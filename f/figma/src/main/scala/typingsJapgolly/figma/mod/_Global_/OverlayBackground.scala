package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.NONE
import typingsJapgolly.figma.figmaStrings.SOLID_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.Anon2
  - typingsJapgolly.figma.AnonColor
*/
trait OverlayBackground extends js.Object

object OverlayBackground {
  @scala.inline
  def Anon2(`type`: NONE): OverlayBackground = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayBackground]
  }
  @scala.inline
  def AnonColor(color: RGBA, `type`: SOLID_COLOR): OverlayBackground = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayBackground]
  }
}

