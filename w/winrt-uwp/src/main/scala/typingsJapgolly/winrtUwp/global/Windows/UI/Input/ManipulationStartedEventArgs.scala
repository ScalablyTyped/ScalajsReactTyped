package typingsJapgolly.winrtUwp.global.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.UI.Input.ManipulationDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the ManipulationStarted event. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
@js.native
open class ManipulationStartedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.Input.ManipulationStartedEventArgs {
  
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation before the ManipulationStarted event. */
  /* CompleteClass */
  var cumulative: ManipulationDelta = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  /* CompleteClass */
  var position: Point = js.native
}
