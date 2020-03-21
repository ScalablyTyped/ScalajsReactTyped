package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonClicktracking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingSettings extends js.Object {
  def getClickTracking(): ClickTracking
  def getGanalytics(): Ganalytics
  def getOpenTracking(): OpenTracking
  def getSubscriptionTracking(): SubscriptionTracking
  def setClickTracking(value: ClickTracking): Unit
  def setGanalytics(value: Ganalytics): Unit
  def setOpenTracking(value: OpenTracking): Unit
  def setSubscriptionTracking(value: SubscriptionTracking): Unit
  def toJSON(): AnonClicktracking
}

object TrackingSettings {
  @scala.inline
  def apply(
    getClickTracking: CallbackTo[ClickTracking],
    getGanalytics: CallbackTo[Ganalytics],
    getOpenTracking: CallbackTo[OpenTracking],
    getSubscriptionTracking: CallbackTo[SubscriptionTracking],
    setClickTracking: ClickTracking => Callback,
    setGanalytics: Ganalytics => Callback,
    setOpenTracking: OpenTracking => Callback,
    setSubscriptionTracking: SubscriptionTracking => Callback,
    toJSON: CallbackTo[AnonClicktracking]
  ): TrackingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClickTracking")(getClickTracking.toJsFn)
    __obj.updateDynamic("getGanalytics")(getGanalytics.toJsFn)
    __obj.updateDynamic("getOpenTracking")(getOpenTracking.toJsFn)
    __obj.updateDynamic("getSubscriptionTracking")(getSubscriptionTracking.toJsFn)
    __obj.updateDynamic("setClickTracking")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.ClickTracking) => setClickTracking(t0).runNow()))
    __obj.updateDynamic("setGanalytics")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Ganalytics) => setGanalytics(t0).runNow()))
    __obj.updateDynamic("setOpenTracking")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.OpenTracking) => setOpenTracking(t0).runNow()))
    __obj.updateDynamic("setSubscriptionTracking")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.SubscriptionTracking) => setSubscriptionTracking(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[TrackingSettings]
  }
}

