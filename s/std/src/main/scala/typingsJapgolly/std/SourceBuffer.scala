package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.abort
import typingsJapgolly.std.stdStrings.error
import typingsJapgolly.std.stdStrings.update
import typingsJapgolly.std.stdStrings.updateend
import typingsJapgolly.std.stdStrings.updatestart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A chunk of media to be passed into an HTMLMediaElement and played, via a MediaSource object. This can be made up of one or several media segments. */
@js.native
trait SourceBuffer extends EventTarget {
  var appendWindowEnd: Double = js.native
  var appendWindowStart: Double = js.native
  val audioTracks: org.scalajs.dom.raw.AudioTrackList = js.native
  val buffered: org.scalajs.dom.raw.TimeRanges = js.native
  var mode: AppendMode = js.native
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onupdateend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onupdatestart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  val textTracks: org.scalajs.dom.raw.TextTrackList = js.native
  var timestampOffset: Double = js.native
  val updating: scala.Boolean = js.native
  val videoTracks: VideoTrackList = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_update(`type`: update, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_update(
    `type`: update,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_update(
    `type`: update,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateend(`type`: updateend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateend(
    `type`: updateend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updateend(
    `type`: updateend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatestart(`type`: updatestart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatestart(
    `type`: updatestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatestart(
    `type`: updatestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def appendBuffer(data: BufferSource): Unit = js.native
  def remove(start: Double, end: Double): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_update(`type`: update, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_update(
    `type`: update,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_update(
    `type`: update,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateend(`type`: updateend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateend(
    `type`: updateend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updateend(
    `type`: updateend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatestart(`type`: updatestart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatestart(
    `type`: updatestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatestart(
    `type`: updatestart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("SourceBuffer")
@js.native
object SourceBuffer extends Instantiable0[SourceBuffer]

