package typingsJapgolly.ckeditorCkeditor5Core.mod.editor

import typingsJapgolly.ckeditorCkeditor5Core.Anon0
import typingsJapgolly.ckeditorCkeditor5Core.AnonPriority
import typingsJapgolly.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.destroyed
import typingsJapgolly.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.initializing
import typingsJapgolly.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.ready
import typingsJapgolly.ckeditorCkeditor5Core.mod.CommandCollection
import typingsJapgolly.ckeditorCkeditor5Core.mod.EditingKeystrokeHandler
import typingsJapgolly.ckeditorCkeditor5Core.mod.Plugin
import typingsJapgolly.ckeditorCkeditor5Core.mod.PluginCollection
import typingsJapgolly.ckeditorCkeditor5Engine.mod.controller.DataController
import typingsJapgolly.ckeditorCkeditor5Engine.mod.controller.EditingController
import typingsJapgolly.ckeditorCkeditor5Engine.mod.conversion.Conversion
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Model
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Config
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Emitter
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Locale
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editor
@JSImport("@ckeditor/ckeditor5-core", "editor.Editor")
@js.native
class Editor () extends Observable {
  def this(config: js.Object) = this()
  val commands: CommandCollection = js.native
  val config: Config = js.native
  val conversion: Conversion = js.native
  val data: DataController = js.native
  val editing: EditingController = js.native
  var isReadOnly: Boolean = js.native
  val keystrokes: EditingKeystrokeHandler = js.native
  val locale: Locale = js.native
  val model: Model = js.native
  val plugins: PluginCollection[Plugin[_]] = js.native
  var state: initializing | ready | destroyed = js.native
  def destroy(): js.Promise[Unit] = js.native
  def execute(commandName: String, commandParams: js.Any*): Unit = js.native
  def initPlugins(): js.Promise[Unit] = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def t(str: String): String = js.native
  def t(str: String, values: js.Array[String]): String = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "editor.Editor")
@js.native
object Editor extends js.Object {
  var builtinPlugins: js.Array[Plugin[_]] = js.native
  var defaultConfig: js.Object = js.native
  def create(config: js.Object): js.Promise[_] = js.native
}

