package typingsJapgolly.jupyterlabCells.inputareaMod.InputArea.ContentFactory

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the content factory.
  */
trait IOptions extends js.Object {
  /**
    * The editor factory used by the content factory.
    *
    * If this is not passed, a default CodeMirror editor factory
    * will be used.
    */
  var editorFactory: js.UndefOr[Factory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (editorFactory != null) __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    __obj.asInstanceOf[IOptions]
  }
}

