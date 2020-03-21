package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonPosttourl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamCheck extends js.Object {
  def getEnable(): Boolean
  def getPosttoUrl(): String
  def getThreshold(): Double
  def setEnable(enabled: Boolean): Unit
  def setPosttoUrl(post_to_url: String): Unit
  def setThreshold(threshold: Double): Unit
  def toJSON(): AnonPosttourl
}

object SpamCheck {
  @scala.inline
  def apply(
    getEnable: CallbackTo[Boolean],
    getPosttoUrl: CallbackTo[String],
    getThreshold: CallbackTo[Double],
    setEnable: Boolean => Callback,
    setPosttoUrl: String => Callback,
    setThreshold: Double => Callback,
    toJSON: CallbackTo[AnonPosttourl]
  ): SpamCheck = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("getPosttoUrl")(getPosttoUrl.toJsFn)
    __obj.updateDynamic("getThreshold")(getThreshold.toJsFn)
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("setPosttoUrl")(js.Any.fromFunction1((t0: java.lang.String) => setPosttoUrl(t0).runNow()))
    __obj.updateDynamic("setThreshold")(js.Any.fromFunction1((t0: scala.Double) => setThreshold(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[SpamCheck]
  }
}

