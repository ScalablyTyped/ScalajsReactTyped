package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonEnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickTracking extends js.Object {
  def getEnable(): Boolean
  def getEnableText(): Boolean
  def setEnable(enabled: Boolean): Unit
  def setEnableText(enableText: Boolean): Unit
  def toJSON(): AnonEnable
}

object ClickTracking {
  @scala.inline
  def apply(
    getEnable: CallbackTo[Boolean],
    getEnableText: CallbackTo[Boolean],
    setEnable: Boolean => Callback,
    setEnableText: Boolean => Callback,
    toJSON: CallbackTo[AnonEnable]
  ): ClickTracking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("getEnableText")(getEnableText.toJsFn)
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("setEnableText")(js.Any.fromFunction1((t0: scala.Boolean) => setEnableText(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[ClickTracking]
  }
}

