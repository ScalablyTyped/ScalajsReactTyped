package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.stdStrings.tonechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtmfSender extends EventTarget {
  val canInsertDTMF: scala.Boolean = js.native
  val duration: Double = js.native
  val interToneGap: Double = js.native
  var ontonechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]) | Null = js.native
  val sender: RTCRtpSender = js.native
  val toneBuffer: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def insertDTMF(tones: java.lang.String): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double, interToneGap: Double): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("RTCDtmfSender")
@js.native
object RTCDtmfSender extends Instantiable1[/* sender */ RTCRtpSender, RTCDtmfSender]

