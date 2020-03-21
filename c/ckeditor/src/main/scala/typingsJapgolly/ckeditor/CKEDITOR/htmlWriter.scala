package typingsJapgolly.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.htmlParser.basicWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.htmlWriter")
@js.native
class htmlWriter () extends basicWriter {
  var indentationChars: String = js.native
  var lineBreakChars: String = js.native
  var selfClosingEnd: String = js.native
  def indentation(): Unit = js.native
  def lineBreak(): Unit = js.native
  def setRules(tagName: String, rules: StringDictionary[js.Any]): Unit = js.native
}

