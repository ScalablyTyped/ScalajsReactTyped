package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonSubstitutiontag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTracking extends js.Object {
  def getEnable(): Boolean
  def getSubscriptionTag(): String
  def setEnable(enabled: Boolean): Unit
  def setSubscriptionTag(subscriptionTag: String): Unit
  def toJSON(): AnonSubstitutiontag
}

object OpenTracking {
  @scala.inline
  def apply(
    getEnable: CallbackTo[Boolean],
    getSubscriptionTag: CallbackTo[String],
    setEnable: Boolean => Callback,
    setSubscriptionTag: String => Callback,
    toJSON: CallbackTo[AnonSubstitutiontag]
  ): OpenTracking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("getSubscriptionTag")(getSubscriptionTag.toJsFn)
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("setSubscriptionTag")(js.Any.fromFunction1((t0: java.lang.String) => setSubscriptionTag(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[OpenTracking]
  }
}

