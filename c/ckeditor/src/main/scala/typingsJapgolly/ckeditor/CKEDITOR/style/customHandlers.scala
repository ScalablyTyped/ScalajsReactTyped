package typingsJapgolly.ckeditor.CKEDITOR.style

import typingsJapgolly.ckeditor.CKEDITOR.dom.element
import typingsJapgolly.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.style.customHandlers")
@js.native
object customHandlers extends js.Object {
  @js.native
  class widget ()
    extends typingsJapgolly.ckeditor.CKEDITOR.style {
    var group: js.Array[_] = js.native
    var widget: String = js.native
    def checkElement(element: element): Boolean = js.native
    def getClassesArray(): js.Array[String] = js.native
    def removeStylesFromSameGroup(editor: editor): Boolean = js.native
  }
  
}

