package typingsJapgolly.jsonEditor.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jsonEditor.AnonAce
import typingsJapgolly.jsonEditor.AnonCustomvalidators
import typingsJapgolly.jsonEditor.JSONEditor
import typingsJapgolly.jsonEditor.JSONEditorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-editor", JSImport.Namespace)
@js.native
class ^[TValue] protected () extends JSONEditor[TValue] {
  def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
}

@JSImport("json-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: AnonCustomvalidators = js.native
  var plugins: AnonAce = js.native
}

