package typingsJapgolly.jupyterlabCodeeditor.factoryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorFactoryService extends js.Object {
  /**
    * Create a new editor for a full document.
    */
  def newDocumentEditor(options: IOptions): IEditor
  /**
    * Create a new editor for inline code.
    */
  def newInlineEditor(options: IOptions): IEditor
}

object IEditorFactoryService {
  @scala.inline
  def apply(
    newDocumentEditor: IOptions => CallbackTo[IEditor],
    newInlineEditor: IOptions => CallbackTo[IEditor]
  ): IEditorFactoryService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newDocumentEditor")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => newDocumentEditor(t0).runNow()))
    __obj.updateDynamic("newInlineEditor")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => newInlineEditor(t0).runNow()))
    __obj.asInstanceOf[IEditorFactoryService]
  }
}

