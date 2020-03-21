package typingsJapgolly.angularTouchspin.mod.angularTouchspin

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchSpinConfigProvider extends js.Object {
  def defaults(touchSpinOptions: ITouchSpinOptions): Unit
}

object ITouchSpinConfigProvider {
  @scala.inline
  def apply(defaults: ITouchSpinOptions => Callback): ITouchSpinConfigProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(js.Any.fromFunction1((t0: typingsJapgolly.angularTouchspin.mod.angularTouchspin.ITouchSpinOptions) => defaults(t0).runNow()))
    __obj.asInstanceOf[ITouchSpinConfigProvider]
  }
}

