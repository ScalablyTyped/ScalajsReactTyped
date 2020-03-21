package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.AnonModel
import typingsJapgolly.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.onDidChangeModelLanguage")
@js.native
object onDidChangeModelLanguage extends js.Object {
  def apply(listener: js.Function1[/* e */ AnonModel, Unit]): IDisposable = js.native
}

