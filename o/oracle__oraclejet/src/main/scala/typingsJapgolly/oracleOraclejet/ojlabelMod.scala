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
import typingsJapgolly.oracleOraclejet.anon.DefinitionSource
import typingsJapgolly.oracleOraclejet.anon.TooltipHelp
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.mod.baseComponentEventMap
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`for`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.forChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.help
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelId
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelIdChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.showRequired
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.showRequiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojlabelMod {
  
  @js.native
  trait ojLabel
    extends StObject
       with baseComponent[ojLabelSettableProperties] {
    
    @JSName("addEventListener")
    def addEventListener_forChanged(`type`: forChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_forChanged(
      `type`: forChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(`type`: helpChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_helpChanged(
      `type`: helpChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelIdChanged(`type`: labelIdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelIdChanged(
      `type`: labelIdChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_showRequiredChanged(`type`: showRequiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_showRequiredChanged(
      `type`: showRequiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var `for`: String | Null = js.native
    
    @JSName("getProperty")
    def getProperty_for(property: `for`): String | Null = js.native
    @JSName("getProperty")
    def getProperty_help(property: help): DefinitionSource = js.native
    @JSName("getProperty")
    def getProperty_labelId(property: labelId): String | Null = js.native
    @JSName("getProperty")
    def getProperty_showRequired(property: showRequired): Boolean | Null = js.native
    
    var help: DefinitionSource = js.native
    
    var labelId: String | Null = js.native
    
    var onForChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onHelpChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onLabelIdChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onShowRequiredChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    def setProperties(properties: ojLabelSettablePropertiesLenient): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_for(property: `for`): Unit = js.native
    @JSName("setProperty")
    def setProperty_for(property: `for`, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_help(property: help, value: DefinitionSource): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelId(property: labelId): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelId(property: labelId, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_showRequired(property: showRequired): Unit = js.native
    @JSName("setProperty")
    def setProperty_showRequired(property: showRequired, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: TooltipHelp): Unit = js.native
    
    var showRequired: Boolean | Null = js.native
    
    @JSName("translations")
    var translations_ojLabel: TooltipHelp = js.native
  }
  
  trait ojLabelEventMap
    extends StObject
       with baseComponentEventMap[ojLabelSettableProperties] {
    
    var forChanged: CustomEvent
    
    var helpChanged: CustomEvent
    
    var labelIdChanged: CustomEvent
    
    var showRequiredChanged: CustomEvent
  }
  object ojLabelEventMap {
    
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
      forChanged: CustomEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      helpChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelIdChanged: CustomEvent,
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
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      showRequiredChanged: CustomEvent,
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
    ): ojLabelEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], forChanged = forChanged.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelIdChanged = labelIdChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], showRequiredChanged = showRequiredChanged.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojLabelEventMap]
    }
    
    extension [Self <: ojLabelEventMap](x: Self) {
      
      inline def setForChanged(value: CustomEvent): Self = StObject.set(x, "forChanged", value.asInstanceOf[js.Any])
      
      inline def setHelpChanged(value: CustomEvent): Self = StObject.set(x, "helpChanged", value.asInstanceOf[js.Any])
      
      inline def setLabelIdChanged(value: CustomEvent): Self = StObject.set(x, "labelIdChanged", value.asInstanceOf[js.Any])
      
      inline def setShowRequiredChanged(value: CustomEvent): Self = StObject.set(x, "showRequiredChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojLabelSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var `for`: String | Null
    
    var help: DefinitionSource
    
    var labelId: String | Null
    
    var showRequired: Boolean | Null
    
    @JSName("translations")
    var translations_ojLabelSettableProperties: TooltipHelp
  }
  object ojLabelSettableProperties {
    
    inline def apply(help: DefinitionSource, translations: TooltipHelp): ojLabelSettableProperties = {
      val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], labelId = null, showRequired = null)
      __obj.updateDynamic("for")(null)
      __obj.asInstanceOf[ojLabelSettableProperties]
    }
    
    extension [Self <: ojLabelSettableProperties](x: Self) {
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForNull: Self = StObject.set(x, "for", null)
      
      inline def setHelp(value: DefinitionSource): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
      
      inline def setShowRequired(value: Boolean): Self = StObject.set(x, "showRequired", value.asInstanceOf[js.Any])
      
      inline def setShowRequiredNull: Self = StObject.set(x, "showRequired", null)
      
      inline def setTranslations(value: TooltipHelp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabel.ojLabelSettableProperties> */
  trait ojLabelSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `for`: js.UndefOr[String | Null] = js.undefined
    
    var help: js.UndefOr[DefinitionSource] = js.undefined
    
    var labelId: js.UndefOr[String | Null] = js.undefined
    
    var showRequired: js.UndefOr[Boolean | Null] = js.undefined
    
    var translations: js.UndefOr[TooltipHelp] = js.undefined
  }
  object ojLabelSettablePropertiesLenient {
    
    inline def apply(): ojLabelSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojLabelSettablePropertiesLenient]
    }
    
    extension [Self <: ojLabelSettablePropertiesLenient](x: Self) {
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForNull: Self = StObject.set(x, "for", null)
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setHelp(value: DefinitionSource): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setShowRequired(value: Boolean): Self = StObject.set(x, "showRequired", value.asInstanceOf[js.Any])
      
      inline def setShowRequiredNull: Self = StObject.set(x, "showRequired", null)
      
      inline def setShowRequiredUndefined: Self = StObject.set(x, "showRequired", js.undefined)
      
      inline def setTranslations(value: TooltipHelp): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
