package typingsJapgolly.rxDom.mod.rxAugmentingMod.DOM

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.MessageEvent
import typingsJapgolly.rxCore.Rx.Observer
import typingsJapgolly.rxCoreBinding.Rx.Subject
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.fromWebSocket")
@js.native
object fromWebSocket extends js.Object {
  // Web Sockets
  def apply(url: String, protocol: String): Subject[MessageEvent] = js.native
  def apply(url: String, protocol: String, openObserver: Observer[Event_]): Subject[MessageEvent] = js.native
  def apply(
    url: String,
    protocol: String,
    openObserver: Observer[Event_],
    closingObserver: Observer[CloseEvent]
  ): Subject[MessageEvent] = js.native
}

