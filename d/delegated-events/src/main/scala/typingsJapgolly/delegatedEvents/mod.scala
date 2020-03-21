package typingsJapgolly.delegatedEvents

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.abort
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationcancel
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationiteration
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.animationstart
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.auxclick
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.blur
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.cancel
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.canplay
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.canplaythrough
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.change
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.click
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.close
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.contextmenu
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.cuechange
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dblclick
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.drag
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragend
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragenter
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.dragexit
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
import typingsJapgolly.delegatedEvents.delegatedEventsStrings.wheel
import typingsJapgolly.std.Event_
import typingsJapgolly.std.GlobalEventHandlers
import typingsJapgolly.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delegated-events", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fire(target: Element, name: String): Boolean = js.native
  def fire(target: Element, name: String, detail: js.Any): Boolean = js.native
  def off(name: String, selector: String, listener: DelegatedEventListener): Unit = js.native
  def off(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = js.native
  def on(name: String, selector: String, listener: DelegatedEventListener): Unit = js.native
  def on(name: String, selector: String, listener: DelegatedEventListener, options: EventListenerOptions): Unit = js.native
  @JSName("on")
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_abort(
    name: abort,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationcancel(
    name: animationcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationend(
    name: animationend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationiteration(
    name: animationiteration,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_animationstart(
    name: animationstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ AnimationEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_auxclick(
    name: auxclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_blur(
    name: blur,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_cancel(
    name: cancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_canplay(
    name: canplay,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_canplaythrough(
    name: canplaythrough,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_change(
    name: change,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_click(
    name: click,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_close(
    name: close,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_contextmenu(
    name: contextmenu,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_cuechange(
    name: cuechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dblclick(
    name: dblclick,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_drag(
    name: drag,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragend(
    name: dragend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragenter(
    name: dragenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragexit(
    name: dragexit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragleave(
    name: dragleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragover(
    name: dragover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_dragstart(
    name: dragstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_drop(
    name: drop,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ DragEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_durationchange(
    name: durationchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_emptied(
    name: emptied,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_ended(
    name: ended,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ErrorEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_error(
    name: error,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ErrorEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focus(
    name: focus,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focusin(
    name: focusin,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_focusout(
    name: focusout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ FocusEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_gotpointercapture(
    name: gotpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_input(
    name: input,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_invalid(
    name: invalid,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keydown(
    name: keydown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keypress(
    name: keypress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_keyup(
    name: keyup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ KeyboardEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_load(
    name: load,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadeddata(
    name: loadeddata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadedmetadata(
    name: loadedmetadata,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_loadstart(
    name: loadstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_lostpointercapture(
    name: lostpointercapture,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mousedown(
    name: mousedown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseenter(
    name: mouseenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseleave(
    name: mouseleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mousemove(
    name: mousemove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseout(
    name: mouseout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseover(
    name: mouseover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_mouseup(
    name: mouseup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ MouseEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pause(
    name: pause,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_play(
    name: play,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_playing(
    name: playing,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointercancel(
    name: pointercancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerdown(
    name: pointerdown,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerenter(
    name: pointerenter,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerleave(
    name: pointerleave,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointermove(
    name: pointermove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerout(
    name: pointerout,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerover(
    name: pointerover,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_pointerup(
    name: pointerup,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ PointerEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_progress(
    name: progress,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ ProgressEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_ratechange(
    name: ratechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_reset(
    name: reset,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_resize(
    name: resize,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ UIEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_scroll(
    name: scroll,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ SecurityPolicyViolationEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_securitypolicyviolation(
    name: securitypolicyviolation,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ SecurityPolicyViolationEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_seeked(
    name: seeked,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_seeking(
    name: seeking,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_select(
    name: select,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_selectionchange(
    name: selectionchange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_selectstart(
    name: selectstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_stalled(
    name: stalled,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_submit(
    name: submit,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_suspend(
    name: suspend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_timeupdate(
    name: timeupdate,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_toggle(
    name: toggle,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchcancel(
    name: touchcancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchend(
    name: touchend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchmove(
    name: touchmove,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_touchstart(
    name: touchstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TouchEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitioncancel(
    name: transitioncancel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionend(
    name: transitionend,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionrun(
    name: transitionrun,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_transitionstart(
    name: transitionstart,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ TransitionEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_volumechange(
    name: volumechange,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_waiting(
    name: waiting,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ Event_ with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("on")
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ WheelEvent with AnonCurrentTarget, 
      _
    ]
  ): Unit = js.native
  @JSName("on")
  def on_wheel(
    name: wheel,
    selector: String,
    listener: js.ThisFunction1[
      /* this */ GlobalEventHandlers with Element, 
      /* ev */ WheelEvent with AnonCurrentTarget, 
      _
    ],
    options: EventListenerOptions
  ): Unit = js.native
  type DelegatedEventListener = js.ThisFunction1[/* this */ Element, /* ev */ CustomEventanycurrentTarg, js.Any]
}

