package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APIResponseSuccess
  extends StObject
     with APIResponse {
  
  var data: APIResponseData
  
  var meta: APIResponseMeta
}
object APIResponseSuccess {
  
  inline def apply(data: APIResponseData, meta: APIResponseMeta): APIResponseSuccess = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponseSuccess]
  }
  
  extension [Self <: APIResponseSuccess](x: Self) {
    
    inline def setData(value: APIResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMeta(value: APIResponseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
