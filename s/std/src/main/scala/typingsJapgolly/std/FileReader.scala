package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.abort
import typingsJapgolly.std.stdStrings.load
import typingsJapgolly.std.stdStrings.loadend
import typingsJapgolly.std.stdStrings.loadstart
import typingsJapgolly.std.stdStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read. */
@js.native
trait FileReader extends EventTarget {
  val DONE: Double = js.native
  val EMPTY: Double = js.native
  val LOADING: Double = js.native
  val error: org.scalajs.dom.raw.DOMException | Null = js.native
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]) | Null = js.native
  val readyState: Double = js.native
  val result: java.lang.String | scala.scalajs.js.typedarray.ArrayBuffer | Null = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def readAsArrayBuffer(blob: org.scalajs.dom.raw.Blob): Unit = js.native
  def readAsBinaryString(blob: org.scalajs.dom.raw.Blob): Unit = js.native
  def readAsDataURL(blob: org.scalajs.dom.raw.Blob): Unit = js.native
  def readAsText(blob: Blob): Unit = js.native
  def readAsText(blob: Blob, encoding: java.lang.String): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typingsJapgolly.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("FileReader")
@js.native
object FileReader extends Instantiable0[FileReader] {
  val DONE: Double = js.native
  val EMPTY: Double = js.native
  val LOADING: Double = js.native
}

