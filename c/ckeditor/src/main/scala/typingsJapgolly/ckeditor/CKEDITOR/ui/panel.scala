package typingsJapgolly.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor.CKEDITOR.dom.document
import typingsJapgolly.ckeditor.CKEDITOR.dom.nodeList
import typingsJapgolly.ckeditor.CKEDITOR.editor
import typingsJapgolly.ckeditor.CKEDITOR.ui.panel.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.panel")
@js.native
class panel protected () extends js.Object {
  def this(document: document, definition: StringDictionary[js.Any]) = this()
  def addBlock(name: String, block: StringDictionary[js.Any]): Unit = js.native
  def getBlock(name: String): block = js.native
  def render(editor: editor): Unit = js.native
  def render(editor: editor, output: js.Array[String]): Unit = js.native
  def showBlock(name: String): Unit = js.native
}

@JSGlobal("CKEDITOR.ui.panel")
@js.native
object panel extends js.Object {
  @js.native
  class block () extends js.Object {
    def getItems(): nodeList = js.native
    def markItem(index: Double): Unit = js.native
  }
  
  val handler: handlerDefinition[panel] = js.native
}

