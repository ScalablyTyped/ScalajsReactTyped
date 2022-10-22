package typingsJapgolly.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.anon.`2`
  - typingsJapgolly.figma.anon.Color
*/
trait OverlayBackground extends StObject
object OverlayBackground {
  
  inline def `2`(): typingsJapgolly.figma.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NONE")
    __obj.asInstanceOf[typingsJapgolly.figma.anon.`2`]
  }
  
  inline def Color(color: RGBA): typingsJapgolly.figma.anon.Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOLID_COLOR")
    __obj.asInstanceOf[typingsJapgolly.figma.anon.Color]
  }
}
