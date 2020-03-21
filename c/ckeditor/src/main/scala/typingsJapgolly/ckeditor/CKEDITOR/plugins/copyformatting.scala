package typingsJapgolly.ckeditor.CKEDITOR.plugins

import typingsJapgolly.ckeditor.CKEDITOR.editor
import typingsJapgolly.ckeditor.CKEDITOR.event
import typingsJapgolly.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.copyformatting")
@js.native
object copyformatting extends js.Object {
  @js.native
  class state protected () extends event {
    def this(editor: editor) = this()
    var editor: typingsJapgolly.ckeditor.CKEDITOR.editor = js.native
    var filter: typingsJapgolly.ckeditor.CKEDITOR.filter = js.native
    var sticky: Boolean = js.native
    var styles: js.Array[style] = js.native
  }
  
  var breakOnElements: js.Array[String] = js.native
  var elementsForInlineTransform: js.Array[String] = js.native
  var excludedAttributes: js.Array[String] = js.native
  var excludedAttributesFromInlineTransform: js.Array[String] = js.native
  var inlineBoundary: js.Array[String] = js.native
  var preservedElements: js.Array[String] = js.native
}

