package typingsJapgolly.railsUjs

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
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
import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.railsUjs.railsUjsStrings.abort
import typingsJapgolly.railsUjs.railsUjsStrings.animationcancel
import typingsJapgolly.railsUjs.railsUjsStrings.animationend
import typingsJapgolly.railsUjs.railsUjsStrings.animationiteration
import typingsJapgolly.railsUjs.railsUjsStrings.animationstart
import typingsJapgolly.railsUjs.railsUjsStrings.auxclick
import typingsJapgolly.railsUjs.railsUjsStrings.beforeinput
import typingsJapgolly.railsUjs.railsUjsStrings.blur
import typingsJapgolly.railsUjs.railsUjsStrings.canplay
import typingsJapgolly.railsUjs.railsUjsStrings.canplaythrough
import typingsJapgolly.railsUjs.railsUjsStrings.change
import typingsJapgolly.railsUjs.railsUjsStrings.click
import typingsJapgolly.railsUjs.railsUjsStrings.close
import typingsJapgolly.railsUjs.railsUjsStrings.compositionend
import typingsJapgolly.railsUjs.railsUjsStrings.compositionstart
import typingsJapgolly.railsUjs.railsUjsStrings.compositionupdate
import typingsJapgolly.railsUjs.railsUjsStrings.contextmenu
import typingsJapgolly.railsUjs.railsUjsStrings.copy
import typingsJapgolly.railsUjs.railsUjsStrings.cuechange
import typingsJapgolly.railsUjs.railsUjsStrings.cut
import typingsJapgolly.railsUjs.railsUjsStrings.dblclick
import typingsJapgolly.railsUjs.railsUjsStrings.drag
import typingsJapgolly.railsUjs.railsUjsStrings.dragend
import typingsJapgolly.railsUjs.railsUjsStrings.dragenter
import typingsJapgolly.railsUjs.railsUjsStrings.dragleave
import typingsJapgolly.railsUjs.railsUjsStrings.dragover
import typingsJapgolly.railsUjs.railsUjsStrings.dragstart
import typingsJapgolly.railsUjs.railsUjsStrings.drop
import typingsJapgolly.railsUjs.railsUjsStrings.durationchange
import typingsJapgolly.railsUjs.railsUjsStrings.emptied
import typingsJapgolly.railsUjs.railsUjsStrings.ended
import typingsJapgolly.railsUjs.railsUjsStrings.error
import typingsJapgolly.railsUjs.railsUjsStrings.focus
import typingsJapgolly.railsUjs.railsUjsStrings.focusin
import typingsJapgolly.railsUjs.railsUjsStrings.focusout
import typingsJapgolly.railsUjs.railsUjsStrings.formdata
import typingsJapgolly.railsUjs.railsUjsStrings.fullscreenchange
import typingsJapgolly.railsUjs.railsUjsStrings.fullscreenerror
import typingsJapgolly.railsUjs.railsUjsStrings.gotpointercapture
import typingsJapgolly.railsUjs.railsUjsStrings.input
import typingsJapgolly.railsUjs.railsUjsStrings.invalid
import typingsJapgolly.railsUjs.railsUjsStrings.keydown
import typingsJapgolly.railsUjs.railsUjsStrings.keypress
import typingsJapgolly.railsUjs.railsUjsStrings.keyup
import typingsJapgolly.railsUjs.railsUjsStrings.load
import typingsJapgolly.railsUjs.railsUjsStrings.loadeddata
import typingsJapgolly.railsUjs.railsUjsStrings.loadedmetadata
import typingsJapgolly.railsUjs.railsUjsStrings.loadstart
import typingsJapgolly.railsUjs.railsUjsStrings.lostpointercapture
import typingsJapgolly.railsUjs.railsUjsStrings.mousedown
import typingsJapgolly.railsUjs.railsUjsStrings.mouseenter
import typingsJapgolly.railsUjs.railsUjsStrings.mouseleave
import typingsJapgolly.railsUjs.railsUjsStrings.mousemove
import typingsJapgolly.railsUjs.railsUjsStrings.mouseout
import typingsJapgolly.railsUjs.railsUjsStrings.mouseover
import typingsJapgolly.railsUjs.railsUjsStrings.mouseup
import typingsJapgolly.railsUjs.railsUjsStrings.paste
import typingsJapgolly.railsUjs.railsUjsStrings.pause
import typingsJapgolly.railsUjs.railsUjsStrings.play
import typingsJapgolly.railsUjs.railsUjsStrings.playing
import typingsJapgolly.railsUjs.railsUjsStrings.pointercancel
import typingsJapgolly.railsUjs.railsUjsStrings.pointerdown
import typingsJapgolly.railsUjs.railsUjsStrings.pointerenter
import typingsJapgolly.railsUjs.railsUjsStrings.pointerleave
import typingsJapgolly.railsUjs.railsUjsStrings.pointermove
import typingsJapgolly.railsUjs.railsUjsStrings.pointerout
import typingsJapgolly.railsUjs.railsUjsStrings.pointerover
import typingsJapgolly.railsUjs.railsUjsStrings.pointerup
import typingsJapgolly.railsUjs.railsUjsStrings.progress
import typingsJapgolly.railsUjs.railsUjsStrings.ratechange
import typingsJapgolly.railsUjs.railsUjsStrings.reset
import typingsJapgolly.railsUjs.railsUjsStrings.resize
import typingsJapgolly.railsUjs.railsUjsStrings.scroll
import typingsJapgolly.railsUjs.railsUjsStrings.securitypolicyviolation
import typingsJapgolly.railsUjs.railsUjsStrings.seeked
import typingsJapgolly.railsUjs.railsUjsStrings.seeking
import typingsJapgolly.railsUjs.railsUjsStrings.select
import typingsJapgolly.railsUjs.railsUjsStrings.selectionchange
import typingsJapgolly.railsUjs.railsUjsStrings.selectstart
import typingsJapgolly.railsUjs.railsUjsStrings.slotchange
import typingsJapgolly.railsUjs.railsUjsStrings.stalled
import typingsJapgolly.railsUjs.railsUjsStrings.submit
import typingsJapgolly.railsUjs.railsUjsStrings.suspend
import typingsJapgolly.railsUjs.railsUjsStrings.timeupdate
import typingsJapgolly.railsUjs.railsUjsStrings.toggle
import typingsJapgolly.railsUjs.railsUjsStrings.touchcancel
import typingsJapgolly.railsUjs.railsUjsStrings.touchend
import typingsJapgolly.railsUjs.railsUjsStrings.touchmove
import typingsJapgolly.railsUjs.railsUjsStrings.touchstart
import typingsJapgolly.railsUjs.railsUjsStrings.transitioncancel
import typingsJapgolly.railsUjs.railsUjsStrings.transitionend
import typingsJapgolly.railsUjs.railsUjsStrings.transitionrun
import typingsJapgolly.railsUjs.railsUjsStrings.transitionstart
import typingsJapgolly.railsUjs.railsUjsStrings.volumechange
import typingsJapgolly.railsUjs.railsUjsStrings.waiting
import typingsJapgolly.railsUjs.railsUjsStrings.webkitanimationend
import typingsJapgolly.railsUjs.railsUjsStrings.webkitanimationiteration
import typingsJapgolly.railsUjs.railsUjsStrings.webkitanimationstart
import typingsJapgolly.railsUjs.railsUjsStrings.webkittransitionend
import typingsJapgolly.railsUjs.railsUjsStrings.wheel
import typingsJapgolly.railsUjs.utilsAjaxMod.AjaxOptions
import typingsJapgolly.railsUjs.utilsDomMod.SelectorObject
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rails/ujs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CSRFProtection(xhr: XMLHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CSRFProtection")(xhr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def _empty(selector: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def ajax(options: AjaxOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@rails/ujs", "buttonClickSelector")
  @js.native
  val buttonClickSelector: SelectorObject = js.native
  
  @JSImport("@rails/ujs", "buttonDisableSelector")
  @js.native
  val buttonDisableSelector: String = js.native
  
  inline def confirm(message: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def confirm(message: String, element: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(message.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cspNonce(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cspNonce")().asInstanceOf[js.UndefOr[String]]
  
  inline def csrfParam(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("csrfParam")().asInstanceOf[String | Null]
  
  inline def csrfToken(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("csrfToken")().asInstanceOf[String | Null]
  
  inline def delegate(element: EventTarget, selector: String, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate(element: EventTarget, selector: SelectorObject, eventType: String, handler: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_abort(
    element: EventTarget,
    selector: String,
    eventType: abort,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_abort(
    element: EventTarget,
    selector: SelectorObject,
    eventType: abort,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_animationcancel(
    element: EventTarget,
    selector: String,
    eventType: animationcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_animationcancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_animationend(
    element: EventTarget,
    selector: String,
    eventType: animationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_animationend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_animationiteration(
    element: EventTarget,
    selector: String,
    eventType: animationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_animationiteration(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_animationstart(
    element: EventTarget,
    selector: String,
    eventType: animationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_animationstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_auxclick(
    element: EventTarget,
    selector: String,
    eventType: auxclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_auxclick(
    element: EventTarget,
    selector: SelectorObject,
    eventType: auxclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_beforeinput(
    element: EventTarget,
    selector: String,
    eventType: beforeinput,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_beforeinput(
    element: EventTarget,
    selector: SelectorObject,
    eventType: beforeinput,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_blur(
    element: EventTarget,
    selector: String,
    eventType: blur,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_blur(
    element: EventTarget,
    selector: SelectorObject,
    eventType: blur,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_canplay(
    element: EventTarget,
    selector: String,
    eventType: canplay,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_canplay(
    element: EventTarget,
    selector: SelectorObject,
    eventType: canplay,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_canplaythrough(
    element: EventTarget,
    selector: String,
    eventType: canplaythrough,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_canplaythrough(
    element: EventTarget,
    selector: SelectorObject,
    eventType: canplaythrough,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_change(
    element: EventTarget,
    selector: String,
    eventType: change,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_change(
    element: EventTarget,
    selector: SelectorObject,
    eventType: change,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_click(
    element: EventTarget,
    selector: String,
    eventType: click,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_click(
    element: EventTarget,
    selector: SelectorObject,
    eventType: click,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_close(
    element: EventTarget,
    selector: String,
    eventType: close,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_close(
    element: EventTarget,
    selector: SelectorObject,
    eventType: close,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_compositionend(
    element: EventTarget,
    selector: String,
    eventType: compositionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_compositionend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: compositionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_compositionstart(
    element: EventTarget,
    selector: String,
    eventType: compositionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_compositionstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: compositionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_compositionupdate(
    element: EventTarget,
    selector: String,
    eventType: compositionupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_compositionupdate(
    element: EventTarget,
    selector: SelectorObject,
    eventType: compositionupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_contextmenu(
    element: EventTarget,
    selector: String,
    eventType: contextmenu,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_contextmenu(
    element: EventTarget,
    selector: SelectorObject,
    eventType: contextmenu,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_copy(
    element: EventTarget,
    selector: String,
    eventType: copy,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_copy(
    element: EventTarget,
    selector: SelectorObject,
    eventType: copy,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_cuechange(
    element: EventTarget,
    selector: String,
    eventType: cuechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_cuechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cuechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_cut(
    element: EventTarget,
    selector: String,
    eventType: cut,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_cut(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cut,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_dblclick(
    element: EventTarget,
    selector: String,
    eventType: dblclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_dblclick(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dblclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_drag(
    element: EventTarget,
    selector: String,
    eventType: drag,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_drag(
    element: EventTarget,
    selector: SelectorObject,
    eventType: drag,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_dragend(
    element: EventTarget,
    selector: String,
    eventType: dragend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_dragend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_dragenter(
    element: EventTarget,
    selector: String,
    eventType: dragenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_dragenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_dragleave(
    element: EventTarget,
    selector: String,
    eventType: dragleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_dragleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_dragover(
    element: EventTarget,
    selector: String,
    eventType: dragover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_dragover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_dragstart(
    element: EventTarget,
    selector: String,
    eventType: dragstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_dragstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_drop(
    element: EventTarget,
    selector: String,
    eventType: drop,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_drop(
    element: EventTarget,
    selector: SelectorObject,
    eventType: drop,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_durationchange(
    element: EventTarget,
    selector: String,
    eventType: durationchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_durationchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: durationchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_emptied(
    element: EventTarget,
    selector: String,
    eventType: emptied,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_emptied(
    element: EventTarget,
    selector: SelectorObject,
    eventType: emptied,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_ended(
    element: EventTarget,
    selector: String,
    eventType: ended,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_ended(
    element: EventTarget,
    selector: SelectorObject,
    eventType: ended,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_error(
    element: EventTarget,
    selector: String,
    eventType: error,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_error(
    element: EventTarget,
    selector: SelectorObject,
    eventType: error,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_focus(
    element: EventTarget,
    selector: String,
    eventType: focus,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_focus(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focus,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_focusin(
    element: EventTarget,
    selector: String,
    eventType: focusin,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_focusin(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focusin,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_focusout(
    element: EventTarget,
    selector: String,
    eventType: focusout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_focusout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focusout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_formdata(
    element: EventTarget,
    selector: String,
    eventType: formdata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_formdata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: formdata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_fullscreenchange(
    element: EventTarget,
    selector: String,
    eventType: fullscreenchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_fullscreenchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: fullscreenchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_fullscreenerror(
    element: EventTarget,
    selector: String,
    eventType: fullscreenerror,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_fullscreenerror(
    element: EventTarget,
    selector: SelectorObject,
    eventType: fullscreenerror,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_gotpointercapture(
    element: EventTarget,
    selector: String,
    eventType: gotpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_gotpointercapture(
    element: EventTarget,
    selector: SelectorObject,
    eventType: gotpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_input(
    element: EventTarget,
    selector: String,
    eventType: input,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_input(
    element: EventTarget,
    selector: SelectorObject,
    eventType: input,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_invalid(
    element: EventTarget,
    selector: String,
    eventType: invalid,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_invalid(
    element: EventTarget,
    selector: SelectorObject,
    eventType: invalid,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_keydown(
    element: EventTarget,
    selector: String,
    eventType: keydown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_keydown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keydown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_keypress(
    element: EventTarget,
    selector: String,
    eventType: keypress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_keypress(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keypress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_keyup(
    element: EventTarget,
    selector: String,
    eventType: keyup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_keyup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keyup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_load(
    element: EventTarget,
    selector: String,
    eventType: load,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_load(
    element: EventTarget,
    selector: SelectorObject,
    eventType: load,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_loadeddata(
    element: EventTarget,
    selector: String,
    eventType: loadeddata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_loadeddata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadeddata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_loadedmetadata(
    element: EventTarget,
    selector: String,
    eventType: loadedmetadata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_loadedmetadata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadedmetadata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_loadstart(
    element: EventTarget,
    selector: String,
    eventType: loadstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_loadstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_lostpointercapture(
    element: EventTarget,
    selector: String,
    eventType: lostpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_lostpointercapture(
    element: EventTarget,
    selector: SelectorObject,
    eventType: lostpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mousedown(
    element: EventTarget,
    selector: String,
    eventType: mousedown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mousedown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mousedown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mouseenter(
    element: EventTarget,
    selector: String,
    eventType: mouseenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mouseenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mouseleave(
    element: EventTarget,
    selector: String,
    eventType: mouseleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mouseleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mousemove(
    element: EventTarget,
    selector: String,
    eventType: mousemove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mousemove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mousemove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mouseout(
    element: EventTarget,
    selector: String,
    eventType: mouseout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mouseout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mouseover(
    element: EventTarget,
    selector: String,
    eventType: mouseover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mouseover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_mouseup(
    element: EventTarget,
    selector: String,
    eventType: mouseup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_mouseup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_paste(
    element: EventTarget,
    selector: String,
    eventType: paste,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_paste(
    element: EventTarget,
    selector: SelectorObject,
    eventType: paste,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pause(
    element: EventTarget,
    selector: String,
    eventType: pause,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pause(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pause,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_play(
    element: EventTarget,
    selector: String,
    eventType: play,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_play(
    element: EventTarget,
    selector: SelectorObject,
    eventType: play,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_playing(
    element: EventTarget,
    selector: String,
    eventType: playing,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_playing(
    element: EventTarget,
    selector: SelectorObject,
    eventType: playing,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointercancel(
    element: EventTarget,
    selector: String,
    eventType: pointercancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointercancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointercancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointerdown(
    element: EventTarget,
    selector: String,
    eventType: pointerdown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointerdown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerdown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointerenter(
    element: EventTarget,
    selector: String,
    eventType: pointerenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointerenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointerleave(
    element: EventTarget,
    selector: String,
    eventType: pointerleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointerleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointermove(
    element: EventTarget,
    selector: String,
    eventType: pointermove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointermove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointermove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointerout(
    element: EventTarget,
    selector: String,
    eventType: pointerout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointerout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointerover(
    element: EventTarget,
    selector: String,
    eventType: pointerover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointerover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_pointerup(
    element: EventTarget,
    selector: String,
    eventType: pointerup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_pointerup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_progress(
    element: EventTarget,
    selector: String,
    eventType: progress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_progress(
    element: EventTarget,
    selector: SelectorObject,
    eventType: progress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_ratechange(
    element: EventTarget,
    selector: String,
    eventType: ratechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_ratechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: ratechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_reset(
    element: EventTarget,
    selector: String,
    eventType: reset,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_reset(
    element: EventTarget,
    selector: SelectorObject,
    eventType: reset,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_resize(
    element: EventTarget,
    selector: String,
    eventType: resize,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_resize(
    element: EventTarget,
    selector: SelectorObject,
    eventType: resize,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_scroll(
    element: EventTarget,
    selector: String,
    eventType: scroll,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_scroll(
    element: EventTarget,
    selector: SelectorObject,
    eventType: scroll,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_securitypolicyviolation(
    element: EventTarget,
    selector: String,
    eventType: securitypolicyviolation,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_securitypolicyviolation(
    element: EventTarget,
    selector: SelectorObject,
    eventType: securitypolicyviolation,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_seeked(
    element: EventTarget,
    selector: String,
    eventType: seeked,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_seeked(
    element: EventTarget,
    selector: SelectorObject,
    eventType: seeked,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_seeking(
    element: EventTarget,
    selector: String,
    eventType: seeking,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_seeking(
    element: EventTarget,
    selector: SelectorObject,
    eventType: seeking,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_select(
    element: EventTarget,
    selector: String,
    eventType: select,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_select(
    element: EventTarget,
    selector: SelectorObject,
    eventType: select,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_selectionchange(
    element: EventTarget,
    selector: String,
    eventType: selectionchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_selectionchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: selectionchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_selectstart(
    element: EventTarget,
    selector: String,
    eventType: selectstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_selectstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: selectstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_slotchange(
    element: EventTarget,
    selector: String,
    eventType: slotchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_slotchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: slotchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_stalled(
    element: EventTarget,
    selector: String,
    eventType: stalled,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_stalled(
    element: EventTarget,
    selector: SelectorObject,
    eventType: stalled,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_submit(
    element: EventTarget,
    selector: String,
    eventType: submit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_submit(
    element: EventTarget,
    selector: SelectorObject,
    eventType: submit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_suspend(
    element: EventTarget,
    selector: String,
    eventType: suspend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_suspend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: suspend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_timeupdate(
    element: EventTarget,
    selector: String,
    eventType: timeupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_timeupdate(
    element: EventTarget,
    selector: SelectorObject,
    eventType: timeupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_toggle(
    element: EventTarget,
    selector: String,
    eventType: toggle,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_toggle(
    element: EventTarget,
    selector: SelectorObject,
    eventType: toggle,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_touchcancel(
    element: EventTarget,
    selector: String,
    eventType: touchcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_touchcancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_touchend(
    element: EventTarget,
    selector: String,
    eventType: touchend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_touchend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_touchmove(
    element: EventTarget,
    selector: String,
    eventType: touchmove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_touchmove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchmove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_touchstart(
    element: EventTarget,
    selector: String,
    eventType: touchstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_touchstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_transitioncancel(
    element: EventTarget,
    selector: String,
    eventType: transitioncancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_transitioncancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitioncancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_transitionend(
    element: EventTarget,
    selector: String,
    eventType: transitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_transitionend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_transitionrun(
    element: EventTarget,
    selector: String,
    eventType: transitionrun,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_transitionrun(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionrun,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_transitionstart(
    element: EventTarget,
    selector: String,
    eventType: transitionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_transitionstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_volumechange(
    element: EventTarget,
    selector: String,
    eventType: volumechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_volumechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: volumechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_waiting(
    element: EventTarget,
    selector: String,
    eventType: waiting,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_waiting(
    element: EventTarget,
    selector: SelectorObject,
    eventType: waiting,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_webkitanimationend(
    element: EventTarget,
    selector: String,
    eventType: webkitanimationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_webkitanimationend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: webkitanimationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_webkitanimationiteration(
    element: EventTarget,
    selector: String,
    eventType: webkitanimationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_webkitanimationiteration(
    element: EventTarget,
    selector: SelectorObject,
    eventType: webkitanimationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_webkitanimationstart(
    element: EventTarget,
    selector: String,
    eventType: webkitanimationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_webkitanimationstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: webkitanimationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_webkittransitionend(
    element: EventTarget,
    selector: String,
    eventType: webkittransitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_webkittransitionend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: webkittransitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def delegate_wheel(
    element: EventTarget,
    selector: String,
    eventType: wheel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def delegate_wheel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: wheel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disableElement(e: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disableElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableElement(e: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@rails/ujs", "fileInputSelector")
  @js.native
  val fileInputSelector: String = js.native
  
  inline def fire(obj: EventTarget, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fire(obj: EventTarget, name: String, data: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@rails/ujs", "formDisableSelector")
  @js.native
  val formDisableSelector: String = js.native
  
  inline def formElements(form: Element, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("formElements")(form.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  @JSImport("@rails/ujs", "formEnableSelector")
  @js.native
  val formEnableSelector: String = js.native
  
  @JSImport("@rails/ujs", "formInputClickSelector")
  @js.native
  val formInputClickSelector: String = js.native
  
  inline def formSubmitButtonClick(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("formSubmitButtonClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@rails/ujs", "formSubmitSelector")
  @js.native
  val formSubmitSelector: String = js.native
  
  inline def getData(element: Element, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(element.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def handleConfirm(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleConfirm")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleDisabledElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDisabledElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleMethod(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleMethod")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleRemote(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRemote")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def href(element: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("href")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @JSImport("@rails/ujs", "inputChangeSelector")
  @js.native
  val inputChangeSelector: String = js.native
  
  inline def isCrossDomain(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrossDomain")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@rails/ujs", "linkClickSelector")
  @js.native
  val linkClickSelector: String = js.native
  
  @JSImport("@rails/ujs", "linkDisableSelector")
  @js.native
  val linkDisableSelector: String = js.native
  
  inline def loadCSPNonce(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCSPNonce")().asInstanceOf[js.UndefOr[String]]
  
  inline def matches(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matches(element: Element, selector: SelectorObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def preventInsignificantClick(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventInsignificantClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def refreshCSRFTokens(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCSRFTokens")().asInstanceOf[Unit]
  
  inline def serializeElement(element: Element, additionalParam: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeElement")(element.asInstanceOf[js.Any], additionalParam.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setData(element: Element, key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(element.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  inline def stopEverything(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEverything")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
