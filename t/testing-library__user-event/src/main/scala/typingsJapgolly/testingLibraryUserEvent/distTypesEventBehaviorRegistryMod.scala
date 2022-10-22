package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.testingLibraryUserEvent.distTypesEventTypesMod.EventType
import typingsJapgolly.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
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

object distTypesEventBehaviorRegistryMod {
  
  /* Inlined {[ Type in @testing-library/user-event.@testing-library/user-event/dist/types/event/types.EventType ]:? @testing-library/user-event.@testing-library/user-event/dist/types/event/behavior/registry.BehaviorPlugin<Type>} */
  object behavior {
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.DOMContentLoaded")
    @js.native
    def DOMContentLoaded: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.DOMContentLoaded
        ]
      ] = js.native
    inline def DOMContentLoaded_=(x: js.UndefOr[BehaviorPlugin[DOMContentLoaded]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMContentLoaded")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.abort")
    @js.native
    def abort: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.abort]
      ] = js.native
    inline def abort_=(x: js.UndefOr[BehaviorPlugin[abort]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abort")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.animationcancel")
    @js.native
    def animationcancel: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.animationcancel
        ]
      ] = js.native
    inline def animationcancel_=(x: js.UndefOr[BehaviorPlugin[animationcancel]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationcancel")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.animationend")
    @js.native
    def animationend: js.UndefOr[BehaviorPlugin[animationend_]] = js.native
    inline def animationend_=(x: js.UndefOr[BehaviorPlugin[animationend_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.animationiteration")
    @js.native
    def animationiteration: js.UndefOr[BehaviorPlugin[animationiteration_]] = js.native
    inline def animationiteration_=(x: js.UndefOr[BehaviorPlugin[animationiteration_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationiteration")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.animationstart")
    @js.native
    def animationstart: js.UndefOr[BehaviorPlugin[animationstart_]] = js.native
    inline def animationstart_=(x: js.UndefOr[BehaviorPlugin[animationstart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.auxclick")
    @js.native
    def auxclick: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.auxclick]
      ] = js.native
    inline def auxclick_=(x: js.UndefOr[BehaviorPlugin[auxclick]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auxclick")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.beforeinput")
    @js.native
    def beforeinput: js.UndefOr[BehaviorPlugin[beforeinput_]] = js.native
    inline def beforeinput_=(x: js.UndefOr[BehaviorPlugin[beforeinput_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeinput")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.blur")
    @js.native
    def blur: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.blur]
      ] = js.native
    inline def blur_=(x: js.UndefOr[BehaviorPlugin[blur]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.canplay")
    @js.native
    def canplay: js.UndefOr[BehaviorPlugin[canplay_]] = js.native
    inline def canplay_=(x: js.UndefOr[BehaviorPlugin[canplay_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canplay")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.canplaythrough")
    @js.native
    def canplaythrough: js.UndefOr[BehaviorPlugin[canplaythrough_]] = js.native
    inline def canplaythrough_=(x: js.UndefOr[BehaviorPlugin[canplaythrough_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canplaythrough")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.change")
    @js.native
    def change: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.change]
      ] = js.native
    inline def change_=(x: js.UndefOr[BehaviorPlugin[change]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("change")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.click")
    @js.native
    def click: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.click]
      ] = js.native
    inline def click_=(x: js.UndefOr[BehaviorPlugin[click]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("click")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.close")
    @js.native
    def close: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.close]
      ] = js.native
    inline def close_=(x: js.UndefOr[BehaviorPlugin[close]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.compositionend")
    @js.native
    def compositionend: js.UndefOr[BehaviorPlugin[compositionend_]] = js.native
    inline def compositionend_=(x: js.UndefOr[BehaviorPlugin[compositionend_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compositionend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.compositionstart")
    @js.native
    def compositionstart: js.UndefOr[BehaviorPlugin[compositionstart_]] = js.native
    inline def compositionstart_=(x: js.UndefOr[BehaviorPlugin[compositionstart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compositionstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.compositionupdate")
    @js.native
    def compositionupdate: js.UndefOr[BehaviorPlugin[compositionupdate_]] = js.native
    inline def compositionupdate_=(x: js.UndefOr[BehaviorPlugin[compositionupdate_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compositionupdate")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.contextmenu")
    @js.native
    def contextmenu: js.UndefOr[BehaviorPlugin[contextmenu_]] = js.native
    inline def contextmenu_=(x: js.UndefOr[BehaviorPlugin[contextmenu_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.copy")
    @js.native
    def copy: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.copy]
      ] = js.native
    inline def copy_=(x: js.UndefOr[BehaviorPlugin[copy]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copy")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.cuechange")
    @js.native
    def cuechange: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.cuechange]
      ] = js.native
    inline def cuechange_=(x: js.UndefOr[BehaviorPlugin[cuechange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cuechange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.cut")
    @js.native
    def cut: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.cut]
      ] = js.native
    inline def cut_=(x: js.UndefOr[BehaviorPlugin[cut]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cut")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.dblclick")
    @js.native
    def dblclick: js.UndefOr[BehaviorPlugin[dblclick_]] = js.native
    inline def dblclick_=(x: js.UndefOr[BehaviorPlugin[dblclick_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.drag")
    @js.native
    def drag: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.drag]
      ] = js.native
    inline def drag_=(x: js.UndefOr[BehaviorPlugin[drag]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drag")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.dragend")
    @js.native
    def dragend: js.UndefOr[BehaviorPlugin[dragend_]] = js.native
    inline def dragend_=(x: js.UndefOr[BehaviorPlugin[dragend_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.dragenter")
    @js.native
    def dragenter: js.UndefOr[BehaviorPlugin[dragenter_]] = js.native
    inline def dragenter_=(x: js.UndefOr[BehaviorPlugin[dragenter_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.dragleave")
    @js.native
    def dragleave: js.UndefOr[BehaviorPlugin[dragleave_]] = js.native
    inline def dragleave_=(x: js.UndefOr[BehaviorPlugin[dragleave_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.dragover")
    @js.native
    def dragover: js.UndefOr[BehaviorPlugin[dragover_]] = js.native
    inline def dragover_=(x: js.UndefOr[BehaviorPlugin[dragover_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragover")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.dragstart")
    @js.native
    def dragstart: js.UndefOr[BehaviorPlugin[dragstart_]] = js.native
    inline def dragstart_=(x: js.UndefOr[BehaviorPlugin[dragstart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.drop")
    @js.native
    def drop: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.drop]
      ] = js.native
    inline def drop_=(x: js.UndefOr[BehaviorPlugin[drop]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.durationchange")
    @js.native
    def durationchange: js.UndefOr[BehaviorPlugin[durationchange_]] = js.native
    inline def durationchange_=(x: js.UndefOr[BehaviorPlugin[durationchange_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("durationchange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.emptied")
    @js.native
    def emptied: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.emptied]
      ] = js.native
    inline def emptied_=(x: js.UndefOr[BehaviorPlugin[emptied]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptied")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.ended")
    @js.native
    def ended: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.ended]
      ] = js.native
    inline def ended_=(x: js.UndefOr[BehaviorPlugin[ended]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ended")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.error")
    @js.native
    def error: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.error]
      ] = js.native
    inline def error_=(x: js.UndefOr[BehaviorPlugin[error]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.focus")
    @js.native
    def focus: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.focus]
      ] = js.native
    inline def focus_=(x: js.UndefOr[BehaviorPlugin[focus]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focus")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.focusin")
    @js.native
    def focusin: js.UndefOr[BehaviorPlugin[focusin_]] = js.native
    inline def focusin_=(x: js.UndefOr[BehaviorPlugin[focusin_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusin")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.focusout")
    @js.native
    def focusout: js.UndefOr[BehaviorPlugin[focusout_]] = js.native
    inline def focusout_=(x: js.UndefOr[BehaviorPlugin[focusout_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusout")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.formdata")
    @js.native
    def formdata: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.formdata]
      ] = js.native
    inline def formdata_=(x: js.UndefOr[BehaviorPlugin[formdata]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formdata")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.fullscreenchange")
    @js.native
    def fullscreenchange: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenchange
        ]
      ] = js.native
    inline def fullscreenchange_=(x: js.UndefOr[BehaviorPlugin[fullscreenchange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreenchange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.fullscreenerror")
    @js.native
    def fullscreenerror: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenerror
        ]
      ] = js.native
    inline def fullscreenerror_=(x: js.UndefOr[BehaviorPlugin[fullscreenerror]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreenerror")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.gotpointercapture")
    @js.native
    def gotpointercapture: js.UndefOr[BehaviorPlugin[gotpointercapture_]] = js.native
    inline def gotpointercapture_=(x: js.UndefOr[BehaviorPlugin[gotpointercapture_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gotpointercapture")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.input")
    @js.native
    def input: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.input]
      ] = js.native
    inline def input_=(x: js.UndefOr[BehaviorPlugin[input]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.invalid")
    @js.native
    def invalid: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.invalid]
      ] = js.native
    inline def invalid_=(x: js.UndefOr[BehaviorPlugin[invalid]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.keydown")
    @js.native
    def keydown: js.UndefOr[BehaviorPlugin[keydown_]] = js.native
    inline def keydown_=(x: js.UndefOr[BehaviorPlugin[keydown_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keydown")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.keypress")
    @js.native
    def keypress: js.UndefOr[BehaviorPlugin[keypress_]] = js.native
    inline def keypress_=(x: js.UndefOr[BehaviorPlugin[keypress_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keypress")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.keyup")
    @js.native
    def keyup: js.UndefOr[BehaviorPlugin[keyup_]] = js.native
    inline def keyup_=(x: js.UndefOr[BehaviorPlugin[keyup_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyup")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.load")
    @js.native
    def load: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.load]
      ] = js.native
    inline def load_=(x: js.UndefOr[BehaviorPlugin[load]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("load")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.loadeddata")
    @js.native
    def loadeddata: js.UndefOr[BehaviorPlugin[loadeddata_]] = js.native
    inline def loadeddata_=(x: js.UndefOr[BehaviorPlugin[loadeddata_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadeddata")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.loadedmetadata")
    @js.native
    def loadedmetadata: js.UndefOr[BehaviorPlugin[loadedmetadata_]] = js.native
    inline def loadedmetadata_=(x: js.UndefOr[BehaviorPlugin[loadedmetadata_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadedmetadata")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.loadstart")
    @js.native
    def loadstart: js.UndefOr[BehaviorPlugin[loadstart_]] = js.native
    inline def loadstart_=(x: js.UndefOr[BehaviorPlugin[loadstart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.lostpointercapture")
    @js.native
    def lostpointercapture: js.UndefOr[BehaviorPlugin[lostpointercapture_]] = js.native
    inline def lostpointercapture_=(x: js.UndefOr[BehaviorPlugin[lostpointercapture_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lostpointercapture")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mousedown")
    @js.native
    def mousedown: js.UndefOr[BehaviorPlugin[mousedown_]] = js.native
    inline def mousedown_=(x: js.UndefOr[BehaviorPlugin[mousedown_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mouseenter")
    @js.native
    def mouseenter: js.UndefOr[BehaviorPlugin[mouseenter_]] = js.native
    inline def mouseenter_=(x: js.UndefOr[BehaviorPlugin[mouseenter_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mouseleave")
    @js.native
    def mouseleave: js.UndefOr[BehaviorPlugin[mouseleave_]] = js.native
    inline def mouseleave_=(x: js.UndefOr[BehaviorPlugin[mouseleave_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mousemove")
    @js.native
    def mousemove: js.UndefOr[BehaviorPlugin[mousemove_]] = js.native
    inline def mousemove_=(x: js.UndefOr[BehaviorPlugin[mousemove_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mouseout")
    @js.native
    def mouseout: js.UndefOr[BehaviorPlugin[mouseout_]] = js.native
    inline def mouseout_=(x: js.UndefOr[BehaviorPlugin[mouseout_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseout")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mouseover")
    @js.native
    def mouseover: js.UndefOr[BehaviorPlugin[mouseover_]] = js.native
    inline def mouseover_=(x: js.UndefOr[BehaviorPlugin[mouseover_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseover")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.mouseup")
    @js.native
    def mouseup: js.UndefOr[BehaviorPlugin[mouseup_]] = js.native
    inline def mouseup_=(x: js.UndefOr[BehaviorPlugin[mouseup_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.paste")
    @js.native
    def paste: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.paste]
      ] = js.native
    inline def paste_=(x: js.UndefOr[BehaviorPlugin[paste]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paste")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pause")
    @js.native
    def pause: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pause]
      ] = js.native
    inline def pause_=(x: js.UndefOr[BehaviorPlugin[pause]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pause")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.play")
    @js.native
    def play: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.play]
      ] = js.native
    inline def play_=(x: js.UndefOr[BehaviorPlugin[play]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("play")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.playing")
    @js.native
    def playing: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.playing]
      ] = js.native
    inline def playing_=(x: js.UndefOr[BehaviorPlugin[playing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playing")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointercancel")
    @js.native
    def pointercancel: js.UndefOr[BehaviorPlugin[pointercancel_]] = js.native
    inline def pointercancel_=(x: js.UndefOr[BehaviorPlugin[pointercancel_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointercancel")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerdown")
    @js.native
    def pointerdown: js.UndefOr[BehaviorPlugin[pointerdown_]] = js.native
    inline def pointerdown_=(x: js.UndefOr[BehaviorPlugin[pointerdown_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerdown")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerenter")
    @js.native
    def pointerenter: js.UndefOr[BehaviorPlugin[pointerenter_]] = js.native
    inline def pointerenter_=(x: js.UndefOr[BehaviorPlugin[pointerenter_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerenter")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerleave")
    @js.native
    def pointerleave: js.UndefOr[BehaviorPlugin[pointerleave_]] = js.native
    inline def pointerleave_=(x: js.UndefOr[BehaviorPlugin[pointerleave_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerleave")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerlockchange")
    @js.native
    def pointerlockchange: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockchange
        ]
      ] = js.native
    inline def pointerlockchange_=(x: js.UndefOr[BehaviorPlugin[pointerlockchange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerlockchange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerlockerror")
    @js.native
    def pointerlockerror: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockerror
        ]
      ] = js.native
    inline def pointerlockerror_=(x: js.UndefOr[BehaviorPlugin[pointerlockerror]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerlockerror")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointermove")
    @js.native
    def pointermove: js.UndefOr[BehaviorPlugin[pointermove_]] = js.native
    inline def pointermove_=(x: js.UndefOr[BehaviorPlugin[pointermove_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointermove")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerout")
    @js.native
    def pointerout: js.UndefOr[BehaviorPlugin[pointerout_]] = js.native
    inline def pointerout_=(x: js.UndefOr[BehaviorPlugin[pointerout_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerout")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerover")
    @js.native
    def pointerover: js.UndefOr[BehaviorPlugin[pointerover_]] = js.native
    inline def pointerover_=(x: js.UndefOr[BehaviorPlugin[pointerover_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerover")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.pointerup")
    @js.native
    def pointerup: js.UndefOr[BehaviorPlugin[pointerup_]] = js.native
    inline def pointerup_=(x: js.UndefOr[BehaviorPlugin[pointerup_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerup")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.progress")
    @js.native
    def progress: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.progress]
      ] = js.native
    inline def progress_=(x: js.UndefOr[BehaviorPlugin[progress]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progress")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.ratechange")
    @js.native
    def ratechange: js.UndefOr[BehaviorPlugin[ratechange_]] = js.native
    inline def ratechange_=(x: js.UndefOr[BehaviorPlugin[ratechange_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ratechange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.readystatechange")
    @js.native
    def readystatechange: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.readystatechange
        ]
      ] = js.native
    inline def readystatechange_=(x: js.UndefOr[BehaviorPlugin[readystatechange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readystatechange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.reset")
    @js.native
    def reset: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.reset]
      ] = js.native
    inline def reset_=(x: js.UndefOr[BehaviorPlugin[reset]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.resize")
    @js.native
    def resize: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.resize]
      ] = js.native
    inline def resize_=(x: js.UndefOr[BehaviorPlugin[resize]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resize")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.scroll")
    @js.native
    def scroll: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.scroll]
      ] = js.native
    inline def scroll_=(x: js.UndefOr[BehaviorPlugin[scroll]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scroll")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.securitypolicyviolation")
    @js.native
    def securitypolicyviolation: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.securitypolicyviolation
        ]
      ] = js.native
    inline def securitypolicyviolation_=(x: js.UndefOr[BehaviorPlugin[securitypolicyviolation]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("securitypolicyviolation")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.seeked")
    @js.native
    def seeked: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.seeked]
      ] = js.native
    inline def seeked_=(x: js.UndefOr[BehaviorPlugin[seeked]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seeked")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.seeking")
    @js.native
    def seeking: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.seeking]
      ] = js.native
    inline def seeking_=(x: js.UndefOr[BehaviorPlugin[seeking]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seeking")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.select")
    @js.native
    def select: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.select]
      ] = js.native
    inline def select_=(x: js.UndefOr[BehaviorPlugin[select]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.selectionchange")
    @js.native
    def selectionchange: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.selectionchange
        ]
      ] = js.native
    inline def selectionchange_=(x: js.UndefOr[BehaviorPlugin[selectionchange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionchange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.selectstart")
    @js.native
    def selectstart: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.selectstart
        ]
      ] = js.native
    inline def selectstart_=(x: js.UndefOr[BehaviorPlugin[selectstart]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.slotchange")
    @js.native
    def slotchange: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.slotchange
        ]
      ] = js.native
    inline def slotchange_=(x: js.UndefOr[BehaviorPlugin[slotchange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slotchange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.stalled")
    @js.native
    def stalled: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.stalled]
      ] = js.native
    inline def stalled_=(x: js.UndefOr[BehaviorPlugin[stalled]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stalled")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.submit")
    @js.native
    def submit: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.submit]
      ] = js.native
    inline def submit_=(x: js.UndefOr[BehaviorPlugin[submit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("submit")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.suspend")
    @js.native
    def suspend: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.suspend]
      ] = js.native
    inline def suspend_=(x: js.UndefOr[BehaviorPlugin[suspend]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suspend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.timeupdate")
    @js.native
    def timeupdate: js.UndefOr[BehaviorPlugin[timeupdate_]] = js.native
    inline def timeupdate_=(x: js.UndefOr[BehaviorPlugin[timeupdate_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeupdate")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.toggle")
    @js.native
    def toggle: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.toggle]
      ] = js.native
    inline def toggle_=(x: js.UndefOr[BehaviorPlugin[toggle]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggle")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.touchcancel")
    @js.native
    def touchcancel: js.UndefOr[BehaviorPlugin[touchcancel_]] = js.native
    inline def touchcancel_=(x: js.UndefOr[BehaviorPlugin[touchcancel_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.touchend")
    @js.native
    def touchend: js.UndefOr[BehaviorPlugin[touchend_]] = js.native
    inline def touchend_=(x: js.UndefOr[BehaviorPlugin[touchend_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.touchmove")
    @js.native
    def touchmove: js.UndefOr[BehaviorPlugin[touchmove_]] = js.native
    inline def touchmove_=(x: js.UndefOr[BehaviorPlugin[touchmove_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.touchstart")
    @js.native
    def touchstart: js.UndefOr[BehaviorPlugin[touchstart_]] = js.native
    inline def touchstart_=(x: js.UndefOr[BehaviorPlugin[touchstart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.transitioncancel")
    @js.native
    def transitioncancel: js.UndefOr[BehaviorPlugin[transitioncancel_]] = js.native
    inline def transitioncancel_=(x: js.UndefOr[BehaviorPlugin[transitioncancel_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitioncancel")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.transitionend")
    @js.native
    def transitionend: js.UndefOr[BehaviorPlugin[transitionend_]] = js.native
    inline def transitionend_=(x: js.UndefOr[BehaviorPlugin[transitionend_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.transitionrun")
    @js.native
    def transitionrun: js.UndefOr[BehaviorPlugin[transitionrun_]] = js.native
    inline def transitionrun_=(x: js.UndefOr[BehaviorPlugin[transitionrun_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionrun")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.transitionstart")
    @js.native
    def transitionstart: js.UndefOr[BehaviorPlugin[transitionstart_]] = js.native
    inline def transitionstart_=(x: js.UndefOr[BehaviorPlugin[transitionstart_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.visibilitychange")
    @js.native
    def visibilitychange: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.visibilitychange
        ]
      ] = js.native
    inline def visibilitychange_=(x: js.UndefOr[BehaviorPlugin[visibilitychange]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visibilitychange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.volumechange")
    @js.native
    def volumechange: js.UndefOr[BehaviorPlugin[volumechange_]] = js.native
    inline def volumechange_=(x: js.UndefOr[BehaviorPlugin[volumechange_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volumechange")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.waiting")
    @js.native
    def waiting: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.waiting]
      ] = js.native
    inline def waiting_=(x: js.UndefOr[BehaviorPlugin[waiting]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waiting")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.webkitanimationend")
    @js.native
    def webkitanimationend: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationend
        ]
      ] = js.native
    inline def webkitanimationend_=(x: js.UndefOr[BehaviorPlugin[webkitanimationend]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webkitanimationend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.webkitanimationiteration")
    @js.native
    def webkitanimationiteration: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationiteration
        ]
      ] = js.native
    inline def webkitanimationiteration_=(x: js.UndefOr[BehaviorPlugin[webkitanimationiteration]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webkitanimationiteration")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.webkitanimationstart")
    @js.native
    def webkitanimationstart: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkitanimationstart
        ]
      ] = js.native
    inline def webkitanimationstart_=(x: js.UndefOr[BehaviorPlugin[webkitanimationstart]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webkitanimationstart")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.webkittransitionend")
    @js.native
    def webkittransitionend: js.UndefOr[
        BehaviorPlugin[
          typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.webkittransitionend
        ]
      ] = js.native
    inline def webkittransitionend_=(x: js.UndefOr[BehaviorPlugin[webkittransitionend]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("webkittransitionend")(x.asInstanceOf[js.Any])
    
    @JSImport("@testing-library/user-event/dist/types/event/behavior/registry", "behavior.wheel")
    @js.native
    def wheel: js.UndefOr[
        BehaviorPlugin[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.wheel]
      ] = js.native
    inline def wheel_=(x: js.UndefOr[BehaviorPlugin[wheel]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wheel")(x.asInstanceOf[js.Any])
  }
  
  type BehaviorPlugin[Type /* <: EventType */] = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: std.DocumentEventMap[Type] */ /* event */ js.Any, 
    /* target */ Element, 
    /* instance */ Instance, 
    (// eslint-disable-next-line @typescript-eslint/no-invalid-void-type
  Unit) | js.Function0[Unit]
  ]
}
