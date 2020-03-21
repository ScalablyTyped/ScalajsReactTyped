package typingsJapgolly.doubleclickGpt.googletag

import typingsJapgolly.doubleclickGpt.doubleclickGptStrings.slotRenderEnded
import typingsJapgolly.doubleclickGpt.doubleclickGptStrings.slotRequested
import typingsJapgolly.doubleclickGpt.doubleclickGptStrings.slotResponseReceived
import typingsJapgolly.doubleclickGpt.doubleclickGptStrings.slotVisibilityChanged
import typingsJapgolly.doubleclickGpt.googletag.events.Event
import typingsJapgolly.doubleclickGpt.googletag.events.SlotRenderEndedEvent
import typingsJapgolly.doubleclickGpt.googletag.events.SlotRequestedEvent
import typingsJapgolly.doubleclickGpt.googletag.events.SlotResponseReceived
import typingsJapgolly.doubleclickGpt.googletag.events.SlotVisibilityChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  def addEventListener(eventType: String, listener: js.Function1[/* event */ Event, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRenderEnded(eventType: slotRenderEnded, listener: js.Function1[/* event */ SlotRenderEndedEvent, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotRequested(eventType: slotRequested, listener: js.Function1[/* event */ SlotRequestedEvent, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotResponseReceived(eventType: slotResponseReceived, listener: js.Function1[/* event */ SlotResponseReceived, Unit]): Service = js.native
  @JSName("addEventListener")
  def addEventListener_slotVisibilityChanged(
    eventType: slotVisibilityChanged,
    listener: js.Function1[/* event */ SlotVisibilityChangedEvent, Unit]
  ): Service = js.native
  def getSlots(): js.Array[Slot] = js.native
}

