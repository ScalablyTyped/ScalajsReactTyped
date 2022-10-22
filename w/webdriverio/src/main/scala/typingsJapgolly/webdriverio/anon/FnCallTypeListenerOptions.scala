package typingsJapgolly.webdriverio.anon

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import typingsJapgolly.webdriverio.webdriverioStrings.abort
import typingsJapgolly.webdriverio.webdriverioStrings.animationcancel
import typingsJapgolly.webdriverio.webdriverioStrings.animationend
import typingsJapgolly.webdriverio.webdriverioStrings.animationiteration
import typingsJapgolly.webdriverio.webdriverioStrings.animationstart
import typingsJapgolly.webdriverio.webdriverioStrings.auxclick
import typingsJapgolly.webdriverio.webdriverioStrings.beforeinput
import typingsJapgolly.webdriverio.webdriverioStrings.blur
import typingsJapgolly.webdriverio.webdriverioStrings.canplay
import typingsJapgolly.webdriverio.webdriverioStrings.canplaythrough
import typingsJapgolly.webdriverio.webdriverioStrings.change
import typingsJapgolly.webdriverio.webdriverioStrings.click
import typingsJapgolly.webdriverio.webdriverioStrings.close
import typingsJapgolly.webdriverio.webdriverioStrings.compositionend
import typingsJapgolly.webdriverio.webdriverioStrings.compositionstart
import typingsJapgolly.webdriverio.webdriverioStrings.compositionupdate
import typingsJapgolly.webdriverio.webdriverioStrings.contextmenu
import typingsJapgolly.webdriverio.webdriverioStrings.copy
import typingsJapgolly.webdriverio.webdriverioStrings.cuechange
import typingsJapgolly.webdriverio.webdriverioStrings.cut
import typingsJapgolly.webdriverio.webdriverioStrings.dblclick
import typingsJapgolly.webdriverio.webdriverioStrings.drag
import typingsJapgolly.webdriverio.webdriverioStrings.dragend
import typingsJapgolly.webdriverio.webdriverioStrings.dragenter
import typingsJapgolly.webdriverio.webdriverioStrings.dragleave
import typingsJapgolly.webdriverio.webdriverioStrings.dragover
import typingsJapgolly.webdriverio.webdriverioStrings.dragstart
import typingsJapgolly.webdriverio.webdriverioStrings.drop
import typingsJapgolly.webdriverio.webdriverioStrings.durationchange
import typingsJapgolly.webdriverio.webdriverioStrings.emptied
import typingsJapgolly.webdriverio.webdriverioStrings.ended
import typingsJapgolly.webdriverio.webdriverioStrings.error
import typingsJapgolly.webdriverio.webdriverioStrings.focus
import typingsJapgolly.webdriverio.webdriverioStrings.focusin
import typingsJapgolly.webdriverio.webdriverioStrings.focusout
import typingsJapgolly.webdriverio.webdriverioStrings.formdata
import typingsJapgolly.webdriverio.webdriverioStrings.fullscreenchange
import typingsJapgolly.webdriverio.webdriverioStrings.fullscreenerror
import typingsJapgolly.webdriverio.webdriverioStrings.gotpointercapture
import typingsJapgolly.webdriverio.webdriverioStrings.input
import typingsJapgolly.webdriverio.webdriverioStrings.invalid
import typingsJapgolly.webdriverio.webdriverioStrings.keydown_
import typingsJapgolly.webdriverio.webdriverioStrings.keypress
import typingsJapgolly.webdriverio.webdriverioStrings.keyup_
import typingsJapgolly.webdriverio.webdriverioStrings.load
import typingsJapgolly.webdriverio.webdriverioStrings.loadeddata
import typingsJapgolly.webdriverio.webdriverioStrings.loadedmetadata
import typingsJapgolly.webdriverio.webdriverioStrings.loadstart
import typingsJapgolly.webdriverio.webdriverioStrings.lostpointercapture
import typingsJapgolly.webdriverio.webdriverioStrings.mousedown
import typingsJapgolly.webdriverio.webdriverioStrings.mouseenter
import typingsJapgolly.webdriverio.webdriverioStrings.mouseleave
import typingsJapgolly.webdriverio.webdriverioStrings.mousemove
import typingsJapgolly.webdriverio.webdriverioStrings.mouseout
import typingsJapgolly.webdriverio.webdriverioStrings.mouseover
import typingsJapgolly.webdriverio.webdriverioStrings.mouseup
import typingsJapgolly.webdriverio.webdriverioStrings.paste
import typingsJapgolly.webdriverio.webdriverioStrings.pause
import typingsJapgolly.webdriverio.webdriverioStrings.play
import typingsJapgolly.webdriverio.webdriverioStrings.playing
import typingsJapgolly.webdriverio.webdriverioStrings.pointercancel_
import typingsJapgolly.webdriverio.webdriverioStrings.pointerdown_
import typingsJapgolly.webdriverio.webdriverioStrings.pointerenter
import typingsJapgolly.webdriverio.webdriverioStrings.pointerleave
import typingsJapgolly.webdriverio.webdriverioStrings.pointermove_
import typingsJapgolly.webdriverio.webdriverioStrings.pointerout
import typingsJapgolly.webdriverio.webdriverioStrings.pointerover
import typingsJapgolly.webdriverio.webdriverioStrings.pointerup_
import typingsJapgolly.webdriverio.webdriverioStrings.progress
import typingsJapgolly.webdriverio.webdriverioStrings.ratechange
import typingsJapgolly.webdriverio.webdriverioStrings.reset
import typingsJapgolly.webdriverio.webdriverioStrings.resize
import typingsJapgolly.webdriverio.webdriverioStrings.scroll
import typingsJapgolly.webdriverio.webdriverioStrings.securitypolicyviolation
import typingsJapgolly.webdriverio.webdriverioStrings.seeked
import typingsJapgolly.webdriverio.webdriverioStrings.seeking
import typingsJapgolly.webdriverio.webdriverioStrings.select
import typingsJapgolly.webdriverio.webdriverioStrings.selectionchange
import typingsJapgolly.webdriverio.webdriverioStrings.selectstart
import typingsJapgolly.webdriverio.webdriverioStrings.slotchange
import typingsJapgolly.webdriverio.webdriverioStrings.stalled
import typingsJapgolly.webdriverio.webdriverioStrings.submit
import typingsJapgolly.webdriverio.webdriverioStrings.suspend
import typingsJapgolly.webdriverio.webdriverioStrings.timeupdate
import typingsJapgolly.webdriverio.webdriverioStrings.toggle
import typingsJapgolly.webdriverio.webdriverioStrings.touchcancel
import typingsJapgolly.webdriverio.webdriverioStrings.touchend
import typingsJapgolly.webdriverio.webdriverioStrings.touchmove_
import typingsJapgolly.webdriverio.webdriverioStrings.touchstart
import typingsJapgolly.webdriverio.webdriverioStrings.transitioncancel
import typingsJapgolly.webdriverio.webdriverioStrings.transitionend
import typingsJapgolly.webdriverio.webdriverioStrings.transitionrun
import typingsJapgolly.webdriverio.webdriverioStrings.transitionstart
import typingsJapgolly.webdriverio.webdriverioStrings.volumechange
import typingsJapgolly.webdriverio.webdriverioStrings.waiting
import typingsJapgolly.webdriverio.webdriverioStrings.webkitanimationend
import typingsJapgolly.webdriverio.webdriverioStrings.webkitanimationiteration
import typingsJapgolly.webdriverio.webdriverioStrings.webkitanimationstart
import typingsJapgolly.webdriverio.webdriverioStrings.webkittransitionend
import typingsJapgolly.webdriverio.webdriverioStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallTypeListenerOptions extends StObject {
  
  def apply(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def apply(`type`: abort, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: auxclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: beforeinput, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any]): Unit = js.native
  def apply(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: beforeinput,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: blur, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: canplay, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: change, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: click, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: close, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: compositionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: compositionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: compositionupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: contextmenu, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: copy, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  def apply(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: cuechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: cut, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  def apply(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: dblclick, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: drag, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: dragstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: drop, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]): Unit = js.native
  def apply(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: durationchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: emptied, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: ended, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: error, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any]): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: focusin, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: focus, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: focusout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]): Unit = js.native
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: formdata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any]): Unit = js.native
  def apply(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: formdata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: input, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: invalid, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: keydown_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  def apply(
    `type`: keydown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: keydown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: keypress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: keyup_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]): Unit = js.native
  def apply(
    `type`: keyup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: keyup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: loadeddata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: load, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: loadstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mousedown, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseenter, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseleave, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mousemove, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseover, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: mouseup, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]): Unit = js.native
  def apply(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: paste, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]): Unit = js.native
  def apply(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: pause, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: playing, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: play, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointercancel_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointercancel_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointercancel_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerdown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerdown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerdown_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointermove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointermove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointermove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: pointerout, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: pointerup_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]): Unit = js.native
  def apply(
    `type`: pointerup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerup_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: progress, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, Any]): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: ratechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: reset, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: resize, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]): Unit = js.native
  def apply(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: scroll, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: seeked, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: seeking, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: selectionchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: select, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: selectstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: slotchange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: slotchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: stalled, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: submit, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any]): Unit = js.native
  def apply(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: suspend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: timeupdate, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: toggle, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchcancel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchend, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchmove_, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchmove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchmove_,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: touchstart, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]): Unit = js.native
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: volumechange, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: waiting, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]): Unit = js.native
  def apply(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkitanimationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkitanimationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkitanimationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = js.native
  def apply(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: webkittransitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(`type`: wheel, listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any]): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: Boolean
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
}
