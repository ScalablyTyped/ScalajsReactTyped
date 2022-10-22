package typingsJapgolly.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetGroupResponse extends StObject {
  
  /**
    * Represents the output of a CreateSubnetGroup operation.
    */
  var SubnetGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsDaxMod.SubnetGroup] = js.undefined
}
object CreateSubnetGroupResponse {
  
  inline def apply(): CreateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetGroupResponse]
  }
  
  extension [Self <: CreateSubnetGroupResponse](x: Self) {
    
    inline def setSubnetGroup(value: SubnetGroup): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
  }
}
