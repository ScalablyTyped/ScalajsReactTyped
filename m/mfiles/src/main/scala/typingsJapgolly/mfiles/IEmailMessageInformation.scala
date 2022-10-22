package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFEmailImportance
import typingsJapgolly.mfiles.MFiles.MFEmailSensitivity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEmailMessageInformation extends StObject {
  
  var Cc: IStrings
  
  def Clone(): IEmailMessageInformation
  
  def CloneFrom(EmailMessageInformation: IEmailMessageInformation): Unit
  
  var From: String
  
  var Importance: MFEmailImportance
  
  var InReplyTo: String
  
  var MessageID: String
  
  var Received: ITimestamp
  
  var Sensitivity: MFEmailSensitivity
  
  var Sent: ITimestamp
  
  var Subject: String
  
  var To: IStrings
}
object IEmailMessageInformation {
  
  inline def apply(
    Cc: IStrings,
    Clone: CallbackTo[IEmailMessageInformation],
    CloneFrom: IEmailMessageInformation => Callback,
    From: String,
    Importance: MFEmailImportance,
    InReplyTo: String,
    MessageID: String,
    Received: ITimestamp,
    Sensitivity: MFEmailSensitivity,
    Sent: ITimestamp,
    Subject: String,
    To: IStrings
  ): IEmailMessageInformation = {
    val __obj = js.Dynamic.literal(Cc = Cc.asInstanceOf[js.Any], Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IEmailMessageInformation) => CloneFrom(t0).runNow()), From = From.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], InReplyTo = InReplyTo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Sensitivity = Sensitivity.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEmailMessageInformation]
  }
  
  extension [Self <: IEmailMessageInformation](x: Self) {
    
    inline def setCc(value: IStrings): Self = StObject.set(x, "Cc", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IEmailMessageInformation]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IEmailMessageInformation => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IEmailMessageInformation) => value(t0).runNow()))
    
    inline def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: MFEmailImportance): Self = StObject.set(x, "Importance", value.asInstanceOf[js.Any])
    
    inline def setInReplyTo(value: String): Self = StObject.set(x, "InReplyTo", value.asInstanceOf[js.Any])
    
    inline def setMessageID(value: String): Self = StObject.set(x, "MessageID", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: ITimestamp): Self = StObject.set(x, "Received", value.asInstanceOf[js.Any])
    
    inline def setSensitivity(value: MFEmailSensitivity): Self = StObject.set(x, "Sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSent(value: ITimestamp): Self = StObject.set(x, "Sent", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setTo(value: IStrings): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
