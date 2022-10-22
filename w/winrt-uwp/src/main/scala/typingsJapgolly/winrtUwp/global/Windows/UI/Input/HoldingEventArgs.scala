package typingsJapgolly.winrtUwp.global.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the Holding event. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
open class HoldingEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.Input.HoldingEventArgs {
  
  /** Gets the state of the Holding event. */
  /* CompleteClass */
  var holdingState: typingsJapgolly.winrtUwp.Windows.UI.Input.HoldingState = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  /* CompleteClass */
  var position: Point = js.native
}
