package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mail extends StObject {
  
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
  
  def toJSON(): typingsJapgolly.sendgrid.anon.Asm
}
object Mail {
  
  inline def apply(
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
    toJSON: CallbackTo[typingsJapgolly.sendgrid.anon.Asm]
  ): typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Mail = {
    val __obj = js.Dynamic.literal(addAttachment = js.Any.fromFunction1((t0: Attachment) => addAttachment(t0).runNow()), addCategory = js.Any.fromFunction1((t0: Category) => addCategory(t0).runNow()), addContent = js.Any.fromFunction1((t0: Content) => addContent(t0).runNow()), addCustomArg = js.Any.fromFunction1((t0: CustomArgs) => addCustomArg(t0).runNow()), addHeader = js.Any.fromFunction1((t0: Header) => addHeader(t0).runNow()), addMailSettings = js.Any.fromFunction1((t0: MailSettings) => addMailSettings(t0).runNow()), addPersonalization = js.Any.fromFunction1((t0: Personalization) => addPersonalization(t0).runNow()), addSection = js.Any.fromFunction1((t0: Section) => addSection(t0).runNow()), addTrackingSettings = js.Any.fromFunction1((t0: TrackingSettings) => addTrackingSettings(t0).runNow()), getAsm = getAsm.toJsFn, getAttachments = getAttachments.toJsFn, getBatchId = getBatchId.toJsFn, getCategories = getCategories.toJsFn, getContents = getContents.toJsFn, getCustomArgs = getCustomArgs.toJsFn, getFrom = getFrom.toJsFn, getHeaders = getHeaders.toJsFn, getIpPoolName = getIpPoolName.toJsFn, getMailSettings = getMailSettings.toJsFn, getPersonalizations = getPersonalizations.toJsFn, getReplyTo = getReplyTo.toJsFn, getSections = getSections.toJsFn, getSendAt = getSendAt.toJsFn, getSubject = getSubject.toJsFn, getTemplateId = getTemplateId.toJsFn, getTrackingSettings = getTrackingSettings.toJsFn, setAsm = js.Any.fromFunction1((t0: Asm) => setAsm(t0).runNow()), setBatchId = js.Any.fromFunction1((t0: String) => setBatchId(t0).runNow()), setFrom = js.Any.fromFunction1((t0: Email) => setFrom(t0).runNow()), setIpPoolName = js.Any.fromFunction1((t0: String) => setIpPoolName(t0).runNow()), setReplyTo = js.Any.fromFunction1((t0: Email) => setReplyTo(t0).runNow()), setSendAt = js.Any.fromFunction1((t0: Double) => setSendAt(t0).runNow()), setSubject = js.Any.fromFunction1((t0: String) => setSubject(t0).runNow()), setTemplateId = js.Any.fromFunction1((t0: String) => setTemplateId(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Mail]
  }
  
  extension [Self <: typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Mail](x: Self) {
    
    inline def setAddAttachment(value: Attachment => Callback): Self = StObject.set(x, "addAttachment", js.Any.fromFunction1((t0: Attachment) => value(t0).runNow()))
    
    inline def setAddCategory(value: Category => Callback): Self = StObject.set(x, "addCategory", js.Any.fromFunction1((t0: Category) => value(t0).runNow()))
    
    inline def setAddContent(value: Content => Callback): Self = StObject.set(x, "addContent", js.Any.fromFunction1((t0: Content) => value(t0).runNow()))
    
    inline def setAddCustomArg(value: CustomArgs => Callback): Self = StObject.set(x, "addCustomArg", js.Any.fromFunction1((t0: CustomArgs) => value(t0).runNow()))
    
    inline def setAddHeader(value: Header => Callback): Self = StObject.set(x, "addHeader", js.Any.fromFunction1((t0: Header) => value(t0).runNow()))
    
    inline def setAddMailSettings(value: MailSettings => Callback): Self = StObject.set(x, "addMailSettings", js.Any.fromFunction1((t0: MailSettings) => value(t0).runNow()))
    
    inline def setAddPersonalization(value: Personalization => Callback): Self = StObject.set(x, "addPersonalization", js.Any.fromFunction1((t0: Personalization) => value(t0).runNow()))
    
    inline def setAddSection(value: Section => Callback): Self = StObject.set(x, "addSection", js.Any.fromFunction1((t0: Section) => value(t0).runNow()))
    
    inline def setAddTrackingSettings(value: TrackingSettings => Callback): Self = StObject.set(x, "addTrackingSettings", js.Any.fromFunction1((t0: TrackingSettings) => value(t0).runNow()))
    
    inline def setGetAsm(value: CallbackTo[Asm]): Self = StObject.set(x, "getAsm", value.toJsFn)
    
    inline def setGetAttachments(value: CallbackTo[js.Array[Attachment]]): Self = StObject.set(x, "getAttachments", value.toJsFn)
    
    inline def setGetBatchId(value: CallbackTo[String]): Self = StObject.set(x, "getBatchId", value.toJsFn)
    
    inline def setGetCategories(value: CallbackTo[js.Array[Category]]): Self = StObject.set(x, "getCategories", value.toJsFn)
    
    inline def setGetContents(value: CallbackTo[js.Array[Content]]): Self = StObject.set(x, "getContents", value.toJsFn)
    
    inline def setGetCustomArgs(value: CallbackTo[js.Array[CustomArgs]]): Self = StObject.set(x, "getCustomArgs", value.toJsFn)
    
    inline def setGetFrom(value: CallbackTo[Email]): Self = StObject.set(x, "getFrom", value.toJsFn)
    
    inline def setGetHeaders(value: CallbackTo[js.Array[Header]]): Self = StObject.set(x, "getHeaders", value.toJsFn)
    
    inline def setGetIpPoolName(value: CallbackTo[String]): Self = StObject.set(x, "getIpPoolName", value.toJsFn)
    
    inline def setGetMailSettings(value: CallbackTo[MailSettings]): Self = StObject.set(x, "getMailSettings", value.toJsFn)
    
    inline def setGetPersonalizations(value: CallbackTo[js.Array[Personalization]]): Self = StObject.set(x, "getPersonalizations", value.toJsFn)
    
    inline def setGetReplyTo(value: CallbackTo[Email]): Self = StObject.set(x, "getReplyTo", value.toJsFn)
    
    inline def setGetSections(value: CallbackTo[js.Array[Section]]): Self = StObject.set(x, "getSections", value.toJsFn)
    
    inline def setGetSendAt(value: CallbackTo[Double]): Self = StObject.set(x, "getSendAt", value.toJsFn)
    
    inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "getSubject", value.toJsFn)
    
    inline def setGetTemplateId(value: CallbackTo[String]): Self = StObject.set(x, "getTemplateId", value.toJsFn)
    
    inline def setGetTrackingSettings(value: CallbackTo[TrackingSettings]): Self = StObject.set(x, "getTrackingSettings", value.toJsFn)
    
    inline def setSetAsm(value: Asm => Callback): Self = StObject.set(x, "setAsm", js.Any.fromFunction1((t0: Asm) => value(t0).runNow()))
    
    inline def setSetBatchId(value: String => Callback): Self = StObject.set(x, "setBatchId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFrom(value: Email => Callback): Self = StObject.set(x, "setFrom", js.Any.fromFunction1((t0: Email) => value(t0).runNow()))
    
    inline def setSetIpPoolName(value: String => Callback): Self = StObject.set(x, "setIpPoolName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetReplyTo(value: Email => Callback): Self = StObject.set(x, "setReplyTo", js.Any.fromFunction1((t0: Email) => value(t0).runNow()))
    
    inline def setSetSendAt(value: Double => Callback): Self = StObject.set(x, "setSendAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSubject(value: String => Callback): Self = StObject.set(x, "setSubject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTemplateId(value: String => Callback): Self = StObject.set(x, "setTemplateId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[typingsJapgolly.sendgrid.anon.Asm]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
