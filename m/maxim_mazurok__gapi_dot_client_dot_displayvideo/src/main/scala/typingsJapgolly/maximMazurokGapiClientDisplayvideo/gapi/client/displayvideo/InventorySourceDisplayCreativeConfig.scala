package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceDisplayCreativeConfig extends StObject {
  
  /** The size requirements for display creatives that can be assigned to the inventory source. */
  var creativeSize: js.UndefOr[Dimensions] = js.undefined
}
object InventorySourceDisplayCreativeConfig {
  
  inline def apply(): InventorySourceDisplayCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceDisplayCreativeConfig]
  }
  
  extension [Self <: InventorySourceDisplayCreativeConfig](x: Self) {
    
    inline def setCreativeSize(value: Dimensions): Self = StObject.set(x, "creativeSize", value.asInstanceOf[js.Any])
    
    inline def setCreativeSizeUndefined: Self = StObject.set(x, "creativeSize", js.undefined)
  }
}
