package typingsJapgolly.winrt.Windows.UI.Input

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHoldingEventArgs extends StObject {
  
  var holdingState: HoldingState
  
  var pointerDeviceType: PointerDeviceType
  
  var position: Point
}
object IHoldingEventArgs {
  
  inline def apply(holdingState: HoldingState, pointerDeviceType: PointerDeviceType, position: Point): IHoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoldingEventArgs]
  }
  
  extension [Self <: IHoldingEventArgs](x: Self) {
    
    inline def setHoldingState(value: HoldingState): Self = StObject.set(x, "holdingState", value.asInstanceOf[js.Any])
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
