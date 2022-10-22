package typingsJapgolly.delegatedEvents

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
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
import typingsJapgolly.delegatedEvents.anon.CurrentTarget
import typingsJapgolly.delegatedEvents.anon.CustomEventanycurrentTarg
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.abort
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationcancel
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationiteration
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.auxclick
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.beforeinput
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.blur
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.canplay
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.canplaythrough
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.change
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.click
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.close
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.compositionend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.compositionstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.compositionupdate
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.contextmenu
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.cuechange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dblclick
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.drag
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragenter
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragleave
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragover
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.drop
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.durationchange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.emptied
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.ended
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.error
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.focus
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.focusin
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.focusout
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.formdata
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.gotpointercapture
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.input
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.invalid
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.keydown
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.keypress
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.keyup
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.load
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.loadeddata
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.loadedmetadata
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.loadstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.lostpointercapture
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mousedown
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mouseenter
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mouseleave
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mousemove
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mouseout
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mouseover
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.mouseup
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pause
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.play
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.playing
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointercancel
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointerdown
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointerenter
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointerleave
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointermove
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointerout
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointerover
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.pointerup
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.progress
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.ratechange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.reset
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.resize
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.scroll
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.securitypolicyviolation
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.seeked
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.seeking
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.select
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.selectionchange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.selectstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.slotchange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.stalled
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.submit
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.suspend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.timeupdate
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.toggle
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.touchcancel
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.touchend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.touchmove
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.touchstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.transitioncancel
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.transitionend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.transitionrun
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.transitionstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.volumechange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.waiting
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.webkitanimationend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.webkitanimationiteration
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.webkitanimationstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.webkittransitionend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.wheel
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.GlobalEventHandlers
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delegated-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fire(target: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fire(target: Element, name: String, detail: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def off(name: String, selector: String, listener: DelegatedEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on(name: String, selector: String, listener: DelegatedEventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ AnimationEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_beforeinput(
    name: beforeinput,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ InputEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_beforeinput(
    name: beforeinput,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ InputEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_compositionend(
    name: compositionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ CompositionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_compositionend(
    name: compositionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ CompositionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_compositionstart(
    name: compositionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ CompositionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_compositionstart(
    name: compositionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ CompositionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_compositionupdate(
    name: compositionupdate,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ CompositionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_compositionupdate(
    name: compositionupdate,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ CompositionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ DragEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ ErrorEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ ErrorEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ FocusEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_formdata(
    name: formdata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FormDataEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_formdata(
    name: formdata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ FormDataEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ KeyboardEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ MouseEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ PointerEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ ProgressEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ ProgressEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ UIEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ SecurityPolicyViolationEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ SecurityPolicyViolationEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_slotchange(
    name: slotchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_slotchange(
    name: slotchange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ SubmitEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ SubmitEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ TouchEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers & Element, 
      /* ev */ TransitionEvent & CurrentTarget, 
      Any
    ],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_webkitanimationend(
    name: webkitanimationend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_webkitanimationend(
    name: webkitanimationend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_webkitanimationiteration(
    name: webkitanimationiteration,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_webkitanimationiteration(
    name: webkitanimationiteration,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_webkitanimationstart(
    name: webkitanimationstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_webkitanimationstart(
    name: webkitanimationstart,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_webkittransitionend(
    name: webkittransitionend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_webkittransitionend(
    name: webkittransitionend,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ Event & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ WheelEvent & CurrentTarget, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[/* this */ GlobalEventHandlers & Element, /* ev */ WheelEvent & CurrentTarget, Any],
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DelegatedEventListener = js.ThisFunction1[/* this */ Element, /* ev */ CustomEventanycurrentTarg, Any]
}
