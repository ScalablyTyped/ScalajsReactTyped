package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitysourcesResource extends StObject {
  
  var items: ItemsResource
  
  var unmappedids: UnmappedidsResource
}
object IdentitysourcesResource {
  
  inline def apply(items: ItemsResource, unmappedids: UnmappedidsResource): IdentitysourcesResource = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], unmappedids = unmappedids.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitysourcesResource]
  }
  
  extension [Self <: IdentitysourcesResource](x: Self) {
    
    inline def setItems(value: ItemsResource): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setUnmappedids(value: UnmappedidsResource): Self = StObject.set(x, "unmappedids", value.asInstanceOf[js.Any])
  }
}
