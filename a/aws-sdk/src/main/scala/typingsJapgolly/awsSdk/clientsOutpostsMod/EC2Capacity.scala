package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2Capacity extends StObject {
  
  /**
    *  The family of the EC2 capacity. 
    */
  var Family: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.Family] = js.undefined
  
  /**
    *  The maximum size of the EC2 capacity. 
    */
  var MaxSize: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.MaxSize] = js.undefined
  
  /**
    *  The quantity of the EC2 capacity. 
    */
  var Quantity: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.Quantity] = js.undefined
}
object EC2Capacity {
  
  inline def apply(): EC2Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2Capacity]
  }
  
  extension [Self <: EC2Capacity](x: Self) {
    
    inline def setFamily(value: Family): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setMaxSize(value: MaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
  }
}
