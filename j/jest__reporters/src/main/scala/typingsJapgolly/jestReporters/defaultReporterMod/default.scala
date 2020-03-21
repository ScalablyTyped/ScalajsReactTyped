package typingsJapgolly.jestReporters.defaultReporterMod

import typingsJapgolly.jestReporters.typesMod.Context
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestReporters.typesMod.Test
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/default_reporter", JSImport.Default)
@js.native
class default protected () extends DefaultReporter {
  def this(globalConfig: GlobalConfig) = this()
  /* CompleteClass */
  override var _bufferedOutput: js.Any = js.native
  /* CompleteClass */
  override var _clear: js.Any = js.native
  /* CompleteClass */
  override var _clearStatus: js.Any = js.native
  /* CompleteClass */
  override var _err: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: GlobalConfig = js.native
  /* CompleteClass */
  override var _out: js.Any = js.native
  /* CompleteClass */
  override var _printStatus: js.Any = js.native
  /* CompleteClass */
  override var _status: js.Any = js.native
  /* CompleteClass */
  override var _wrapStdio: js.Any = js.native
  /* CompleteClass */
  /* protected */ override def _setError(error: js.Error): Unit = js.native
  /* CompleteClass */
  override def forceFlushBufferedOutput(): Unit = js.native
  /* CompleteClass */
  override def getLastError(): js.Error | Unit = js.native
  /* CompleteClass */
  override def log(message: String): Unit = js.native
  /* CompleteClass */
  override def onRunComplete(): Unit = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def printTestFileFailureMessage(_testPath: Path, _config: ProjectConfig, result: TestResult): Unit = js.native
  /* CompleteClass */
  override def printTestFileHeader(_testPath: Path, config: ProjectConfig, result: TestResult): Unit = js.native
  /* CompleteClass */
  override def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
}

