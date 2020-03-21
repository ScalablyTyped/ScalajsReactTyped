package typingsJapgolly.antvG2.mod

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TransitionEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.antvG2.AnonLeft
import typingsJapgolly.antvG2.antvG2Strings.abort
import typingsJapgolly.antvG2.antvG2Strings.animationcancel
import typingsJapgolly.antvG2.antvG2Strings.animationend
import typingsJapgolly.antvG2.antvG2Strings.animationiteration
import typingsJapgolly.antvG2.antvG2Strings.animationstart
import typingsJapgolly.antvG2.antvG2Strings.auxclick
import typingsJapgolly.antvG2.antvG2Strings.blur
import typingsJapgolly.antvG2.antvG2Strings.cancel
import typingsJapgolly.antvG2.antvG2Strings.canplay
import typingsJapgolly.antvG2.antvG2Strings.canplaythrough
import typingsJapgolly.antvG2.antvG2Strings.change
import typingsJapgolly.antvG2.antvG2Strings.click
import typingsJapgolly.antvG2.antvG2Strings.close
import typingsJapgolly.antvG2.antvG2Strings.contextmenu
import typingsJapgolly.antvG2.antvG2Strings.copy
import typingsJapgolly.antvG2.antvG2Strings.cuechange
import typingsJapgolly.antvG2.antvG2Strings.cut
import typingsJapgolly.antvG2.antvG2Strings.dblclick
import typingsJapgolly.antvG2.antvG2Strings.drag
import typingsJapgolly.antvG2.antvG2Strings.dragend
import typingsJapgolly.antvG2.antvG2Strings.dragenter
import typingsJapgolly.antvG2.antvG2Strings.dragexit
import typingsJapgolly.antvG2.antvG2Strings.dragleave
import typingsJapgolly.antvG2.antvG2Strings.dragover
import typingsJapgolly.antvG2.antvG2Strings.dragstart
import typingsJapgolly.antvG2.antvG2Strings.drop
import typingsJapgolly.antvG2.antvG2Strings.durationchange
import typingsJapgolly.antvG2.antvG2Strings.emptied
import typingsJapgolly.antvG2.antvG2Strings.ended
import typingsJapgolly.antvG2.antvG2Strings.error
import typingsJapgolly.antvG2.antvG2Strings.focus
import typingsJapgolly.antvG2.antvG2Strings.focusin
import typingsJapgolly.antvG2.antvG2Strings.focusout
import typingsJapgolly.antvG2.antvG2Strings.fullscreenchange
import typingsJapgolly.antvG2.antvG2Strings.fullscreenerror
import typingsJapgolly.antvG2.antvG2Strings.gotpointercapture
import typingsJapgolly.antvG2.antvG2Strings.input
import typingsJapgolly.antvG2.antvG2Strings.invalid
import typingsJapgolly.antvG2.antvG2Strings.keydown
import typingsJapgolly.antvG2.antvG2Strings.keypress
import typingsJapgolly.antvG2.antvG2Strings.keyup
import typingsJapgolly.antvG2.antvG2Strings.load
import typingsJapgolly.antvG2.antvG2Strings.loadeddata
import typingsJapgolly.antvG2.antvG2Strings.loadedmetadata
import typingsJapgolly.antvG2.antvG2Strings.loadstart
import typingsJapgolly.antvG2.antvG2Strings.lostpointercapture
import typingsJapgolly.antvG2.antvG2Strings.mousedown
import typingsJapgolly.antvG2.antvG2Strings.mouseenter
import typingsJapgolly.antvG2.antvG2Strings.mouseleave
import typingsJapgolly.antvG2.antvG2Strings.mousemove
import typingsJapgolly.antvG2.antvG2Strings.mouseout
import typingsJapgolly.antvG2.antvG2Strings.mouseover
import typingsJapgolly.antvG2.antvG2Strings.mouseup
import typingsJapgolly.antvG2.antvG2Strings.paste
import typingsJapgolly.antvG2.antvG2Strings.pause
import typingsJapgolly.antvG2.antvG2Strings.play
import typingsJapgolly.antvG2.antvG2Strings.playing
import typingsJapgolly.antvG2.antvG2Strings.pointercancel
import typingsJapgolly.antvG2.antvG2Strings.pointerdown
import typingsJapgolly.antvG2.antvG2Strings.pointerenter
import typingsJapgolly.antvG2.antvG2Strings.pointerleave
import typingsJapgolly.antvG2.antvG2Strings.pointermove
import typingsJapgolly.antvG2.antvG2Strings.pointerout
import typingsJapgolly.antvG2.antvG2Strings.pointerover
import typingsJapgolly.antvG2.antvG2Strings.pointerup
import typingsJapgolly.antvG2.antvG2Strings.progress
import typingsJapgolly.antvG2.antvG2Strings.ratechange
import typingsJapgolly.antvG2.antvG2Strings.reset
import typingsJapgolly.antvG2.antvG2Strings.resize
import typingsJapgolly.antvG2.antvG2Strings.scroll
import typingsJapgolly.antvG2.antvG2Strings.securitypolicyviolation
import typingsJapgolly.antvG2.antvG2Strings.seeked
import typingsJapgolly.antvG2.antvG2Strings.seeking
import typingsJapgolly.antvG2.antvG2Strings.select
import typingsJapgolly.antvG2.antvG2Strings.selectionchange
import typingsJapgolly.antvG2.antvG2Strings.selectstart
import typingsJapgolly.antvG2.antvG2Strings.stalled
import typingsJapgolly.antvG2.antvG2Strings.submit
import typingsJapgolly.antvG2.antvG2Strings.suspend
import typingsJapgolly.antvG2.antvG2Strings.timeupdate
import typingsJapgolly.antvG2.antvG2Strings.toggle
import typingsJapgolly.antvG2.antvG2Strings.touchcancel
import typingsJapgolly.antvG2.antvG2Strings.touchend
import typingsJapgolly.antvG2.antvG2Strings.touchmove
import typingsJapgolly.antvG2.antvG2Strings.touchstart
import typingsJapgolly.antvG2.antvG2Strings.transitioncancel
import typingsJapgolly.antvG2.antvG2Strings.transitionend
import typingsJapgolly.antvG2.antvG2Strings.transitionrun
import typingsJapgolly.antvG2.antvG2Strings.transitionstart
import typingsJapgolly.antvG2.antvG2Strings.volumechange
import typingsJapgolly.antvG2.antvG2Strings.waiting
import typingsJapgolly.antvG2.antvG2Strings.wheel
import typingsJapgolly.std.Event_
import typingsJapgolly.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/g2", "DomUtil")
@js.native
class DomUtil () extends js.Object {
  def addEventListener(target: HTMLElement, eventType: String, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    target: HTMLElement,
    eventType: abort,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    target: HTMLElement,
    eventType: animationcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    target: HTMLElement,
    eventType: animationend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    target: HTMLElement,
    eventType: animationiteration,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    target: HTMLElement,
    eventType: animationstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    target: HTMLElement,
    eventType: auxclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    target: HTMLElement,
    eventType: blur,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    target: HTMLElement,
    eventType: cancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    target: HTMLElement,
    eventType: canplay,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    target: HTMLElement,
    eventType: canplaythrough,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    target: HTMLElement,
    eventType: change,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    target: HTMLElement,
    eventType: click,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    target: HTMLElement,
    eventType: close,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    target: HTMLElement,
    eventType: contextmenu,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    target: HTMLElement,
    eventType: copy,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    target: HTMLElement,
    eventType: cuechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    target: HTMLElement,
    eventType: cut,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    target: HTMLElement,
    eventType: dblclick,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    target: HTMLElement,
    eventType: drag,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    target: HTMLElement,
    eventType: dragend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    target: HTMLElement,
    eventType: dragenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    target: HTMLElement,
    eventType: dragexit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    target: HTMLElement,
    eventType: dragleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    target: HTMLElement,
    eventType: dragover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    target: HTMLElement,
    eventType: dragstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    target: HTMLElement,
    eventType: drop,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    target: HTMLElement,
    eventType: durationchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    target: HTMLElement,
    eventType: emptied,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    target: HTMLElement,
    eventType: ended,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    target: HTMLElement,
    eventType: error,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    target: HTMLElement,
    eventType: focus,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusin(
    target: HTMLElement,
    eventType: focusin,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusout(
    target: HTMLElement,
    eventType: focusout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    target: HTMLElement,
    eventType: fullscreenchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    target: HTMLElement,
    eventType: fullscreenerror,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    target: HTMLElement,
    eventType: gotpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    target: HTMLElement,
    eventType: input,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    target: HTMLElement,
    eventType: invalid,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    target: HTMLElement,
    eventType: keydown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    target: HTMLElement,
    eventType: keypress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    target: HTMLElement,
    eventType: keyup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    target: HTMLElement,
    eventType: load,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    target: HTMLElement,
    eventType: loadeddata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    target: HTMLElement,
    eventType: loadedmetadata,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    target: HTMLElement,
    eventType: loadstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    target: HTMLElement,
    eventType: lostpointercapture,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    target: HTMLElement,
    eventType: mousedown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    target: HTMLElement,
    eventType: mouseenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    target: HTMLElement,
    eventType: mouseleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    target: HTMLElement,
    eventType: mousemove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    target: HTMLElement,
    eventType: mouseout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    target: HTMLElement,
    eventType: mouseover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    target: HTMLElement,
    eventType: mouseup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    target: HTMLElement,
    eventType: paste,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    target: HTMLElement,
    eventType: pause,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    target: HTMLElement,
    eventType: play,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    target: HTMLElement,
    eventType: playing,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    target: HTMLElement,
    eventType: pointercancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    target: HTMLElement,
    eventType: pointerdown,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    target: HTMLElement,
    eventType: pointerenter,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    target: HTMLElement,
    eventType: pointerleave,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    target: HTMLElement,
    eventType: pointermove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    target: HTMLElement,
    eventType: pointerout,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    target: HTMLElement,
    eventType: pointerover,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    target: HTMLElement,
    eventType: pointerup,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    target: HTMLElement,
    eventType: progress,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    target: HTMLElement,
    eventType: ratechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    target: HTMLElement,
    eventType: reset,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    target: HTMLElement,
    eventType: resize,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    target: HTMLElement,
    eventType: scroll,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    target: HTMLElement,
    eventType: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    target: HTMLElement,
    eventType: seeked,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    target: HTMLElement,
    eventType: seeking,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    target: HTMLElement,
    eventType: select,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    target: HTMLElement,
    eventType: selectionchange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    target: HTMLElement,
    eventType: selectstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    target: HTMLElement,
    eventType: stalled,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    target: HTMLElement,
    eventType: submit,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    target: HTMLElement,
    eventType: suspend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    target: HTMLElement,
    eventType: timeupdate,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    target: HTMLElement,
    eventType: toggle,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    target: HTMLElement,
    eventType: touchcancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    target: HTMLElement,
    eventType: touchend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    target: HTMLElement,
    eventType: touchmove,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    target: HTMLElement,
    eventType: touchstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    target: HTMLElement,
    eventType: transitioncancel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    target: HTMLElement,
    eventType: transitionend,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    target: HTMLElement,
    eventType: transitionrun,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    target: HTMLElement,
    eventType: transitionstart,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    target: HTMLElement,
    eventType: volumechange,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    target: HTMLElement,
    eventType: waiting,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    target: HTMLElement,
    eventType: wheel,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  def createDom(str: String): HTMLElement = js.native
  def getBoundingClientRect(node: Element): AnonLeft = js.native
  def getHeight(el: HTMLElement): Double = js.native
  def getOuterHeight(el: HTMLElement): Double = js.native
  def getOuterWidth(el: HTMLElement): Double = js.native
  def getRatio(): Double = js.native
  def getStyle(dom: HTMLElement, name: String): js.Any = js.native
  def getWidth(el: HTMLElement): Double = js.native
  def modifyCSS(dom: HTMLElement, css: js.Any): HTMLElement = js.native
  def requestAnimationFrame(fn: js.Function0[Unit]): Unit = js.native
}

