package typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.CodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an editor widget.
  */
trait IOptions extends js.Object {
  /**
    * The document context associated with the editor.
    */
  var context: CodeContext
  /**
    * A code editor factory.
    */
  var factory: Factory
  /**
    * The mime type service for the editor.
    */
  var mimeTypeService: IEditorMimeTypeService
}

object IOptions {
  @scala.inline
  def apply(
    context: CodeContext,
    factory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor],
    mimeTypeService: IEditorMimeTypeService
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => factory(t0).runNow()))
    __obj.asInstanceOf[IOptions]
  }
}

