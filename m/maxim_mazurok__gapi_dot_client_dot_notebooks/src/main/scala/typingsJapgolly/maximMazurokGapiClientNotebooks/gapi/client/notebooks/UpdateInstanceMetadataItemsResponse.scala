package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceMetadataItemsResponse extends StObject {
  
  /** Map of items that were added/updated to/in the metadata. */
  var items: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object UpdateInstanceMetadataItemsResponse {
  
  inline def apply(): UpdateInstanceMetadataItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceMetadataItemsResponse]
  }
  
  extension [Self <: UpdateInstanceMetadataItemsResponse](x: Self) {
    
    inline def setItems(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
