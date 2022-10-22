package typingsJapgolly.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by DeviceLocationTrackingComponent to indicate the user’s distance from the landmarker location. See the Landmarker guide for more information. */
@JSGlobal("LocationProximityStatus")
@js.native
object LocationProximityStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.snapchatLensStudio.LocationProximityStatus & Double] = js.native
  
  /* 2 */ val OutOfRange: typingsJapgolly.snapchatLensStudio.LocationProximityStatus.OutOfRange & Double = js.native
  
  /* 0 */ val Unknown: typingsJapgolly.snapchatLensStudio.LocationProximityStatus.Unknown & Double = js.native
  
  /* 1 */ val WithinRange: typingsJapgolly.snapchatLensStudio.LocationProximityStatus.WithinRange & Double = js.native
}
