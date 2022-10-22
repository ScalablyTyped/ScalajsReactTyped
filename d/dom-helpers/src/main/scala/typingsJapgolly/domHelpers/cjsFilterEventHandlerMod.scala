package typingsJapgolly.domHelpers

import typingsJapgolly.domHelpers.cjsAddEventListenerMod.EventHandler
import typingsJapgolly.domHelpers.domHelpersStrings.abort
import typingsJapgolly.domHelpers.domHelpersStrings.animationcancel
import typingsJapgolly.domHelpers.domHelpersStrings.animationend
import typingsJapgolly.domHelpers.domHelpersStrings.animationiteration
import typingsJapgolly.domHelpers.domHelpersStrings.animationstart
import typingsJapgolly.domHelpers.domHelpersStrings.auxclick
import typingsJapgolly.domHelpers.domHelpersStrings.beforeinput
import typingsJapgolly.domHelpers.domHelpersStrings.blur
import typingsJapgolly.domHelpers.domHelpersStrings.canplay
import typingsJapgolly.domHelpers.domHelpersStrings.canplaythrough
import typingsJapgolly.domHelpers.domHelpersStrings.change
import typingsJapgolly.domHelpers.domHelpersStrings.click
import typingsJapgolly.domHelpers.domHelpersStrings.close
import typingsJapgolly.domHelpers.domHelpersStrings.compositionend
import typingsJapgolly.domHelpers.domHelpersStrings.compositionstart
import typingsJapgolly.domHelpers.domHelpersStrings.compositionupdate
import typingsJapgolly.domHelpers.domHelpersStrings.contextmenu
import typingsJapgolly.domHelpers.domHelpersStrings.copy
import typingsJapgolly.domHelpers.domHelpersStrings.cuechange
import typingsJapgolly.domHelpers.domHelpersStrings.cut
import typingsJapgolly.domHelpers.domHelpersStrings.dblclick
import typingsJapgolly.domHelpers.domHelpersStrings.drag
import typingsJapgolly.domHelpers.domHelpersStrings.dragend
import typingsJapgolly.domHelpers.domHelpersStrings.dragenter
import typingsJapgolly.domHelpers.domHelpersStrings.dragleave
import typingsJapgolly.domHelpers.domHelpersStrings.dragover
import typingsJapgolly.domHelpers.domHelpersStrings.dragstart
import typingsJapgolly.domHelpers.domHelpersStrings.drop
import typingsJapgolly.domHelpers.domHelpersStrings.durationchange
import typingsJapgolly.domHelpers.domHelpersStrings.emptied
import typingsJapgolly.domHelpers.domHelpersStrings.ended
import typingsJapgolly.domHelpers.domHelpersStrings.error
import typingsJapgolly.domHelpers.domHelpersStrings.focus
import typingsJapgolly.domHelpers.domHelpersStrings.focusin
import typingsJapgolly.domHelpers.domHelpersStrings.focusout
import typingsJapgolly.domHelpers.domHelpersStrings.formdata
import typingsJapgolly.domHelpers.domHelpersStrings.fullscreenchange
import typingsJapgolly.domHelpers.domHelpersStrings.fullscreenerror
import typingsJapgolly.domHelpers.domHelpersStrings.gotpointercapture
import typingsJapgolly.domHelpers.domHelpersStrings.input
import typingsJapgolly.domHelpers.domHelpersStrings.invalid
import typingsJapgolly.domHelpers.domHelpersStrings.keydown
import typingsJapgolly.domHelpers.domHelpersStrings.keypress
import typingsJapgolly.domHelpers.domHelpersStrings.keyup
import typingsJapgolly.domHelpers.domHelpersStrings.load
import typingsJapgolly.domHelpers.domHelpersStrings.loadeddata
import typingsJapgolly.domHelpers.domHelpersStrings.loadedmetadata
import typingsJapgolly.domHelpers.domHelpersStrings.loadstart
import typingsJapgolly.domHelpers.domHelpersStrings.lostpointercapture
import typingsJapgolly.domHelpers.domHelpersStrings.mousedown
import typingsJapgolly.domHelpers.domHelpersStrings.mouseenter
import typingsJapgolly.domHelpers.domHelpersStrings.mouseleave
import typingsJapgolly.domHelpers.domHelpersStrings.mousemove
import typingsJapgolly.domHelpers.domHelpersStrings.mouseout
import typingsJapgolly.domHelpers.domHelpersStrings.mouseover
import typingsJapgolly.domHelpers.domHelpersStrings.mouseup
import typingsJapgolly.domHelpers.domHelpersStrings.paste
import typingsJapgolly.domHelpers.domHelpersStrings.pause
import typingsJapgolly.domHelpers.domHelpersStrings.play
import typingsJapgolly.domHelpers.domHelpersStrings.playing
import typingsJapgolly.domHelpers.domHelpersStrings.pointercancel
import typingsJapgolly.domHelpers.domHelpersStrings.pointerdown
import typingsJapgolly.domHelpers.domHelpersStrings.pointerenter
import typingsJapgolly.domHelpers.domHelpersStrings.pointerleave
import typingsJapgolly.domHelpers.domHelpersStrings.pointermove
import typingsJapgolly.domHelpers.domHelpersStrings.pointerout
import typingsJapgolly.domHelpers.domHelpersStrings.pointerover
import typingsJapgolly.domHelpers.domHelpersStrings.pointerup
import typingsJapgolly.domHelpers.domHelpersStrings.progress
import typingsJapgolly.domHelpers.domHelpersStrings.ratechange
import typingsJapgolly.domHelpers.domHelpersStrings.reset
import typingsJapgolly.domHelpers.domHelpersStrings.resize
import typingsJapgolly.domHelpers.domHelpersStrings.scroll
import typingsJapgolly.domHelpers.domHelpersStrings.securitypolicyviolation
import typingsJapgolly.domHelpers.domHelpersStrings.seeked
import typingsJapgolly.domHelpers.domHelpersStrings.seeking
import typingsJapgolly.domHelpers.domHelpersStrings.select
import typingsJapgolly.domHelpers.domHelpersStrings.selectionchange
import typingsJapgolly.domHelpers.domHelpersStrings.selectstart
import typingsJapgolly.domHelpers.domHelpersStrings.slotchange
import typingsJapgolly.domHelpers.domHelpersStrings.stalled
import typingsJapgolly.domHelpers.domHelpersStrings.submit
import typingsJapgolly.domHelpers.domHelpersStrings.suspend
import typingsJapgolly.domHelpers.domHelpersStrings.timeupdate
import typingsJapgolly.domHelpers.domHelpersStrings.toggle
import typingsJapgolly.domHelpers.domHelpersStrings.touchcancel
import typingsJapgolly.domHelpers.domHelpersStrings.touchend
import typingsJapgolly.domHelpers.domHelpersStrings.touchmove
import typingsJapgolly.domHelpers.domHelpersStrings.touchstart
import typingsJapgolly.domHelpers.domHelpersStrings.transitioncancel
import typingsJapgolly.domHelpers.domHelpersStrings.transitionend
import typingsJapgolly.domHelpers.domHelpersStrings.transitionrun
import typingsJapgolly.domHelpers.domHelpersStrings.transitionstart
import typingsJapgolly.domHelpers.domHelpersStrings.volumechange
import typingsJapgolly.domHelpers.domHelpersStrings.waiting
import typingsJapgolly.domHelpers.domHelpersStrings.webkitanimationend
import typingsJapgolly.domHelpers.domHelpersStrings.webkitanimationiteration
import typingsJapgolly.domHelpers.domHelpersStrings.webkitanimationstart
import typingsJapgolly.domHelpers.domHelpersStrings.webkittransitionend
import typingsJapgolly.domHelpers.domHelpersStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsFilterEventHandlerMod {
  
  @JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[abort]]
  
  inline def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationcancel]]
  
  inline def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationend]]
  
  inline def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationiteration]]
  
  inline def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[animationstart]]
  
  inline def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[auxclick]]
  
  inline def default_beforeinput(selector: String, handler: EventHandler[beforeinput]): EventHandler[beforeinput] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[beforeinput]]
  
  inline def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[blur]]
  
  inline def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplay]]
  
  inline def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[canplaythrough]]
  
  inline def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[change]]
  
  inline def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[click]]
  
  inline def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[close]]
  
  inline def default_compositionend(selector: String, handler: EventHandler[compositionend]): EventHandler[compositionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[compositionend]]
  
  inline def default_compositionstart(selector: String, handler: EventHandler[compositionstart]): EventHandler[compositionstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[compositionstart]]
  
  inline def default_compositionupdate(selector: String, handler: EventHandler[compositionupdate]): EventHandler[compositionupdate] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[compositionupdate]]
  
  inline def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[contextmenu]]
  
  inline def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[copy]]
  
  inline def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cuechange]]
  
  inline def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[cut]]
  
  inline def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dblclick]]
  
  inline def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drag]]
  
  inline def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragend]]
  
  inline def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragenter]]
  
  inline def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragleave]]
  
  inline def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragover]]
  
  inline def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[dragstart]]
  
  inline def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[drop]]
  
  inline def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[durationchange]]
  
  inline def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[emptied]]
  
  inline def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ended]]
  
  inline def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[error]]
  
  inline def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focus]]
  
  inline def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusin]]
  
  inline def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[focusout]]
  
  inline def default_formdata(selector: String, handler: EventHandler[formdata]): EventHandler[formdata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[formdata]]
  
  inline def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenchange]]
  
  inline def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[fullscreenerror]]
  
  inline def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[gotpointercapture]]
  
  inline def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[input]]
  
  inline def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[invalid]]
  
  inline def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keydown]]
  
  inline def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keypress]]
  
  inline def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[keyup]]
  
  inline def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[load]]
  
  inline def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadeddata]]
  
  inline def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadedmetadata]]
  
  inline def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[loadstart]]
  
  inline def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[lostpointercapture]]
  
  inline def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousedown]]
  
  inline def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseenter]]
  
  inline def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseleave]]
  
  inline def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mousemove]]
  
  inline def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseout]]
  
  inline def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseover]]
  
  inline def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[mouseup]]
  
  inline def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[paste]]
  
  inline def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pause]]
  
  inline def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[play]]
  
  inline def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[playing]]
  
  inline def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointercancel]]
  
  inline def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerdown]]
  
  inline def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerenter]]
  
  inline def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerleave]]
  
  inline def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointermove]]
  
  inline def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerout]]
  
  inline def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerover]]
  
  inline def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[pointerup]]
  
  inline def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[progress]]
  
  inline def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[ratechange]]
  
  inline def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[reset]]
  
  inline def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[resize]]
  
  inline def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[scroll]]
  
  inline def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[securitypolicyviolation]]
  
  inline def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeked]]
  
  inline def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[seeking]]
  
  inline def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[select]]
  
  inline def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectionchange]]
  
  inline def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[selectstart]]
  
  inline def default_slotchange(selector: String, handler: EventHandler[slotchange]): EventHandler[slotchange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[slotchange]]
  
  inline def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[stalled]]
  
  inline def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[submit]]
  
  inline def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[suspend]]
  
  inline def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[timeupdate]]
  
  inline def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[toggle]]
  
  inline def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchcancel]]
  
  inline def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchend]]
  
  inline def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchmove]]
  
  inline def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[touchstart]]
  
  inline def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitioncancel]]
  
  inline def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionend]]
  
  inline def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionrun]]
  
  inline def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[transitionstart]]
  
  inline def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[volumechange]]
  
  inline def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[waiting]]
  
  inline def default_webkitanimationend(selector: String, handler: EventHandler[webkitanimationend]): EventHandler[webkitanimationend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[webkitanimationend]]
  
  inline def default_webkitanimationiteration(selector: String, handler: EventHandler[webkitanimationiteration]): EventHandler[webkitanimationiteration] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[webkitanimationiteration]]
  
  inline def default_webkitanimationstart(selector: String, handler: EventHandler[webkitanimationstart]): EventHandler[webkitanimationstart] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[webkitanimationstart]]
  
  inline def default_webkittransitionend(selector: String, handler: EventHandler[webkittransitionend]): EventHandler[webkittransitionend] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[webkittransitionend]]
  
  inline def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventHandler[wheel]]
}
