package typingsJapgolly.mochaPhantomjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaPhantomJsWindowOptions extends Window {
  var ended: Boolean
  var env: js.Any
  var failures: Double
  var started: Boolean
  def run(): Unit
}

object MochaPhantomJsWindowOptions {
  @scala.inline
  def apply(
    ended: Boolean,
    env: js.Any,
    failures: Double,
    mochaPhantomJS: CallbackTo[MochaPhantomJsWindowOptions],
    run: Callback,
    started: Boolean
  ): MochaPhantomJsWindowOptions = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("mochaPhantomJS")(mochaPhantomJS.toJsFn)
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
}

