package typingsJapgolly.jupyterlabSettingeditor.plugineditorMod

import typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISettings
import typingsJapgolly.jupyterlabSettingeditor.plugineditorMod.PluginEditor.IOptions
import typingsJapgolly.jupyterlabSettingeditor.raweditorMod.RawEditor
import typingsJapgolly.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IPluginLayout
import typingsJapgolly.phosphorSignaling.mod.ISignal
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/plugineditor", "PluginEditor")
@js.native
class PluginEditor_ protected () extends Widget {
  /**
    * Create a new plugin editor.
    *
    * @param options - The plugin editor instantiation options.
    */
  def this(options: IOptions) = this()
  /**
    * Handle layout state changes that need to be saved.
    */
  var _onStateChanged: js.Any = js.native
  var _rawEditor: js.Any = js.native
  var _settings: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * Tests whether the settings have been modified and need saving.
    */
  val isDirty: Boolean = js.native
  /**
    * The plugin editor's raw editor.
    */
  val raw: RawEditor = js.native
  /**
    * The plugin settings being edited.
    */
  var settings: ISettings | Null = js.native
  /**
    * The plugin editor layout state.
    */
  var state: IPluginLayout = js.native
  /**
    * A signal that emits when editor layout state changes and needs to be saved.
    */
  val stateChanged: ISignal[this.type, Unit] = js.native
  /**
    * If the editor is in a dirty state, confirm that the user wants to leave.
    */
  def confirm(): js.Promise[Unit] = js.native
}

