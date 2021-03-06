package typingsJapgolly.winrtUwp.Windows.Devices.Geolocation.Geofencing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MonitoredGeofenceStates extends js.Object

/** Indicates the state or states of the Geofences that are currently being monitored by the system. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates")
@js.native
object MonitoredGeofenceStates extends js.Object {
  /** The device has entered a geofence area. */
  @js.native
  sealed trait entered extends MonitoredGeofenceStates
  
  /** The device has left a geofence area. */
  @js.native
  sealed trait exited extends MonitoredGeofenceStates
  
  /** No flag is set. */
  @js.native
  sealed trait none extends MonitoredGeofenceStates
  
  /** The geofence has been removed. */
  @js.native
  sealed trait removed extends MonitoredGeofenceStates
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MonitoredGeofenceStates with Double] = js.native
  /* 1 */ @js.native
  object entered extends TopLevel[entered with Double]
  
  /* 2 */ @js.native
  object exited extends TopLevel[exited with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object removed extends TopLevel[removed with Double]
  
}

