package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.bufferedamountlow
import typingsJapgolly.std.stdStrings.error
import typingsJapgolly.std.stdStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDataChannel extends EventTarget {
  var binaryType: java.lang.String = js.native
  val bufferedAmount: Double = js.native
  var bufferedAmountLowThreshold: Double = js.native
  val id: Double | Null = js.native
  val label: java.lang.String = js.native
  val maxPacketLifeTime: Double | Null = js.native
  val maxRetransmits: Double | Null = js.native
  val negotiated: scala.Boolean = js.native
  var onbufferedamountlow: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  val ordered: scala.Boolean = js.native
  val priority: RTCPriorityType = js.native
  val protocol: java.lang.String = js.native
  val readyState: org.scalajs.dom.experimental.webrtc.RTCDataChannelState = js.native
  @JSName("addEventListener")
  def addEventListener_bufferedamountlow(`type`: bufferedamountlow, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: typingsJapgolly.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: typingsJapgolly.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: typingsJapgolly.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: typingsJapgolly.std.stdStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: typingsJapgolly.std.stdStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: typingsJapgolly.std.stdStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def close(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferedamountlow(`type`: bufferedamountlow, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: typingsJapgolly.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: typingsJapgolly.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: typingsJapgolly.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: typingsJapgolly.std.stdStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: typingsJapgolly.std.stdStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: typingsJapgolly.std.stdStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def send(data: java.lang.String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

@JSGlobal("RTCDataChannel")
@js.native
object RTCDataChannel extends Instantiable0[RTCDataChannel]

