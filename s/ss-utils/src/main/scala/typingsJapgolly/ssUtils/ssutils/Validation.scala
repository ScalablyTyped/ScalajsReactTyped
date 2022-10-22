package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validation extends StObject {
  
  def errorFilter(errorMsg: String, errorCode: String, `type`: String): Unit
  
  var messages: StringDictionary[String]
  
  var overrideMessages: Boolean
}
object Validation {
  
  inline def apply(
    errorFilter: (String, String, String) => Callback,
    messages: StringDictionary[String],
    overrideMessages: Boolean
  ): Validation = {
    val __obj = js.Dynamic.literal(errorFilter = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (errorFilter(t0, t1, t2)).runNow()), messages = messages.asInstanceOf[js.Any], overrideMessages = overrideMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validation]
  }
  
  extension [Self <: Validation](x: Self) {
    
    inline def setErrorFilter(value: (String, String, String) => Callback): Self = StObject.set(x, "errorFilter", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOverrideMessages(value: Boolean): Self = StObject.set(x, "overrideMessages", value.asInstanceOf[js.Any])
  }
}
