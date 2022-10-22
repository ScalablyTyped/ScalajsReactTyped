package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideEmailOutbound extends StObject {
  
  def addAddress(`type`: String, address: String, displayName: String): Unit
  
  def getSubject(): String
  
  def setBody(bodyText: String): Unit
  
  def setFrom(address: String): Unit
  
  def setReplyTo(address: String): Unit
  
  def setSubject(subject: String): Unit
}
object GlideEmailOutbound {
  
  inline def apply(
    addAddress: (String, String, String) => Callback,
    getSubject: CallbackTo[String],
    setBody: String => Callback,
    setFrom: String => Callback,
    setReplyTo: String => Callback,
    setSubject: String => Callback
  ): GlideEmailOutbound = {
    val __obj = js.Dynamic.literal(addAddress = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (addAddress(t0, t1, t2)).runNow()), getSubject = getSubject.toJsFn, setBody = js.Any.fromFunction1((t0: String) => setBody(t0).runNow()), setFrom = js.Any.fromFunction1((t0: String) => setFrom(t0).runNow()), setReplyTo = js.Any.fromFunction1((t0: String) => setReplyTo(t0).runNow()), setSubject = js.Any.fromFunction1((t0: String) => setSubject(t0).runNow()))
    __obj.asInstanceOf[GlideEmailOutbound]
  }
  
  extension [Self <: GlideEmailOutbound](x: Self) {
    
    inline def setAddAddress(value: (String, String, String) => Callback): Self = StObject.set(x, "addAddress", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "getSubject", value.toJsFn)
    
    inline def setSetBody(value: String => Callback): Self = StObject.set(x, "setBody", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFrom(value: String => Callback): Self = StObject.set(x, "setFrom", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetReplyTo(value: String => Callback): Self = StObject.set(x, "setReplyTo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetSubject(value: String => Callback): Self = StObject.set(x, "setSubject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
