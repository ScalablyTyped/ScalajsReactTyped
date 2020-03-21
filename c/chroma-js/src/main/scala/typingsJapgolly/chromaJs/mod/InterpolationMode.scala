package typingsJapgolly.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromaJs.chromaJsStrings.rgb
  - typingsJapgolly.chromaJs.chromaJsStrings.hsl
  - typingsJapgolly.chromaJs.chromaJsStrings.hsv
  - typingsJapgolly.chromaJs.chromaJsStrings.hsi
  - typingsJapgolly.chromaJs.chromaJsStrings.lab
  - typingsJapgolly.chromaJs.chromaJsStrings.lch
  - typingsJapgolly.chromaJs.chromaJsStrings.hcl
  - typingsJapgolly.chromaJs.chromaJsStrings.lrgb
*/
trait InterpolationMode extends js.Object

object InterpolationMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hcl: typingsJapgolly.chromaJs.chromaJsStrings.hcl = this.cast("hcl")
  @scala.inline
  def hsi: typingsJapgolly.chromaJs.chromaJsStrings.hsi = this.cast("hsi")
  @scala.inline
  def hsl: typingsJapgolly.chromaJs.chromaJsStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsv: typingsJapgolly.chromaJs.chromaJsStrings.hsv = this.cast("hsv")
  @scala.inline
  def lab: typingsJapgolly.chromaJs.chromaJsStrings.lab = this.cast("lab")
  @scala.inline
  def lch: typingsJapgolly.chromaJs.chromaJsStrings.lch = this.cast("lch")
  @scala.inline
  def lrgb: typingsJapgolly.chromaJs.chromaJsStrings.lrgb = this.cast("lrgb")
  @scala.inline
  def rgb: typingsJapgolly.chromaJs.chromaJsStrings.rgb = this.cast("rgb")
}

