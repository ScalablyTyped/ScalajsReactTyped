package typingsJapgolly.materialBase

import org.scalajs.dom.Event
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialBase.materialBaseStrings.abort
import typingsJapgolly.materialBase.materialBaseStrings.animationcancel
import typingsJapgolly.materialBase.materialBaseStrings.animationend
import typingsJapgolly.materialBase.materialBaseStrings.animationiteration
import typingsJapgolly.materialBase.materialBaseStrings.animationstart
import typingsJapgolly.materialBase.materialBaseStrings.auxclick
import typingsJapgolly.materialBase.materialBaseStrings.beforeinput
import typingsJapgolly.materialBase.materialBaseStrings.blur
import typingsJapgolly.materialBase.materialBaseStrings.canplay
import typingsJapgolly.materialBase.materialBaseStrings.canplaythrough
import typingsJapgolly.materialBase.materialBaseStrings.change
import typingsJapgolly.materialBase.materialBaseStrings.click
import typingsJapgolly.materialBase.materialBaseStrings.close
import typingsJapgolly.materialBase.materialBaseStrings.compositionend
import typingsJapgolly.materialBase.materialBaseStrings.compositionstart
import typingsJapgolly.materialBase.materialBaseStrings.compositionupdate
import typingsJapgolly.materialBase.materialBaseStrings.contextmenu
import typingsJapgolly.materialBase.materialBaseStrings.cuechange
import typingsJapgolly.materialBase.materialBaseStrings.dblclick
import typingsJapgolly.materialBase.materialBaseStrings.drag
import typingsJapgolly.materialBase.materialBaseStrings.dragend
import typingsJapgolly.materialBase.materialBaseStrings.dragenter
import typingsJapgolly.materialBase.materialBaseStrings.dragleave
import typingsJapgolly.materialBase.materialBaseStrings.dragover
import typingsJapgolly.materialBase.materialBaseStrings.dragstart
import typingsJapgolly.materialBase.materialBaseStrings.drop
import typingsJapgolly.materialBase.materialBaseStrings.durationchange
import typingsJapgolly.materialBase.materialBaseStrings.emptied
import typingsJapgolly.materialBase.materialBaseStrings.ended
import typingsJapgolly.materialBase.materialBaseStrings.error
import typingsJapgolly.materialBase.materialBaseStrings.focus
import typingsJapgolly.materialBase.materialBaseStrings.focusin
import typingsJapgolly.materialBase.materialBaseStrings.focusout
import typingsJapgolly.materialBase.materialBaseStrings.formdata
import typingsJapgolly.materialBase.materialBaseStrings.gotpointercapture
import typingsJapgolly.materialBase.materialBaseStrings.input
import typingsJapgolly.materialBase.materialBaseStrings.invalid
import typingsJapgolly.materialBase.materialBaseStrings.keydown
import typingsJapgolly.materialBase.materialBaseStrings.keypress
import typingsJapgolly.materialBase.materialBaseStrings.keyup
import typingsJapgolly.materialBase.materialBaseStrings.load
import typingsJapgolly.materialBase.materialBaseStrings.loadeddata
import typingsJapgolly.materialBase.materialBaseStrings.loadedmetadata
import typingsJapgolly.materialBase.materialBaseStrings.loadstart
import typingsJapgolly.materialBase.materialBaseStrings.lostpointercapture
import typingsJapgolly.materialBase.materialBaseStrings.mousedown
import typingsJapgolly.materialBase.materialBaseStrings.mouseenter
import typingsJapgolly.materialBase.materialBaseStrings.mouseleave
import typingsJapgolly.materialBase.materialBaseStrings.mousemove
import typingsJapgolly.materialBase.materialBaseStrings.mouseout
import typingsJapgolly.materialBase.materialBaseStrings.mouseover
import typingsJapgolly.materialBase.materialBaseStrings.mouseup
import typingsJapgolly.materialBase.materialBaseStrings.pause
import typingsJapgolly.materialBase.materialBaseStrings.play
import typingsJapgolly.materialBase.materialBaseStrings.playing
import typingsJapgolly.materialBase.materialBaseStrings.pointercancel
import typingsJapgolly.materialBase.materialBaseStrings.pointerdown
import typingsJapgolly.materialBase.materialBaseStrings.pointerenter
import typingsJapgolly.materialBase.materialBaseStrings.pointerleave
import typingsJapgolly.materialBase.materialBaseStrings.pointermove
import typingsJapgolly.materialBase.materialBaseStrings.pointerout
import typingsJapgolly.materialBase.materialBaseStrings.pointerover
import typingsJapgolly.materialBase.materialBaseStrings.pointerup
import typingsJapgolly.materialBase.materialBaseStrings.progress
import typingsJapgolly.materialBase.materialBaseStrings.ratechange
import typingsJapgolly.materialBase.materialBaseStrings.reset
import typingsJapgolly.materialBase.materialBaseStrings.resize
import typingsJapgolly.materialBase.materialBaseStrings.scroll
import typingsJapgolly.materialBase.materialBaseStrings.securitypolicyviolation
import typingsJapgolly.materialBase.materialBaseStrings.seeked
import typingsJapgolly.materialBase.materialBaseStrings.seeking
import typingsJapgolly.materialBase.materialBaseStrings.select
import typingsJapgolly.materialBase.materialBaseStrings.selectionchange
import typingsJapgolly.materialBase.materialBaseStrings.selectstart
import typingsJapgolly.materialBase.materialBaseStrings.slotchange
import typingsJapgolly.materialBase.materialBaseStrings.stalled
import typingsJapgolly.materialBase.materialBaseStrings.submit
import typingsJapgolly.materialBase.materialBaseStrings.suspend
import typingsJapgolly.materialBase.materialBaseStrings.timeupdate
import typingsJapgolly.materialBase.materialBaseStrings.toggle
import typingsJapgolly.materialBase.materialBaseStrings.touchcancel
import typingsJapgolly.materialBase.materialBaseStrings.touchend
import typingsJapgolly.materialBase.materialBaseStrings.touchmove
import typingsJapgolly.materialBase.materialBaseStrings.touchstart
import typingsJapgolly.materialBase.materialBaseStrings.transitioncancel
import typingsJapgolly.materialBase.materialBaseStrings.transitionend
import typingsJapgolly.materialBase.materialBaseStrings.transitionrun
import typingsJapgolly.materialBase.materialBaseStrings.transitionstart
import typingsJapgolly.materialBase.materialBaseStrings.volumechange
import typingsJapgolly.materialBase.materialBaseStrings.waiting
import typingsJapgolly.materialBase.materialBaseStrings.webkitanimationend
import typingsJapgolly.materialBase.materialBaseStrings.webkitanimationiteration
import typingsJapgolly.materialBase.materialBaseStrings.webkitanimationstart
import typingsJapgolly.materialBase.materialBaseStrings.webkittransitionend
import typingsJapgolly.materialBase.materialBaseStrings.wheel
import typingsJapgolly.materialBase.typesMod.CustomEventListener
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/base/component", JSImport.Default)
  @js.native
  open class default[FoundationType /* <: MDCFoundation[js.Object] */] protected () extends MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: Any*) = this()
    def this(root: Element, foundation: Unit, args: Any*) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/base/component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCComponent[MDCFoundation[js.Object]]]
  }
  
  @JSImport("@material/base/component", "MDCComponent")
  @js.native
  open class MDCComponent[FoundationType /* <: MDCFoundation[js.Object] */] protected () extends StObject {
    def this(root: Element, foundation: FoundationType, args: Any*) = this()
    def this(root: Element, foundation: Unit, args: Any*) = this()
    
    def destroy(): Unit = js.native
    
    /**
      * Fires a cross-browser-compatible custom event from the component root of the given type, with the given data.
      */
    def emit[T /* <: js.Object */](evtType: String, evtData: T): Unit = js.native
    def emit[T /* <: js.Object */](evtType: String, evtData: T, shouldBubble: Boolean): Unit = js.native
    
    /* protected */ var foundation: FoundationType = js.native
    
    def getDefaultFoundation(): FoundationType = js.native
    
    def initialSyncWithDOM(): Unit = js.native
    
    def initialize(_args: Any*): Unit = js.native
    
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E]): Unit = js.native
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: Boolean): Unit = js.native
    def listen[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: AddEventListenerOptions): Unit = js.native
    /**
      * Wrapper method to add an event listener to the component's root element. This is most useful when
      * listening for custom events.
      */
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort]): Unit = js.native
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_abort(evtType: abort, handler: SpecificEventListener[abort], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel]): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationcancel(
      evtType: animationcancel,
      handler: SpecificEventListener[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationend(evtType: animationend, handler: SpecificEventListener[animationend]): Unit = js.native
    @JSName("listen")
    def listen_animationend(evtType: animationend, handler: SpecificEventListener[animationend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationend(
      evtType: animationend,
      handler: SpecificEventListener[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration]): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationiteration(
      evtType: animationiteration,
      handler: SpecificEventListener[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart]): Unit = js.native
    @JSName("listen")
    def listen_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_animationstart(
      evtType: animationstart,
      handler: SpecificEventListener[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick]): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput]): Unit = js.native
    @JSName("listen")
    def listen_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_beforeinput(
      evtType: beforeinput,
      handler: SpecificEventListener[beforeinput],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur]): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_blur(evtType: blur, handler: SpecificEventListener[blur], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay]): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough]): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_canplaythrough(
      evtType: canplaythrough,
      handler: SpecificEventListener[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change]): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_change(evtType: change, handler: SpecificEventListener[change], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click]): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_click(evtType: click, handler: SpecificEventListener[click], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close]): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_close(evtType: close, handler: SpecificEventListener[close], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend]): Unit = js.native
    @JSName("listen")
    def listen_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_compositionend(
      evtType: compositionend,
      handler: SpecificEventListener[compositionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart]): Unit = js.native
    @JSName("listen")
    def listen_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_compositionstart(
      evtType: compositionstart,
      handler: SpecificEventListener[compositionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate]): Unit = js.native
    @JSName("listen")
    def listen_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_compositionupdate(
      evtType: compositionupdate,
      handler: SpecificEventListener[compositionupdate],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu]): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_contextmenu(
      evtType: contextmenu,
      handler: SpecificEventListener[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange]): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick]): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag]): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_drag(evtType: drag, handler: SpecificEventListener[drag], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend]): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter]): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave]): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover]): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart]): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop]): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_drop(evtType: drop, handler: SpecificEventListener[drop], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange]): Unit = js.native
    @JSName("listen")
    def listen_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_durationchange(
      evtType: durationchange,
      handler: SpecificEventListener[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied]): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended]): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_ended(evtType: ended, handler: SpecificEventListener[ended], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error]): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_error(evtType: error, handler: SpecificEventListener[error], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus]): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focus(evtType: focus, handler: SpecificEventListener[focus], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin]): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout]): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_formdata(evtType: formdata, handler: SpecificEventListener[formdata]): Unit = js.native
    @JSName("listen")
    def listen_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture]): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_gotpointercapture(
      evtType: gotpointercapture,
      handler: SpecificEventListener[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input]): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_input(evtType: input, handler: SpecificEventListener[input], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid]): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown]): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress]): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup]): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load]): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_load(evtType: load, handler: SpecificEventListener[load], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata]): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata]): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadedmetadata(
      evtType: loadedmetadata,
      handler: SpecificEventListener[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart]): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture]): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_lostpointercapture(
      evtType: lostpointercapture,
      handler: SpecificEventListener[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown]): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter]): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave]): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove]): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout]): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover]): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup]): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause]): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pause(evtType: pause, handler: SpecificEventListener[pause], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play]): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_play(evtType: play, handler: SpecificEventListener[play], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing]): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_playing(evtType: playing, handler: SpecificEventListener[playing], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel]): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointercancel(
      evtType: pointercancel,
      handler: SpecificEventListener[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown]): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerdown(
      evtType: pointerdown,
      handler: SpecificEventListener[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter]): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerenter(
      evtType: pointerenter,
      handler: SpecificEventListener[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave]): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerleave(
      evtType: pointerleave,
      handler: SpecificEventListener[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove]): Unit = js.native
    @JSName("listen")
    def listen_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointermove(
      evtType: pointermove,
      handler: SpecificEventListener[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout]): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover]): Unit = js.native
    @JSName("listen")
    def listen_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerover(
      evtType: pointerover,
      handler: SpecificEventListener[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup]): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress]): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_progress(evtType: progress, handler: SpecificEventListener[progress], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange]): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset]): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_reset(evtType: reset, handler: SpecificEventListener[reset], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize]): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_resize(evtType: resize, handler: SpecificEventListener[resize], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll]): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(evtType: securitypolicyviolation, handler: SpecificEventListener[securitypolicyviolation]): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked]): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking]): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select]): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_select(evtType: select, handler: SpecificEventListener[select], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange]): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_selectionchange(
      evtType: selectionchange,
      handler: SpecificEventListener[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart]): Unit = js.native
    @JSName("listen")
    def listen_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_selectstart(
      evtType: selectstart,
      handler: SpecificEventListener[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange]): Unit = js.native
    @JSName("listen")
    def listen_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled]): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit]): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_submit(evtType: submit, handler: SpecificEventListener[submit], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend]): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate]): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle]): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel]): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchcancel(
      evtType: touchcancel,
      handler: SpecificEventListener[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend]): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove]): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart]): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel]): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitioncancel(
      evtType: transitioncancel,
      handler: SpecificEventListener[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend]): Unit = js.native
    @JSName("listen")
    def listen_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionend(
      evtType: transitionend,
      handler: SpecificEventListener[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun]): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionrun(
      evtType: transitionrun,
      handler: SpecificEventListener[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart]): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_transitionstart(
      evtType: transitionstart,
      handler: SpecificEventListener[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange]): Unit = js.native
    @JSName("listen")
    def listen_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_volumechange(
      evtType: volumechange,
      handler: SpecificEventListener[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting]): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: AddEventListenerOptions): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend]): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationend(
      evtType: webkitanimationend,
      handler: SpecificEventListener[webkitanimationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationiteration(evtType: webkitanimationiteration, handler: SpecificEventListener[webkitanimationiteration]): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationstart(evtType: webkitanimationstart, handler: SpecificEventListener[webkitanimationstart]): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_webkittransitionend(evtType: webkittransitionend, handler: SpecificEventListener[webkittransitionend]): Unit = js.native
    @JSName("listen")
    def listen_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: Boolean
    ): Unit = js.native
    @JSName("listen")
    def listen_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel]): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: Boolean): Unit = js.native
    @JSName("listen")
    def listen_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: AddEventListenerOptions): Unit = js.native
    
    var root: Element = js.native
    
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E]): Unit = js.native
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: Boolean): Unit = js.native
    def unlisten[E /* <: Event */](evtType: String, handler: CustomEventListener[E], options: AddEventListenerOptions): Unit = js.native
    /**
      * Wrapper method to remove an event listener to the component's root element. This is most useful when
      * unlistening for custom events.
      */
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort]): Unit = js.native
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_abort(evtType: abort, handler: SpecificEventListener[abort], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(evtType: animationcancel, handler: SpecificEventListener[animationcancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationcancel(
      evtType: animationcancel,
      handler: SpecificEventListener[animationcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(evtType: animationend, handler: SpecificEventListener[animationend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(evtType: animationend, handler: SpecificEventListener[animationend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationend(
      evtType: animationend,
      handler: SpecificEventListener[animationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(evtType: animationiteration, handler: SpecificEventListener[animationiteration], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationiteration(
      evtType: animationiteration,
      handler: SpecificEventListener[animationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(evtType: animationstart, handler: SpecificEventListener[animationstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_animationstart(
      evtType: animationstart,
      handler: SpecificEventListener[animationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick]): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_auxclick(evtType: auxclick, handler: SpecificEventListener[auxclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput]): Unit = js.native
    @JSName("unlisten")
    def unlisten_beforeinput(evtType: beforeinput, handler: SpecificEventListener[beforeinput], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_beforeinput(
      evtType: beforeinput,
      handler: SpecificEventListener[beforeinput],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur]): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_blur(evtType: blur, handler: SpecificEventListener[blur], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay]): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplay(evtType: canplay, handler: SpecificEventListener[canplay], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough]): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(evtType: canplaythrough, handler: SpecificEventListener[canplaythrough], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_canplaythrough(
      evtType: canplaythrough,
      handler: SpecificEventListener[canplaythrough],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change]): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_change(evtType: change, handler: SpecificEventListener[change], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click]): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_click(evtType: click, handler: SpecificEventListener[click], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close]): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_close(evtType: close, handler: SpecificEventListener[close], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionend(evtType: compositionend, handler: SpecificEventListener[compositionend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionend(
      evtType: compositionend,
      handler: SpecificEventListener[compositionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionstart(evtType: compositionstart, handler: SpecificEventListener[compositionstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionstart(
      evtType: compositionstart,
      handler: SpecificEventListener[compositionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate]): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionupdate(evtType: compositionupdate, handler: SpecificEventListener[compositionupdate], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_compositionupdate(
      evtType: compositionupdate,
      handler: SpecificEventListener[compositionupdate],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu]): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(evtType: contextmenu, handler: SpecificEventListener[contextmenu], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_contextmenu(
      evtType: contextmenu,
      handler: SpecificEventListener[contextmenu],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_cuechange(evtType: cuechange, handler: SpecificEventListener[cuechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dblclick(evtType: dblclick, handler: SpecificEventListener[dblclick], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag]): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_drag(evtType: drag, handler: SpecificEventListener[drag], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragend(evtType: dragend, handler: SpecificEventListener[dragend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragenter(evtType: dragenter, handler: SpecificEventListener[dragenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragleave(evtType: dragleave, handler: SpecificEventListener[dragleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragover(evtType: dragover, handler: SpecificEventListener[dragover], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_dragstart(evtType: dragstart, handler: SpecificEventListener[dragstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop]): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_drop(evtType: drop, handler: SpecificEventListener[drop], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(evtType: durationchange, handler: SpecificEventListener[durationchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_durationchange(
      evtType: durationchange,
      handler: SpecificEventListener[durationchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied]): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_emptied(evtType: emptied, handler: SpecificEventListener[emptied], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended]): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_ended(evtType: ended, handler: SpecificEventListener[ended], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error]): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_error(evtType: error, handler: SpecificEventListener[error], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focus(evtType: focus, handler: SpecificEventListener[focus], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusin(evtType: focusin, handler: SpecificEventListener[focusin], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_focusout(evtType: focusout, handler: SpecificEventListener[focusout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_formdata(evtType: formdata, handler: SpecificEventListener[formdata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_formdata(evtType: formdata, handler: SpecificEventListener[formdata], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture]): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(evtType: gotpointercapture, handler: SpecificEventListener[gotpointercapture], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_gotpointercapture(
      evtType: gotpointercapture,
      handler: SpecificEventListener[gotpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input]): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_input(evtType: input, handler: SpecificEventListener[input], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid]): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_invalid(evtType: invalid, handler: SpecificEventListener[invalid], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keydown(evtType: keydown, handler: SpecificEventListener[keydown], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keypress(evtType: keypress, handler: SpecificEventListener[keypress], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_keyup(evtType: keyup, handler: SpecificEventListener[keyup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load]): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_load(evtType: load, handler: SpecificEventListener[load], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadeddata(evtType: loadeddata, handler: SpecificEventListener[loadeddata], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(evtType: loadedmetadata, handler: SpecificEventListener[loadedmetadata], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadedmetadata(
      evtType: loadedmetadata,
      handler: SpecificEventListener[loadedmetadata],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_loadstart(evtType: loadstart, handler: SpecificEventListener[loadstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture]): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(evtType: lostpointercapture, handler: SpecificEventListener[lostpointercapture], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_lostpointercapture(
      evtType: lostpointercapture,
      handler: SpecificEventListener[lostpointercapture],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousedown(evtType: mousedown, handler: SpecificEventListener[mousedown], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseenter(evtType: mouseenter, handler: SpecificEventListener[mouseenter], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseleave(evtType: mouseleave, handler: SpecificEventListener[mouseleave], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mousemove(evtType: mousemove, handler: SpecificEventListener[mousemove], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseout(evtType: mouseout, handler: SpecificEventListener[mouseout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseover(evtType: mouseover, handler: SpecificEventListener[mouseover], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_mouseup(evtType: mouseup, handler: SpecificEventListener[mouseup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pause(evtType: pause, handler: SpecificEventListener[pause], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play]): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_play(evtType: play, handler: SpecificEventListener[play], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing]): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_playing(evtType: playing, handler: SpecificEventListener[playing], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(evtType: pointercancel, handler: SpecificEventListener[pointercancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointercancel(
      evtType: pointercancel,
      handler: SpecificEventListener[pointercancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(evtType: pointerdown, handler: SpecificEventListener[pointerdown], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerdown(
      evtType: pointerdown,
      handler: SpecificEventListener[pointerdown],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(evtType: pointerenter, handler: SpecificEventListener[pointerenter], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerenter(
      evtType: pointerenter,
      handler: SpecificEventListener[pointerenter],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(evtType: pointerleave, handler: SpecificEventListener[pointerleave], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerleave(
      evtType: pointerleave,
      handler: SpecificEventListener[pointerleave],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(evtType: pointermove, handler: SpecificEventListener[pointermove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointermove(
      evtType: pointermove,
      handler: SpecificEventListener[pointermove],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerout(evtType: pointerout, handler: SpecificEventListener[pointerout], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(evtType: pointerover, handler: SpecificEventListener[pointerover], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerover(
      evtType: pointerover,
      handler: SpecificEventListener[pointerover],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup]): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_pointerup(evtType: pointerup, handler: SpecificEventListener[pointerup], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress]): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_progress(evtType: progress, handler: SpecificEventListener[progress], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_ratechange(evtType: ratechange, handler: SpecificEventListener[ratechange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset]): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_reset(evtType: reset, handler: SpecificEventListener[reset], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize]): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_resize(evtType: resize, handler: SpecificEventListener[resize], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll]): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_scroll(evtType: scroll, handler: SpecificEventListener[scroll], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(evtType: securitypolicyviolation, handler: SpecificEventListener[securitypolicyviolation]): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_securitypolicyviolation(
      evtType: securitypolicyviolation,
      handler: SpecificEventListener[securitypolicyviolation],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked]): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeked(evtType: seeked, handler: SpecificEventListener[seeked], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking]): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_seeking(evtType: seeking, handler: SpecificEventListener[seeking], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select]): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_select(evtType: select, handler: SpecificEventListener[select], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(evtType: selectionchange, handler: SpecificEventListener[selectionchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectionchange(
      evtType: selectionchange,
      handler: SpecificEventListener[selectionchange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(evtType: selectstart, handler: SpecificEventListener[selectstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_selectstart(
      evtType: selectstart,
      handler: SpecificEventListener[selectstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_slotchange(evtType: slotchange, handler: SpecificEventListener[slotchange], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled]): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_stalled(evtType: stalled, handler: SpecificEventListener[stalled], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit]): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_submit(evtType: submit, handler: SpecificEventListener[submit], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_suspend(evtType: suspend, handler: SpecificEventListener[suspend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate]): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_timeupdate(evtType: timeupdate, handler: SpecificEventListener[timeupdate], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle]): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_toggle(evtType: toggle, handler: SpecificEventListener[toggle], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(evtType: touchcancel, handler: SpecificEventListener[touchcancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchcancel(
      evtType: touchcancel,
      handler: SpecificEventListener[touchcancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchend(evtType: touchend, handler: SpecificEventListener[touchend], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchmove(evtType: touchmove, handler: SpecificEventListener[touchmove], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_touchstart(evtType: touchstart, handler: SpecificEventListener[touchstart], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(evtType: transitioncancel, handler: SpecificEventListener[transitioncancel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitioncancel(
      evtType: transitioncancel,
      handler: SpecificEventListener[transitioncancel],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(evtType: transitionend, handler: SpecificEventListener[transitionend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionend(
      evtType: transitionend,
      handler: SpecificEventListener[transitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(evtType: transitionrun, handler: SpecificEventListener[transitionrun], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionrun(
      evtType: transitionrun,
      handler: SpecificEventListener[transitionrun],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(evtType: transitionstart, handler: SpecificEventListener[transitionstart], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_transitionstart(
      evtType: transitionstart,
      handler: SpecificEventListener[transitionstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange]): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(evtType: volumechange, handler: SpecificEventListener[volumechange], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_volumechange(
      evtType: volumechange,
      handler: SpecificEventListener[volumechange],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting]): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_waiting(evtType: waiting, handler: SpecificEventListener[waiting], options: AddEventListenerOptions): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationend(evtType: webkitanimationend, handler: SpecificEventListener[webkitanimationend], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationend(
      evtType: webkitanimationend,
      handler: SpecificEventListener[webkitanimationend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationiteration(evtType: webkitanimationiteration, handler: SpecificEventListener[webkitanimationiteration]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationiteration(
      evtType: webkitanimationiteration,
      handler: SpecificEventListener[webkitanimationiteration],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationstart(evtType: webkitanimationstart, handler: SpecificEventListener[webkitanimationstart]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkitanimationstart(
      evtType: webkitanimationstart,
      handler: SpecificEventListener[webkitanimationstart],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkittransitionend(evtType: webkittransitionend, handler: SpecificEventListener[webkittransitionend]): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: Boolean
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_webkittransitionend(
      evtType: webkittransitionend,
      handler: SpecificEventListener[webkittransitionend],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel]): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: Boolean): Unit = js.native
    @JSName("unlisten")
    def unlisten_wheel(evtType: wheel, handler: SpecificEventListener[wheel], options: AddEventListenerOptions): Unit = js.native
  }
  /* static members */
  object MDCComponent {
    
    @JSImport("@material/base/component", "MDCComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCComponent[MDCFoundation[js.Object]]]
  }
}
