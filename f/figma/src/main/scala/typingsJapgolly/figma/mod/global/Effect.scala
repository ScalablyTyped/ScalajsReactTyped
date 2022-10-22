package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.BACKGROUND_BLUR
import typingsJapgolly.figma.figmaStrings.DROP_SHADOW
import typingsJapgolly.figma.figmaStrings.INNER_SHADOW
import typingsJapgolly.figma.figmaStrings.LAYER_BLUR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod.global.ShadowEffect
  - typingsJapgolly.figma.mod.global.BlurEffect
*/
trait Effect extends StObject
object Effect {
  
  inline def BlurEffect(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): typingsJapgolly.figma.mod.global.BlurEffect = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.BlurEffect]
  }
  
  inline def ShadowEffect(
    blendMode: BlendMode,
    color: RGBA,
    offset: Vector,
    radius: Double,
    `type`: DROP_SHADOW | INNER_SHADOW,
    visible: Boolean
  ): typingsJapgolly.figma.mod.global.ShadowEffect = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.ShadowEffect]
  }
}
