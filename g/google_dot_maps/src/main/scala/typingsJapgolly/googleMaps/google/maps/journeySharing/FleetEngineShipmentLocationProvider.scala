package typingsJapgolly.googleMaps.google.maps.journeySharing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Shipment location provider.
  */
trait FleetEngineShipmentLocationProvider
  extends StObject
     with LocationProvider {
  
  /**
    * Returns the currently tracked task.
    */
  def getTask(): Task | Null
  
  /**
    * Explicitly refreshes the tracked location.
    */
  def refresh(): Unit
  
  /**
    * The tracking ID for the task that this location provider observes. Set
    * this field to begin tracking.
    */
  var trackingId: String
}
object FleetEngineShipmentLocationProvider {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    getTask: CallbackTo[Task | Null],
    refresh: Callback,
    trackingId: String
  ): FleetEngineShipmentLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), getTask = getTask.toJsFn, refresh = refresh.toJsFn, trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetEngineShipmentLocationProvider]
  }
  
  extension [Self <: FleetEngineShipmentLocationProvider](x: Self) {
    
    inline def setGetTask(value: CallbackTo[Task | Null]): Self = StObject.set(x, "getTask", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
  }
}
