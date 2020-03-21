package typingsJapgolly.domHelpers

import typingsJapgolly.domHelpers.addEventListenerMod.EventHandler
import typingsJapgolly.domHelpers.domHelpersStrings.abort
import typingsJapgolly.domHelpers.domHelpersStrings.animationcancel
import typingsJapgolly.domHelpers.domHelpersStrings.animationend
import typingsJapgolly.domHelpers.domHelpersStrings.animationiteration
import typingsJapgolly.domHelpers.domHelpersStrings.animationstart
import typingsJapgolly.domHelpers.domHelpersStrings.auxclick
import typingsJapgolly.domHelpers.domHelpersStrings.blur
import typingsJapgolly.domHelpers.domHelpersStrings.cancel
import typingsJapgolly.domHelpers.domHelpersStrings.canplay
import typingsJapgolly.domHelpers.domHelpersStrings.canplaythrough
import typingsJapgolly.domHelpers.domHelpersStrings.change
import typingsJapgolly.domHelpers.domHelpersStrings.click
import typingsJapgolly.domHelpers.domHelpersStrings.close
import typingsJapgolly.domHelpers.domHelpersStrings.contextmenu
import typingsJapgolly.domHelpers.domHelpersStrings.copy
import typingsJapgolly.domHelpers.domHelpersStrings.cuechange
import typingsJapgolly.domHelpers.domHelpersStrings.cut
import typingsJapgolly.domHelpers.domHelpersStrings.dblclick
import typingsJapgolly.domHelpers.domHelpersStrings.drag
import typingsJapgolly.domHelpers.domHelpersStrings.dragend
import typingsJapgolly.domHelpers.domHelpersStrings.dragenter
import typingsJapgolly.domHelpers.domHelpersStrings.dragexit
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
import typingsJapgolly.domHelpers.domHelpersStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/filterEventHandler", JSImport.Namespace)
@js.native
object filterEventHandlerMod extends js.Object {
  @JSName("default")
  def default_abort(selector: String, handler: EventHandler[abort]): EventHandler[abort] = js.native
  @JSName("default")
  def default_animationcancel(selector: String, handler: EventHandler[animationcancel]): EventHandler[animationcancel] = js.native
  @JSName("default")
  def default_animationend(selector: String, handler: EventHandler[animationend]): EventHandler[animationend] = js.native
  @JSName("default")
  def default_animationiteration(selector: String, handler: EventHandler[animationiteration]): EventHandler[animationiteration] = js.native
  @JSName("default")
  def default_animationstart(selector: String, handler: EventHandler[animationstart]): EventHandler[animationstart] = js.native
  @JSName("default")
  def default_auxclick(selector: String, handler: EventHandler[auxclick]): EventHandler[auxclick] = js.native
  @JSName("default")
  def default_blur(selector: String, handler: EventHandler[blur]): EventHandler[blur] = js.native
  @JSName("default")
  def default_cancel(selector: String, handler: EventHandler[cancel]): EventHandler[cancel] = js.native
  @JSName("default")
  def default_canplay(selector: String, handler: EventHandler[canplay]): EventHandler[canplay] = js.native
  @JSName("default")
  def default_canplaythrough(selector: String, handler: EventHandler[canplaythrough]): EventHandler[canplaythrough] = js.native
  @JSName("default")
  def default_change(selector: String, handler: EventHandler[change]): EventHandler[change] = js.native
  @JSName("default")
  def default_click(selector: String, handler: EventHandler[click]): EventHandler[click] = js.native
  @JSName("default")
  def default_close(selector: String, handler: EventHandler[close]): EventHandler[close] = js.native
  @JSName("default")
  def default_contextmenu(selector: String, handler: EventHandler[contextmenu]): EventHandler[contextmenu] = js.native
  @JSName("default")
  def default_copy(selector: String, handler: EventHandler[copy]): EventHandler[copy] = js.native
  @JSName("default")
  def default_cuechange(selector: String, handler: EventHandler[cuechange]): EventHandler[cuechange] = js.native
  @JSName("default")
  def default_cut(selector: String, handler: EventHandler[cut]): EventHandler[cut] = js.native
  @JSName("default")
  def default_dblclick(selector: String, handler: EventHandler[dblclick]): EventHandler[dblclick] = js.native
  @JSName("default")
  def default_drag(selector: String, handler: EventHandler[drag]): EventHandler[drag] = js.native
  @JSName("default")
  def default_dragend(selector: String, handler: EventHandler[dragend]): EventHandler[dragend] = js.native
  @JSName("default")
  def default_dragenter(selector: String, handler: EventHandler[dragenter]): EventHandler[dragenter] = js.native
  @JSName("default")
  def default_dragexit(selector: String, handler: EventHandler[dragexit]): EventHandler[dragexit] = js.native
  @JSName("default")
  def default_dragleave(selector: String, handler: EventHandler[dragleave]): EventHandler[dragleave] = js.native
  @JSName("default")
  def default_dragover(selector: String, handler: EventHandler[dragover]): EventHandler[dragover] = js.native
  @JSName("default")
  def default_dragstart(selector: String, handler: EventHandler[dragstart]): EventHandler[dragstart] = js.native
  @JSName("default")
  def default_drop(selector: String, handler: EventHandler[drop]): EventHandler[drop] = js.native
  @JSName("default")
  def default_durationchange(selector: String, handler: EventHandler[durationchange]): EventHandler[durationchange] = js.native
  @JSName("default")
  def default_emptied(selector: String, handler: EventHandler[emptied]): EventHandler[emptied] = js.native
  @JSName("default")
  def default_ended(selector: String, handler: EventHandler[ended]): EventHandler[ended] = js.native
  @JSName("default")
  def default_error(selector: String, handler: EventHandler[error]): EventHandler[error] = js.native
  @JSName("default")
  def default_focus(selector: String, handler: EventHandler[focus]): EventHandler[focus] = js.native
  @JSName("default")
  def default_focusin(selector: String, handler: EventHandler[focusin]): EventHandler[focusin] = js.native
  @JSName("default")
  def default_focusout(selector: String, handler: EventHandler[focusout]): EventHandler[focusout] = js.native
  @JSName("default")
  def default_fullscreenchange(selector: String, handler: EventHandler[fullscreenchange]): EventHandler[fullscreenchange] = js.native
  @JSName("default")
  def default_fullscreenerror(selector: String, handler: EventHandler[fullscreenerror]): EventHandler[fullscreenerror] = js.native
  @JSName("default")
  def default_gotpointercapture(selector: String, handler: EventHandler[gotpointercapture]): EventHandler[gotpointercapture] = js.native
  @JSName("default")
  def default_input(selector: String, handler: EventHandler[input]): EventHandler[input] = js.native
  @JSName("default")
  def default_invalid(selector: String, handler: EventHandler[invalid]): EventHandler[invalid] = js.native
  @JSName("default")
  def default_keydown(selector: String, handler: EventHandler[keydown]): EventHandler[keydown] = js.native
  @JSName("default")
  def default_keypress(selector: String, handler: EventHandler[keypress]): EventHandler[keypress] = js.native
  @JSName("default")
  def default_keyup(selector: String, handler: EventHandler[keyup]): EventHandler[keyup] = js.native
  @JSName("default")
  def default_load(selector: String, handler: EventHandler[load]): EventHandler[load] = js.native
  @JSName("default")
  def default_loadeddata(selector: String, handler: EventHandler[loadeddata]): EventHandler[loadeddata] = js.native
  @JSName("default")
  def default_loadedmetadata(selector: String, handler: EventHandler[loadedmetadata]): EventHandler[loadedmetadata] = js.native
  @JSName("default")
  def default_loadstart(selector: String, handler: EventHandler[loadstart]): EventHandler[loadstart] = js.native
  @JSName("default")
  def default_lostpointercapture(selector: String, handler: EventHandler[lostpointercapture]): EventHandler[lostpointercapture] = js.native
  @JSName("default")
  def default_mousedown(selector: String, handler: EventHandler[mousedown]): EventHandler[mousedown] = js.native
  @JSName("default")
  def default_mouseenter(selector: String, handler: EventHandler[mouseenter]): EventHandler[mouseenter] = js.native
  @JSName("default")
  def default_mouseleave(selector: String, handler: EventHandler[mouseleave]): EventHandler[mouseleave] = js.native
  @JSName("default")
  def default_mousemove(selector: String, handler: EventHandler[mousemove]): EventHandler[mousemove] = js.native
  @JSName("default")
  def default_mouseout(selector: String, handler: EventHandler[mouseout]): EventHandler[mouseout] = js.native
  @JSName("default")
  def default_mouseover(selector: String, handler: EventHandler[mouseover]): EventHandler[mouseover] = js.native
  @JSName("default")
  def default_mouseup(selector: String, handler: EventHandler[mouseup]): EventHandler[mouseup] = js.native
  @JSName("default")
  def default_paste(selector: String, handler: EventHandler[paste]): EventHandler[paste] = js.native
  @JSName("default")
  def default_pause(selector: String, handler: EventHandler[pause]): EventHandler[pause] = js.native
  @JSName("default")
  def default_play(selector: String, handler: EventHandler[play]): EventHandler[play] = js.native
  @JSName("default")
  def default_playing(selector: String, handler: EventHandler[playing]): EventHandler[playing] = js.native
  @JSName("default")
  def default_pointercancel(selector: String, handler: EventHandler[pointercancel]): EventHandler[pointercancel] = js.native
  @JSName("default")
  def default_pointerdown(selector: String, handler: EventHandler[pointerdown]): EventHandler[pointerdown] = js.native
  @JSName("default")
  def default_pointerenter(selector: String, handler: EventHandler[pointerenter]): EventHandler[pointerenter] = js.native
  @JSName("default")
  def default_pointerleave(selector: String, handler: EventHandler[pointerleave]): EventHandler[pointerleave] = js.native
  @JSName("default")
  def default_pointermove(selector: String, handler: EventHandler[pointermove]): EventHandler[pointermove] = js.native
  @JSName("default")
  def default_pointerout(selector: String, handler: EventHandler[pointerout]): EventHandler[pointerout] = js.native
  @JSName("default")
  def default_pointerover(selector: String, handler: EventHandler[pointerover]): EventHandler[pointerover] = js.native
  @JSName("default")
  def default_pointerup(selector: String, handler: EventHandler[pointerup]): EventHandler[pointerup] = js.native
  @JSName("default")
  def default_progress(selector: String, handler: EventHandler[progress]): EventHandler[progress] = js.native
  @JSName("default")
  def default_ratechange(selector: String, handler: EventHandler[ratechange]): EventHandler[ratechange] = js.native
  @JSName("default")
  def default_reset(selector: String, handler: EventHandler[reset]): EventHandler[reset] = js.native
  @JSName("default")
  def default_resize(selector: String, handler: EventHandler[resize]): EventHandler[resize] = js.native
  @JSName("default")
  def default_scroll(selector: String, handler: EventHandler[scroll]): EventHandler[scroll] = js.native
  @JSName("default")
  def default_securitypolicyviolation(selector: String, handler: EventHandler[securitypolicyviolation]): EventHandler[securitypolicyviolation] = js.native
  @JSName("default")
  def default_seeked(selector: String, handler: EventHandler[seeked]): EventHandler[seeked] = js.native
  @JSName("default")
  def default_seeking(selector: String, handler: EventHandler[seeking]): EventHandler[seeking] = js.native
  @JSName("default")
  def default_select(selector: String, handler: EventHandler[select]): EventHandler[select] = js.native
  @JSName("default")
  def default_selectionchange(selector: String, handler: EventHandler[selectionchange]): EventHandler[selectionchange] = js.native
  @JSName("default")
  def default_selectstart(selector: String, handler: EventHandler[selectstart]): EventHandler[selectstart] = js.native
  @JSName("default")
  def default_stalled(selector: String, handler: EventHandler[stalled]): EventHandler[stalled] = js.native
  @JSName("default")
  def default_submit(selector: String, handler: EventHandler[submit]): EventHandler[submit] = js.native
  @JSName("default")
  def default_suspend(selector: String, handler: EventHandler[suspend]): EventHandler[suspend] = js.native
  @JSName("default")
  def default_timeupdate(selector: String, handler: EventHandler[timeupdate]): EventHandler[timeupdate] = js.native
  @JSName("default")
  def default_toggle(selector: String, handler: EventHandler[toggle]): EventHandler[toggle] = js.native
  @JSName("default")
  def default_touchcancel(selector: String, handler: EventHandler[touchcancel]): EventHandler[touchcancel] = js.native
  @JSName("default")
  def default_touchend(selector: String, handler: EventHandler[touchend]): EventHandler[touchend] = js.native
  @JSName("default")
  def default_touchmove(selector: String, handler: EventHandler[touchmove]): EventHandler[touchmove] = js.native
  @JSName("default")
  def default_touchstart(selector: String, handler: EventHandler[touchstart]): EventHandler[touchstart] = js.native
  @JSName("default")
  def default_transitioncancel(selector: String, handler: EventHandler[transitioncancel]): EventHandler[transitioncancel] = js.native
  @JSName("default")
  def default_transitionend(selector: String, handler: EventHandler[transitionend]): EventHandler[transitionend] = js.native
  @JSName("default")
  def default_transitionrun(selector: String, handler: EventHandler[transitionrun]): EventHandler[transitionrun] = js.native
  @JSName("default")
  def default_transitionstart(selector: String, handler: EventHandler[transitionstart]): EventHandler[transitionstart] = js.native
  @JSName("default")
  def default_volumechange(selector: String, handler: EventHandler[volumechange]): EventHandler[volumechange] = js.native
  @JSName("default")
  def default_waiting(selector: String, handler: EventHandler[waiting]): EventHandler[waiting] = js.native
  @JSName("default")
  def default_wheel(selector: String, handler: EventHandler[wheel]): EventHandler[wheel] = js.native
}

