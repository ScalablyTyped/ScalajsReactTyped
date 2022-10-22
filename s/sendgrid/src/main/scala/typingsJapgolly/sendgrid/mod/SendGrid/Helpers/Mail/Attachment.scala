package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  def getContent(): String
  
  def getContentId(): String
  
  def getDisposition(): String
  
  def getFilename(): String
  
  def getType(): String
  
  def setContent(content: String): Unit
  
  def setContentId(contentId: String): Unit
  
  def setDisposition(disposition: String): Unit
  
  def setFilename(filename: String): Unit
  
  def setType(`type`: String): Unit
  
  def toJSON(): typingsJapgolly.sendgrid.anon.Content
}
object Attachment {
  
  inline def apply(
    getContent: CallbackTo[String],
    getContentId: CallbackTo[String],
    getDisposition: CallbackTo[String],
    getFilename: CallbackTo[String],
    getType: CallbackTo[String],
    setContent: String => Callback,
    setContentId: String => Callback,
    setDisposition: String => Callback,
    setFilename: String => Callback,
    setType: String => Callback,
    toJSON: CallbackTo[typingsJapgolly.sendgrid.anon.Content]
  ): Attachment = {
    val __obj = js.Dynamic.literal(getContent = getContent.toJsFn, getContentId = getContentId.toJsFn, getDisposition = getDisposition.toJsFn, getFilename = getFilename.toJsFn, getType = getType.toJsFn, setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()), setContentId = js.Any.fromFunction1((t0: String) => setContentId(t0).runNow()), setDisposition = js.Any.fromFunction1((t0: String) => setDisposition(t0).runNow()), setFilename = js.Any.fromFunction1((t0: String) => setFilename(t0).runNow()), setType = js.Any.fromFunction1((t0: String) => setType(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setGetContent(value: CallbackTo[String]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetContentId(value: CallbackTo[String]): Self = StObject.set(x, "getContentId", value.toJsFn)
    
    inline def setGetDisposition(value: CallbackTo[String]): Self = StObject.set(x, "getDisposition", value.toJsFn)
    
    inline def setGetFilename(value: CallbackTo[String]): Self = StObject.set(x, "getFilename", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSetContent(value: String => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetContentId(value: String => Callback): Self = StObject.set(x, "setContentId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDisposition(value: String => Callback): Self = StObject.set(x, "setDisposition", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFilename(value: String => Callback): Self = StObject.set(x, "setFilename", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetType(value: String => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[typingsJapgolly.sendgrid.anon.Content]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
