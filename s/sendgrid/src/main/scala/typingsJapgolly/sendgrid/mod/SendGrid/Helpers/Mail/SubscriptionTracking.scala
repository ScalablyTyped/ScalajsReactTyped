package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionTracking extends js.Object {
  def getEnable(): Boolean
  def getHtml(): String
  def getSubstitutionTag(): String
  def getText(): String
  def setEnable(enabled: Boolean): Unit
  def setHtml(html: String): Unit
  def setSubstitutionTag(substitutionTag: String): Unit
  def setText(text: String): Unit
  def toJSON(): AnonHtml
}

object SubscriptionTracking {
  @scala.inline
  def apply(
    getEnable: CallbackTo[Boolean],
    getHtml: CallbackTo[String],
    getSubstitutionTag: CallbackTo[String],
    getText: CallbackTo[String],
    setEnable: Boolean => Callback,
    setHtml: String => Callback,
    setSubstitutionTag: String => Callback,
    setText: String => Callback,
    toJSON: CallbackTo[AnonHtml]
  ): SubscriptionTracking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("getHtml")(getHtml.toJsFn)
    __obj.updateDynamic("getSubstitutionTag")(getSubstitutionTag.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("setHtml")(js.Any.fromFunction1((t0: java.lang.String) => setHtml(t0).runNow()))
    __obj.updateDynamic("setSubstitutionTag")(js.Any.fromFunction1((t0: java.lang.String) => setSubstitutionTag(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[SubscriptionTracking]
  }
}

