package typingsJapgolly.winrtUwp.global.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Tapped event. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.TappedEventArgs")
@js.native
open class TappedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.Input.TappedEventArgs {
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  /* CompleteClass */
  var position: Point = js.native
  
  /** Gets the number of times the tap interaction was detected. */
  /* CompleteClass */
  var tapCount: Double = js.native
}
