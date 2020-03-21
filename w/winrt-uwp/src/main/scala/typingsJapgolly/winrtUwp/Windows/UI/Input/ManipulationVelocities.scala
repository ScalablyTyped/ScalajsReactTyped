package typingsJapgolly.winrtUwp.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the velocities of the accumulated transformations for the current interaction. */
trait ManipulationVelocities extends js.Object {
  /** The rotational velocity in degrees per millisecond. */
  var angular: Double
  /** The expansion, or scaling, velocity in DIPs per millisecond. */
  var expansion: Double
  /** The straight line velocity in DIPs per millisecond. */
  var linear: Point
}

object ManipulationVelocities {
  @scala.inline
  def apply(angular: Double, expansion: Double, linear: Point): ManipulationVelocities = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], expansion = expansion.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManipulationVelocities]
  }
}

