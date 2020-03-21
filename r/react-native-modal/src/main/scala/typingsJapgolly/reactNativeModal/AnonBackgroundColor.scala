package typingsJapgolly.reactNativeModal

import typingsJapgolly.reactNativeModal.reactNativeModalStrings.absolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var backgroundColor: String
  var bottom: Double
  var left: Double
  var opacity: Double
  var position: absolute
  var right: Double
  var top: Double
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    bottom: Double,
    left: Double,
    opacity: Double,
    position: absolute,
    right: Double,
    top: Double
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

