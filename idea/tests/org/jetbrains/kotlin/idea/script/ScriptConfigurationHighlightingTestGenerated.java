/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.script;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/script/definition/highlighting")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ScriptConfigurationHighlightingTestGenerated extends AbstractScriptConfigurationHighlightingTest {
    @TestMetadata("additionalImports")
    public void testAdditionalImports() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/highlighting/additionalImports/");
        doTest(fileName);
    }

    public void testAllFilesPresentInHighlighting() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/script/definition/highlighting"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("customBaseClass")
    public void testCustomBaseClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/highlighting/customBaseClass/");
        doTest(fileName);
    }

    @TestMetadata("customLibrary")
    public void testCustomLibrary() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/highlighting/customLibrary/");
        doTest(fileName);
    }

    @TestMetadata("doNotSpeakAboutJava")
    public void testDoNotSpeakAboutJava() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/highlighting/doNotSpeakAboutJava/");
        doTest(fileName);
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/script/definition/highlighting/simple/");
        doTest(fileName);
    }
}
