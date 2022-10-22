package typingsJapgolly.restartHooks

import org.scalajs.dom.Document
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

object cjsUseGlobalListenerMod {
  
  @JSImport("@restart/hooks/cjs/useGlobalListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_DOMContentLoaded(event: DOMContentLoaded, handler: DocumentEventHandler[DOMContentLoaded]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(event: DOMContentLoaded, handler: DocumentEventHandler[DOMContentLoaded], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_DOMContentLoaded(
    event: DOMContentLoaded,
    handler: DocumentEventHandler[DOMContentLoaded],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_abort(event: abort, handler: DocumentEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(event: abort, handler: DocumentEventHandler[abort], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_abort(event: abort, handler: DocumentEventHandler[abort], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationcancel(
    event: animationcancel,
    handler: DocumentEventHandler[animationcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationend(event: animationend, handler: DocumentEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationiteration(
    event: animationiteration,
    handler: DocumentEventHandler[animationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_animationstart(
    event: animationstart,
    handler: DocumentEventHandler[animationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_beforeinput(event: beforeinput, handler: DocumentEventHandler[beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(event: beforeinput, handler: DocumentEventHandler[beforeinput], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_beforeinput(event: beforeinput, handler: DocumentEventHandler[beforeinput], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_blur(event: blur, handler: DocumentEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(event: blur, handler: DocumentEventHandler[blur], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_blur(event: blur, handler: DocumentEventHandler[blur], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplay(event: canplay, handler: DocumentEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_canplaythrough(
    event: canplaythrough,
    handler: DocumentEventHandler[canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_change(event: change, handler: DocumentEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(event: change, handler: DocumentEventHandler[change], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_change(event: change, handler: DocumentEventHandler[change], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_click(event: click, handler: DocumentEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(event: click, handler: DocumentEventHandler[click], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_click(event: click, handler: DocumentEventHandler[click], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_close(event: close, handler: DocumentEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(event: close, handler: DocumentEventHandler[close], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_close(event: close, handler: DocumentEventHandler[close], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionend(event: compositionend, handler: DocumentEventHandler[compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(event: compositionend, handler: DocumentEventHandler[compositionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionend(
    event: compositionend,
    handler: DocumentEventHandler[compositionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionstart(event: compositionstart, handler: DocumentEventHandler[compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(event: compositionstart, handler: DocumentEventHandler[compositionstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionstart(
    event: compositionstart,
    handler: DocumentEventHandler[compositionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_compositionupdate(event: compositionupdate, handler: DocumentEventHandler[compositionupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(event: compositionupdate, handler: DocumentEventHandler[compositionupdate], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_compositionupdate(
    event: compositionupdate,
    handler: DocumentEventHandler[compositionupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_copy(event: copy, handler: DocumentEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(event: copy, handler: DocumentEventHandler[copy], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_copy(event: copy, handler: DocumentEventHandler[copy], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_cut(event: cut, handler: DocumentEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(event: cut, handler: DocumentEventHandler[cut], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_cut(event: cut, handler: DocumentEventHandler[cut], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drag(event: drag, handler: DocumentEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(event: drag, handler: DocumentEventHandler[drag], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drag(event: drag, handler: DocumentEventHandler[drag], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragend(event: dragend, handler: DocumentEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragover(event: dragover, handler: DocumentEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_drop(event: drop, handler: DocumentEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(event: drop, handler: DocumentEventHandler[drop], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_drop(event: drop, handler: DocumentEventHandler[drop], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_durationchange(
    event: durationchange,
    handler: DocumentEventHandler[durationchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_emptied(event: emptied, handler: DocumentEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ended(event: ended, handler: DocumentEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(event: ended, handler: DocumentEventHandler[ended], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ended(event: ended, handler: DocumentEventHandler[ended], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_error(event: error, handler: DocumentEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(event: error, handler: DocumentEventHandler[error], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_error(event: error, handler: DocumentEventHandler[error], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focus(event: focus, handler: DocumentEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(event: focus, handler: DocumentEventHandler[focus], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focus(event: focus, handler: DocumentEventHandler[focus], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusin(event: focusin, handler: DocumentEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_focusout(event: focusout, handler: DocumentEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_formdata(event: formdata, handler: DocumentEventHandler[formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(event: formdata, handler: DocumentEventHandler[formdata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_formdata(event: formdata, handler: DocumentEventHandler[formdata], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenchange(
    event: fullscreenchange,
    handler: DocumentEventHandler[fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_fullscreenerror(
    event: fullscreenerror,
    handler: DocumentEventHandler[fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_gotpointercapture(
    event: gotpointercapture,
    handler: DocumentEventHandler[gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_input(event: input, handler: DocumentEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(event: input, handler: DocumentEventHandler[input], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_input(event: input, handler: DocumentEventHandler[input], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_invalid(event: invalid, handler: DocumentEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keydown(event: keydown, handler: DocumentEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keypress(event: keypress, handler: DocumentEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_keyup(event: keyup, handler: DocumentEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_load(event: load, handler: DocumentEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(event: load, handler: DocumentEventHandler[load], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_load(event: load, handler: DocumentEventHandler[load], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadedmetadata(
    event: loadedmetadata,
    handler: DocumentEventHandler[loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_lostpointercapture(
    event: lostpointercapture,
    handler: DocumentEventHandler[lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_paste(event: paste, handler: DocumentEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(event: paste, handler: DocumentEventHandler[paste], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_paste(event: paste, handler: DocumentEventHandler[paste], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pause(event: pause, handler: DocumentEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(event: pause, handler: DocumentEventHandler[pause], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pause(event: pause, handler: DocumentEventHandler[pause], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_play(event: play, handler: DocumentEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(event: play, handler: DocumentEventHandler[play], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_play(event: play, handler: DocumentEventHandler[play], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_playing(event: playing, handler: DocumentEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(event: playing, handler: DocumentEventHandler[playing], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_playing(event: playing, handler: DocumentEventHandler[playing], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointercancel(
    event: pointercancel,
    handler: DocumentEventHandler[pointercancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockchange(
    event: pointerlockchange,
    handler: DocumentEventHandler[pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerlockerror(
    event: pointerlockerror,
    handler: DocumentEventHandler[pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_progress(event: progress, handler: DocumentEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(event: progress, handler: DocumentEventHandler[progress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_progress(event: progress, handler: DocumentEventHandler[progress], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_readystatechange(
    event: readystatechange,
    handler: DocumentEventHandler[readystatechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_reset(event: reset, handler: DocumentEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(event: reset, handler: DocumentEventHandler[reset], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_reset(event: reset, handler: DocumentEventHandler[reset], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_resize(event: resize, handler: DocumentEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(event: resize, handler: DocumentEventHandler[resize], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_resize(event: resize, handler: DocumentEventHandler[resize], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_scroll(event: scroll, handler: DocumentEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_securitypolicyviolation(event: securitypolicyviolation, handler: DocumentEventHandler[securitypolicyviolation]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeked(event: seeked, handler: DocumentEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_seeking(event: seeking, handler: DocumentEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_select(event: select, handler: DocumentEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(event: select, handler: DocumentEventHandler[select], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_select(event: select, handler: DocumentEventHandler[select], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectionchange(
    event: selectionchange,
    handler: DocumentEventHandler[selectionchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_slotchange(event: slotchange, handler: DocumentEventHandler[slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(event: slotchange, handler: DocumentEventHandler[slotchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_slotchange(event: slotchange, handler: DocumentEventHandler[slotchange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_stalled(event: stalled, handler: DocumentEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_submit(event: submit, handler: DocumentEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(event: submit, handler: DocumentEventHandler[submit], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_submit(event: submit, handler: DocumentEventHandler[submit], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_suspend(event: suspend, handler: DocumentEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_toggle(event: toggle, handler: DocumentEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchend(event: touchend, handler: DocumentEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitioncancel(
    event: transitioncancel,
    handler: DocumentEventHandler[transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionend(
    event: transitionend,
    handler: DocumentEventHandler[transitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionrun(
    event: transitionrun,
    handler: DocumentEventHandler[transitionrun],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_transitionstart(
    event: transitionstart,
    handler: DocumentEventHandler[transitionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_visibilitychange(
    event: visibilitychange,
    handler: DocumentEventHandler[visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_waiting(event: waiting, handler: DocumentEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationend(event: webkitanimationend, handler: DocumentEventHandler[webkitanimationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(event: webkitanimationend, handler: DocumentEventHandler[webkitanimationend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationend(
    event: webkitanimationend,
    handler: DocumentEventHandler[webkitanimationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationiteration(event: webkitanimationiteration, handler: DocumentEventHandler[webkitanimationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    event: webkitanimationiteration,
    handler: DocumentEventHandler[webkitanimationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationiteration(
    event: webkitanimationiteration,
    handler: DocumentEventHandler[webkitanimationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkitanimationstart(event: webkitanimationstart, handler: DocumentEventHandler[webkitanimationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(event: webkitanimationstart, handler: DocumentEventHandler[webkitanimationstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkitanimationstart(
    event: webkitanimationstart,
    handler: DocumentEventHandler[webkitanimationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_webkittransitionend(event: webkittransitionend, handler: DocumentEventHandler[webkittransitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(event: webkittransitionend, handler: DocumentEventHandler[webkittransitionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_webkittransitionend(
    event: webkittransitionend,
    handler: DocumentEventHandler[webkittransitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def default_wheel(event: wheel, handler: DocumentEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DocumentEventHandler[K /* <: DOMContentLoaded | fullscreenchange | fullscreenerror | pointerlockchange | pointerlockerror | readystatechange | visibilitychange */] = js.ThisFunction1[
    /* this */ Document, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[K] */ /* ev */ js.Any, 
    Any
  ]
}
