package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexItemRequest extends StObject {
  
  /** The name of connector making this call. Format: datasources/{source_id}/connectors/{ID} */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.undefined
  
  var indexItemOptions: js.UndefOr[IndexItemOptions] = js.undefined
  
  /** The name of the item. Format: datasources/{source_id}/items/{item_id} */
  var item: js.UndefOr[Item] = js.undefined
  
  /** Required. The RequestMode for this request. */
  var mode: js.UndefOr[String] = js.undefined
}
object IndexItemRequest {
  
  inline def apply(): IndexItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexItemRequest]
  }
  
  extension [Self <: IndexItemRequest](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setIndexItemOptions(value: IndexItemOptions): Self = StObject.set(x, "indexItemOptions", value.asInstanceOf[js.Any])
    
    inline def setIndexItemOptionsUndefined: Self = StObject.set(x, "indexItemOptions", js.undefined)
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
