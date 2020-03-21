package typingsJapgolly.jestReporters.statusMod

import typingsJapgolly.jestReporters.AnonClear
import typingsJapgolly.jestReporters.typesMod.ReporterOnStartOptions
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.TestResult
import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/Status", JSImport.Default)
@js.native
class default () extends Status {
  /* CompleteClass */
  override var _cache: js.Any = js.native
  /* CompleteClass */
  override var _currentTests: js.Any = js.native
  /* CompleteClass */
  override var _debouncedEmit: js.Any = js.native
  /* CompleteClass */
  override var _done: js.Any = js.native
  /* CompleteClass */
  override var _emit: js.Any = js.native
  /* CompleteClass */
  override var _emitScheduled: js.Any = js.native
  /* CompleteClass */
  override var _estimatedTime: js.Any = js.native
  /* CompleteClass */
  override var _showStatus: js.Any = js.native
  /* CompleteClass */
  override var _tick: js.Any = js.native
  /* CompleteClass */
  override def get(): AnonClear = js.native
  /* CompleteClass */
  override def onChange(callback: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def runFinished(): Unit = js.native
  /* CompleteClass */
  override def runStarted(aggregatedResults: AggregatedResult, options: ReporterOnStartOptions): Unit = js.native
  /* CompleteClass */
  override def testFinished(_config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  /* CompleteClass */
  override def testStarted(testPath: Path, config: ProjectConfig): Unit = js.native
}

