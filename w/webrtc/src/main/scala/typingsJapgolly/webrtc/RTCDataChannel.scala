package typingsJapgolly.webrtc

import org.scalajs.dom.experimental.webrtc.RTCDataChannelState
import org.scalajs.dom.raw.MessageEvent
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.ArrayBufferView
import typingsJapgolly.std.Blob
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Event_
import typingsJapgolly.std.RTCErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDataChannel extends EventTarget {
  var binaryType: String = js.native
  val bufferedAmount: Double = js.native
  var bufferedAmountLowThreshold: Double = js.native
  val id: Double | Null = js.native
  val label: String = js.native
  val maxPacketLifeTime: Double | Null = js.native
  val maxRetransmits: Double | Null = js.native
  val negotiated: Boolean = js.native
  var onbufferedamountlow: DataChannelEventHandler[Event_] = js.native
  var onclose: DataChannelEventHandler[Event_] = js.native
  var onerror: DataChannelEventHandler[RTCErrorEvent] = js.native
  var onmessage: DataChannelEventHandler[MessageEvent] = js.native
  var onopen: DataChannelEventHandler[Event_] = js.native
  val ordered: Boolean = js.native
  val protocol: String = js.native
  val readyState: RTCDataChannelState = js.native
  def close(): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

