package typingsJapgolly.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :std.Array<any> | undefined,   meta :any | undefined} */
trait ResponsedataArrayanyundef
  extends StObject
     with /* others */ StringDictionary[Any] {
  
  var data: js.UndefOr[Any] & js.UndefOr[js.Array[Any]]
  
  var message: String
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var status: Boolean
}
object ResponsedataArrayanyundef {
  
  inline def apply(data: js.UndefOr[Any] & js.UndefOr[js.Array[Any]], message: String, status: Boolean): ResponsedataArrayanyundef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayanyundef]
  }
  
  extension [Self <: ResponsedataArrayanyundef](x: Self) {
    
    inline def setData(value: js.UndefOr[Any] & js.UndefOr[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
