package typingsJapgolly.jupyterlabSettingeditor.raweditorMod.RawEditor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a raw editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: ICommandBundle
  /**
    * The editor factory used by the raw editor.
    */
  var editorFactory: Factory
  /**
    * The setting registry used by the editor.
    */
  var registry: ISettingRegistry
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.undefined
  /**
    * A function the raw editor calls on save errors.
    */
  def onSaveError(reason: js.Any): Unit
}

object IOptions {
  @scala.inline
  def apply(
    commands: ICommandBundle,
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor],
    onSaveError: js.Any => Callback,
    registry: ISettingRegistry,
    rendermime: IRenderMimeRegistry = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    __obj.updateDynamic("onSaveError")(js.Any.fromFunction1((t0: js.Any) => onSaveError(t0).runNow()))
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

