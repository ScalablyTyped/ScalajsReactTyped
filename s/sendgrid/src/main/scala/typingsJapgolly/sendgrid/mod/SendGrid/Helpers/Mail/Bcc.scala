package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bcc extends js.Object {
  def getEmail(): Email
  def getEnable(): Boolean
  def setEmail(value: Email): Unit
  def setEnable(enabled: Boolean): Unit
  def toJSON(): AnonEmail
}

object Bcc {
  @scala.inline
  def apply(
    getEmail: CallbackTo[Email],
    getEnable: CallbackTo[Boolean],
    setEmail: Email => Callback,
    setEnable: Boolean => Callback,
    toJSON: CallbackTo[AnonEmail]
  ): Bcc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("setEmail")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email) => setEmail(t0).runNow()))
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Bcc]
  }
}

