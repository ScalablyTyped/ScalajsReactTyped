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
import typingsJapgolly.std.DocumentEventMap
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.DOMContentLoaded
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenchange
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.fullscreenerror
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockchange
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointerlockerror
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.readystatechange
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.visibilitychange
  */
  trait EventType extends StObject
  
  type EventTypeInit[K /* <: EventType */] = SpecificEventInit[
    /* import warning: importer.ImportType#apply Failed type conversion: @testing-library/user-event.@testing-library/user-event/dist/types/event/types.FixedDocumentEventMap[K] */ js.Any
  ]
  
  trait FixedDocumentEventMap
    extends StObject
       with DocumentEventMap {
    
    @JSName("input")
    var input_FixedDocumentEventMap: InputEvent
  }
  object FixedDocumentEventMap {
    
    inline def apply(
      DOMContentLoaded: Event,
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      input: InputEvent,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointerlockchange: Event,
      pointerlockerror: Event,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      readystatechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      visibilitychange: Event,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): FixedDocumentEventMap = {
      val __obj = js.Dynamic.literal(DOMContentLoaded = DOMContentLoaded.asInstanceOf[js.Any], abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointerlockchange = pointerlockchange.asInstanceOf[js.Any], pointerlockerror = pointerlockerror.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], visibilitychange = visibilitychange.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedDocumentEventMap]
    }
    
    extension [Self <: FixedDocumentEventMap](x: Self) {
      
      inline def setInput(value: InputEvent): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointerCoords extends StObject {
    
    var clientX: js.UndefOr[Double] = js.undefined
    
    var clientY: js.UndefOr[Double] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var pageX: js.UndefOr[Double] = js.undefined
    
    var pageY: js.UndefOr[Double] = js.undefined
    
    var screenX: js.UndefOr[Double] = js.undefined
    
    var screenY: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PointerCoords {
    
    inline def apply(): PointerCoords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointerCoords]
    }
    
    extension [Self <: PointerCoords](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
      
      inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    E extends std.InputEvent ? std.InputEventInit : E extends std.ClipboardEvent ? std.ClipboardEventInit : E extends std.KeyboardEvent ? std.KeyboardEventInit : E extends std.PointerEvent ? std.PointerEventInit : E extends std.MouseEvent ? std.MouseEventInit : E extends std.UIEvent ? std.UIEventInit : std.EventInit
    }}}
    */
  @js.native
  trait SpecificEventInit[E /* <: Event */] extends StObject
}
