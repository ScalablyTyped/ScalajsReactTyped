package typingsJapgolly.figma.mod.global

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod.global.SimpleTransition
  - typingsJapgolly.figma.mod.global.DirectionalTransition
*/
trait Transition extends StObject
object Transition {
  
  inline def DirectionalTransition(
    direction: LEFT | RIGHT | TOP | BOTTOM,
    duration: Double,
    easing: Easing,
    matchLayers: Boolean,
    `type`: MOVE_IN | MOVE_OUT | PUSH | SLIDE_IN | SLIDE_OUT
  ): typingsJapgolly.figma.mod.global.DirectionalTransition = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], matchLayers = matchLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.DirectionalTransition]
  }
  
  inline def SimpleTransition(duration: Double, easing: Easing, `type`: DISSOLVE | SMART_ANIMATE): typingsJapgolly.figma.mod.global.SimpleTransition = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.SimpleTransition]
  }
}
