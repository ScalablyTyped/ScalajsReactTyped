package typingsJapgolly.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncreaseReplicationFactorRequest extends StObject {
  
  /**
    * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * The name of the DAX cluster that will receive additional nodes.
    */
  var ClusterName: String
  
  /**
    * The new number of nodes for the DAX cluster.
    */
  var NewReplicationFactor: Integer
}
object IncreaseReplicationFactorRequest {
  
  inline def apply(ClusterName: String, NewReplicationFactor: Integer): IncreaseReplicationFactorRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NewReplicationFactor = NewReplicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseReplicationFactorRequest]
  }
  
  extension [Self <: IncreaseReplicationFactorRequest](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setNewReplicationFactor(value: Integer): Self = StObject.set(x, "NewReplicationFactor", value.asInstanceOf[js.Any])
  }
}
