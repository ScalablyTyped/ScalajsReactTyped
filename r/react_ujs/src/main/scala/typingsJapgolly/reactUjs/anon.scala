package typingsJapgolly.reactUjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.jquery.JQuery
import typingsJapgolly.jquery.JQueryStatic
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactUjs.mod.SearchSelector
import typingsJapgolly.reactUjs.mod.WebpackRequireContext
import typingsJapgolly.reactUjs.reactUjsBooleans.`false`
import typingsJapgolly.reactUjs.reactUjsStrings.DOMContentLoaded
import typingsJapgolly.reactUjs.reactUjsStrings.abort
import typingsJapgolly.reactUjs.reactUjsStrings.animationcancel
import typingsJapgolly.reactUjs.reactUjsStrings.animationend
import typingsJapgolly.reactUjs.reactUjsStrings.animationiteration
import typingsJapgolly.reactUjs.reactUjsStrings.animationstart
import typingsJapgolly.reactUjs.reactUjsStrings.auxclick
import typingsJapgolly.reactUjs.reactUjsStrings.beforeinput
import typingsJapgolly.reactUjs.reactUjsStrings.blur
import typingsJapgolly.reactUjs.reactUjsStrings.canplay
import typingsJapgolly.reactUjs.reactUjsStrings.canplaythrough
import typingsJapgolly.reactUjs.reactUjsStrings.change
import typingsJapgolly.reactUjs.reactUjsStrings.click
import typingsJapgolly.reactUjs.reactUjsStrings.close
import typingsJapgolly.reactUjs.reactUjsStrings.compositionend
import typingsJapgolly.reactUjs.reactUjsStrings.compositionstart
import typingsJapgolly.reactUjs.reactUjsStrings.compositionupdate
import typingsJapgolly.reactUjs.reactUjsStrings.contextmenu
import typingsJapgolly.reactUjs.reactUjsStrings.copy
import typingsJapgolly.reactUjs.reactUjsStrings.cuechange
import typingsJapgolly.reactUjs.reactUjsStrings.cut
import typingsJapgolly.reactUjs.reactUjsStrings.dblclick
import typingsJapgolly.reactUjs.reactUjsStrings.drag
import typingsJapgolly.reactUjs.reactUjsStrings.dragend
import typingsJapgolly.reactUjs.reactUjsStrings.dragenter
import typingsJapgolly.reactUjs.reactUjsStrings.dragleave
import typingsJapgolly.reactUjs.reactUjsStrings.dragover
import typingsJapgolly.reactUjs.reactUjsStrings.dragstart
import typingsJapgolly.reactUjs.reactUjsStrings.drop
import typingsJapgolly.reactUjs.reactUjsStrings.durationchange
import typingsJapgolly.reactUjs.reactUjsStrings.emptied
import typingsJapgolly.reactUjs.reactUjsStrings.ended
import typingsJapgolly.reactUjs.reactUjsStrings.error
import typingsJapgolly.reactUjs.reactUjsStrings.focus
import typingsJapgolly.reactUjs.reactUjsStrings.focusin
import typingsJapgolly.reactUjs.reactUjsStrings.focusout
import typingsJapgolly.reactUjs.reactUjsStrings.formdata
import typingsJapgolly.reactUjs.reactUjsStrings.fullscreenchange
import typingsJapgolly.reactUjs.reactUjsStrings.fullscreenerror
import typingsJapgolly.reactUjs.reactUjsStrings.gotpointercapture
import typingsJapgolly.reactUjs.reactUjsStrings.input
import typingsJapgolly.reactUjs.reactUjsStrings.invalid
import typingsJapgolly.reactUjs.reactUjsStrings.keydown
import typingsJapgolly.reactUjs.reactUjsStrings.keypress
import typingsJapgolly.reactUjs.reactUjsStrings.keyup
import typingsJapgolly.reactUjs.reactUjsStrings.load
import typingsJapgolly.reactUjs.reactUjsStrings.loadeddata
import typingsJapgolly.reactUjs.reactUjsStrings.loadedmetadata
import typingsJapgolly.reactUjs.reactUjsStrings.loadstart
import typingsJapgolly.reactUjs.reactUjsStrings.lostpointercapture
import typingsJapgolly.reactUjs.reactUjsStrings.mousedown
import typingsJapgolly.reactUjs.reactUjsStrings.mouseenter
import typingsJapgolly.reactUjs.reactUjsStrings.mouseleave
import typingsJapgolly.reactUjs.reactUjsStrings.mousemove
import typingsJapgolly.reactUjs.reactUjsStrings.mouseout
import typingsJapgolly.reactUjs.reactUjsStrings.mouseover
import typingsJapgolly.reactUjs.reactUjsStrings.mouseup
import typingsJapgolly.reactUjs.reactUjsStrings.paste
import typingsJapgolly.reactUjs.reactUjsStrings.pause
import typingsJapgolly.reactUjs.reactUjsStrings.play
import typingsJapgolly.reactUjs.reactUjsStrings.playing
import typingsJapgolly.reactUjs.reactUjsStrings.pointercancel
import typingsJapgolly.reactUjs.reactUjsStrings.pointerdown
import typingsJapgolly.reactUjs.reactUjsStrings.pointerenter
import typingsJapgolly.reactUjs.reactUjsStrings.pointerleave
import typingsJapgolly.reactUjs.reactUjsStrings.pointerlockchange
import typingsJapgolly.reactUjs.reactUjsStrings.pointerlockerror
import typingsJapgolly.reactUjs.reactUjsStrings.pointermove
import typingsJapgolly.reactUjs.reactUjsStrings.pointerout
import typingsJapgolly.reactUjs.reactUjsStrings.pointerover
import typingsJapgolly.reactUjs.reactUjsStrings.pointerup
import typingsJapgolly.reactUjs.reactUjsStrings.progress
import typingsJapgolly.reactUjs.reactUjsStrings.ratechange
import typingsJapgolly.reactUjs.reactUjsStrings.readystatechange
import typingsJapgolly.reactUjs.reactUjsStrings.reset
import typingsJapgolly.reactUjs.reactUjsStrings.resize
import typingsJapgolly.reactUjs.reactUjsStrings.scroll
import typingsJapgolly.reactUjs.reactUjsStrings.securitypolicyviolation
import typingsJapgolly.reactUjs.reactUjsStrings.seeked
import typingsJapgolly.reactUjs.reactUjsStrings.seeking
import typingsJapgolly.reactUjs.reactUjsStrings.select
import typingsJapgolly.reactUjs.reactUjsStrings.selectionchange
import typingsJapgolly.reactUjs.reactUjsStrings.selectstart
import typingsJapgolly.reactUjs.reactUjsStrings.slotchange
import typingsJapgolly.reactUjs.reactUjsStrings.stalled
import typingsJapgolly.reactUjs.reactUjsStrings.submit
import typingsJapgolly.reactUjs.reactUjsStrings.suspend
import typingsJapgolly.reactUjs.reactUjsStrings.timeupdate
import typingsJapgolly.reactUjs.reactUjsStrings.toggle
import typingsJapgolly.reactUjs.reactUjsStrings.touchcancel
import typingsJapgolly.reactUjs.reactUjsStrings.touchend
import typingsJapgolly.reactUjs.reactUjsStrings.touchmove
import typingsJapgolly.reactUjs.reactUjsStrings.touchstart
import typingsJapgolly.reactUjs.reactUjsStrings.transitioncancel
import typingsJapgolly.reactUjs.reactUjsStrings.transitionend
import typingsJapgolly.reactUjs.reactUjsStrings.transitionrun
import typingsJapgolly.reactUjs.reactUjsStrings.transitionstart
import typingsJapgolly.reactUjs.reactUjsStrings.visibilitychange
import typingsJapgolly.reactUjs.reactUjsStrings.volumechange
import typingsJapgolly.reactUjs.reactUjsStrings.waiting
import typingsJapgolly.reactUjs.reactUjsStrings.webkitanimationend
import typingsJapgolly.reactUjs.reactUjsStrings.webkitanimationiteration
import typingsJapgolly.reactUjs.reactUjsStrings.webkitanimationstart
import typingsJapgolly.reactUjs.reactUjsStrings.webkittransitionend
import typingsJapgolly.reactUjs.reactUjsStrings.wheel
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.DOMHighResTimeStamp
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.Record
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(`type`: String): Unit = js.native
    def apply(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def apply(`type`: String, callback: Null, options: AddEventListenerOptions): Unit = js.native
    def apply(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    def apply(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: DOMContentLoaded,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: DOMContentLoaded,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    def apply(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
    def apply(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    def apply(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    def apply(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    def apply(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
    def apply(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    def apply(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    def apply(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    def apply(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    def apply(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerlockchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: pointerlockchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerlockchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerlockerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: pointerlockerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerlockerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any]): Unit = js.native
    def apply(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    def apply(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
    def apply(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: visibilitychange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: visibilitychange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: visibilitychange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    def apply(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    def apply(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def apply(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]): Unit = js.native
    def apply(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallTypeListenerOptions extends StObject {
    
    def apply(`type`: String): Unit = js.native
    def apply(`type`: String, callback: Null, options: EventListenerOptions): Unit = js.native
    def apply(`type`: String, callback: Null, options: Boolean): Unit = js.native
    def apply(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    def apply(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    def apply(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: DOMContentLoaded,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: DOMContentLoaded,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    def apply(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: animationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: auxclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: auxclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: beforeinput, listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any]): Unit = js.native
    def apply(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: beforeinput,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ InputEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: blur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: blur,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: canplay, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: canplay,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: canplaythrough, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: canplaythrough,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: change,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: click, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: click,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: close,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: compositionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: compositionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: compositionupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ CompositionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: contextmenu, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: contextmenu,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: copy, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    def apply(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: copy,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: cuechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: cuechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: cut, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    def apply(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: cut,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: dblclick, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: dblclick,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: dragend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: dragend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: dragenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: dragenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: dragleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: dragleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: drag, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: drag,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: dragover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: dragover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: dragstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: dragstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: drop, listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any]): Unit = js.native
    def apply(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: drop,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: durationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: durationchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: emptied, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: emptied,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: ended, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: ended,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any]): Unit = js.native
    def apply(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: focusin, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: focusin,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: focus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: focus,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: focusout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any]): Unit = js.native
    def apply(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: focusout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: formdata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any]): Unit = js.native
    def apply(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: formdata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ FormDataEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: fullscreenchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: fullscreenchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: fullscreenerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: fullscreenerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: gotpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: input, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: input,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: invalid, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: invalid,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: keydown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    def apply(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: keydown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: keypress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    def apply(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: keypress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: keyup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any]): Unit = js.native
    def apply(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: keyup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: loadeddata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: loadeddata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: loadedmetadata, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: loadedmetadata,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: load,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: loadstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: loadstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: lostpointercapture,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mousedown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mousedown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mouseenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mouseenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mouseleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mouseleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mousemove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mousemove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mouseout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mouseout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mouseover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mouseover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: mouseup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]): Unit = js.native
    def apply(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: mouseup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: paste, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any]): Unit = js.native
    def apply(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: paste,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pause,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: playing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: playing,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: play, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: play,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointercancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerdown, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerdown,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerenter, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerenter,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerleave, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerleave,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerlockchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: pointerlockchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerlockchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerlockerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: pointerlockerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerlockerror,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointermove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointermove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerout, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerout,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerover, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerover,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: pointerup, listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any]): Unit = js.native
    def apply(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: pointerup,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: progress, listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any]): Unit = js.native
    def apply(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: ratechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: ratechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: readystatechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: reset, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: reset,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: resize, listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any]): Unit = js.native
    def apply(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: resize,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: scroll, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: scroll,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: securitypolicyviolation,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: seeked, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: seeked,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: seeking, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: seeking,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: selectionchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: selectionchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: select, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: select,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: selectstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: selectstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: slotchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: slotchange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: stalled, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: stalled,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: submit, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any]): Unit = js.native
    def apply(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: submit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ SubmitEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: suspend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: suspend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: timeupdate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: timeupdate,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: toggle, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: toggle,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: touchcancel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: touchcancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: touchend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: touchend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: touchmove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: touchmove,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: touchstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any]): Unit = js.native
    def apply(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: touchstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitioncancel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitionrun,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any]
    ): Unit = js.native
    def apply(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: transitionstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: visibilitychange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: visibilitychange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: visibilitychange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: volumechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: volumechange,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: waiting, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: waiting,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: webkitanimationend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: webkitanimationend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    def apply(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: webkitanimationiteration,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
    ): Unit = js.native
    def apply(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: webkitanimationstart,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: webkittransitionend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def apply(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: webkittransitionend,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def apply(`type`: wheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any]): Unit = js.native
    def apply(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: EventListenerOptions
    ): Unit = js.native
    def apply(
      `type`: wheel,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, Any],
      options: Boolean
    ): Unit = js.native
  }
  
  /* Inlined std.Partial<std.Event> */
  trait PartialEvent extends StObject {
    
    var AT_TARGET: js.UndefOr[Double] = js.undefined
    
    var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
    
    var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
    
    var NONE: js.UndefOr[Double] = js.undefined
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelBubble: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var composed: js.UndefOr[Boolean] = js.undefined
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.undefined
    
    var currentTarget: js.UndefOr[EventTarget | Null] = js.undefined
    
    var defaultPrevented: js.UndefOr[Boolean] = js.undefined
    
    var eventPhase: js.UndefOr[Double] = js.undefined
    
    var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
    
    var isTrusted: js.UndefOr[Boolean] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var returnValue: js.UndefOr[Boolean] = js.undefined
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PartialEvent {
    
    inline def apply(): PartialEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEvent]
    }
    
    extension [Self <: PartialEvent](x: Self) {
      
      inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      inline def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedPath(value: CallbackTo[js.Array[EventTarget]]): Self = StObject.set(x, "composedPath", value.toJsFn)
      
      inline def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      inline def setInitEvent(value: /* type */ String => Callback): Self = StObject.set(x, "initEvent", js.Any.fromFunction1((t0: /* type */ String) => value(t0).runNow()))
      
      inline def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
      
      inline def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TypeofreactUjs extends StObject {
    
    /** This attribute holds a unique identifier to identify a node. */
    val CACHE_ID_ATTR: String = js.native
    
    /** This attribute holds the name of component which should be mounted. */
    val CLASS_NAME_ATTR: String = js.native
    
    /** This attribute holds JSON stringified props for initializing the component. */
    val PROPS_ATTR: String = js.native
    
    /** This attribute holds which method to use between: ReactDOM.hydrate, ReactDOM.render. */
    val RENDER_ATTR: String = js.native
    
    /** This attribute is set to persist the element through Turbolinks navigations. */
    val TURBOLINKS_PERMANENT_ATTR: String = js.native
    
    /** A map of rendered React elements. The keys are values of CACHE_ID_ATTR attributes. */
    val components: Record[String, Element] = js.native
    
    /**
      * Check the global context for installed libraries and figure out which library to hook up to (pjax, Turbolinks,
      * jQuery). This is called on load, but you can call it again if needed (it will unmount itself).
      */
    def detectEvents(): Unit = js.native
    
    /**
      * Find DOM elements with the CLASS_NAME_ATTR attribute within `searchSelector`.
      */
    def findDOMNodes(): JQuery[HTMLElement] | NodeList[Node] = js.native
    def findDOMNodes(searchSelector: SearchSelector): JQuery[HTMLElement] | NodeList[Node] = js.native
    
    /**
      * Get the constructor for a className (returns a React class). Override this function to lookup classes in a custom
      * way.
      */
    def getConstructor(className: String): ComponentType[js.Object] = js.native
    
    /**
      * Internal reference to document.addEventListener, set when detectEvents is called.
      */
    var handleEvent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof document.addEventListener */ js.Any
      ] = js.native
    
    /**
      * An event listener that calls mountComponents on event.target.
      */
    def handleMount(): Unit = js.native
    def handleMount(event: PartialEvent): Unit = js.native
    
    /**
      * An event listener that calls unmountComponents on event.target.
      */
    def handleUnmount(): Unit = js.native
    def handleUnmount(event: PartialEvent): Unit = js.native
    
    /** If jQuery is detected, save a reference to it for event handlers. */
    val jQuery: js.UndefOr[`false` | JQueryStatic] = js.native
    
    /**
      * Within `searchSelector`, find nodes which should have React components inside them, and mount them with their props.
      */
    def mountComponents(): Unit = js.native
    def mountComponents(searchSelector: SearchSelector): Unit = js.native
    
    /**
      * Internal reference to document.removeEventListener, set when detectEvents is called.
      */
    var removeEvent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof document.removeEventListener */ js.Any
      ] = js.native
    
    /**
      * Render `componentName` with `props` to a string,
      * using the specified `renderFunction` from `react-dom/server`.
      */
    def serverRender(renderFunction: String, componentName: String, props: Any): Any = js.native
    
    /**
      * Within `searchSelector`, find nodes which have React components inside them, and unmount those components.
      */
    def unmountComponents(): Unit = js.native
    def unmountComponents(searchSelector: SearchSelector): Unit = js.native
    
    /**
      * Given a Webpack `require.context`, try finding components with `require`, then falling back to global lookup.
      */
    def useContext(context: WebpackRequireContext): Unit = js.native
  }
}
