package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonEnableBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BypassListManagement extends js.Object {
  def getEnable(): Boolean
  def setEnable(enabled: Boolean): Unit
  def toJSON(): AnonEnableBoolean
}

object BypassListManagement {
  @scala.inline
  def apply(
    getEnable: CallbackTo[Boolean],
    setEnable: Boolean => Callback,
    toJSON: CallbackTo[AnonEnableBoolean]
  ): BypassListManagement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[BypassListManagement]
  }
}

