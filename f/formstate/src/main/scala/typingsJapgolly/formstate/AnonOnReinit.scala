package typingsJapgolly.formstate

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnReinit extends js.Object {
  @JSName("on$Reinit")
  def on$Reinit(): Unit
  @JSName("on$ValidationPass")
  def on$ValidationPass(): Unit
}

object AnonOnReinit {
  @scala.inline
  def apply(on$Reinit: Callback, on$ValidationPass: Callback): AnonOnReinit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on$Reinit")(on$Reinit.toJsFn)
    __obj.updateDynamic("on$ValidationPass")(on$ValidationPass.toJsFn)
    __obj.asInstanceOf[AnonOnReinit]
  }
}

