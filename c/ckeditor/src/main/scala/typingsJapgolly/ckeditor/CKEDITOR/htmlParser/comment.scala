package typingsJapgolly.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlParser.comment")
@js.native
class comment protected () extends node {
  def this(value: String) = this()
  var `type`: Double = js.native
  var value: String = js.native
  def filter(filter: typingsJapgolly.ckeditor.CKEDITOR.htmlParser.filter): Boolean = js.native
  def writeHtml(writer: basicWriter): Unit = js.native
  def writeHtml(writer: basicWriter, filter: filter): Unit = js.native
}

