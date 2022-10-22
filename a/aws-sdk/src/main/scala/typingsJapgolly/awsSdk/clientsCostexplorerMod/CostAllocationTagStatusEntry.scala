package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostAllocationTagStatusEntry extends StObject {
  
  /**
    * The status of a cost allocation tag. 
    */
  var Status: CostAllocationTagStatus
  
  /**
    * The key for the cost allocation tag. 
    */
  var TagKey: typingsJapgolly.awsSdk.clientsCostexplorerMod.TagKey
}
object CostAllocationTagStatusEntry {
  
  inline def apply(Status: CostAllocationTagStatus, TagKey: TagKey): CostAllocationTagStatusEntry = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], TagKey = TagKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostAllocationTagStatusEntry]
  }
  
  extension [Self <: CostAllocationTagStatusEntry](x: Self) {
    
    inline def setStatus(value: CostAllocationTagStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
  }
}
