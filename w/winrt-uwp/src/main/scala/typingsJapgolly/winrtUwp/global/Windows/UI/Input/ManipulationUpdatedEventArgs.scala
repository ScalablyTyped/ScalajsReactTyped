package typingsJapgolly.winrtUwp.global.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.UI.Input.ManipulationDelta
import typingsJapgolly.winrtUwp.Windows.UI.Input.ManipulationVelocities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the ManipulationUpdated event. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
@js.native
open class ManipulationUpdatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.Input.ManipulationUpdatedEventArgs {
  
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation from the beginning of the interaction to the ManipulationUpdated event. */
  /* CompleteClass */
  var cumulative: ManipulationDelta = js.native
  
  /** Gets values that indicate the changes in the transformation deltas (translation, rotation, scale) of a manipulation since the last manipulation event. */
  /* CompleteClass */
  var delta: ManipulationDelta = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  /* CompleteClass */
  var position: Point = js.native
  
  /** Gets values that indicate the velocities of the transformation deltas (translation, rotation, scale) for a manipulation at the ManipulationUpdated event. */
  /* CompleteClass */
  var velocities: ManipulationVelocities = js.native
}
