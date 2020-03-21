package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonBcc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailSettings extends js.Object {
  def getBcc(): Bcc
  def getBypassListManagement(): BypassListManagement
  def getFooter(): Footer
  def getSandBoxMode(): SandBoxMode
  def getSpamCheck(): SpamCheck
  def setBcc(bcc: Bcc): Unit
  def setBypassListManagement(bypassListManagement: BypassListManagement): Unit
  def setFooter(footer: Footer): Unit
  def setSandBoxMode(sandBoxMode: SandBoxMode): Unit
  def setSpamCheck(spamCheck: SpamCheck): Unit
  def toJSON(): AnonBcc
}

object MailSettings {
  @scala.inline
  def apply(
    getBcc: CallbackTo[Bcc],
    getBypassListManagement: CallbackTo[BypassListManagement],
    getFooter: CallbackTo[Footer],
    getSandBoxMode: CallbackTo[SandBoxMode],
    getSpamCheck: CallbackTo[SpamCheck],
    setBcc: Bcc => Callback,
    setBypassListManagement: BypassListManagement => Callback,
    setFooter: Footer => Callback,
    setSandBoxMode: SandBoxMode => Callback,
    setSpamCheck: SpamCheck => Callback,
    toJSON: CallbackTo[AnonBcc]
  ): MailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBcc")(getBcc.toJsFn)
    __obj.updateDynamic("getBypassListManagement")(getBypassListManagement.toJsFn)
    __obj.updateDynamic("getFooter")(getFooter.toJsFn)
    __obj.updateDynamic("getSandBoxMode")(getSandBoxMode.toJsFn)
    __obj.updateDynamic("getSpamCheck")(getSpamCheck.toJsFn)
    __obj.updateDynamic("setBcc")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Bcc) => setBcc(t0).runNow()))
    __obj.updateDynamic("setBypassListManagement")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.BypassListManagement) => setBypassListManagement(t0).runNow()))
    __obj.updateDynamic("setFooter")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Footer) => setFooter(t0).runNow()))
    __obj.updateDynamic("setSandBoxMode")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.SandBoxMode) => setSandBoxMode(t0).runNow()))
    __obj.updateDynamic("setSpamCheck")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.SpamCheck) => setSpamCheck(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[MailSettings]
  }
}

