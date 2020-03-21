package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.encodeMod.ColorHCL
import typingsJapgolly.vegaTypings.encodeMod.ColorHSL
import typingsJapgolly.vegaTypings.encodeMod.ColorLAB
import typingsJapgolly.vegaTypings.encodeMod.ColorRGB
import typingsJapgolly.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends _ColorValueRef {
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL
}

object AnonColor {
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

