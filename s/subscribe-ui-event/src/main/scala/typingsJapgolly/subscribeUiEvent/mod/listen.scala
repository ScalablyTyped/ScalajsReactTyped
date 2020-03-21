package typingsJapgolly.subscribeUiEvent.mod

import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.subscribeUiEvent.AnonRemove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", "listen")
@js.native
object listen extends js.Object {
  def apply(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): AnonRemove = js.native
  def apply(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): AnonRemove = js.native
}

