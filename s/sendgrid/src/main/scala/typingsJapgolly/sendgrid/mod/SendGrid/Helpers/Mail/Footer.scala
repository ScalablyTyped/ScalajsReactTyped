package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  def getEnable(): Boolean
  
  def getHtml(): String
  
  def getText(): String
  
  def setEnable(enabled: Boolean): Unit
  
  def setHtml(html: String): Unit
  
  def setText(text: String): Unit
  
  def toJSON(): Text
}
object Footer {
  
  inline def apply(
    getEnable: CallbackTo[Boolean],
    getHtml: CallbackTo[String],
    getText: CallbackTo[String],
    setEnable: Boolean => Callback,
    setHtml: String => Callback,
    setText: String => Callback,
    toJSON: CallbackTo[Text]
  ): Footer = {
    val __obj = js.Dynamic.literal(getEnable = getEnable.toJsFn, getHtml = getHtml.toJsFn, getText = getText.toJsFn, setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setHtml = js.Any.fromFunction1((t0: String) => setHtml(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Footer]
  }
  
  extension [Self <: Footer](x: Self) {
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setGetHtml(value: CallbackTo[String]): Self = StObject.set(x, "getHtml", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetHtml(value: String => Callback): Self = StObject.set(x, "setHtml", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Text]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
