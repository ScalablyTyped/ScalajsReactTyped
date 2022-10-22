package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import typingsJapgolly.testingLibraryUserEvent.distTypesEventTypesMod.EventTypeInit
import typingsJapgolly.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.DOMContentLoaded
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.abort
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.animationcancel
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.animationend_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.animationiteration_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.animationstart_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.auxclick
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.beforeinput_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.blur
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.canplay_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.canplaythrough_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.change
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.click
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.close
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.compositionend_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.compositionstart_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.compositionupdate_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.contextmenu_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.copy
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.cuechange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.cut
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.dblclick_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.drag
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.dragend_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.dragenter_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.dragleave_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.dragover_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.dragstart_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.drop
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.durationchange_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.emptied
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.ended
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.error
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.focus
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.focusin_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.focusout_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.formdata
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenchange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenerror
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.gotpointercapture_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.input
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.invalid
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.keydown_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.keypress_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.keyup_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.load
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.loadeddata_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.loadedmetadata_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.loadstart_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.lostpointercapture_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mousedown_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseenter_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseleave_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mousemove_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseout_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseover_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mouseup_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.paste
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pause
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.play
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.playing
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointercancel_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerdown_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerenter_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerleave_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockchange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockerror
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointermove_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerout_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerover_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerup_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.progress
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.ratechange_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.readystatechange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.reset
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.resize
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.scroll
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.securitypolicyviolation
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.seeked
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.seeking
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.select
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.selectionchange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.selectstart
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.slotchange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.stalled
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.submit
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.suspend
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.timeupdate_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.toggle
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.touchcancel_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.touchend_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.touchmove_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.touchstart_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.transitioncancel_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.transitionend_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.transitionrun_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.transitionstart_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.visibilitychange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.volumechange_
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.waiting
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationend
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationiteration
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationstart
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkittransitionend
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventCreateEventMod {
  
  @JSImport("@testing-library/user-event/dist/types/event/createEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEvent_DOMContentLoaded(`type`: DOMContentLoaded, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_DOMContentLoaded(`type`: DOMContentLoaded, target: Element, init: EventTypeInit[DOMContentLoaded]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_abort(`type`: abort, target: Element): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  inline def createEvent_abort(`type`: abort, target: Element, init: EventTypeInit[abort]): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  
  inline def createEvent_animationcancel(`type`: animationcancel, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationcancel(`type`: animationcancel, target: Element, init: EventTypeInit[animationcancel]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_animationend(`type`: animationend_, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationend(`type`: animationend_, target: Element, init: EventTypeInit[animationend_]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_animationiteration(`type`: animationiteration_, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationiteration(`type`: animationiteration_, target: Element, init: EventTypeInit[animationiteration_]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_animationstart(`type`: animationstart_, target: Element): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  inline def createEvent_animationstart(`type`: animationstart_, target: Element, init: EventTypeInit[animationstart_]): AnimationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AnimationEvent]
  
  inline def createEvent_auxclick(`type`: auxclick, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_auxclick(`type`: auxclick, target: Element, init: EventTypeInit[auxclick]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_beforeinput(`type`: beforeinput_, target: Element): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  inline def createEvent_beforeinput(`type`: beforeinput_, target: Element, init: EventTypeInit[beforeinput_]): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  
  inline def createEvent_blur(`type`: blur, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_blur(`type`: blur, target: Element, init: EventTypeInit[blur]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_canplay(`type`: canplay_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_canplay(`type`: canplay_, target: Element, init: EventTypeInit[canplay_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_canplaythrough(`type`: canplaythrough_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_canplaythrough(`type`: canplaythrough_, target: Element, init: EventTypeInit[canplaythrough_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_change(`type`: change, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_change(`type`: change, target: Element, init: EventTypeInit[change]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_click(`type`: click, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_click(`type`: click, target: Element, init: EventTypeInit[click]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_close(`type`: close, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_close(`type`: close, target: Element, init: EventTypeInit[close]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_compositionend(`type`: compositionend_, target: Element): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  inline def createEvent_compositionend(`type`: compositionend_, target: Element, init: EventTypeInit[compositionend_]): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  
  inline def createEvent_compositionstart(`type`: compositionstart_, target: Element): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  inline def createEvent_compositionstart(`type`: compositionstart_, target: Element, init: EventTypeInit[compositionstart_]): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  
  inline def createEvent_compositionupdate(`type`: compositionupdate_, target: Element): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  inline def createEvent_compositionupdate(`type`: compositionupdate_, target: Element, init: EventTypeInit[compositionupdate_]): CompositionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[CompositionEvent]
  
  inline def createEvent_contextmenu(`type`: contextmenu_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_contextmenu(`type`: contextmenu_, target: Element, init: EventTypeInit[contextmenu_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_copy(`type`: copy, target: Element): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  inline def createEvent_copy(`type`: copy, target: Element, init: EventTypeInit[copy]): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  
  inline def createEvent_cuechange(`type`: cuechange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_cuechange(`type`: cuechange, target: Element, init: EventTypeInit[cuechange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_cut(`type`: cut, target: Element): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  inline def createEvent_cut(`type`: cut, target: Element, init: EventTypeInit[cut]): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  
  inline def createEvent_dblclick(`type`: dblclick_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_dblclick(`type`: dblclick_, target: Element, init: EventTypeInit[dblclick_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_drag(`type`: drag, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_drag(`type`: drag, target: Element, init: EventTypeInit[drag]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragend(`type`: dragend_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragend(`type`: dragend_, target: Element, init: EventTypeInit[dragend_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragenter(`type`: dragenter_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragenter(`type`: dragenter_, target: Element, init: EventTypeInit[dragenter_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragleave(`type`: dragleave_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragleave(`type`: dragleave_, target: Element, init: EventTypeInit[dragleave_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragover(`type`: dragover_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragover(`type`: dragover_, target: Element, init: EventTypeInit[dragover_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_dragstart(`type`: dragstart_, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_dragstart(`type`: dragstart_, target: Element, init: EventTypeInit[dragstart_]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_drop(`type`: drop, target: Element): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  inline def createEvent_drop(`type`: drop, target: Element, init: EventTypeInit[drop]): DragEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[DragEvent]
  
  inline def createEvent_durationchange(`type`: durationchange_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_durationchange(`type`: durationchange_, target: Element, init: EventTypeInit[durationchange_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_emptied(`type`: emptied, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_emptied(`type`: emptied, target: Element, init: EventTypeInit[emptied]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_ended(`type`: ended, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_ended(`type`: ended, target: Element, init: EventTypeInit[ended]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_error(`type`: error, target: Element): ErrorEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ErrorEvent]
  inline def createEvent_error(`type`: error, target: Element, init: EventTypeInit[error]): ErrorEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ErrorEvent]
  
  inline def createEvent_focus(`type`: focus, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_focus(`type`: focus, target: Element, init: EventTypeInit[focus]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_focusin(`type`: focusin_, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_focusin(`type`: focusin_, target: Element, init: EventTypeInit[focusin_]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_focusout(`type`: focusout_, target: Element): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  inline def createEvent_focusout(`type`: focusout_, target: Element, init: EventTypeInit[focusout_]): FocusEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FocusEvent]
  
  inline def createEvent_formdata(`type`: formdata, target: Element): FormDataEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[FormDataEvent]
  inline def createEvent_formdata(`type`: formdata, target: Element, init: EventTypeInit[formdata]): FormDataEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[FormDataEvent]
  
  inline def createEvent_fullscreenchange(`type`: fullscreenchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_fullscreenchange(`type`: fullscreenchange, target: Element, init: EventTypeInit[fullscreenchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_fullscreenerror(`type`: fullscreenerror, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_fullscreenerror(`type`: fullscreenerror, target: Element, init: EventTypeInit[fullscreenerror]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_gotpointercapture(`type`: gotpointercapture_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_gotpointercapture(`type`: gotpointercapture_, target: Element, init: EventTypeInit[gotpointercapture_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_input(`type`: input, target: Element): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  inline def createEvent_input(`type`: input, target: Element, init: EventTypeInit[input]): InputEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[InputEvent]
  
  inline def createEvent_invalid(`type`: invalid, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_invalid(`type`: invalid, target: Element, init: EventTypeInit[invalid]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_keydown(`type`: keydown_, target: Element): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  inline def createEvent_keydown(`type`: keydown_, target: Element, init: EventTypeInit[keydown_]): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  
  inline def createEvent_keypress(`type`: keypress_, target: Element): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  inline def createEvent_keypress(`type`: keypress_, target: Element, init: EventTypeInit[keypress_]): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  
  inline def createEvent_keyup(`type`: keyup_, target: Element): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  inline def createEvent_keyup(`type`: keyup_, target: Element, init: EventTypeInit[keyup_]): KeyboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[KeyboardEvent]
  
  inline def createEvent_load(`type`: load, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_load(`type`: load, target: Element, init: EventTypeInit[load]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_loadeddata(`type`: loadeddata_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_loadeddata(`type`: loadeddata_, target: Element, init: EventTypeInit[loadeddata_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_loadedmetadata(`type`: loadedmetadata_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_loadedmetadata(`type`: loadedmetadata_, target: Element, init: EventTypeInit[loadedmetadata_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_loadstart(`type`: loadstart_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_loadstart(`type`: loadstart_, target: Element, init: EventTypeInit[loadstart_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_lostpointercapture(`type`: lostpointercapture_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_lostpointercapture(`type`: lostpointercapture_, target: Element, init: EventTypeInit[lostpointercapture_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_mousedown(`type`: mousedown_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mousedown(`type`: mousedown_, target: Element, init: EventTypeInit[mousedown_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseenter(`type`: mouseenter_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseenter(`type`: mouseenter_, target: Element, init: EventTypeInit[mouseenter_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseleave(`type`: mouseleave_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseleave(`type`: mouseleave_, target: Element, init: EventTypeInit[mouseleave_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mousemove(`type`: mousemove_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mousemove(`type`: mousemove_, target: Element, init: EventTypeInit[mousemove_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseout(`type`: mouseout_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseout(`type`: mouseout_, target: Element, init: EventTypeInit[mouseout_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseover(`type`: mouseover_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseover(`type`: mouseover_, target: Element, init: EventTypeInit[mouseover_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_mouseup(`type`: mouseup_, target: Element): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  inline def createEvent_mouseup(`type`: mouseup_, target: Element, init: EventTypeInit[mouseup_]): MouseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[MouseEvent]
  
  inline def createEvent_paste(`type`: paste, target: Element): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  inline def createEvent_paste(`type`: paste, target: Element, init: EventTypeInit[paste]): ClipboardEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ClipboardEvent]
  
  inline def createEvent_pause(`type`: pause, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_pause(`type`: pause, target: Element, init: EventTypeInit[pause]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_play(`type`: play, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_play(`type`: play, target: Element, init: EventTypeInit[play]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_playing(`type`: playing, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_playing(`type`: playing, target: Element, init: EventTypeInit[playing]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_pointercancel(`type`: pointercancel_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointercancel(`type`: pointercancel_, target: Element, init: EventTypeInit[pointercancel_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerdown(`type`: pointerdown_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerdown(`type`: pointerdown_, target: Element, init: EventTypeInit[pointerdown_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerenter(`type`: pointerenter_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerenter(`type`: pointerenter_, target: Element, init: EventTypeInit[pointerenter_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerleave(`type`: pointerleave_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerleave(`type`: pointerleave_, target: Element, init: EventTypeInit[pointerleave_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerlockchange(`type`: pointerlockchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_pointerlockchange(`type`: pointerlockchange, target: Element, init: EventTypeInit[pointerlockchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_pointerlockerror(`type`: pointerlockerror, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_pointerlockerror(`type`: pointerlockerror, target: Element, init: EventTypeInit[pointerlockerror]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_pointermove(`type`: pointermove_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointermove(`type`: pointermove_, target: Element, init: EventTypeInit[pointermove_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerout(`type`: pointerout_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerout(`type`: pointerout_, target: Element, init: EventTypeInit[pointerout_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerover(`type`: pointerover_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerover(`type`: pointerover_, target: Element, init: EventTypeInit[pointerover_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_pointerup(`type`: pointerup_, target: Element): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  inline def createEvent_pointerup(`type`: pointerup_, target: Element, init: EventTypeInit[pointerup_]): PointerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[PointerEvent]
  
  inline def createEvent_progress(`type`: progress, target: Element): ProgressEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ProgressEvent]
  inline def createEvent_progress(`type`: progress, target: Element, init: EventTypeInit[progress]): ProgressEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[ProgressEvent]
  
  inline def createEvent_ratechange(`type`: ratechange_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_ratechange(`type`: ratechange_, target: Element, init: EventTypeInit[ratechange_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_readystatechange(`type`: readystatechange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_readystatechange(`type`: readystatechange, target: Element, init: EventTypeInit[readystatechange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_reset(`type`: reset, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_reset(`type`: reset, target: Element, init: EventTypeInit[reset]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_resize(`type`: resize, target: Element): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  inline def createEvent_resize(`type`: resize, target: Element, init: EventTypeInit[resize]): UIEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[UIEvent]
  
  inline def createEvent_scroll(`type`: scroll, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_scroll(`type`: scroll, target: Element, init: EventTypeInit[scroll]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_securitypolicyviolation(`type`: securitypolicyviolation, target: Element): SecurityPolicyViolationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[SecurityPolicyViolationEvent]
  inline def createEvent_securitypolicyviolation(`type`: securitypolicyviolation, target: Element, init: EventTypeInit[securitypolicyviolation]): SecurityPolicyViolationEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[SecurityPolicyViolationEvent]
  
  inline def createEvent_seeked(`type`: seeked, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_seeked(`type`: seeked, target: Element, init: EventTypeInit[seeked]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_seeking(`type`: seeking, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_seeking(`type`: seeking, target: Element, init: EventTypeInit[seeking]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_select(`type`: select, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_select(`type`: select, target: Element, init: EventTypeInit[select]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_selectionchange(`type`: selectionchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_selectionchange(`type`: selectionchange, target: Element, init: EventTypeInit[selectionchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_selectstart(`type`: selectstart, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_selectstart(`type`: selectstart, target: Element, init: EventTypeInit[selectstart]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_slotchange(`type`: slotchange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_slotchange(`type`: slotchange, target: Element, init: EventTypeInit[slotchange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_stalled(`type`: stalled, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_stalled(`type`: stalled, target: Element, init: EventTypeInit[stalled]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_submit(`type`: submit, target: Element): SubmitEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[SubmitEvent]
  inline def createEvent_submit(`type`: submit, target: Element, init: EventTypeInit[submit]): SubmitEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[SubmitEvent]
  
  inline def createEvent_suspend(`type`: suspend, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_suspend(`type`: suspend, target: Element, init: EventTypeInit[suspend]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_timeupdate(`type`: timeupdate_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_timeupdate(`type`: timeupdate_, target: Element, init: EventTypeInit[timeupdate_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_toggle(`type`: toggle, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_toggle(`type`: toggle, target: Element, init: EventTypeInit[toggle]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_touchcancel(`type`: touchcancel_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchcancel(`type`: touchcancel_, target: Element, init: EventTypeInit[touchcancel_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_touchend(`type`: touchend_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchend(`type`: touchend_, target: Element, init: EventTypeInit[touchend_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_touchmove(`type`: touchmove_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchmove(`type`: touchmove_, target: Element, init: EventTypeInit[touchmove_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_touchstart(`type`: touchstart_, target: Element): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  inline def createEvent_touchstart(`type`: touchstart_, target: Element, init: EventTypeInit[touchstart_]): TouchEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TouchEvent]
  
  inline def createEvent_transitioncancel(`type`: transitioncancel_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitioncancel(`type`: transitioncancel_, target: Element, init: EventTypeInit[transitioncancel_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_transitionend(`type`: transitionend_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitionend(`type`: transitionend_, target: Element, init: EventTypeInit[transitionend_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_transitionrun(`type`: transitionrun_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitionrun(`type`: transitionrun_, target: Element, init: EventTypeInit[transitionrun_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_transitionstart(`type`: transitionstart_, target: Element): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  inline def createEvent_transitionstart(`type`: transitionstart_, target: Element, init: EventTypeInit[transitionstart_]): TransitionEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[TransitionEvent]
  
  inline def createEvent_visibilitychange(`type`: visibilitychange, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_visibilitychange(`type`: visibilitychange, target: Element, init: EventTypeInit[visibilitychange]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_volumechange(`type`: volumechange_, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_volumechange(`type`: volumechange_, target: Element, init: EventTypeInit[volumechange_]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_waiting(`type`: waiting, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_waiting(`type`: waiting, target: Element, init: EventTypeInit[waiting]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkitanimationend(`type`: webkitanimationend, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkitanimationend(`type`: webkitanimationend, target: Element, init: EventTypeInit[webkitanimationend]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkitanimationiteration(`type`: webkitanimationiteration, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkitanimationiteration(`type`: webkitanimationiteration, target: Element, init: EventTypeInit[webkitanimationiteration]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkitanimationstart(`type`: webkitanimationstart, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkitanimationstart(`type`: webkitanimationstart, target: Element, init: EventTypeInit[webkitanimationstart]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_webkittransitionend(`type`: webkittransitionend, target: Element): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def createEvent_webkittransitionend(`type`: webkittransitionend, target: Element, init: EventTypeInit[webkittransitionend]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def createEvent_wheel(`type`: wheel, target: Element): WheelEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[WheelEvent]
  inline def createEvent_wheel(`type`: wheel, target: Element, init: EventTypeInit[wheel]): WheelEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(`type`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[WheelEvent]
}
