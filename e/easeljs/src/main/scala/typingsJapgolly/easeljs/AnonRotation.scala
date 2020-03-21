package typingsJapgolly.easeljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRotation extends js.Object {
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var skewX: Double
  var skewY: Double
  var x: Double
  var y: Double
}

object AnonRotation {
  @scala.inline
  def apply(
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    x: Double,
    y: Double
  ): AnonRotation = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRotation]
  }
}

