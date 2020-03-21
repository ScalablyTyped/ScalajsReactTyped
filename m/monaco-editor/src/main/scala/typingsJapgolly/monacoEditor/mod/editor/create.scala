package typingsJapgolly.monacoEditor.mod.editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.create")
@js.native
object create extends js.Object {
  def apply(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def apply(domElement: HTMLElement, options: IEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def apply(domElement: HTMLElement, options: IEditorConstructionOptions, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
}

