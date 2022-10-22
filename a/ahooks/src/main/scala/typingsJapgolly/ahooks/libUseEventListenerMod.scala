package typingsJapgolly.ahooks

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.BeforeUnloadEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DeviceMotionEvent
import org.scalajs.dom.DeviceOrientationEvent
import org.scalajs.dom.Document
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.GamepadEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HashChangeEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.PopStateEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.StorageEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import org.scalajs.dom.Window
import typingsJapgolly.ahooks.ahooksStrings.DOMContentLoaded
import typingsJapgolly.ahooks.ahooksStrings.abort
import typingsJapgolly.ahooks.ahooksStrings.afterprint
import typingsJapgolly.ahooks.ahooksStrings.animationcancel
import typingsJapgolly.ahooks.ahooksStrings.animationend
import typingsJapgolly.ahooks.ahooksStrings.animationiteration
import typingsJapgolly.ahooks.ahooksStrings.animationstart
import typingsJapgolly.ahooks.ahooksStrings.auxclick
import typingsJapgolly.ahooks.ahooksStrings.beforeinput
import typingsJapgolly.ahooks.ahooksStrings.beforeprint
import typingsJapgolly.ahooks.ahooksStrings.beforeunload
import typingsJapgolly.ahooks.ahooksStrings.blur
import typingsJapgolly.ahooks.ahooksStrings.canplay
import typingsJapgolly.ahooks.ahooksStrings.canplaythrough
import typingsJapgolly.ahooks.ahooksStrings.change
import typingsJapgolly.ahooks.ahooksStrings.click
import typingsJapgolly.ahooks.ahooksStrings.close
import typingsJapgolly.ahooks.ahooksStrings.compositionend
import typingsJapgolly.ahooks.ahooksStrings.compositionstart
import typingsJapgolly.ahooks.ahooksStrings.compositionupdate
import typingsJapgolly.ahooks.ahooksStrings.contextmenu
import typingsJapgolly.ahooks.ahooksStrings.copy
import typingsJapgolly.ahooks.ahooksStrings.cuechange
import typingsJapgolly.ahooks.ahooksStrings.cut
import typingsJapgolly.ahooks.ahooksStrings.dblclick
import typingsJapgolly.ahooks.ahooksStrings.devicemotion
import typingsJapgolly.ahooks.ahooksStrings.deviceorientation
import typingsJapgolly.ahooks.ahooksStrings.drag
import typingsJapgolly.ahooks.ahooksStrings.dragend
import typingsJapgolly.ahooks.ahooksStrings.dragenter
import typingsJapgolly.ahooks.ahooksStrings.dragleave
import typingsJapgolly.ahooks.ahooksStrings.dragover
import typingsJapgolly.ahooks.ahooksStrings.dragstart
import typingsJapgolly.ahooks.ahooksStrings.drop
import typingsJapgolly.ahooks.ahooksStrings.durationchange
import typingsJapgolly.ahooks.ahooksStrings.emptied
import typingsJapgolly.ahooks.ahooksStrings.ended
import typingsJapgolly.ahooks.ahooksStrings.error
import typingsJapgolly.ahooks.ahooksStrings.focus
import typingsJapgolly.ahooks.ahooksStrings.focusin
import typingsJapgolly.ahooks.ahooksStrings.focusout
import typingsJapgolly.ahooks.ahooksStrings.formdata
import typingsJapgolly.ahooks.ahooksStrings.fullscreenchange
import typingsJapgolly.ahooks.ahooksStrings.fullscreenerror
import typingsJapgolly.ahooks.ahooksStrings.gamepadconnected
import typingsJapgolly.ahooks.ahooksStrings.gamepaddisconnected
import typingsJapgolly.ahooks.ahooksStrings.gotpointercapture
import typingsJapgolly.ahooks.ahooksStrings.hashchange
import typingsJapgolly.ahooks.ahooksStrings.input
import typingsJapgolly.ahooks.ahooksStrings.invalid
import typingsJapgolly.ahooks.ahooksStrings.keydown
import typingsJapgolly.ahooks.ahooksStrings.keypress
import typingsJapgolly.ahooks.ahooksStrings.keyup
import typingsJapgolly.ahooks.ahooksStrings.languagechange
import typingsJapgolly.ahooks.ahooksStrings.load
import typingsJapgolly.ahooks.ahooksStrings.loadeddata
import typingsJapgolly.ahooks.ahooksStrings.loadedmetadata
import typingsJapgolly.ahooks.ahooksStrings.loadstart
import typingsJapgolly.ahooks.ahooksStrings.lostpointercapture
import typingsJapgolly.ahooks.ahooksStrings.message
import typingsJapgolly.ahooks.ahooksStrings.messageerror
import typingsJapgolly.ahooks.ahooksStrings.mousedown
import typingsJapgolly.ahooks.ahooksStrings.mouseenter
import typingsJapgolly.ahooks.ahooksStrings.mouseleave
import typingsJapgolly.ahooks.ahooksStrings.mousemove
import typingsJapgolly.ahooks.ahooksStrings.mouseout
import typingsJapgolly.ahooks.ahooksStrings.mouseover
import typingsJapgolly.ahooks.ahooksStrings.mouseup
import typingsJapgolly.ahooks.ahooksStrings.offline
import typingsJapgolly.ahooks.ahooksStrings.online
import typingsJapgolly.ahooks.ahooksStrings.orientationchange
import typingsJapgolly.ahooks.ahooksStrings.pagehide
import typingsJapgolly.ahooks.ahooksStrings.pageshow
import typingsJapgolly.ahooks.ahooksStrings.paste
import typingsJapgolly.ahooks.ahooksStrings.pause
import typingsJapgolly.ahooks.ahooksStrings.play
import typingsJapgolly.ahooks.ahooksStrings.playing
import typingsJapgolly.ahooks.ahooksStrings.pointercancel
import typingsJapgolly.ahooks.ahooksStrings.pointerdown
import typingsJapgolly.ahooks.ahooksStrings.pointerenter
import typingsJapgolly.ahooks.ahooksStrings.pointerleave
import typingsJapgolly.ahooks.ahooksStrings.pointerlockchange
import typingsJapgolly.ahooks.ahooksStrings.pointerlockerror
import typingsJapgolly.ahooks.ahooksStrings.pointermove
import typingsJapgolly.ahooks.ahooksStrings.pointerout
import typingsJapgolly.ahooks.ahooksStrings.pointerover
import typingsJapgolly.ahooks.ahooksStrings.pointerup
import typingsJapgolly.ahooks.ahooksStrings.popstate
import typingsJapgolly.ahooks.ahooksStrings.progress
import typingsJapgolly.ahooks.ahooksStrings.ratechange
import typingsJapgolly.ahooks.ahooksStrings.readystatechange
import typingsJapgolly.ahooks.ahooksStrings.rejectionhandled
import typingsJapgolly.ahooks.ahooksStrings.reset
import typingsJapgolly.ahooks.ahooksStrings.resize
import typingsJapgolly.ahooks.ahooksStrings.scroll
import typingsJapgolly.ahooks.ahooksStrings.securitypolicyviolation
import typingsJapgolly.ahooks.ahooksStrings.seeked
import typingsJapgolly.ahooks.ahooksStrings.seeking
import typingsJapgolly.ahooks.ahooksStrings.select
import typingsJapgolly.ahooks.ahooksStrings.selectionchange
import typingsJapgolly.ahooks.ahooksStrings.selectstart
import typingsJapgolly.ahooks.ahooksStrings.slotchange
import typingsJapgolly.ahooks.ahooksStrings.stalled
import typingsJapgolly.ahooks.ahooksStrings.storage
import typingsJapgolly.ahooks.ahooksStrings.submit
import typingsJapgolly.ahooks.ahooksStrings.suspend
import typingsJapgolly.ahooks.ahooksStrings.timeupdate
import typingsJapgolly.ahooks.ahooksStrings.toggle
import typingsJapgolly.ahooks.ahooksStrings.touchcancel
import typingsJapgolly.ahooks.ahooksStrings.touchend
import typingsJapgolly.ahooks.ahooksStrings.touchmove
import typingsJapgolly.ahooks.ahooksStrings.touchstart
import typingsJapgolly.ahooks.ahooksStrings.transitioncancel
import typingsJapgolly.ahooks.ahooksStrings.transitionend
import typingsJapgolly.ahooks.ahooksStrings.transitionrun
import typingsJapgolly.ahooks.ahooksStrings.transitionstart
import typingsJapgolly.ahooks.ahooksStrings.unhandledrejection
import typingsJapgolly.ahooks.ahooksStrings.unload
import typingsJapgolly.ahooks.ahooksStrings.visibilitychange
import typingsJapgolly.ahooks.ahooksStrings.volumechange
import typingsJapgolly.ahooks.ahooksStrings.waiting
import typingsJapgolly.ahooks.ahooksStrings.webkitanimationend
import typingsJapgolly.ahooks.ahooksStrings.webkitanimationiteration
import typingsJapgolly.ahooks.ahooksStrings.webkitanimationstart
import typingsJapgolly.ahooks.ahooksStrings.webkittransitionend
import typingsJapgolly.ahooks.ahooksStrings.wheel
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.PageTransitionEvent
import typingsJapgolly.std.PromiseRejectionEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseEventListenerMod {
  
  @JSImport("ahooks/lib/useEventListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(eventName: String, handler: noop, options: Options[Target]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_DOMContentLoaded(eventName: DOMContentLoaded, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(
    eventName: DOMContentLoaded,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_abort(eventName: abort, handler: js.Function1[/* ev */ UIEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(
    eventName: abort,
    handler: js.Function1[/* ev */ UIEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_afterprint(eventName: afterprint, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_afterprint(eventName: afterprint, handler: js.Function1[/* ev */ Event, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationcancel(eventName: animationcancel, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    eventName: animationcancel,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationend(eventName: animationend, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(
    eventName: animationend,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationiteration(eventName: animationiteration, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    eventName: animationiteration,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationstart(eventName: animationstart, handler: js.Function1[/* ev */ AnimationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    eventName: animationstart,
    handler: js.Function1[/* ev */ AnimationEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_auxclick(eventName: auxclick, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(
    eventName: auxclick,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeinput(eventName: beforeinput, handler: js.Function1[/* ev */ InputEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(
    eventName: beforeinput,
    handler: js.Function1[/* ev */ InputEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeprint(eventName: beforeprint, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeprint(eventName: beforeprint, handler: js.Function1[/* ev */ Event, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeunload(eventName: beforeunload, handler: js.Function1[/* ev */ BeforeUnloadEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeunload(
    eventName: beforeunload,
    handler: js.Function1[/* ev */ BeforeUnloadEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_blur(eventName: blur, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(
    eventName: blur,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplay(eventName: canplay, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(
    eventName: canplay,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplaythrough(eventName: canplaythrough, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    eventName: canplaythrough,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_change(eventName: change, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(
    eventName: change,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_click(eventName: click, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(
    eventName: click,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_close(eventName: close, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(
    eventName: close,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionend(eventName: compositionend, handler: js.Function1[/* ev */ CompositionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    eventName: compositionend,
    handler: js.Function1[/* ev */ CompositionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionstart(eventName: compositionstart, handler: js.Function1[/* ev */ CompositionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    eventName: compositionstart,
    handler: js.Function1[/* ev */ CompositionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionupdate(eventName: compositionupdate, handler: js.Function1[/* ev */ CompositionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    eventName: compositionupdate,
    handler: js.Function1[/* ev */ CompositionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_contextmenu(eventName: contextmenu, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(
    eventName: contextmenu,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_copy(eventName: copy, handler: js.Function1[/* ev */ ClipboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(
    eventName: copy,
    handler: js.Function1[/* ev */ ClipboardEvent, Unit],
    options: Options[Document | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cuechange(eventName: cuechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(
    eventName: cuechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cut(eventName: cut, handler: js.Function1[/* ev */ ClipboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(
    eventName: cut,
    handler: js.Function1[/* ev */ ClipboardEvent, Unit],
    options: Options[Document | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dblclick(eventName: dblclick, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(
    eventName: dblclick,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_devicemotion(eventName: devicemotion, handler: js.Function1[/* ev */ DeviceMotionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_devicemotion(
    eventName: devicemotion,
    handler: js.Function1[/* ev */ DeviceMotionEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_deviceorientation(eventName: deviceorientation, handler: js.Function1[/* ev */ DeviceOrientationEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_deviceorientation(
    eventName: deviceorientation,
    handler: js.Function1[/* ev */ DeviceOrientationEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drag(eventName: drag, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(
    eventName: drag,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragend(eventName: dragend, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(
    eventName: dragend,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragenter(eventName: dragenter, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(
    eventName: dragenter,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragleave(eventName: dragleave, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(
    eventName: dragleave,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragover(eventName: dragover, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(
    eventName: dragover,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragstart(eventName: dragstart, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(
    eventName: dragstart,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drop(eventName: drop, handler: js.Function1[/* ev */ DragEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(
    eventName: drop,
    handler: js.Function1[/* ev */ DragEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_durationchange(eventName: durationchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    eventName: durationchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_emptied(eventName: emptied, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(
    eventName: emptied,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ended(eventName: ended, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(
    eventName: ended,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_error(eventName: error, handler: js.Function1[/* ev */ ErrorEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(
    eventName: error,
    handler: js.Function1[/* ev */ ErrorEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focus(eventName: focus, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(
    eventName: focus,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusin(eventName: focusin, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(
    eventName: focusin,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusout(eventName: focusout, handler: js.Function1[/* ev */ FocusEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(
    eventName: focusout,
    handler: js.Function1[/* ev */ FocusEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_formdata(eventName: formdata, handler: js.Function1[/* ev */ FormDataEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(
    eventName: formdata,
    handler: js.Function1[/* ev */ FormDataEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenchange(eventName: fullscreenchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    eventName: fullscreenchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | Element | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenerror(eventName: fullscreenerror, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    eventName: fullscreenerror,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | Element | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gamepadconnected(eventName: gamepadconnected, handler: js.Function1[/* ev */ GamepadEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepadconnected(
    eventName: gamepadconnected,
    handler: js.Function1[/* ev */ GamepadEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gamepaddisconnected(eventName: gamepaddisconnected, handler: js.Function1[/* ev */ GamepadEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gamepaddisconnected(
    eventName: gamepaddisconnected,
    handler: js.Function1[/* ev */ GamepadEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gotpointercapture(eventName: gotpointercapture, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    eventName: gotpointercapture,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_hashchange(eventName: hashchange, handler: js.Function1[/* ev */ HashChangeEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_hashchange(
    eventName: hashchange,
    handler: js.Function1[/* ev */ HashChangeEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_input(eventName: input, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(
    eventName: input,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_invalid(eventName: invalid, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(
    eventName: invalid,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keydown(eventName: keydown, handler: js.Function1[/* ev */ KeyboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(
    eventName: keydown,
    handler: js.Function1[/* ev */ KeyboardEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keypress(eventName: keypress, handler: js.Function1[/* ev */ KeyboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(
    eventName: keypress,
    handler: js.Function1[/* ev */ KeyboardEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keyup(eventName: keyup, handler: js.Function1[/* ev */ KeyboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(
    eventName: keyup,
    handler: js.Function1[/* ev */ KeyboardEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_languagechange(eventName: languagechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_languagechange(eventName: languagechange, handler: js.Function1[/* ev */ Event, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_load(eventName: load, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(
    eventName: load,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadeddata(eventName: loadeddata, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(
    eventName: loadeddata,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadedmetadata(eventName: loadedmetadata, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    eventName: loadedmetadata,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadstart(eventName: loadstart, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(
    eventName: loadstart,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_lostpointercapture(eventName: lostpointercapture, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    eventName: lostpointercapture,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_message(eventName: message, handler: js.Function1[/* ev */ MessageEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_message(eventName: message, handler: js.Function1[/* ev */ MessageEvent, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_messageerror(eventName: messageerror, handler: js.Function1[/* ev */ MessageEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_messageerror(
    eventName: messageerror,
    handler: js.Function1[/* ev */ MessageEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousedown(eventName: mousedown, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(
    eventName: mousedown,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseenter(eventName: mouseenter, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(
    eventName: mouseenter,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseleave(eventName: mouseleave, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(
    eventName: mouseleave,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousemove(eventName: mousemove, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(
    eventName: mousemove,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseout(eventName: mouseout, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(
    eventName: mouseout,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseover(eventName: mouseover, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(
    eventName: mouseover,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseup(eventName: mouseup, handler: js.Function1[/* ev */ MouseEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(
    eventName: mouseup,
    handler: js.Function1[/* ev */ MouseEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_offline(eventName: offline, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_offline(eventName: offline, handler: js.Function1[/* ev */ Event, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_online(eventName: online, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_online(eventName: online, handler: js.Function1[/* ev */ Event, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_orientationchange(eventName: orientationchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_orientationchange(
    eventName: orientationchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pagehide(eventName: pagehide, handler: js.Function1[/* ev */ PageTransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pagehide(
    eventName: pagehide,
    handler: js.Function1[/* ev */ PageTransitionEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pageshow(eventName: pageshow, handler: js.Function1[/* ev */ PageTransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pageshow(
    eventName: pageshow,
    handler: js.Function1[/* ev */ PageTransitionEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_paste(eventName: paste, handler: js.Function1[/* ev */ ClipboardEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(
    eventName: paste,
    handler: js.Function1[/* ev */ ClipboardEvent, Unit],
    options: Options[Document | HTMLElement]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pause(eventName: pause, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(
    eventName: pause,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_play(eventName: play, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(
    eventName: play,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_playing(eventName: playing, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(
    eventName: playing,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointercancel(eventName: pointercancel, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    eventName: pointercancel,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerdown(eventName: pointerdown, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(
    eventName: pointerdown,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerenter(eventName: pointerenter, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(
    eventName: pointerenter,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerleave(eventName: pointerleave, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(
    eventName: pointerleave,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockchange(eventName: pointerlockchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange(
    eventName: pointerlockchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockerror(eventName: pointerlockerror, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror(
    eventName: pointerlockerror,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointermove(eventName: pointermove, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(
    eventName: pointermove,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerout(eventName: pointerout, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(
    eventName: pointerout,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerover(eventName: pointerover, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(
    eventName: pointerover,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerup(eventName: pointerup, handler: js.Function1[/* ev */ PointerEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(
    eventName: pointerup,
    handler: js.Function1[/* ev */ PointerEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_popstate(eventName: popstate, handler: js.Function1[/* ev */ PopStateEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_popstate(eventName: popstate, handler: js.Function1[/* ev */ PopStateEvent, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_progress(eventName: progress, handler: js.Function1[/* ev */ ProgressEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(
    eventName: progress,
    handler: js.Function1[/* ev */ ProgressEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ratechange(eventName: ratechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(
    eventName: ratechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_readystatechange(eventName: readystatechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange(
    eventName: readystatechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_rejectionhandled(eventName: rejectionhandled, handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_rejectionhandled(
    eventName: rejectionhandled,
    handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_reset(eventName: reset, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(
    eventName: reset,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_resize(eventName: resize, handler: js.Function1[/* ev */ UIEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(
    eventName: resize,
    handler: js.Function1[/* ev */ UIEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_scroll(eventName: scroll, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(
    eventName: scroll,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    eventName: securitypolicyviolation,
    handler: js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeked(eventName: seeked, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(
    eventName: seeked,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeking(eventName: seeking, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(
    eventName: seeking,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_select(eventName: select, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(
    eventName: select,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectionchange(eventName: selectionchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    eventName: selectionchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectstart(eventName: selectstart, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(
    eventName: selectstart,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_slotchange(eventName: slotchange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(
    eventName: slotchange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_stalled(eventName: stalled, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(
    eventName: stalled,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_storage(eventName: storage, handler: js.Function1[/* ev */ StorageEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_storage(eventName: storage, handler: js.Function1[/* ev */ StorageEvent, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_submit(eventName: submit, handler: js.Function1[/* ev */ SubmitEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(
    eventName: submit,
    handler: js.Function1[/* ev */ SubmitEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_suspend(eventName: suspend, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(
    eventName: suspend,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_timeupdate(eventName: timeupdate, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(
    eventName: timeupdate,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_toggle(eventName: toggle, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(
    eventName: toggle,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchcancel(eventName: touchcancel, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(
    eventName: touchcancel,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchend(eventName: touchend, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(
    eventName: touchend,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchmove(eventName: touchmove, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(
    eventName: touchmove,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchstart(eventName: touchstart, handler: js.Function1[/* ev */ TouchEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(
    eventName: touchstart,
    handler: js.Function1[/* ev */ TouchEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitioncancel(eventName: transitioncancel, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    eventName: transitioncancel,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionend(eventName: transitionend, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    eventName: transitionend,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionrun(eventName: transitionrun, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    eventName: transitionrun,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionstart(eventName: transitionstart, handler: js.Function1[/* ev */ TransitionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    eventName: transitionstart,
    handler: js.Function1[/* ev */ TransitionEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_unhandledrejection(eventName: unhandledrejection, handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unhandledrejection(
    eventName: unhandledrejection,
    handler: js.Function1[/* ev */ PromiseRejectionEvent, Unit],
    options: Options[Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_unload(eventName: unload, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_unload(eventName: unload, handler: js.Function1[/* ev */ Event, Unit], options: Options[Window]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_visibilitychange(eventName: visibilitychange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange(
    eventName: visibilitychange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_volumechange(eventName: volumechange, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(
    eventName: volumechange,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_waiting(eventName: waiting, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(
    eventName: waiting,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationend(eventName: webkitanimationend, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    eventName: webkitanimationend,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationiteration(eventName: webkitanimationiteration, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    eventName: webkitanimationiteration,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationstart(eventName: webkitanimationstart, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    eventName: webkitanimationstart,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkittransitionend(eventName: webkittransitionend, handler: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    eventName: webkittransitionend,
    handler: js.Function1[/* ev */ Event, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_wheel(eventName: wheel, handler: js.Function1[/* ev */ WheelEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(
    eventName: wheel,
    handler: js.Function1[/* ev */ WheelEvent, Unit],
    options: Options[Document | HTMLElement | Window]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options[T /* <: Target */] extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[T] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: Target */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T /* <: Target */](x: Self & Options[T]) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type Target = BasicTarget[HTMLElement | Element | Window | Document]
  
  type noop = js.Function1[/* p */ Any, Unit]
}
