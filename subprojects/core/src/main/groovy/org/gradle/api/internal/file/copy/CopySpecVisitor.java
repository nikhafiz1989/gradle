/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.internal.file.copy;

import org.gradle.api.file.FileCopyDetails;
import org.gradle.api.tasks.WorkResult;

public interface CopySpecVisitor extends WorkResult {
    /**
     * Called at the start of the visit.
     */
    void startVisit(CopyAction action);

    /**
     * Called at the end of the visit.
     */
    void endVisit();

    /**
     * Visits a spec. Called before any of the files or directories of the spec are visited.
     */
    void visitSpec(CopySpecInternal spec);

    /**
     * Visits a directory.
     *
     * @param dirDetails Meta-info about the directory.
     */
    public void visitDir(FileCopyDetails dirDetails);

    /**
     * Visits a file.
     *
     * @param fileDetails Meta-info about the file.
     */
    public void visitFile(FileCopyDetails fileDetails);

}
