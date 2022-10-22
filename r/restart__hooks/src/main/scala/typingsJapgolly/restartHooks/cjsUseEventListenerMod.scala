package typingsJapgolly.restartHooks

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.restartHooks.restartHooksStrings.DOMContentLoaded
import typingsJapgolly.restartHooks.restartHooksStrings.abort
import typingsJapgolly.restartHooks.restartHooksStrings.animationcancel
import typingsJapgolly.restartHooks.restartHooksStrings.animationend
import typingsJapgolly.restartHooks.restartHooksStrings.animationiteration
import typingsJapgolly.restartHooks.restartHooksStrings.animationstart
import typingsJapgolly.restartHooks.restartHooksStrings.auxclick
import typingsJapgolly.restartHooks.restartHooksStrings.beforeinput
import typingsJapgolly.restartHooks.restartHooksStrings.blur
import typingsJapgolly.restartHooks.restartHooksStrings.canplay
import typingsJapgolly.restartHooks.restartHooksStrings.canplaythrough
import typingsJapgolly.restartHooks.restartHooksStrings.change
import typingsJapgolly.restartHooks.restartHooksStrings.click
import typingsJapgolly.restartHooks.restartHooksStrings.close
import typingsJapgolly.restartHooks.restartHooksStrings.compositionend
import typingsJapgolly.restartHooks.restartHooksStrings.compositionstart
import typingsJapgolly.restartHooks.restartHooksStrings.compositionupdate
import typingsJapgolly.restartHooks.restartHooksStrings.contextmenu
import typingsJapgolly.restartHooks.restartHooksStrings.copy
import typingsJapgolly.restartHooks.restartHooksStrings.cuechange
import typingsJapgolly.restartHooks.restartHooksStrings.cut
import typingsJapgolly.restartHooks.restartHooksStrings.dblclick
import typingsJapgolly.restartHooks.restartHooksStrings.drag
import typingsJapgolly.restartHooks.restartHooksStrings.dragend
import typingsJapgolly.restartHooks.restartHooksStrings.dragenter
import typingsJapgolly.restartHooks.restartHooksStrings.dragleave
import typingsJapgolly.restartHooks.restartHooksStrings.dragover
import typingsJapgolly.restartHooks.restartHooksStrings.dragstart
import typingsJapgolly.restartHooks.restartHooksStrings.drop
import typingsJapgolly.restartHooks.restartHooksStrings.durationchange
import typingsJapgolly.restartHooks.restartHooksStrings.emptied
import typingsJapgolly.restartHooks.restartHooksStrings.ended
import typingsJapgolly.restartHooks.restartHooksStrings.error
import typingsJapgolly.restartHooks.restartHooksStrings.focus
import typingsJapgolly.restartHooks.restartHooksStrings.focusin
import typingsJapgolly.restartHooks.restartHooksStrings.focusout
import typingsJapgolly.restartHooks.restartHooksStrings.formdata
import typingsJapgolly.restartHooks.restartHooksStrings.fullscreenchange
import typingsJapgolly.restartHooks.restartHooksStrings.fullscreenerror
import typingsJapgolly.restartHooks.restartHooksStrings.gotpointercapture
import typingsJapgolly.restartHooks.restartHooksStrings.input
import typingsJapgolly.restartHooks.restartHooksStrings.invalid
import typingsJapgolly.restartHooks.restartHooksStrings.keydown
import typingsJapgolly.restartHooks.restartHooksStrings.keypress
import typingsJapgolly.restartHooks.restartHooksStrings.keyup
import typingsJapgolly.restartHooks.restartHooksStrings.load
import typingsJapgolly.restartHooks.restartHooksStrings.loadeddata
import typingsJapgolly.restartHooks.restartHooksStrings.loadedmetadata
import typingsJapgolly.restartHooks.restartHooksStrings.loadstart
import typingsJapgolly.restartHooks.restartHooksStrings.lostpointercapture
import typingsJapgolly.restartHooks.restartHooksStrings.mousedown
import typingsJapgolly.restartHooks.restartHooksStrings.mouseenter
import typingsJapgolly.restartHooks.restartHooksStrings.mouseleave
import typingsJapgolly.restartHooks.restartHooksStrings.mousemove
import typingsJapgolly.restartHooks.restartHooksStrings.mouseout
import typingsJapgolly.restartHooks.restartHooksStrings.mouseover
import typingsJapgolly.restartHooks.restartHooksStrings.mouseup
import typingsJapgolly.restartHooks.restartHooksStrings.paste
import typingsJapgolly.restartHooks.restartHooksStrings.pause
import typingsJapgolly.restartHooks.restartHooksStrings.play
import typingsJapgolly.restartHooks.restartHooksStrings.playing
import typingsJapgolly.restartHooks.restartHooksStrings.pointercancel
import typingsJapgolly.restartHooks.restartHooksStrings.pointerdown
import typingsJapgolly.restartHooks.restartHooksStrings.pointerenter
import typingsJapgolly.restartHooks.restartHooksStrings.pointerleave
import typingsJapgolly.restartHooks.restartHooksStrings.pointerlockchange
import typingsJapgolly.restartHooks.restartHooksStrings.pointerlockerror
import typingsJapgolly.restartHooks.restartHooksStrings.pointermove
import typingsJapgolly.restartHooks.restartHooksStrings.pointerout
import typingsJapgolly.restartHooks.restartHooksStrings.pointerover
import typingsJapgolly.restartHooks.restartHooksStrings.pointerup
import typingsJapgolly.restartHooks.restartHooksStrings.progress
import typingsJapgolly.restartHooks.restartHooksStrings.ratechange
import typingsJapgolly.restartHooks.restartHooksStrings.readystatechange
import typingsJapgolly.restartHooks.restartHooksStrings.reset
import typingsJapgolly.restartHooks.restartHooksStrings.resize
import typingsJapgolly.restartHooks.restartHooksStrings.scroll
import typingsJapgolly.restartHooks.restartHooksStrings.securitypolicyviolation
import typingsJapgolly.restartHooks.restartHooksStrings.seeked
import typingsJapgolly.restartHooks.restartHooksStrings.seeking
import typingsJapgolly.restartHooks.restartHooksStrings.select
import typingsJapgolly.restartHooks.restartHooksStrings.selectionchange
import typingsJapgolly.restartHooks.restartHooksStrings.selectstart
import typingsJapgolly.restartHooks.restartHooksStrings.slotchange
import typingsJapgolly.restartHooks.restartHooksStrings.stalled
import typingsJapgolly.restartHooks.restartHooksStrings.submit
import typingsJapgolly.restartHooks.restartHooksStrings.suspend
import typingsJapgolly.restartHooks.restartHooksStrings.timeupdate
import typingsJapgolly.restartHooks.restartHooksStrings.toggle
import typingsJapgolly.restartHooks.restartHooksStrings.touchcancel
import typingsJapgolly.restartHooks.restartHooksStrings.touchend
import typingsJapgolly.restartHooks.restartHooksStrings.touchmove
import typingsJapgolly.restartHooks.restartHooksStrings.touchstart
import typingsJapgolly.restartHooks.restartHooksStrings.transitioncancel
import typingsJapgolly.restartHooks.restartHooksStrings.transitionend
import typingsJapgolly.restartHooks.restartHooksStrings.transitionrun
import typingsJapgolly.restartHooks.restartHooksStrings.transitionstart
import typingsJapgolly.restartHooks.restartHooksStrings.visibilitychange
import typingsJapgolly.restartHooks.restartHooksStrings.volumechange
import typingsJapgolly.restartHooks.restartHooksStrings.waiting
import typingsJapgolly.restartHooks.restartHooksStrings.webkitanimationend
import typingsJapgolly.restartHooks.restartHooksStrings.webkitanimationiteration
import typingsJapgolly.restartHooks.restartHooksStrings.webkitanimationstart
import typingsJapgolly.restartHooks.restartHooksStrings.webkittransitionend
import typingsJapgolly.restartHooks.restartHooksStrings.wheel
import typingsJapgolly.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseEventListenerMod {
  
  @JSImport("@restart/hooks/cjs/useEventListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_DOMContentLoaded[T /* <: Element | Document | Window */](eventTarget: T, event: DOMContentLoaded, listener: EventHandler[T, DOMContentLoaded]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: DOMContentLoaded, listener: EventHandler[T, DOMContentLoaded]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: abort,
    listener: EventHandler[T, abort],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationcancel[T /* <: Element | Document | Window */](eventTarget: T, event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationend, listener: EventHandler[T, animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationiteration[T /* <: Element | Document | Window */](eventTarget: T, event: animationiteration, listener: EventHandler[T, animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationstart, listener: EventHandler[T, animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: auxclick, listener: EventHandler[T, auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeinput[T /* <: Element | Document | Window */](eventTarget: T, event: beforeinput, listener: EventHandler[T, beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput[T /* <: Element | Document | Window */](eventTarget: T, event: beforeinput, listener: EventHandler[T, beforeinput], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: beforeinput,
    listener: EventHandler[T, beforeinput],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: beforeinput, listener: EventHandler[T, beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: beforeinput,
    listener: EventHandler[T, beforeinput],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: beforeinput,
    listener: EventHandler[T, beforeinput],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: blur,
    listener: EventHandler[T, blur],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: change,
    listener: EventHandler[T, change],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: click,
    listener: EventHandler[T, click],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: close,
    listener: EventHandler[T, close],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionend[T /* <: Element | Document | Window */](eventTarget: T, event: compositionend, listener: EventHandler[T, compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend[T /* <: Element | Document | Window */](eventTarget: T, event: compositionend, listener: EventHandler[T, compositionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionend,
    listener: EventHandler[T, compositionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: compositionend, listener: EventHandler[T, compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionend,
    listener: EventHandler[T, compositionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionend,
    listener: EventHandler[T, compositionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionstart[T /* <: Element | Document | Window */](eventTarget: T, event: compositionstart, listener: EventHandler[T, compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: compositionstart, listener: EventHandler[T, compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionupdate[T /* <: Element | Document | Window */](eventTarget: T, event: compositionupdate, listener: EventHandler[T, compositionupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: copy,
    listener: EventHandler[T, copy],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cuechange, listener: EventHandler[T, cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cut,
    listener: EventHandler[T, cut],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dblclick, listener: EventHandler[T, dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drag,
    listener: EventHandler[T, drag],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragenter, listener: EventHandler[T, dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragleave, listener: EventHandler[T, dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragover, listener: EventHandler[T, dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragstart, listener: EventHandler[T, dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drop,
    listener: EventHandler[T, drop],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: durationchange, listener: EventHandler[T, durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ended,
    listener: EventHandler[T, ended],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: error,
    listener: EventHandler[T, error],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focus,
    listener: EventHandler[T, focus],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusout, listener: EventHandler[T, focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_formdata[T /* <: Element | Document | Window */](eventTarget: T, event: formdata, listener: EventHandler[T, formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata[T /* <: Element | Document | Window */](eventTarget: T, event: formdata, listener: EventHandler[T, formdata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: formdata,
    listener: EventHandler[T, formdata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: formdata, listener: EventHandler[T, formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: formdata,
    listener: EventHandler[T, formdata],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: formdata,
    listener: EventHandler[T, formdata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gotpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: gotpointercapture, listener: EventHandler[T, gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: input,
    listener: EventHandler[T, input],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keypress, listener: EventHandler[T, keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keyup,
    listener: EventHandler[T, keyup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: load,
    listener: EventHandler[T, load],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadstart, listener: EventHandler[T, loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_lostpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: lostpointercapture, listener: EventHandler[T, lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousedown, listener: EventHandler[T, mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousemove, listener: EventHandler[T, mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseout, listener: EventHandler[T, mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseover, listener: EventHandler[T, mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: paste,
    listener: EventHandler[T, paste],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pause,
    listener: EventHandler[T, pause],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: play,
    listener: EventHandler[T, play],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockchange[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockchange, listener: EventHandler[T, pointerlockchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointermove, listener: EventHandler[T, pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerout, listener: EventHandler[T, pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerover, listener: EventHandler[T, pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerup, listener: EventHandler[T, pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: progress, listener: EventHandler[T, progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ratechange, listener: EventHandler[T, ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_readystatechange[T /* <: Element | Document | Window */](eventTarget: T, event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: reset,
    listener: EventHandler[T, reset],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: resize,
    listener: EventHandler[T, resize],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: scroll,
    listener: EventHandler[T, scroll],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_securitypolicyviolation[T /* <: Element | Document | Window */](eventTarget: T, event: securitypolicyviolation, listener: EventHandler[T, securitypolicyviolation]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeked,
    listener: EventHandler[T, seeked],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: select,
    listener: EventHandler[T, select],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectionchange[T /* <: Element | Document | Window */](eventTarget: T, event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectstart, listener: EventHandler[T, selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_slotchange[T /* <: Element | Document | Window */](eventTarget: T, event: slotchange, listener: EventHandler[T, slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange[T /* <: Element | Document | Window */](eventTarget: T, event: slotchange, listener: EventHandler[T, slotchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: slotchange,
    listener: EventHandler[T, slotchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: slotchange, listener: EventHandler[T, slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: slotchange,
    listener: EventHandler[T, slotchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: slotchange,
    listener: EventHandler[T, slotchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: submit,
    listener: EventHandler[T, submit],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: toggle,
    listener: EventHandler[T, toggle],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchend, listener: EventHandler[T, touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchmove, listener: EventHandler[T, touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchstart, listener: EventHandler[T, touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitioncancel[T /* <: Element | Document | Window */](eventTarget: T, event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionend, listener: EventHandler[T, transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionstart[T /* <: Element | Document | Window */](eventTarget: T, event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_visibilitychange[T /* <: Element | Document | Window */](eventTarget: T, event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: volumechange, listener: EventHandler[T, volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationend[T /* <: Element | Document | Window */](eventTarget: T, event: webkitanimationend, listener: EventHandler[T, webkitanimationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationstart[T /* <: Element | Document | Window */](eventTarget: T, event: webkitanimationstart, listener: EventHandler[T, webkitanimationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkittransitionend[T /* <: Element | Document | Window */](eventTarget: T, event: webkittransitionend, listener: EventHandler[T, webkittransitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: wheel,
    listener: EventHandler[T, wheel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type EventHandler[T, K /* <: DOMContentLoaded | fullscreenchange | fullscreenerror | pointerlockchange | pointerlockerror | readystatechange | visibilitychange */] = js.ThisFunction1[
    /* this */ T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[K] */ /* ev */ js.Any, 
    Any
  ]
}
