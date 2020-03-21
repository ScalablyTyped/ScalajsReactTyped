package typingsJapgolly.jupyterlabCells.inputareaMod.InputArea

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.inputareaMod.IInputPrompt
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An input area widget content factory.
  *
  * The content factory is used to create children in a way
  * that can be customized.
  */
trait IContentFactory extends js.Object {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  val editorFactory: Factory
  /**
    * Create an input prompt.
    */
  def createInputPrompt(): IInputPrompt
}

object IContentFactory {
  @scala.inline
  def apply(
    createInputPrompt: CallbackTo[IInputPrompt],
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor]
  ): IContentFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInputPrompt")(createInputPrompt.toJsFn)
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

