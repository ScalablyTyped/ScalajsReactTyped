package typingsJapgolly.winrt.Windows.UI.Input

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IManipulationUpdatedEventArgs extends StObject {
  
  var cumulative: ManipulationDelta
  
  var delta: ManipulationDelta
  
  var pointerDeviceType: PointerDeviceType
  
  var position: Point
  
  var velocities: ManipulationVelocities
}
object IManipulationUpdatedEventArgs {
  
  inline def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManipulationUpdatedEventArgs]
  }
  
  extension [Self <: IManipulationUpdatedEventArgs](x: Self) {
    
    inline def setCumulative(value: ManipulationDelta): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: ManipulationDelta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setPointerDeviceType(value: PointerDeviceType): Self = StObject.set(x, "pointerDeviceType", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setVelocities(value: ManipulationVelocities): Self = StObject.set(x, "velocities", value.asInstanceOf[js.Any])
  }
}
