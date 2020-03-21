package typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.formatDate

import typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatDate")
@js.native
object ^ extends js.Object {
  /**
    * Create a date format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new date format function.
    *
    * #### Notes
    * This formatter uses `Date.toDateString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

