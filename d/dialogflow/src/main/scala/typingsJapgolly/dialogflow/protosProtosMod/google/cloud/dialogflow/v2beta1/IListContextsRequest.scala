package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListContextsRequest. */
trait IListContextsRequest extends StObject {
  
  /** ListContextsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /** ListContextsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /** ListContextsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object IListContextsRequest {
  
  inline def apply(): IListContextsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListContextsRequest]
  }
  
  extension [Self <: IListContextsRequest](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
