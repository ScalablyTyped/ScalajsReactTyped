package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Sends a message._
  *
  * Constructs a message to be sent either as a text message or an iMessage.
  * @see https://docs.scriptable.app/message/#-new-message
  */
trait Message extends StObject {
  
  /**
    * _Adds a data attachment to the message._
    *
    * When adding a data attachment to the message, you are responsible for providing a valid Uniform Type Identifier and filename. It is advised to use `addImageAttachment` and
    * `addFileAttachment` whenever possible.
    * @param data - Data representation of file to add to the message.
    * @param uti - UTI of file represented by the data.
    * @param filename - Name of the file represented by the data.
    * @see https://docs.scriptable.app/message/#-adddataattachment
    */
  def addDataAttachment(data: Data, uti: String, filename: String): Unit
  
  /**
    * _Adds a file attachment to the message._
    * @param filePath - Path of file to add to the message.
    * @see https://docs.scriptable.app/message/#-addfileattachment
    */
  def addFileAttachment(filePath: String): Unit
  
  /**
    * _Adds an image attachment to the message._
    * @param image - Image to add to the message.
    * @see https://docs.scriptable.app/message/#-addimageattachment
    */
  def addImageAttachment(image: Image): Unit
  
  /**
    * _Body of the message._
    *
    * Body of the message to send. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#body
    */
  var body: String
  
  /**
    * _Recipients of the message._
    *
    * Array of recipients to send the message to. Elements in the array should be phone numbers. You will have a chance to modify this before the message is sent.
    * @see https://docs.scriptable.app/message/#recipients
    */
  var recipients: js.Array[String]
  
  /**
    * _Send the message._
    *
    * Presents a screen from which the message can be sent. The message will not be sent until you have confirmed it from the presented screen.
    * @see https://docs.scriptable.app/message/#-send
    */
  def send(): js.Promise[Unit]
}
object Message {
  
  inline def apply(
    addDataAttachment: (Data, String, String) => Callback,
    addFileAttachment: String => Callback,
    addImageAttachment: Image => Callback,
    body: String,
    recipients: js.Array[String],
    send: CallbackTo[js.Promise[Unit]]
  ): Message = {
    val __obj = js.Dynamic.literal(addDataAttachment = js.Any.fromFunction3((t0: Data, t1: String, t2: String) => (addDataAttachment(t0, t1, t2)).runNow()), addFileAttachment = js.Any.fromFunction1((t0: String) => addFileAttachment(t0).runNow()), addImageAttachment = js.Any.fromFunction1((t0: Image) => addImageAttachment(t0).runNow()), body = body.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], send = send.toJsFn)
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setAddDataAttachment(value: (Data, String, String) => Callback): Self = StObject.set(x, "addDataAttachment", js.Any.fromFunction3((t0: Data, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddFileAttachment(value: String => Callback): Self = StObject.set(x, "addFileAttachment", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddImageAttachment(value: Image => Callback): Self = StObject.set(x, "addImageAttachment", js.Any.fromFunction1((t0: Image) => value(t0).runNow()))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setSend(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "send", value.toJsFn)
  }
}
