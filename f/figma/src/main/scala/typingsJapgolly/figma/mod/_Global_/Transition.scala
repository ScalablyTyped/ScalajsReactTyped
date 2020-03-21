package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.BOTTOM
import typingsJapgolly.figma.figmaStrings.DISSOLVE
import typingsJapgolly.figma.figmaStrings.LEFT
import typingsJapgolly.figma.figmaStrings.MOVE_IN
import typingsJapgolly.figma.figmaStrings.MOVE_OUT
import typingsJapgolly.figma.figmaStrings.PUSH
import typingsJapgolly.figma.figmaStrings.RIGHT
import typingsJapgolly.figma.figmaStrings.SLIDE_IN
import typingsJapgolly.figma.figmaStrings.SLIDE_OUT
import typingsJapgolly.figma.figmaStrings.SMART_ANIMATE
import typingsJapgolly.figma.figmaStrings.TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod._Global_.SimpleTransition
  - typingsJapgolly.figma.mod._Global_.DirectionalTransition
*/
trait Transition extends js.Object

object Transition {
  @scala.inline
  def SimpleTransition(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): Transition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  @scala.inline
  def DirectionalTransition(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): Transition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

