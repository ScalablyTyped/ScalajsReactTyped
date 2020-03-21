package typingsJapgolly.jestCore.reporterDispatcherMod

import typingsJapgolly.jestReporters.typesMod.Reporter
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestRunner.mod.Test
import typingsJapgolly.jestRuntime.mod.Context
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/ReporterDispatcher", JSImport.Default)
@js.native
class default () extends ReporterDispatcher {
  /* CompleteClass */
  override var _reporters: js.Any = js.native
  /* CompleteClass */
  override def getErrors(): js.Array[js.Error] = js.native
  /* CompleteClass */
  override def hasErrors(): Boolean = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, results: AggregatedResult): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def register(reporter: Reporter): Unit = js.native
  /* CompleteClass */
  override def unregister(ReporterClass: js.Function): Unit = js.native
}

