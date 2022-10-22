package typingsJapgolly.winrtUwp.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the CrossSliding event. */
trait CrossSlidingEventArgs extends StObject {
  
  /** Gets the state of the CrossSliding event. */
  var crossSlidingState: CrossSlidingState
  
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  
  /** Gets the location of the touch contact. */
  var position: Point
}
object CrossSlidingEventArgs {
  
  inline def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): CrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlidingEventArgs]
  }
  
  extension [Self <: CrossSlidingEventArgs](x: Self) {
    
    inline def setCrossSlidingState(value: CrossSlidingState): Self = StObject.set(x, "crossSlidingState", value.asInstanceOf[js.Any])
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
