package typingsJapgolly.jupyterlabSettingeditor.settingeditorMod.SettingEditor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsJapgolly.jupyterlabCoreutils.tokensMod.IStateDB
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsJapgolly.jupyterlabSettingeditor.AnonRegistry
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a setting editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: AnonRegistry
  /**
    * The editor factory used by the setting editor.
    */
  var editorFactory: Factory
  /**
    * The state database key for the editor's state management.
    */
  var key: String
  /**
    * The setting registry the editor modifies.
    */
  var registry: ISettingRegistry
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.undefined
  /**
    * The state database used to store layout.
    */
  var state: IStateDB[ReadonlyJSONValue]
  /**
    * The point after which the editor should restore its state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    commands: AnonRegistry,
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor],
    key: String,
    registry: ISettingRegistry,
    state: IStateDB[ReadonlyJSONValue],
    rendermime: IRenderMimeRegistry = null,
    when: js.Promise[_] | js.Array[js.Promise[_]] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

