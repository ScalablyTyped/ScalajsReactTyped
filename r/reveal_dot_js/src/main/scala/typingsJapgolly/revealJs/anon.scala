package typingsJapgolly.revealJs

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.revealJs.revealJsStrings.DOMContentLoaded
import typingsJapgolly.revealJs.revealJsStrings.abort
import typingsJapgolly.revealJs.revealJsStrings.animationcancel
import typingsJapgolly.revealJs.revealJsStrings.animationend
import typingsJapgolly.revealJs.revealJsStrings.animationiteration
import typingsJapgolly.revealJs.revealJsStrings.animationstart
import typingsJapgolly.revealJs.revealJsStrings.auxclick
import typingsJapgolly.revealJs.revealJsStrings.beforeinput
import typingsJapgolly.revealJs.revealJsStrings.blur
import typingsJapgolly.revealJs.revealJsStrings.canplay
import typingsJapgolly.revealJs.revealJsStrings.canplaythrough
import typingsJapgolly.revealJs.revealJsStrings.change
import typingsJapgolly.revealJs.revealJsStrings.click
import typingsJapgolly.revealJs.revealJsStrings.close
import typingsJapgolly.revealJs.revealJsStrings.compositionend
import typingsJapgolly.revealJs.revealJsStrings.compositionstart
import typingsJapgolly.revealJs.revealJsStrings.compositionupdate
import typingsJapgolly.revealJs.revealJsStrings.contextmenu
import typingsJapgolly.revealJs.revealJsStrings.copy
import typingsJapgolly.revealJs.revealJsStrings.cuechange
import typingsJapgolly.revealJs.revealJsStrings.cut
import typingsJapgolly.revealJs.revealJsStrings.dblclick
import typingsJapgolly.revealJs.revealJsStrings.drag
import typingsJapgolly.revealJs.revealJsStrings.dragend
import typingsJapgolly.revealJs.revealJsStrings.dragenter
import typingsJapgolly.revealJs.revealJsStrings.dragleave
import typingsJapgolly.revealJs.revealJsStrings.dragover
import typingsJapgolly.revealJs.revealJsStrings.dragstart
import typingsJapgolly.revealJs.revealJsStrings.drop
import typingsJapgolly.revealJs.revealJsStrings.durationchange
import typingsJapgolly.revealJs.revealJsStrings.emptied
import typingsJapgolly.revealJs.revealJsStrings.ended
import typingsJapgolly.revealJs.revealJsStrings.error
import typingsJapgolly.revealJs.revealJsStrings.focus
import typingsJapgolly.revealJs.revealJsStrings.focusin
import typingsJapgolly.revealJs.revealJsStrings.focusout
import typingsJapgolly.revealJs.revealJsStrings.formdata
import typingsJapgolly.revealJs.revealJsStrings.fullscreenchange
import typingsJapgolly.revealJs.revealJsStrings.fullscreenerror
import typingsJapgolly.revealJs.revealJsStrings.gotpointercapture
import typingsJapgolly.revealJs.revealJsStrings.input
import typingsJapgolly.revealJs.revealJsStrings.invalid
import typingsJapgolly.revealJs.revealJsStrings.keydown
import typingsJapgolly.revealJs.revealJsStrings.keypress
import typingsJapgolly.revealJs.revealJsStrings.keyup
import typingsJapgolly.revealJs.revealJsStrings.load
import typingsJapgolly.revealJs.revealJsStrings.loadeddata
import typingsJapgolly.revealJs.revealJsStrings.loadedmetadata
import typingsJapgolly.revealJs.revealJsStrings.loadstart
import typingsJapgolly.revealJs.revealJsStrings.lostpointercapture
import typingsJapgolly.revealJs.revealJsStrings.mousedown
import typingsJapgolly.revealJs.revealJsStrings.mouseenter
import typingsJapgolly.revealJs.revealJsStrings.mouseleave
import typingsJapgolly.revealJs.revealJsStrings.mousemove
import typingsJapgolly.revealJs.revealJsStrings.mouseout
import typingsJapgolly.revealJs.revealJsStrings.mouseover
import typingsJapgolly.revealJs.revealJsStrings.mouseup
import typingsJapgolly.revealJs.revealJsStrings.paste
import typingsJapgolly.revealJs.revealJsStrings.pause
import typingsJapgolly.revealJs.revealJsStrings.play
import typingsJapgolly.revealJs.revealJsStrings.playing
import typingsJapgolly.revealJs.revealJsStrings.pointercancel
import typingsJapgolly.revealJs.revealJsStrings.pointerdown
import typingsJapgolly.revealJs.revealJsStrings.pointerenter
import typingsJapgolly.revealJs.revealJsStrings.pointerleave
import typingsJapgolly.revealJs.revealJsStrings.pointerlockchange
import typingsJapgolly.revealJs.revealJsStrings.pointerlockerror
import typingsJapgolly.revealJs.revealJsStrings.pointermove
import typingsJapgolly.revealJs.revealJsStrings.pointerout
import typingsJapgolly.revealJs.revealJsStrings.pointerover
import typingsJapgolly.revealJs.revealJsStrings.pointerup
import typingsJapgolly.revealJs.revealJsStrings.progress
import typingsJapgolly.revealJs.revealJsStrings.ratechange
import typingsJapgolly.revealJs.revealJsStrings.readystatechange
import typingsJapgolly.revealJs.revealJsStrings.reset
import typingsJapgolly.revealJs.revealJsStrings.resize
import typingsJapgolly.revealJs.revealJsStrings.scroll
import typingsJapgolly.revealJs.revealJsStrings.securitypolicyviolation
import typingsJapgolly.revealJs.revealJsStrings.seeked
import typingsJapgolly.revealJs.revealJsStrings.seeking
import typingsJapgolly.revealJs.revealJsStrings.select
import typingsJapgolly.revealJs.revealJsStrings.selectionchange
import typingsJapgolly.revealJs.revealJsStrings.selectstart
import typingsJapgolly.revealJs.revealJsStrings.slotchange
import typingsJapgolly.revealJs.revealJsStrings.stalled
import typingsJapgolly.revealJs.revealJsStrings.submit
import typingsJapgolly.revealJs.revealJsStrings.suspend
import typingsJapgolly.revealJs.revealJsStrings.timeupdate
import typingsJapgolly.revealJs.revealJsStrings.toggle
import typingsJapgolly.revealJs.revealJsStrings.touchcancel
import typingsJapgolly.revealJs.revealJsStrings.touchend
import typingsJapgolly.revealJs.revealJsStrings.touchmove
import typingsJapgolly.revealJs.revealJsStrings.touchstart
import typingsJapgolly.revealJs.revealJsStrings.transitioncancel
import typingsJapgolly.revealJs.revealJsStrings.transitionend
import typingsJapgolly.revealJs.revealJsStrings.transitionrun
import typingsJapgolly.revealJs.revealJsStrings.transitionstart
import typingsJapgolly.revealJs.revealJsStrings.visibilitychange
import typingsJapgolly.revealJs.revealJsStrings.volumechange
import typingsJapgolly.revealJs.revealJsStrings.waiting
import typingsJapgolly.revealJs.revealJsStrings.webkitanimationend
import typingsJapgolly.revealJs.revealJsStrings.webkitanimationiteration
import typingsJapgolly.revealJs.revealJsStrings.webkitanimationstart
import typingsJapgolly.revealJs.revealJsStrings.webkittransitionend
import typingsJapgolly.revealJs.revealJsStrings.wheel
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var inlineMath: js.UndefOr[Any] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setInlineMath(value: Any): Self = StObject.set(x, "inlineMath", value.asInstanceOf[js.Any])
      
      inline def setInlineMathUndefined: Self = StObject.set(x, "inlineMath", js.undefined)
    }
  }
  
  trait Bubbles extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var data: Any
    
    var target: js.UndefOr[Any] = js.undefined
    
    var `type`: String
  }
  object Bubbles {
    
    inline def apply(data: Any, `type`: String): Bubbles = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bubbles]
    }
    
    extension [Self <: Bubbles](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: String
    
    var key: String
    
    var keyCode: Double
  }
  object Description {
    
    inline def apply(description: String, key: String, keyCode: Double): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Display extends StObject {
    
    var display: Boolean
    
    var left: String
    
    var right: String
  }
  object Display {
    
    inline def apply(display: Boolean, left: String, right: String): Display = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Display]
    }
    
    extension [Self <: Display](x: Self) {
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Down extends StObject {
    
    var down: Boolean
    
    var left: Boolean
    
    var right: Boolean
    
    var up: Boolean
  }
  object Down {
    
    inline def apply(down: Boolean, left: Boolean, right: Boolean, up: Boolean): Down = {
      val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
      __obj.asInstanceOf[Down]
    }
    
    extension [Self <: Down](x: Self) {
      
      inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExcludeIframes extends StObject {
    
    var excludeIframes: js.UndefOr[Boolean] = js.undefined
  }
  object ExcludeIframes {
    
    inline def apply(): ExcludeIframes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeIframes]
    }
    
    extension [Self <: ExcludeIframes](x: Self) {
      
      inline def setExcludeIframes(value: Boolean): Self = StObject.set(x, "excludeIframes", value.asInstanceOf[js.Any])
      
      inline def setExcludeIframesUndefined: Self = StObject.set(x, "excludeIframes", js.undefined)
    }
  }
  
  trait F extends StObject {
    
    var f: Double
    
    var h: Double
    
    var v: Double
  }
  object F {
    
    inline def apply(f: Double, h: Double, v: Double): F = {
      val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[F]
    }
    
    extension [Self <: F](x: Self) {
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  trait Indexf extends StObject {
    
    var indexf: Double
    
    var indexh: Double
    
    var indexv: Double
    
    var overview: Boolean
    
    var paused: Boolean
  }
  object Indexf {
    
    inline def apply(indexf: Double, indexh: Double, indexv: Double, overview: Boolean, paused: Boolean): Indexf = {
      val __obj = js.Dynamic.literal(indexf = indexf.asInstanceOf[js.Any], indexh = indexh.asInstanceOf[js.Any], indexv = indexv.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Indexf]
    }
    
    extension [Self <: Indexf](x: Self) {
      
      inline def setIndexf(value: Double): Self = StObject.set(x, "indexf", value.asInstanceOf[js.Any])
      
      inline def setIndexh(value: Double): Self = StObject.set(x, "indexh", value.asInstanceOf[js.Any])
      
      inline def setIndexv(value: Double): Self = StObject.set(x, "indexv", value.asInstanceOf[js.Any])
      
      inline def setOverview(value: Boolean): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    }
  }
  
  trait InlineMath extends StObject {
    
    var inlineMath: js.UndefOr[Any] = js.undefined
    
    var skipTags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object InlineMath {
    
    inline def apply(): InlineMath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineMath]
    }
    
    extension [Self <: InlineMath](x: Self) {
      
      inline def setInlineMath(value: Any): Self = StObject.set(x, "inlineMath", value.asInstanceOf[js.Any])
      
      inline def setInlineMathUndefined: Self = StObject.set(x, "inlineMath", js.undefined)
      
      inline def setSkipTags(value: js.Array[String]): Self = StObject.set(x, "skipTags", value.asInstanceOf[js.Any])
      
      inline def setSkipTagsUndefined: Self = StObject.set(x, "skipTags", js.undefined)
      
      inline def setSkipTagsVarargs(value: String*): Self = StObject.set(x, "skipTags", js.Array(value*))
    }
  }
  
  trait Next extends StObject {
    
    var next: Boolean
    
    var prev: Boolean
  }
  object Next {
    
    inline def apply(next: Boolean, prev: Boolean): Next = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Boolean): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
  
  trait SkipHtmlTags extends StObject {
    
    var skipHtmlTags: js.Array[String]
  }
  object SkipHtmlTags {
    
    inline def apply(skipHtmlTags: js.Array[String]): SkipHtmlTags = {
      val __obj = js.Dynamic.literal(skipHtmlTags = skipHtmlTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipHtmlTags]
    }
    
    extension [Self <: SkipHtmlTags](x: Self) {
      
      inline def setSkipHtmlTags(value: js.Array[String]): Self = StObject.set(x, "skipHtmlTags", value.asInstanceOf[js.Any])
      
      inline def setSkipHtmlTagsVarargs(value: String*): Self = StObject.set(x, "skipHtmlTags", js.Array(value*))
    }
  }
}
