package typingsJapgolly.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFar extends js.Object {
  var aspectRatio: Double
  var far: Double
  var fov: Double
  var near: Double
  var xOffset: Double
  var yOffset: Double
}

object AnonFar {
  @scala.inline
  def apply(aspectRatio: Double, far: Double, fov: Double, near: Double, xOffset: Double, yOffset: Double): AnonFar = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFar]
  }
}

