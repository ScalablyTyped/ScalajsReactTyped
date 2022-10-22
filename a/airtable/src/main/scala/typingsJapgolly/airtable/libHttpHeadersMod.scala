package typingsJapgolly.airtable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpHeadersMod {
  
  @JSImport("airtable/lib/http_headers", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HttpHeaders {
    
    /* CompleteClass */
    var _headersByLowercasedKey: Any = js.native
    
    /* CompleteClass */
    override def set(headerKey: String, headerValue: String): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): StringDictionary[String] = js.native
  }
  
  trait HttpHeaders extends StObject {
    
    var _headersByLowercasedKey: Any
    
    def set(headerKey: String, headerValue: String): Unit
    
    def toJSON(): StringDictionary[String]
  }
  object HttpHeaders {
    
    inline def apply(
      _headersByLowercasedKey: Any,
      set: (String, String) => Callback,
      toJSON: CallbackTo[StringDictionary[String]]
    ): HttpHeaders = {
      val __obj = js.Dynamic.literal(_headersByLowercasedKey = _headersByLowercasedKey.asInstanceOf[js.Any], set = js.Any.fromFunction2((t0: String, t1: String) => (set(t0, t1)).runNow()), toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[HttpHeaders]
    }
    
    extension [Self <: HttpHeaders](x: Self) {
      
      inline def setSet(value: (String, String) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setToJSON(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def set_headersByLowercasedKey(value: Any): Self = StObject.set(x, "_headersByLowercasedKey", value.asInstanceOf[js.Any])
    }
  }
}
