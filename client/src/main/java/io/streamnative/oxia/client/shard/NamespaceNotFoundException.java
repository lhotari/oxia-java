/*
 * Copyright © 2022-2023 StreamNative Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.streamnative.oxia.client.shard;


import lombok.Getter;
import lombok.NonNull;

/** The namespace not found in shards assignments. */
public class NamespaceNotFoundException extends RuntimeException {
    @Getter private final String namespace;

    /**
     * Creates an instance of the exception.
     *
     * @param namespace The namespace specified in the call.
     */
    public NamespaceNotFoundException(@NonNull String namespace) {
        super(String.format("namespace %s not found in shards assignments", namespace));
        this.namespace = namespace;
    }
}