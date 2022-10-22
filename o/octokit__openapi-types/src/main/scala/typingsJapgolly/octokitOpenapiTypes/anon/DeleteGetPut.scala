package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPut extends StObject {
  
  var delete: Responses275
  
  var get: Responses404Content4
  
  /** Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)." */
  var put: Responses275
}
object DeleteGetPut {
  
  inline def apply(delete: Responses275, get: Responses404Content4, put: Responses275): DeleteGetPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPut]
  }
  
  extension [Self <: DeleteGetPut](x: Self) {
    
    inline def setDelete(value: Responses275): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses404Content4): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses275): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
