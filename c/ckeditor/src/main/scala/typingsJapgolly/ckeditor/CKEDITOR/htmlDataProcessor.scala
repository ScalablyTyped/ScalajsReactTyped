package typingsJapgolly.ckeditor.CKEDITOR

import typingsJapgolly.ckeditor.AnonContext
import typingsJapgolly.ckeditor.CKEDITOR.htmlParser.basicWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlDataProcessor")
@js.native
class htmlDataProcessor protected () extends dataProcessor {
  def this(editor: editor) = this()
  var dataFilter: typingsJapgolly.ckeditor.CKEDITOR.htmlParser.filter = js.native
  var htmlFilter: typingsJapgolly.ckeditor.CKEDITOR.htmlParser.filter = js.native
  var writer: basicWriter = js.native
  def toDataFormat(html: String): String = js.native
  def toDataFormat(html: String, options: AnonContext): String = js.native
  def toHtml(data: String, options: htmlDataProcessorOptions): String = js.native
}

