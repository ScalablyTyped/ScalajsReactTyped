package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.CROP
import typingsJapgolly.figma.figmaStrings.FILL
import typingsJapgolly.figma.figmaStrings.FIT
import typingsJapgolly.figma.figmaStrings.GRADIENT_ANGULAR
import typingsJapgolly.figma.figmaStrings.GRADIENT_DIAMOND
import typingsJapgolly.figma.figmaStrings.GRADIENT_LINEAR
import typingsJapgolly.figma.figmaStrings.GRADIENT_RADIAL
import typingsJapgolly.figma.figmaStrings.TILE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod.global.SolidPaint
  - typingsJapgolly.figma.mod.global.GradientPaint
  - typingsJapgolly.figma.mod.global.ImagePaint
*/
trait Paint extends StObject
object Paint {
  
  inline def GradientPaint(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): typingsJapgolly.figma.mod.global.GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.GradientPaint]
  }
  
  inline def ImagePaint(scaleMode: FILL | FIT | CROP | TILE): typingsJapgolly.figma.mod.global.ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any], imageHash = null)
    __obj.updateDynamic("type")("IMAGE")
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.ImagePaint]
  }
  
  inline def SolidPaint(color: RGB): typingsJapgolly.figma.mod.global.SolidPaint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOLID")
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.SolidPaint]
  }
}
