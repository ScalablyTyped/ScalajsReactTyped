package typingsJapgolly.domMediacaptureRecord

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.AudioTrackList
import typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.dataavailable
import typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.error
import typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.pause
import typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.resume
import typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.start
import typingsJapgolly.domMediacaptureRecord.domMediacaptureRecordStrings.stop
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaRecorder")
@js.native
class MediaRecorder protected () extends EventTarget {
  def this(stream: MediaStream) = this()
  def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  val audioBitsPerSecond: Double = js.native
  val mimeType: String = js.native
  var ondataavailable: (js.Function1[/* event */ BlobEvent, Unit]) | Null = js.native
  var onerror: (js.Function1[/* event */ MediaRecorderErrorEvent, Unit]) | Null = js.native
  var onpause: EventListener | Null = js.native
  var onresume: EventListener | Null = js.native
  var onstart: EventListener | Null = js.native
  var onstop: EventListener | Null = js.native
  val state: RecordingState = js.native
  val stream: MediaStream = js.native
  val videoBitsPerSecond: Double = js.native
  @JSName("addEventListener")
  def addEventListener_dataavailable(
    `type`: dataavailable,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ BlobEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataavailable(
    `type`: dataavailable,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ BlobEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dataavailable(
    `type`: dataavailable,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ BlobEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ MediaRecorderErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ MediaRecorderErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ MediaRecorderErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(`type`: resume, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(`type`: stop, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(
    `type`: stop,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stop(
    `type`: stop,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def pause(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dataavailable(
    `type`: dataavailable,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ BlobEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dataavailable(
    `type`: dataavailable,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ BlobEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dataavailable(
    `type`: dataavailable,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ BlobEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ MediaRecorderErrorEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ MediaRecorderErrorEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ MediaRecorderErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(`type`: resume, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(`type`: stop, listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(
    `type`: stop,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stop(
    `type`: stop,
    listener: js.ThisFunction1[/* this */ AudioTrackList, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  def requestData(): Unit = js.native
  def resume(): Unit = js.native
  def start(): Unit = js.native
  def start(timeslice: Double): Unit = js.native
  def stop(): Unit = js.native
}

/* static members */
@JSGlobal("MediaRecorder")
@js.native
object MediaRecorder extends js.Object {
  def isTypeSupported(`type`: String): Boolean = js.native
}

