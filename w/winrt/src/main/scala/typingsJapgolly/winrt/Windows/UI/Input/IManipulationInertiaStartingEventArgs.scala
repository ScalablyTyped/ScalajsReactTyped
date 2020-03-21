package typingsJapgolly.winrt.Windows.UI.Input

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationInertiaStartingEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var delta: ManipulationDelta
  var pointerDeviceType: PointerDeviceType
  var position: Point
  var velocities: ManipulationVelocities
}

object IManipulationInertiaStartingEventArgs {
  @scala.inline
  def apply(
    cumulative: ManipulationDelta,
    delta: ManipulationDelta,
    pointerDeviceType: PointerDeviceType,
    position: Point,
    velocities: ManipulationVelocities
  ): IManipulationInertiaStartingEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocities = velocities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IManipulationInertiaStartingEventArgs]
  }
}

