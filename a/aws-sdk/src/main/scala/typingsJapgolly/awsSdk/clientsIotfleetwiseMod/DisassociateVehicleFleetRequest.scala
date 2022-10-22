package typingsJapgolly.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateVehicleFleetRequest extends StObject {
  
  /**
    *  The unique ID of a fleet. 
    */
  var fleetId: typingsJapgolly.awsSdk.clientsIotfleetwiseMod.fleetId
  
  /**
    *  The unique ID of the vehicle to disassociate from the fleet.
    */
  var vehicleName: typingsJapgolly.awsSdk.clientsIotfleetwiseMod.vehicleName
}
object DisassociateVehicleFleetRequest {
  
  inline def apply(fleetId: fleetId, vehicleName: vehicleName): DisassociateVehicleFleetRequest = {
    val __obj = js.Dynamic.literal(fleetId = fleetId.asInstanceOf[js.Any], vehicleName = vehicleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVehicleFleetRequest]
  }
  
  extension [Self <: DisassociateVehicleFleetRequest](x: Self) {
    
    inline def setFleetId(value: fleetId): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
    
    inline def setVehicleName(value: vehicleName): Self = StObject.set(x, "vehicleName", value.asInstanceOf[js.Any])
  }
}
