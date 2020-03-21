package typingsJapgolly.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OrdinalColorsInstruction[D] extends js.Object

object _OrdinalColorsInstruction {
  @scala.inline
  def DatumColorInstruction[D](datum: String): _OrdinalColorsInstruction[D] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_OrdinalColorsInstruction[D]]
  }
  @scala.inline
  def SchemeColorInstruction[D](scheme: ColorSchemeId, size: Int | Double = null): _OrdinalColorsInstruction[D] = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OrdinalColorsInstruction[D]]
  }
}

