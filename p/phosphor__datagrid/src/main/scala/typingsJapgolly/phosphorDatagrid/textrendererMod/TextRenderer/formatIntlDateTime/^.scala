package typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.formatIntlDateTime

import typingsJapgolly.phosphorDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/textrenderer", "TextRenderer.formatIntlDateTime")
@js.native
object ^ extends js.Object {
  /**
    * Create an international datetime format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new international datetime format function.
    *
    * #### Notes
    * This formatter uses the builtin `Intl.DateTimeFormat` object to
    * coerce values.
    *
    * This is the most flexible (but slowest) datetime formatter.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

