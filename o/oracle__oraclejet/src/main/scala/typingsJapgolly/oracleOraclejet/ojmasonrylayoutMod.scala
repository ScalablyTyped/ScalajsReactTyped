package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.oracleOraclejet.anon.LabelCut
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.mod.baseComponentEventMap
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeInsert
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeRemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeReorder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojInsert
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojRemove
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojReorder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reorderHandle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.reorderHandleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojmasonrylayoutMod {
  
  @js.native
  trait ojMasonryLayout
    extends StObject
       with baseComponent[ojMasonryLayoutSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeInsert(`type`: ojBeforeInsert, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeInsert(
      `type`: ojBeforeInsert,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeRemove(`type`: ojBeforeRemove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeRemove(
      `type`: ojBeforeRemove,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeReorder(`type`: ojBeforeReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeReorder(
      `type`: ojBeforeReorder,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeResize(`type`: ojBeforeResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeResize(
      `type`: ojBeforeResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojInsert(`type`: ojInsert, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojInsert(
      `type`: ojInsert,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojRemove(`type`: ojRemove, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojRemove(
      `type`: ojRemove,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojReorder(`type`: ojReorder, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojReorder(
      `type`: ojReorder,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(`type`: ojResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reorderHandleChanged(`type`: reorderHandleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_reorderHandleChanged(
      `type`: reorderHandleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_reorderHandle(property: reorderHandle): String | Null = js.native
    
    def insertTile(selector: String, index: Double): Unit = js.native
    
    var onOjAnimateEnd: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeInsert: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeRemove: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeReorder: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeResize: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjInsert: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjRemove: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjReorder: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjResize: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onReorderHandleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    def removeTile(selector: String): Unit = js.native
    
    var reorderHandle: String | Null = js.native
    
    def resizeTile(selector: String, sizeStyleClass: String): Unit = js.native
    
    def setProperties(properties: ojMasonryLayoutSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_reorderHandle(property: reorderHandle): Unit = js.native
    @JSName("setProperty")
    def setProperty_reorderHandle(property: reorderHandle, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelCut): Unit = js.native
    
    @JSName("translations")
    var translations_ojMasonryLayout: LabelCut = js.native
  }
  object ojMasonryLayout {
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
    
    type ojBeforeInsert = CustomEvent
    
    type ojBeforeRemove = CustomEvent
    
    type ojBeforeReorder = CustomEvent
    
    type ojBeforeResize = CustomEvent
    
    type ojInsert = CustomEvent
    
    type ojRemove = CustomEvent
    
    type ojReorder = CustomEvent
    
    type ojResize = CustomEvent
  }
  
  trait ojMasonryLayoutEventMap
    extends StObject
       with baseComponentEventMap[ojMasonryLayoutSettableProperties] {
    
    var ojAnimateEnd: CustomEvent
    
    var ojAnimateStart: CustomEvent
    
    var ojBeforeInsert: CustomEvent
    
    var ojBeforeRemove: CustomEvent
    
    var ojBeforeReorder: CustomEvent
    
    var ojBeforeResize: CustomEvent
    
    var ojInsert: CustomEvent
    
    var ojRemove: CustomEvent
    
    var ojReorder: CustomEvent
    
    var ojResize: CustomEvent
    
    var reorderHandleChanged: CustomEvent
  }
  object ojMasonryLayoutEventMap {
    
    inline def apply(
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
      input: Event,
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
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
      ojBeforeInsert: CustomEvent,
      ojBeforeRemove: CustomEvent,
      ojBeforeReorder: CustomEvent,
      ojBeforeResize: CustomEvent,
      ojInsert: CustomEvent,
      ojRemove: CustomEvent,
      ojReorder: CustomEvent,
      ojResize: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reorderHandleChanged: CustomEvent,
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
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojMasonryLayoutEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeInsert = ojBeforeInsert.asInstanceOf[js.Any], ojBeforeRemove = ojBeforeRemove.asInstanceOf[js.Any], ojBeforeReorder = ojBeforeReorder.asInstanceOf[js.Any], ojBeforeResize = ojBeforeResize.asInstanceOf[js.Any], ojInsert = ojInsert.asInstanceOf[js.Any], ojRemove = ojRemove.asInstanceOf[js.Any], ojReorder = ojReorder.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reorderHandleChanged = reorderHandleChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojMasonryLayoutEventMap]
    }
    
    extension [Self <: ojMasonryLayoutEventMap](x: Self) {
      
      inline def setOjAnimateEnd(value: CustomEvent): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateStart(value: CustomEvent): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeInsert(value: CustomEvent): Self = StObject.set(x, "ojBeforeInsert", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeRemove(value: CustomEvent): Self = StObject.set(x, "ojBeforeRemove", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeReorder(value: CustomEvent): Self = StObject.set(x, "ojBeforeReorder", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeResize(value: CustomEvent): Self = StObject.set(x, "ojBeforeResize", value.asInstanceOf[js.Any])
      
      inline def setOjInsert(value: CustomEvent): Self = StObject.set(x, "ojInsert", value.asInstanceOf[js.Any])
      
      inline def setOjRemove(value: CustomEvent): Self = StObject.set(x, "ojRemove", value.asInstanceOf[js.Any])
      
      inline def setOjReorder(value: CustomEvent): Self = StObject.set(x, "ojReorder", value.asInstanceOf[js.Any])
      
      inline def setOjResize(value: CustomEvent): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      inline def setReorderHandleChanged(value: CustomEvent): Self = StObject.set(x, "reorderHandleChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojMasonryLayoutSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var reorderHandle: String | Null
    
    @JSName("translations")
    var translations_ojMasonryLayoutSettableProperties: LabelCut
  }
  object ojMasonryLayoutSettableProperties {
    
    inline def apply(translations: LabelCut): ojMasonryLayoutSettableProperties = {
      val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any], reorderHandle = null)
      __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
    }
    
    extension [Self <: ojMasonryLayoutSettableProperties](x: Self) {
      
      inline def setReorderHandle(value: String): Self = StObject.set(x, "reorderHandle", value.asInstanceOf[js.Any])
      
      inline def setReorderHandleNull: Self = StObject.set(x, "reorderHandle", null)
      
      inline def setTranslations(value: LabelCut): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmasonrylayout.ojMasonryLayoutSettableProperties> */
  trait ojMasonryLayoutSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var reorderHandle: js.UndefOr[String | Null] = js.undefined
    
    var translations: js.UndefOr[LabelCut] = js.undefined
  }
  object ojMasonryLayoutSettablePropertiesLenient {
    
    inline def apply(): ojMasonryLayoutSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojMasonryLayoutSettablePropertiesLenient]
    }
    
    extension [Self <: ojMasonryLayoutSettablePropertiesLenient](x: Self) {
      
      inline def setReorderHandle(value: String): Self = StObject.set(x, "reorderHandle", value.asInstanceOf[js.Any])
      
      inline def setReorderHandleNull: Self = StObject.set(x, "reorderHandle", null)
      
      inline def setReorderHandleUndefined: Self = StObject.set(x, "reorderHandle", js.undefined)
      
      inline def setTranslations(value: LabelCut): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
