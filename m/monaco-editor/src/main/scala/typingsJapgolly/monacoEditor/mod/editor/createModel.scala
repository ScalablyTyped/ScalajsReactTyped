package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.createModel")
@js.native
object createModel extends js.Object {
  def apply(value: String): ITextModel = js.native
  def apply(value: String, language: String): ITextModel = js.native
  def apply(value: String, language: String, uri: Uri): ITextModel = js.native
}

