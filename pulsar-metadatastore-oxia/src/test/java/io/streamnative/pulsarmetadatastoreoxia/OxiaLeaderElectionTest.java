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
package io.streamnative.pulsarmetadatastoreoxia;


import io.streamnative.oxia.testcontainers.OxiaContainer;
import lombok.Getter;
import lombok.Setter;
import org.apache.pulsar.metadata.LeaderElectionTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;

@Ignore // TODO fix failing tests
public class OxiaLeaderElectionTest extends LeaderElectionTest implements OxiaTestBase {

    @Getter @Setter private OxiaContainer container;

    @BeforeClass(alwaysRun = true)
    public void setup() throws Exception {
        this.incrementSetupNumber();
    }

    @DataProvider(name = "impl")
    public Object[][] implementations() {
        return impl();
    }
}