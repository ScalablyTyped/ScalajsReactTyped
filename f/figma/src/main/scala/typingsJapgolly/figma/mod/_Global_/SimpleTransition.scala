package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.DISSOLVE
import typingsJapgolly.figma.figmaStrings.SMART_ANIMATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTransition extends Transition {
  val duration: Double
  val easing: Easing
  val `type`: DISSOLVE | SMART_ANIMATE
}

object SimpleTransition {
  @scala.inline
  def apply(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): SimpleTransition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTransition]
  }
}

