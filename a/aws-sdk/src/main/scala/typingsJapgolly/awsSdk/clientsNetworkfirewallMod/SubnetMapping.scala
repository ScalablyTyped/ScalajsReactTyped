package typingsJapgolly.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetMapping extends StObject {
  
  /**
    * The unique identifier for the subnet. 
    */
  var SubnetId: CollectionMemberString
}
object SubnetMapping {
  
  inline def apply(SubnetId: CollectionMemberString): SubnetMapping = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetMapping]
  }
  
  extension [Self <: SubnetMapping](x: Self) {
    
    inline def setSubnetId(value: CollectionMemberString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
