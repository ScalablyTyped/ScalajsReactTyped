package typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.formatTime

import typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatTime")
@js.native
object ^ extends js.Object {
  /**
    * Create a time format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new time format function.
    *
    * #### Notes
    * This formatter uses `Date.toTimeString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

