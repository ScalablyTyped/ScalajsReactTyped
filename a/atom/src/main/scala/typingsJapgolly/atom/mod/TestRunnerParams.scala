package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunnerParams extends js.Object {
  /**
    *  A boolean indicating whether or not the tests are being run from the command
    *  line via atom --test.
    */
  var headless: Boolean
  /** An optional path to a log file to which test output should be logged. */
  var logFile: String
  /** An array of paths to tests to run. Could be paths to files or directories. */
  var testPaths: js.Array[String]
  /**
    *  A function that can be called to construct an instance of the atom global.
    *  No atom global will be explicitly assigned, but you can assign one in your
    *  runner if desired.
    */
  def buildAtomEnvironment(options: BuildEnvironmentOptions): AtomEnvironment
  /**
    *  A function that builds a default instance of the application delegate, suitable
    *  to be passed as the applicationDelegate parameter to buildAtomEnvironment.
    */
  def buildDefaultApplicationDelegate(): js.Object
}

object TestRunnerParams {
  @scala.inline
  def apply(
    buildAtomEnvironment: BuildEnvironmentOptions => CallbackTo[AtomEnvironment],
    buildDefaultApplicationDelegate: CallbackTo[js.Object],
    headless: Boolean,
    logFile: String,
    testPaths: js.Array[String]
  ): TestRunnerParams = {
    val __obj = js.Dynamic.literal(headless = headless.asInstanceOf[js.Any], logFile = logFile.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.updateDynamic("buildAtomEnvironment")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.BuildEnvironmentOptions) => buildAtomEnvironment(t0).runNow()))
    __obj.updateDynamic("buildDefaultApplicationDelegate")(buildDefaultApplicationDelegate.toJsFn)
    __obj.asInstanceOf[TestRunnerParams]
  }
}

