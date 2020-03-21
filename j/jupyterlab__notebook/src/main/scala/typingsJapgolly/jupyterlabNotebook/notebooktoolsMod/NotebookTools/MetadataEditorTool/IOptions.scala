package typingsJapgolly.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a metadata editor tool.
  */
trait IOptions extends js.Object {
  /**
    * Initial collapse state, defaults to true.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * The editor factory used by the tool.
    */
  var editorFactory: Factory
  /**
    * The label for the JSON editor
    */
  var label: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor],
    collapsed: js.UndefOr[Boolean] = js.undefined,
    label: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

