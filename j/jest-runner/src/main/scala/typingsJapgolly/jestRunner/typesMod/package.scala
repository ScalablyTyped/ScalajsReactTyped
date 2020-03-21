package typingsJapgolly.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OnTestFailure = js.Function2[
    /* test */ typingsJapgolly.jestRunner.typesMod.Test, 
    /* serializableError */ typingsJapgolly.jestTestResult.typesMod.SerializableError, 
    js.Promise[scala.Unit]
  ]
  type OnTestStart = js.Function1[/* test */ typingsJapgolly.jestRunner.typesMod.Test, js.Promise[scala.Unit]]
  type OnTestSuccess = js.Function2[
    /* test */ typingsJapgolly.jestRunner.typesMod.Test, 
    /* testResult */ typingsJapgolly.jestTestResult.typesMod.TestResult, 
    js.Promise[scala.Unit]
  ]
  type TestFramework = js.Function5[
    /* globalConfig */ typingsJapgolly.jestTypes.configMod.GlobalConfig, 
    /* config */ typingsJapgolly.jestTypes.configMod.ProjectConfig, 
    /* environment */ typingsJapgolly.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typingsJapgolly.jestRuntime.mod.^, 
    /* testPath */ java.lang.String, 
    js.Promise[typingsJapgolly.jestTestResult.typesMod.TestResult]
  ]
}
