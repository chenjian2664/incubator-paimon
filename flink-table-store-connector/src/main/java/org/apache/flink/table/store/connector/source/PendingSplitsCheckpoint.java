/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.store.connector.source;

import java.util.Collection;

/**
 * A checkpoint of the current state of the containing the currently pending splits that are not yet
 * assigned.
 */
public class PendingSplitsCheckpoint {

    public static final long INVALID_SNAPSHOT = -1L;

    /** The splits in the checkpoint. */
    private final Collection<FileStoreSourceSplit> splits;

    private final long currentSnapshotId;

    public PendingSplitsCheckpoint(
            Collection<FileStoreSourceSplit> splits, long currentSnapshotId) {
        this.splits = splits;
        this.currentSnapshotId = currentSnapshotId;
    }

    public Collection<FileStoreSourceSplit> splits() {
        return splits;
    }

    public long currentSnapshotId() {
        return currentSnapshotId;
    }
}
