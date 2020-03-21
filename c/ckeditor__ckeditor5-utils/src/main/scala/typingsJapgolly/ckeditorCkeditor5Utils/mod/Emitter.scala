package typingsJapgolly.ckeditorCkeditor5Utils.mod

import typingsJapgolly.ckeditorCkeditor5Utils.Anon0
import typingsJapgolly.ckeditorCkeditor5Utils.AnonPriority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  def delegate(events: String*): EmitterMixinDelegateChain = js.native
  def fire(eventOrInfo: String, args: js.Any*): js.Any = js.native
  def fire(eventOrInfo: EventInfo[Emitter], args: js.Any*): js.Any = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def off(event: String): Unit = js.native
  def off(event: String, callback: js.Function): Unit = js.native
  def on(event: String, callback: js.Function): Unit = js.native
  def on(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def once(event: String, callback: js.Function): Unit = js.native
  def once(event: String, callback: js.Function, options: Anon0): Unit = js.native
  def stopDelegating(): Unit = js.native
  def stopDelegating(event: String): Unit = js.native
  def stopDelegating(event: String, emitter: Emitter): Unit = js.native
  def stopListening(): Unit = js.native
  def stopListening(emitter: Emitter): Unit = js.native
  def stopListening(emitter: Emitter, event: String): Unit = js.native
  def stopListening(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
}

