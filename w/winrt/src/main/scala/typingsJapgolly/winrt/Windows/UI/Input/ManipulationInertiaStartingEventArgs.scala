package typingsJapgolly.winrt.Windows.UI.Input

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManipulationInertiaStartingEventArgs
  extends StObject
     with IManipulationInertiaStartingEventArgs
object ManipulationInertiaStartingEventArgs {
  
  inline def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): ManipulationInertiaStartingEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationInertiaStartingEventArgs]
  }
}
