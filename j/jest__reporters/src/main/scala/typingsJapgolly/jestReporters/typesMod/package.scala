package typingsJapgolly.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type OnTestFailure = js.Function2[
    /* test */ typingsJapgolly.jestReporters.typesMod.Test, 
    /* error */ typingsJapgolly.jestTestResult.typesMod.SerializableError, 
    js.Promise[js.Any]
  ]
  type OnTestStart = js.Function1[/* test */ typingsJapgolly.jestReporters.typesMod.Test, js.Promise[scala.Unit]]
  type OnTestSuccess = js.Function2[
    /* test */ typingsJapgolly.jestReporters.typesMod.Test, 
    /* result */ typingsJapgolly.jestTestResult.typesMod.TestResult, 
    js.Promise[js.Any]
  ]
  type TestFramework = js.Function5[
    /* globalConfig */ typingsJapgolly.jestTypes.configMod.GlobalConfig, 
    /* config */ typingsJapgolly.jestTypes.configMod.ProjectConfig, 
    /* environment */ typingsJapgolly.jestEnvironment.mod.JestEnvironment, 
    /* runtime */ typingsJapgolly.jestRuntime.mod.^, 
    /* testPath */ java.lang.String, 
    js.Promise[typingsJapgolly.jestTestResult.typesMod.TestResult]
  ]
  type TestRunData = js.Array[typingsJapgolly.jestReporters.AnonContext]
}
