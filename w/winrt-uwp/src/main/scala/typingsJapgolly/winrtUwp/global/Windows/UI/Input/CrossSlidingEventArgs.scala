package typingsJapgolly.winrtUwp.global.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the CrossSliding event. */
/* note: abstract class */ @JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
@js.native
open class CrossSlidingEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.Input.CrossSlidingEventArgs {
  
  /** Gets the state of the CrossSliding event. */
  /* CompleteClass */
  var crossSlidingState: typingsJapgolly.winrtUwp.Windows.UI.Input.CrossSlidingState = js.native
  
  /** Gets the device type of the input source. */
  /* CompleteClass */
  var pointerDeviceType: PointerDeviceType = js.native
  
  /** Gets the location of the touch contact. */
  /* CompleteClass */
  var position: Point = js.native
}
