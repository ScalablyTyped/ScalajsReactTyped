package typingsJapgolly.reactIntl

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.intlMessageformat.mod.PrimitiveType
import typingsJapgolly.reactIntl.typesMod.Formatters
import typingsJapgolly.reactIntl.typesMod.MessageDescriptor
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/message", JSImport.Namespace)
@js.native
object formattersMessageMod extends js.Object {
  def formatHTMLMessage(config: PickIntlConfiglocaleformaDefaultFormats, state: Formatters): Node = js.native
  def formatHTMLMessage(
    config: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): Node = js.native
  def formatHTMLMessage(
    config: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    rawValues: Record[String, PrimitiveType]
  ): Node = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def prepareIntlMessageFormatHtmlOutput(chunks: js.Array[String | js.Object]): Element = js.native
}

