package typingsJapgolly.jestWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FileChange = js.Function1[/* fs */ typingsJapgolly.jestWatcher.typesMod.JestHookExposedFS, scala.Unit]
  type ShouldRunTestSuite = js.Function1[
    /* testSuiteInfo */ typingsJapgolly.jestWatcher.typesMod.TestSuiteInfo, 
    js.Promise[scala.Boolean]
  ]
  type TestRunComplete = js.Function1[/* results */ typingsJapgolly.jestTestResult.typesMod.AggregatedResult, scala.Unit]
  type UpdateConfigCallback = js.Function1[
    /* config */ js.UndefOr[typingsJapgolly.jestWatcher.typesMod.AllowedConfigOptions], 
    scala.Unit
  ]
}
