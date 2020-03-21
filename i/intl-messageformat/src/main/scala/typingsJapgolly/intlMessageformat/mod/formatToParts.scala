package typingsJapgolly.intlMessageformat.mod

import typingsJapgolly.intlMessageformatParser.mod.MessageFormatElement
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "formatToParts")
@js.native
object formatToParts extends js.Object {
  def apply(els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _]
  ): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _]
  ): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart] = js.native
}

