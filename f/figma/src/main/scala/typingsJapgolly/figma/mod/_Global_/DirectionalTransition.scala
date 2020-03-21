package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.BOTTOM
import typingsJapgolly.figma.figmaStrings.LEFT
import typingsJapgolly.figma.figmaStrings.MOVE_IN
import typingsJapgolly.figma.figmaStrings.MOVE_OUT
import typingsJapgolly.figma.figmaStrings.PUSH
import typingsJapgolly.figma.figmaStrings.RIGHT
import typingsJapgolly.figma.figmaStrings.SLIDE_IN
import typingsJapgolly.figma.figmaStrings.SLIDE_OUT
import typingsJapgolly.figma.figmaStrings.TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionalTransition extends Transition {
  val direction: LEFT | RIGHT | TOP | BOTTOM
  val duration: Double
  val easing: Easing
  val matchLayers: Boolean
  val `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
}

object DirectionalTransition {
  @scala.inline
  def apply(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): DirectionalTransition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalTransition]
  }
}

