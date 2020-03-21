package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonAsm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mail extends js.Object {
  def addAttachment(attachment: Attachment): Unit
  def addCategory(category: Category): Unit
  def addContent(content: Content): Unit
  def addCustomArg(customArg: CustomArgs): Unit
  def addHeader(header: Header): Unit
  def addMailSettings(settings: MailSettings): Unit
  def addPersonalization(personalization: Personalization): Unit
  def addSection(section: Section): Unit
  def addTrackingSettings(settings: TrackingSettings): Unit
  def getAsm(): Asm
  def getAttachments(): js.Array[Attachment]
  def getBatchId(): String
  def getCategories(): js.Array[Category]
  def getContents(): js.Array[Content]
  def getCustomArgs(): js.Array[CustomArgs]
  def getFrom(): Email
  def getHeaders(): js.Array[Header]
  def getIpPoolName(): String
  def getMailSettings(): MailSettings
  def getPersonalizations(): js.Array[Personalization]
  def getReplyTo(): Email
  def getSections(): js.Array[Section]
  def getSendAt(): Double
  def getSubject(): String
  def getTemplateId(): String
  def getTrackingSettings(): TrackingSettings
  def setAsm(asm: Asm): Unit
  def setBatchId(batch_id: String): Unit
  def setFrom(email: Email): Unit
  def setIpPoolName(name: String): Unit
  def setReplyTo(email: Email): Unit
  def setSendAt(sendAt: Double): Unit
  def setSubject(subject: String): Unit
  def setTemplateId(templateId: String): Unit
  def toJSON(): AnonAsm
}

object Mail {
  @scala.inline
  def apply(
    addAttachment: Attachment => Callback,
    addCategory: Category => Callback,
    addContent: Content => Callback,
    addCustomArg: CustomArgs => Callback,
    addHeader: Header => Callback,
    addMailSettings: MailSettings => Callback,
    addPersonalization: Personalization => Callback,
    addSection: Section => Callback,
    addTrackingSettings: TrackingSettings => Callback,
    getAsm: CallbackTo[Asm],
    getAttachments: CallbackTo[js.Array[Attachment]],
    getBatchId: CallbackTo[String],
    getCategories: CallbackTo[js.Array[Category]],
    getContents: CallbackTo[js.Array[Content]],
    getCustomArgs: CallbackTo[js.Array[CustomArgs]],
    getFrom: CallbackTo[Email],
    getHeaders: CallbackTo[js.Array[Header]],
    getIpPoolName: CallbackTo[String],
    getMailSettings: CallbackTo[MailSettings],
    getPersonalizations: CallbackTo[js.Array[Personalization]],
    getReplyTo: CallbackTo[Email],
    getSections: CallbackTo[js.Array[Section]],
    getSendAt: CallbackTo[Double],
    getSubject: CallbackTo[String],
    getTemplateId: CallbackTo[String],
    getTrackingSettings: CallbackTo[TrackingSettings],
    setAsm: Asm => Callback,
    setBatchId: String => Callback,
    setFrom: Email => Callback,
    setIpPoolName: String => Callback,
    setReplyTo: Email => Callback,
    setSendAt: Double => Callback,
    setSubject: String => Callback,
    setTemplateId: String => Callback,
    toJSON: CallbackTo[AnonAsm]
  ): Mail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAttachment")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Attachment) => addAttachment(t0).runNow()))
    __obj.updateDynamic("addCategory")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Category) => addCategory(t0).runNow()))
    __obj.updateDynamic("addContent")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Content) => addContent(t0).runNow()))
    __obj.updateDynamic("addCustomArg")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.CustomArgs) => addCustomArg(t0).runNow()))
    __obj.updateDynamic("addHeader")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Header) => addHeader(t0).runNow()))
    __obj.updateDynamic("addMailSettings")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.MailSettings) => addMailSettings(t0).runNow()))
    __obj.updateDynamic("addPersonalization")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Personalization) => addPersonalization(t0).runNow()))
    __obj.updateDynamic("addSection")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Section) => addSection(t0).runNow()))
    __obj.updateDynamic("addTrackingSettings")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.TrackingSettings) => addTrackingSettings(t0).runNow()))
    __obj.updateDynamic("getAsm")(getAsm.toJsFn)
    __obj.updateDynamic("getAttachments")(getAttachments.toJsFn)
    __obj.updateDynamic("getBatchId")(getBatchId.toJsFn)
    __obj.updateDynamic("getCategories")(getCategories.toJsFn)
    __obj.updateDynamic("getContents")(getContents.toJsFn)
    __obj.updateDynamic("getCustomArgs")(getCustomArgs.toJsFn)
    __obj.updateDynamic("getFrom")(getFrom.toJsFn)
    __obj.updateDynamic("getHeaders")(getHeaders.toJsFn)
    __obj.updateDynamic("getIpPoolName")(getIpPoolName.toJsFn)
    __obj.updateDynamic("getMailSettings")(getMailSettings.toJsFn)
    __obj.updateDynamic("getPersonalizations")(getPersonalizations.toJsFn)
    __obj.updateDynamic("getReplyTo")(getReplyTo.toJsFn)
    __obj.updateDynamic("getSections")(getSections.toJsFn)
    __obj.updateDynamic("getSendAt")(getSendAt.toJsFn)
    __obj.updateDynamic("getSubject")(getSubject.toJsFn)
    __obj.updateDynamic("getTemplateId")(getTemplateId.toJsFn)
    __obj.updateDynamic("getTrackingSettings")(getTrackingSettings.toJsFn)
    __obj.updateDynamic("setAsm")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Asm) => setAsm(t0).runNow()))
    __obj.updateDynamic("setBatchId")(js.Any.fromFunction1((t0: java.lang.String) => setBatchId(t0).runNow()))
    __obj.updateDynamic("setFrom")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email) => setFrom(t0).runNow()))
    __obj.updateDynamic("setIpPoolName")(js.Any.fromFunction1((t0: java.lang.String) => setIpPoolName(t0).runNow()))
    __obj.updateDynamic("setReplyTo")(js.Any.fromFunction1((t0: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Email) => setReplyTo(t0).runNow()))
    __obj.updateDynamic("setSendAt")(js.Any.fromFunction1((t0: scala.Double) => setSendAt(t0).runNow()))
    __obj.updateDynamic("setSubject")(js.Any.fromFunction1((t0: java.lang.String) => setSubject(t0).runNow()))
    __obj.updateDynamic("setTemplateId")(js.Any.fromFunction1((t0: java.lang.String) => setTemplateId(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Mail]
  }
}

