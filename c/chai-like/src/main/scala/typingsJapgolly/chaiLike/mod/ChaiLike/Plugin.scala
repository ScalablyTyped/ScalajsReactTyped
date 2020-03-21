package typingsJapgolly.chaiLike.mod.ChaiLike

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def assert(`object`: js.Any, expected: js.Any): Boolean
  def `match`(`object`: js.Any, expected: js.Any): Boolean
}

object Plugin {
  @scala.inline
  def apply(assert: (js.Any, js.Any) => CallbackTo[Boolean], `match`: (js.Any, js.Any) => CallbackTo[Boolean]): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assert")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => assert(t0, t1).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => `match`(t0, t1).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

