package typingsJapgolly.snabbdom.eventlistenersMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Event_
import typingsJapgolly.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ N in keyof std.HTMLElementEventMap ]:? (ev : std.HTMLElementEventMap[N]): void} & {[event: string] : std.EventListener} */
trait On extends /* event */ StringDictionary[EventListener] {
  var abort: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.undefined
  var animationcancel: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var animationend: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var animationiteration: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var animationstart: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var auxclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var canplay: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var canplaythrough: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var click: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var contextmenu: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var copy: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.undefined
  var cuechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var cut: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.undefined
  var dblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragexit: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var durationchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var emptied: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var ended: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* ev */ ErrorEvent, Unit]] = js.undefined
  var focus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var focusin: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var focusout: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var fullscreenchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var fullscreenerror: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var gotpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var input: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var invalid: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var keydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  var keypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  var keyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  var load: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var loadeddata: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var loadedmetadata: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var loadstart: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var lostpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var mousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var paste: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.undefined
  var pause: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var play: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var playing: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var pointercancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerdown: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerenter: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerleave: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointermove: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerout: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerover: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerup: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var progress: js.UndefOr[js.Function1[/* ev */ ProgressEvent, Unit]] = js.undefined
  var ratechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var reset: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var securitypolicyviolation: js.UndefOr[js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit]] = js.undefined
  var seeked: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var seeking: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var selectionchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var selectstart: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var stalled: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var submit: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var suspend: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var timeupdate: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var toggle: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var touchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var touchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var touchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var touchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var transitioncancel: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var transitionend: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var transitionrun: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var transitionstart: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var volumechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var waiting: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var wheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, Unit]] = js.undefined
}

object On {
  @scala.inline
  def apply(
    StringDictionary: /* event */ StringDictionary[EventListener] = null,
    abort: /* ev */ UIEvent => Callback = null,
    animationcancel: /* ev */ AnimationEvent => Callback = null,
    animationend: /* ev */ AnimationEvent => Callback = null,
    animationiteration: /* ev */ AnimationEvent => Callback = null,
    animationstart: /* ev */ AnimationEvent => Callback = null,
    auxclick: /* ev */ MouseEvent => Callback = null,
    blur: /* ev */ FocusEvent => Callback = null,
    cancel: /* ev */ Event_ => Callback = null,
    canplay: /* ev */ Event_ => Callback = null,
    canplaythrough: /* ev */ Event_ => Callback = null,
    change: /* ev */ Event_ => Callback = null,
    click: /* ev */ MouseEvent => Callback = null,
    close: /* ev */ Event_ => Callback = null,
    contextmenu: /* ev */ MouseEvent => Callback = null,
    copy: /* ev */ ClipboardEvent => Callback = null,
    cuechange: /* ev */ Event_ => Callback = null,
    cut: /* ev */ ClipboardEvent => Callback = null,
    dblclick: /* ev */ MouseEvent => Callback = null,
    drag: /* ev */ DragEvent => Callback = null,
    dragend: /* ev */ DragEvent => Callback = null,
    dragenter: /* ev */ DragEvent => Callback = null,
    dragexit: /* ev */ Event_ => Callback = null,
    dragleave: /* ev */ DragEvent => Callback = null,
    dragover: /* ev */ DragEvent => Callback = null,
    dragstart: /* ev */ DragEvent => Callback = null,
    drop: /* ev */ DragEvent => Callback = null,
    durationchange: /* ev */ Event_ => Callback = null,
    emptied: /* ev */ Event_ => Callback = null,
    ended: /* ev */ Event_ => Callback = null,
    error: /* ev */ ErrorEvent => Callback = null,
    focus: /* ev */ FocusEvent => Callback = null,
    focusin: /* ev */ FocusEvent => Callback = null,
    focusout: /* ev */ FocusEvent => Callback = null,
    fullscreenchange: /* ev */ Event_ => Callback = null,
    fullscreenerror: /* ev */ Event_ => Callback = null,
    gotpointercapture: /* ev */ PointerEvent => Callback = null,
    input: /* ev */ Event_ => Callback = null,
    invalid: /* ev */ Event_ => Callback = null,
    keydown: /* ev */ KeyboardEvent => Callback = null,
    keypress: /* ev */ KeyboardEvent => Callback = null,
    keyup: /* ev */ KeyboardEvent => Callback = null,
    load: /* ev */ Event_ => Callback = null,
    loadeddata: /* ev */ Event_ => Callback = null,
    loadedmetadata: /* ev */ Event_ => Callback = null,
    loadstart: /* ev */ Event_ => Callback = null,
    lostpointercapture: /* ev */ PointerEvent => Callback = null,
    mousedown: /* ev */ MouseEvent => Callback = null,
    mouseenter: /* ev */ MouseEvent => Callback = null,
    mouseleave: /* ev */ MouseEvent => Callback = null,
    mousemove: /* ev */ MouseEvent => Callback = null,
    mouseout: /* ev */ MouseEvent => Callback = null,
    mouseover: /* ev */ MouseEvent => Callback = null,
    mouseup: /* ev */ MouseEvent => Callback = null,
    paste: /* ev */ ClipboardEvent => Callback = null,
    pause: /* ev */ Event_ => Callback = null,
    play: /* ev */ Event_ => Callback = null,
    playing: /* ev */ Event_ => Callback = null,
    pointercancel: /* ev */ PointerEvent => Callback = null,
    pointerdown: /* ev */ PointerEvent => Callback = null,
    pointerenter: /* ev */ PointerEvent => Callback = null,
    pointerleave: /* ev */ PointerEvent => Callback = null,
    pointermove: /* ev */ PointerEvent => Callback = null,
    pointerout: /* ev */ PointerEvent => Callback = null,
    pointerover: /* ev */ PointerEvent => Callback = null,
    pointerup: /* ev */ PointerEvent => Callback = null,
    progress: /* ev */ ProgressEvent => Callback = null,
    ratechange: /* ev */ Event_ => Callback = null,
    reset: /* ev */ Event_ => Callback = null,
    resize: /* ev */ UIEvent => Callback = null,
    scroll: /* ev */ Event_ => Callback = null,
    securitypolicyviolation: /* ev */ SecurityPolicyViolationEvent => Callback = null,
    seeked: /* ev */ Event_ => Callback = null,
    seeking: /* ev */ Event_ => Callback = null,
    select: /* ev */ Event_ => Callback = null,
    selectionchange: /* ev */ Event_ => Callback = null,
    selectstart: /* ev */ Event_ => Callback = null,
    stalled: /* ev */ Event_ => Callback = null,
    submit: /* ev */ Event_ => Callback = null,
    suspend: /* ev */ Event_ => Callback = null,
    timeupdate: /* ev */ Event_ => Callback = null,
    toggle: /* ev */ Event_ => Callback = null,
    touchcancel: /* ev */ TouchEvent => Callback = null,
    touchend: /* ev */ TouchEvent => Callback = null,
    touchmove: /* ev */ TouchEvent => Callback = null,
    touchstart: /* ev */ TouchEvent => Callback = null,
    transitioncancel: /* ev */ TransitionEvent => Callback = null,
    transitionend: /* ev */ TransitionEvent => Callback = null,
    transitionrun: /* ev */ TransitionEvent => Callback = null,
    transitionstart: /* ev */ TransitionEvent => Callback = null,
    volumechange: /* ev */ Event_ => Callback = null,
    waiting: /* ev */ Event_ => Callback = null,
    wheel: /* ev */ WheelEvent => Callback = null
  ): On = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => abort(t0).runNow()))
    if (animationcancel != null) __obj.updateDynamic("animationcancel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.AnimationEvent) => animationcancel(t0).runNow()))
    if (animationend != null) __obj.updateDynamic("animationend")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.AnimationEvent) => animationend(t0).runNow()))
    if (animationiteration != null) __obj.updateDynamic("animationiteration")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.AnimationEvent) => animationiteration(t0).runNow()))
    if (animationstart != null) __obj.updateDynamic("animationstart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.AnimationEvent) => animationstart(t0).runNow()))
    if (auxclick != null) __obj.updateDynamic("auxclick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => auxclick(t0).runNow()))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => blur(t0).runNow()))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => cancel(t0).runNow()))
    if (canplay != null) __obj.updateDynamic("canplay")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => canplay(t0).runNow()))
    if (canplaythrough != null) __obj.updateDynamic("canplaythrough")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => canplaythrough(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => change(t0).runNow()))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => click(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => close(t0).runNow()))
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => contextmenu(t0).runNow()))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ClipboardEvent) => copy(t0).runNow()))
    if (cuechange != null) __obj.updateDynamic("cuechange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => cuechange(t0).runNow()))
    if (cut != null) __obj.updateDynamic("cut")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ClipboardEvent) => cut(t0).runNow()))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => dblclick(t0).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => drag(t0).runNow()))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => dragend(t0).runNow()))
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => dragenter(t0).runNow()))
    if (dragexit != null) __obj.updateDynamic("dragexit")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => dragexit(t0).runNow()))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => dragleave(t0).runNow()))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => dragover(t0).runNow()))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => dragstart(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => drop(t0).runNow()))
    if (durationchange != null) __obj.updateDynamic("durationchange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => durationchange(t0).runNow()))
    if (emptied != null) __obj.updateDynamic("emptied")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => emptied(t0).runNow()))
    if (ended != null) __obj.updateDynamic("ended")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => ended(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ErrorEvent) => error(t0).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => focus(t0).runNow()))
    if (focusin != null) __obj.updateDynamic("focusin")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => focusin(t0).runNow()))
    if (focusout != null) __obj.updateDynamic("focusout")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => focusout(t0).runNow()))
    if (fullscreenchange != null) __obj.updateDynamic("fullscreenchange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => fullscreenchange(t0).runNow()))
    if (fullscreenerror != null) __obj.updateDynamic("fullscreenerror")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => fullscreenerror(t0).runNow()))
    if (gotpointercapture != null) __obj.updateDynamic("gotpointercapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => gotpointercapture(t0).runNow()))
    if (input != null) __obj.updateDynamic("input")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => input(t0).runNow()))
    if (invalid != null) __obj.updateDynamic("invalid")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => invalid(t0).runNow()))
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => keydown(t0).runNow()))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => keypress(t0).runNow()))
    if (keyup != null) __obj.updateDynamic("keyup")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => keyup(t0).runNow()))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => load(t0).runNow()))
    if (loadeddata != null) __obj.updateDynamic("loadeddata")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => loadeddata(t0).runNow()))
    if (loadedmetadata != null) __obj.updateDynamic("loadedmetadata")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => loadedmetadata(t0).runNow()))
    if (loadstart != null) __obj.updateDynamic("loadstart")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => loadstart(t0).runNow()))
    if (lostpointercapture != null) __obj.updateDynamic("lostpointercapture")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => lostpointercapture(t0).runNow()))
    if (mousedown != null) __obj.updateDynamic("mousedown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mousedown(t0).runNow()))
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mouseenter(t0).runNow()))
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mouseleave(t0).runNow()))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mousemove(t0).runNow()))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mouseout(t0).runNow()))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mouseover(t0).runNow()))
    if (mouseup != null) __obj.updateDynamic("mouseup")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => mouseup(t0).runNow()))
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ClipboardEvent) => paste(t0).runNow()))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => pause(t0).runNow()))
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => play(t0).runNow()))
    if (playing != null) __obj.updateDynamic("playing")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => playing(t0).runNow()))
    if (pointercancel != null) __obj.updateDynamic("pointercancel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointercancel(t0).runNow()))
    if (pointerdown != null) __obj.updateDynamic("pointerdown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointerdown(t0).runNow()))
    if (pointerenter != null) __obj.updateDynamic("pointerenter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointerenter(t0).runNow()))
    if (pointerleave != null) __obj.updateDynamic("pointerleave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointerleave(t0).runNow()))
    if (pointermove != null) __obj.updateDynamic("pointermove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointermove(t0).runNow()))
    if (pointerout != null) __obj.updateDynamic("pointerout")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointerout(t0).runNow()))
    if (pointerover != null) __obj.updateDynamic("pointerover")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointerover(t0).runNow()))
    if (pointerup != null) __obj.updateDynamic("pointerup")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.PointerEvent) => pointerup(t0).runNow()))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.ProgressEvent) => progress(t0).runNow()))
    if (ratechange != null) __obj.updateDynamic("ratechange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => ratechange(t0).runNow()))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => reset(t0).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => resize(t0).runNow()))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => scroll(t0).runNow()))
    if (securitypolicyviolation != null) __obj.updateDynamic("securitypolicyviolation")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.SecurityPolicyViolationEvent) => securitypolicyviolation(t0).runNow()))
    if (seeked != null) __obj.updateDynamic("seeked")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => seeked(t0).runNow()))
    if (seeking != null) __obj.updateDynamic("seeking")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => seeking(t0).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => select(t0).runNow()))
    if (selectionchange != null) __obj.updateDynamic("selectionchange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => selectionchange(t0).runNow()))
    if (selectstart != null) __obj.updateDynamic("selectstart")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => selectstart(t0).runNow()))
    if (stalled != null) __obj.updateDynamic("stalled")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => stalled(t0).runNow()))
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => submit(t0).runNow()))
    if (suspend != null) __obj.updateDynamic("suspend")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => suspend(t0).runNow()))
    if (timeupdate != null) __obj.updateDynamic("timeupdate")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => timeupdate(t0).runNow()))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => toggle(t0).runNow()))
    if (touchcancel != null) __obj.updateDynamic("touchcancel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => touchcancel(t0).runNow()))
    if (touchend != null) __obj.updateDynamic("touchend")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => touchend(t0).runNow()))
    if (touchmove != null) __obj.updateDynamic("touchmove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => touchmove(t0).runNow()))
    if (touchstart != null) __obj.updateDynamic("touchstart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => touchstart(t0).runNow()))
    if (transitioncancel != null) __obj.updateDynamic("transitioncancel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TransitionEvent) => transitioncancel(t0).runNow()))
    if (transitionend != null) __obj.updateDynamic("transitionend")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TransitionEvent) => transitionend(t0).runNow()))
    if (transitionrun != null) __obj.updateDynamic("transitionrun")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TransitionEvent) => transitionrun(t0).runNow()))
    if (transitionstart != null) __obj.updateDynamic("transitionstart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TransitionEvent) => transitionstart(t0).runNow()))
    if (volumechange != null) __obj.updateDynamic("volumechange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => volumechange(t0).runNow()))
    if (waiting != null) __obj.updateDynamic("waiting")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => waiting(t0).runNow()))
    if (wheel != null) __obj.updateDynamic("wheel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.WheelEvent) => wheel(t0).runNow()))
    __obj.asInstanceOf[On]
  }
}

