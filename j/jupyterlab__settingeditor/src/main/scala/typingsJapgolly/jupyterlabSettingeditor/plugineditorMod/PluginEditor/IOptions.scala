package typingsJapgolly.jupyterlabSettingeditor.plugineditorMod.PluginEditor

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsJapgolly.jupyterlabSettingeditor.AnonRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a plugin editor.
  */
trait IOptions extends js.Object {
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: AnonRegistry
  /**
    * The editor factory used by the plugin editor.
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
}

object IOptions {
  @scala.inline
  def apply(
    commands: AnonRegistry,
    editorFactory: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => CallbackTo[IEditor],
    registry: ISettingRegistry,
    rendermime: IRenderMimeRegistry = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    __obj.updateDynamic("editorFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions) => editorFactory(t0).runNow()))
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

