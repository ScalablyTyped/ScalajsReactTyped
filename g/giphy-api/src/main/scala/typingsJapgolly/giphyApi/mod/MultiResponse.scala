package typingsJapgolly.giphyApi.mod

import typingsJapgolly.giphyApi.anon.Count
import typingsJapgolly.giphyApi.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiResponse
  extends StObject
     with BaseResponse {
  
  var data: js.Array[GIFObject]
}
object MultiResponse {
  
  inline def apply(data: js.Array[GIFObject], meta: Msg, pagination: Count): MultiResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiResponse]
  }
  
  extension [Self <: MultiResponse](x: Self) {
    
    inline def setData(value: js.Array[GIFObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: GIFObject*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
