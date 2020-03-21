package typingsJapgolly.jestRunner.mod

import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-runner", JSImport.Namespace)
@js.native
class ^ protected () extends TestRunner {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, context: typingsJapgolly.jestRunner.typesMod.TestRunnerContext) = this()
  /* CompleteClass */
  override var _context: js.Any = js.native
  /* CompleteClass */
  override var _createInBandTestRun: js.Any = js.native
  /* CompleteClass */
  override var _createParallelTestRun: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override def runTests(
    tests: js.Array[typingsJapgolly.jestRunner.typesMod.Test],
    watcher: typingsJapgolly.jestRunner.typesMod.TestWatcher,
    onStart: typingsJapgolly.jestRunner.typesMod.OnTestStart,
    onResult: typingsJapgolly.jestRunner.typesMod.OnTestSuccess,
    onFailure: typingsJapgolly.jestRunner.typesMod.OnTestFailure,
    options: typingsJapgolly.jestRunner.typesMod.TestRunnerOptions
  ): js.Promise[Unit] = js.native
}

