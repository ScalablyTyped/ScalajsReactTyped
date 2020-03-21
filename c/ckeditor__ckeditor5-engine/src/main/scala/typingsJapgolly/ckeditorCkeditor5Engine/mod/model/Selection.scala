package typingsJapgolly.ckeditorCkeditor5Engine.mod.model

import typingsJapgolly.ckeditorCkeditor5Engine.Anon0
import typingsJapgolly.ckeditorCkeditor5Engine.AnonPriority
import typingsJapgolly.ckeditorCkeditor5Utils.mod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/selection
@JSImport("@ckeditor/ckeditor5-engine", "model.Selection")
@js.native
class Selection () extends Emitter {
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
}

