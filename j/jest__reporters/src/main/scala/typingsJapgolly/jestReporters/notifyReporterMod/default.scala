package typingsJapgolly.jestReporters.notifyReporterMod

import typingsJapgolly.jestReporters.typesMod.Context
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestReporters.typesMod.Test
import typingsJapgolly.jestReporters.typesMod.TestSchedulerContext
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/notify_reporter", JSImport.Default)
@js.native
class default protected () extends NotifyReporter {
  def this(
    globalConfig: GlobalConfig,
    startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
    context: TestSchedulerContext
  ) = this()
  /* CompleteClass */
  override var _context: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override var _startRun: js.Any = js.native
  /* CompleteClass */
  /* protected */ override def _setError(error: js.Error): Unit = js.native
  /* CompleteClass */
  override def getLastError(): js.Error | Unit = js.native
  /* CompleteClass */
  override def log(message: String): Unit = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
}

