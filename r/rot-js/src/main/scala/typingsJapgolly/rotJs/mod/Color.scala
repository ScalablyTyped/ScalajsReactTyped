package typingsJapgolly.rotJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Color")
@js.native
object Color extends js.Object {
  def add(color1: typingsJapgolly.rotJs.colorMod.Color, colors: typingsJapgolly.rotJs.colorMod.Color*): typingsJapgolly.rotJs.colorMod.Color = js.native
  def add_(color1: typingsJapgolly.rotJs.colorMod.Color, colors: typingsJapgolly.rotJs.colorMod.Color*): typingsJapgolly.rotJs.colorMod.Color = js.native
  def fromString(str: String): js.Array[Double] = js.native
  def hsl2rgb(color: typingsJapgolly.rotJs.colorMod.Color): typingsJapgolly.rotJs.colorMod.Color = js.native
  def interpolate(color1: typingsJapgolly.rotJs.colorMod.Color, color2: typingsJapgolly.rotJs.colorMod.Color): typingsJapgolly.rotJs.colorMod.Color = js.native
  def interpolate(
    color1: typingsJapgolly.rotJs.colorMod.Color,
    color2: typingsJapgolly.rotJs.colorMod.Color,
    factor: Double
  ): typingsJapgolly.rotJs.colorMod.Color = js.native
  def interpolateHSL(color1: typingsJapgolly.rotJs.colorMod.Color, color2: typingsJapgolly.rotJs.colorMod.Color): typingsJapgolly.rotJs.colorMod.Color = js.native
  def interpolateHSL(
    color1: typingsJapgolly.rotJs.colorMod.Color,
    color2: typingsJapgolly.rotJs.colorMod.Color,
    factor: Double
  ): typingsJapgolly.rotJs.colorMod.Color = js.native
  def multiply(color1: typingsJapgolly.rotJs.colorMod.Color, colors: typingsJapgolly.rotJs.colorMod.Color*): typingsJapgolly.rotJs.colorMod.Color = js.native
  def multiply_(color1: typingsJapgolly.rotJs.colorMod.Color, colors: typingsJapgolly.rotJs.colorMod.Color*): typingsJapgolly.rotJs.colorMod.Color = js.native
  def randomize(color: typingsJapgolly.rotJs.colorMod.Color, diff: Double): typingsJapgolly.rotJs.colorMod.Color = js.native
  def randomize(color: typingsJapgolly.rotJs.colorMod.Color, diff: typingsJapgolly.rotJs.colorMod.Color): typingsJapgolly.rotJs.colorMod.Color = js.native
  def rgb2hsl(color: typingsJapgolly.rotJs.colorMod.Color): typingsJapgolly.rotJs.colorMod.Color = js.native
  def toHex(color: typingsJapgolly.rotJs.colorMod.Color): String = js.native
  def toRGB(color: typingsJapgolly.rotJs.colorMod.Color): String = js.native
}

