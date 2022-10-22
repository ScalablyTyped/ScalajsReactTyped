package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItem extends StObject {
  
  /**
    *  Information about assets. 
    */
  var AssetInformationList: js.UndefOr[LineItemAssetInformationList] = js.undefined
  
  /**
    *  The ID of the catalog item. 
    */
  var CatalogItemId: js.UndefOr[SkuCode] = js.undefined
  
  /**
    * The ID of the line item.
    */
  var LineItemId: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.LineItemId] = js.undefined
  
  /**
    * The quantity of the line item.
    */
  var Quantity: js.UndefOr[LineItemQuantity] = js.undefined
  
  /**
    *  Information about a line item shipment. 
    */
  var ShipmentInformation: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.ShipmentInformation] = js.undefined
  
  /**
    * The status of the line item.
    */
  var Status: js.UndefOr[LineItemStatus] = js.undefined
}
object LineItem {
  
  inline def apply(): LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItem]
  }
  
  extension [Self <: LineItem](x: Self) {
    
    inline def setAssetInformationList(value: LineItemAssetInformationList): Self = StObject.set(x, "AssetInformationList", value.asInstanceOf[js.Any])
    
    inline def setAssetInformationListUndefined: Self = StObject.set(x, "AssetInformationList", js.undefined)
    
    inline def setAssetInformationListVarargs(value: LineItemAssetInformation*): Self = StObject.set(x, "AssetInformationList", js.Array(value*))
    
    inline def setCatalogItemId(value: SkuCode): Self = StObject.set(x, "CatalogItemId", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemIdUndefined: Self = StObject.set(x, "CatalogItemId", js.undefined)
    
    inline def setLineItemId(value: LineItemId): Self = StObject.set(x, "LineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "LineItemId", js.undefined)
    
    inline def setQuantity(value: LineItemQuantity): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
    
    inline def setShipmentInformation(value: ShipmentInformation): Self = StObject.set(x, "ShipmentInformation", value.asInstanceOf[js.Any])
    
    inline def setShipmentInformationUndefined: Self = StObject.set(x, "ShipmentInformation", js.undefined)
    
    inline def setStatus(value: LineItemStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
