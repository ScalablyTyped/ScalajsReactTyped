package typingsJapgolly.googleMaps.google.maps.journeySharing

import typingsJapgolly.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * The details for a task returned by Fleet Engine.
  */
trait Task extends StObject {
  
  /**
    * The timestamp of the estimated completion time of the task.
    */
  var estimatedCompletionTime: js.Date | Null
  
  /**
    * Information specific to the last location update.
    */
  var latestVehicleLocationUpdate: VehicleLocationUpdate | Null
  
  /**
    * The task name in the format
    * &quot;providers/{provider_id}/tasks/{task_id}&quot;. The task_id must be
    * a unique identifier and not a tracking ID. To store a tracking ID of a
    * shipment, use the tracking_id field. Multiple tasks can have the same
    * tracking_id.
    */
  var name: String | Null
  
  /**
    * The outcome of the task.
    */
  var outcome: String | Null
  
  /**
    * The location where the task was completed (from provider).
    */
  var outcomeLocation: LatLngLiteral | Null
  
  /**
    * The setter of the task outcome location (&#39;PROVIDER&#39; or
    * &#39;LAST_VEHICLE_LOCATION&#39;).
    */
  var outcomeLocationSource: String | Null
  
  /**
    * The timestamp of when the task&#39;s outcome was set (from provider).
    */
  var outcomeTime: js.Date | Null
  
  /**
    * The location where the task is to be completed.
    */
  var plannedLocation: LatLngLiteral | Null
  
  /**
    * Information about the segments left to be completed for this task.
    */
  var remainingVehicleJourneySegments: js.Array[VehicleJourneySegment] | Null
  
  /**
    * The current execution state of the task.
    */
  var status: String | Null
  
  /**
    * The tracking ID of the shipment.
    */
  var trackingId: String | Null
  
  /**
    * The task type; for example, a break or shipment.
    */
  var `type`: String | Null
  
  /**
    * The ID of the vehicle performing this task.
    */
  var vehicleId: String | Null
}
object Task {
  
  inline def apply(): Task = {
    val __obj = js.Dynamic.literal(estimatedCompletionTime = null, latestVehicleLocationUpdate = null, name = null, outcome = null, outcomeLocation = null, outcomeLocationSource = null, outcomeTime = null, plannedLocation = null, remainingVehicleJourneySegments = null, status = null, trackingId = null, vehicleId = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setEstimatedCompletionTime(value: js.Date): Self = StObject.set(x, "estimatedCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCompletionTimeNull: Self = StObject.set(x, "estimatedCompletionTime", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeLocation(value: LatLngLiteral): Self = StObject.set(x, "outcomeLocation", value.asInstanceOf[js.Any])
    
    inline def setOutcomeLocationNull: Self = StObject.set(x, "outcomeLocation", null)
    
    inline def setOutcomeLocationSource(value: String): Self = StObject.set(x, "outcomeLocationSource", value.asInstanceOf[js.Any])
    
    inline def setOutcomeLocationSourceNull: Self = StObject.set(x, "outcomeLocationSource", null)
    
    inline def setOutcomeNull: Self = StObject.set(x, "outcome", null)
    
    inline def setOutcomeTime(value: js.Date): Self = StObject.set(x, "outcomeTime", value.asInstanceOf[js.Any])
    
    inline def setOutcomeTimeNull: Self = StObject.set(x, "outcomeTime", null)
    
    inline def setPlannedLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedLocationNull: Self = StObject.set(x, "plannedLocation", null)
    
    inline def setRemainingVehicleJourneySegments(value: js.Array[VehicleJourneySegment]): Self = StObject.set(x, "remainingVehicleJourneySegments", value.asInstanceOf[js.Any])
    
    inline def setRemainingVehicleJourneySegmentsNull: Self = StObject.set(x, "remainingVehicleJourneySegments", null)
    
    inline def setRemainingVehicleJourneySegmentsVarargs(value: VehicleJourneySegment*): Self = StObject.set(x, "remainingVehicleJourneySegments", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setVehicleId(value: String): Self = StObject.set(x, "vehicleId", value.asInstanceOf[js.Any])
    
    inline def setVehicleIdNull: Self = StObject.set(x, "vehicleId", null)
  }
}
