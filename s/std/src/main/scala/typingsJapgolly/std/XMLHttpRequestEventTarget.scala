package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.abort
import typingsJapgolly.std.stdStrings.error
import typingsJapgolly.std.stdStrings.load
import typingsJapgolly.std.stdStrings.loadend
import typingsJapgolly.std.stdStrings.loadstart
import typingsJapgolly.std.stdStrings.progress
import typingsJapgolly.std.stdStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTarget extends EventTarget {
  var onabort: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  var onerror: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  var onload: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  var onloadend: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  var onloadstart: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  var onprogress: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  var ontimeout: (js.ThisFunction1[
    /* this */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* ev */ org.scalajs.dom.raw.ProgressEvent, 
    _
  ]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.ProgressEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("XMLHttpRequestEventTarget")
@js.native
object XMLHttpRequestEventTarget extends Instantiable0[XMLHttpRequestEventTarget]

