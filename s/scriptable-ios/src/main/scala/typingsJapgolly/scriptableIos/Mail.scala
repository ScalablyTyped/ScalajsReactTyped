package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Sends a mail._
  * @see https://docs.scriptable.app/mail/#-new-mail
  */
trait Mail extends StObject {
  
  /**
    * _Adds a data attachment to the mail._
    *
    * When adding a data attachment to the mail, you are responsible for providing a valid MIME type and filename. It is advised to use `addImageAttachment` and `addFileAttachment`
    * whenever possible.
    * @param data - Data representation of file to add to the mail.
    * @param mimeType - MIME type of file represented by the data.
    * @param filename - Name of the file represented by the data.
    * @see https://docs.scriptable.app/mail/#-adddataattachment
    */
  def addDataAttachment(data: Data, mimeType: String, filename: String): Unit
  
  /**
    * _Adds a file attachment to the mail._
    * @param filePath - Path of file to add to the mail.
    * @see https://docs.scriptable.app/mail/#-addfileattachment
    */
  def addFileAttachment(filePath: String): Unit
  
  /**
    * _Adds an image attachment to the mail._
    * @param image - Image to add to the mail.
    * @see https://docs.scriptable.app/mail/#-addimageattachment
    */
  def addImageAttachment(image: Image): Unit
  
  /**
    * _Recipients to set BCC on the mail._
    *
    * Array of recipients to set as BCC on the mail. Elements in the array should be e-mail addresses. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#bccrecipients
    */
  var bccRecipients: js.Array[String]
  
  /**
    * _Body of the mail._
    *
    * Body of the mail to send. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#body
    */
  var body: String
  
  /**
    * _Recipients to set CC on the mail._
    *
    * Array of recipients to set as CC on the mail. Elements in the array should be e-mail addresses. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#ccrecipients
    */
  var ccRecipients: js.Array[String]
  
  /**
    * _Whether body is HTML._
    *
    * Set to true if the body of the mail is HTML. Defaults to false.
    * @see https://docs.scriptable.app/mail/#isbodyhtml
    */
  var isBodyHTML: Boolean
  
  /**
    * _Preferred email address to use in the from field._
    *
    * Sets the preferred email addressed to use when sending the mail. If no account with the preferred email address is set up, the default email address is used.
    * @see https://docs.scriptable.app/mail/#preferredsendingemailaddress
    */
  var preferredSendingEmailAddress: String
  
  /**
    * _Send the mail._
    *
    * Presents a screen from which the mail can be sent. The mail will not be sent until you have confirmed it from the presented screen.
    * @see https://docs.scriptable.app/mail/#-send
    */
  def send(): js.Promise[Unit]
  
  /**
    * _Subject of the mail._
    *
    * Subject of the mail to send. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#subject
    */
  var subject: String
  
  /**
    * _Recipients of the mail._
    *
    * Array of recipients to send the mail to. Elements in the array should be e-mail addresses. You will have a chance to modify this before the mail is sent.
    * @see https://docs.scriptable.app/mail/#torecipients
    */
  var toRecipients: js.Array[String]
}
object Mail {
  
  inline def apply(
    addDataAttachment: (Data, String, String) => Callback,
    addFileAttachment: String => Callback,
    addImageAttachment: Image => Callback,
    bccRecipients: js.Array[String],
    body: String,
    ccRecipients: js.Array[String],
    isBodyHTML: Boolean,
    preferredSendingEmailAddress: String,
    send: CallbackTo[js.Promise[Unit]],
    subject: String,
    toRecipients: js.Array[String]
  ): Mail = {
    val __obj = js.Dynamic.literal(addDataAttachment = js.Any.fromFunction3((t0: Data, t1: String, t2: String) => (addDataAttachment(t0, t1, t2)).runNow()), addFileAttachment = js.Any.fromFunction1((t0: String) => addFileAttachment(t0).runNow()), addImageAttachment = js.Any.fromFunction1((t0: Image) => addImageAttachment(t0).runNow()), bccRecipients = bccRecipients.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], ccRecipients = ccRecipients.asInstanceOf[js.Any], isBodyHTML = isBodyHTML.asInstanceOf[js.Any], preferredSendingEmailAddress = preferredSendingEmailAddress.asInstanceOf[js.Any], send = send.toJsFn, subject = subject.asInstanceOf[js.Any], toRecipients = toRecipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mail]
  }
  
  extension [Self <: Mail](x: Self) {
    
    inline def setAddDataAttachment(value: (Data, String, String) => Callback): Self = StObject.set(x, "addDataAttachment", js.Any.fromFunction3((t0: Data, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddFileAttachment(value: String => Callback): Self = StObject.set(x, "addFileAttachment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddImageAttachment(value: Image => Callback): Self = StObject.set(x, "addImageAttachment", js.Any.fromFunction1((t0: Image) => value(t0).runNow()))
    
    inline def setBccRecipients(value: js.Array[String]): Self = StObject.set(x, "bccRecipients", value.asInstanceOf[js.Any])
    
    inline def setBccRecipientsVarargs(value: String*): Self = StObject.set(x, "bccRecipients", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCcRecipients(value: js.Array[String]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
    
    inline def setCcRecipientsVarargs(value: String*): Self = StObject.set(x, "ccRecipients", js.Array(value*))
    
    inline def setIsBodyHTML(value: Boolean): Self = StObject.set(x, "isBodyHTML", value.asInstanceOf[js.Any])
    
    inline def setPreferredSendingEmailAddress(value: String): Self = StObject.set(x, "preferredSendingEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setSend(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "send", value.toJsFn)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setToRecipients(value: js.Array[String]): Self = StObject.set(x, "toRecipients", value.asInstanceOf[js.Any])
    
    inline def setToRecipientsVarargs(value: String*): Self = StObject.set(x, "toRecipients", js.Array(value*))
  }
}
