package typingsJapgolly.materialUiCore.colorManipulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.rgb
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.rgba
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.hsl
  - typingsJapgolly.materialUiCore.materialUiCoreStrings.hsla
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hsl: typingsJapgolly.materialUiCore.materialUiCoreStrings.hsl = this.cast("hsl")
  @scala.inline
  def hsla: typingsJapgolly.materialUiCore.materialUiCoreStrings.hsla = this.cast("hsla")
  @scala.inline
  def rgb: typingsJapgolly.materialUiCore.materialUiCoreStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typingsJapgolly.materialUiCore.materialUiCoreStrings.rgba = this.cast("rgba")
}

