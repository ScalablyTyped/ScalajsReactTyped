package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.Color
import typingsJapgolly.plotlyJs.plotlyJsStrings.horizontal
import typingsJapgolly.plotlyJs.plotlyJsStrings.none
import typingsJapgolly.plotlyJs.plotlyJsStrings.radial
import typingsJapgolly.plotlyJs.plotlyJsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsrc extends js.Object {
  var color: Color
  var colorsrc: js.Any
  var `type`: radial | horizontal | vertical | none
  var typesrc: js.Any
}

object AnonColorsrc {
  @scala.inline
  def apply(color: Color, colorsrc: js.Any, `type`: radial | horizontal | vertical | none, typesrc: js.Any): AnonColorsrc = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorsrc = colorsrc.asInstanceOf[js.Any], typesrc = typesrc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsrc]
  }
}

