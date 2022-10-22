package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSubnetGroupResult extends StObject {
  
  var ClusterSubnetGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.ClusterSubnetGroup] = js.undefined
}
object CreateClusterSubnetGroupResult {
  
  inline def apply(): CreateClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterSubnetGroupResult]
  }
  
  extension [Self <: CreateClusterSubnetGroupResult](x: Self) {
    
    inline def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = StObject.set(x, "ClusterSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupUndefined: Self = StObject.set(x, "ClusterSubnetGroup", js.undefined)
  }
}
