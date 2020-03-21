package typingsJapgolly.bootstrapColorpicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.hex
  - typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.rgb
  - typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.rgba
*/
trait ColorFormat extends js.Object

object ColorFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.hex = this.cast("hex")
  @scala.inline
  def rgb: typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.rgb = this.cast("rgb")
  @scala.inline
  def rgba: typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.rgba = this.cast("rgba")
}

