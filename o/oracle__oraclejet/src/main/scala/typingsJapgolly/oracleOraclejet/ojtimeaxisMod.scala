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
import typingsJapgolly.oracleOraclejet.anon.LabelAndValue
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typingsJapgolly.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.days
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.endChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hours
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.months
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scale
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.scaleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.startChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.years
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtimeaxisMod {
  
  @js.native
  trait ojTimeAxis
    extends StObject
       with dvtBaseComponent[ojTimeAxisSettableProperties] {
    
    def addEventListener(`type`: scaleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    def addEventListener(
      `type`: scaleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_converterChanged(`type`: converterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_converterChanged(
      `type`: converterChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_endChanged(`type`: endChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_endChanged(
      `type`: endChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_startChanged(`type`: startChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_startChanged(
      `type`: startChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var converter: Converters | Converter[String] = js.native
    
    var end: String = js.native
    
    @JSName("getProperty")
    def getProperty_converter(property: converter): Converters | Converter[String] = js.native
    @JSName("getProperty")
    def getProperty_end(property: end): String = js.native
    @JSName("getProperty")
    def getProperty_scale(property: scale): seconds | minutes | hours | days | weeks | months | quarters | years = js.native
    @JSName("getProperty")
    def getProperty_start(property: start): String = js.native
    
    var onConverterChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onEndChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onScaleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onStartChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
    
    def setProperties(properties: ojTimeAxisSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: scale, value: seconds | minutes | hours | days | weeks | months | quarters | years): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: Converters): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
    @JSName("setProperty")
    def setProperty_end(property: end, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_start(property: start, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
    
    var start: String = js.native
    
    @JSName("translations")
    var translations_ojTimeAxis: LabelAndValue = js.native
  }
  object ojTimeAxis {
    
    // tslint:disable-next-line interface-over-type-literal
    trait Converters extends StObject {
      
      var default: js.UndefOr[Converter[String]] = js.undefined
      
      var days: js.UndefOr[Converter[String]] = js.undefined
      
      var hours: js.UndefOr[Converter[String]] = js.undefined
      
      var minutes: js.UndefOr[Converter[String]] = js.undefined
      
      var months: js.UndefOr[Converter[String]] = js.undefined
      
      var quarters: js.UndefOr[Converter[String]] = js.undefined
      
      var seconds: js.UndefOr[Converter[String]] = js.undefined
      
      var weeks: js.UndefOr[Converter[String]] = js.undefined
      
      var years: js.UndefOr[Converter[String]] = js.undefined
    }
    object Converters {
      
      inline def apply(): Converters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Converters]
      }
      
      extension [Self <: Converters](x: Self) {
        
        inline def setDays(value: Converter[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
        
        inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
        
        inline def setDefault(value: Converter[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setHours(value: Converter[String]): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
        
        inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
        
        inline def setMinutes(value: Converter[String]): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
        
        inline def setMonths(value: Converter[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
        
        inline def setQuarters(value: Converter[String]): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
        
        inline def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
        
        inline def setSeconds(value: Converter[String]): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
        
        inline def setWeeks(value: Converter[String]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
        
        inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
        
        inline def setYears(value: Converter[String]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
        
        inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
      }
    }
  }
  
  trait ojTimeAxisEventMap
    extends StObject
       with dvtBaseComponentEventMap[ojTimeAxisSettableProperties] {
    
    var converterChanged: CustomEvent
    
    var endChanged: CustomEvent
    
    var scaleChanged: CustomEvent
    
    var startChanged: CustomEvent
  }
  object ojTimeAxisEventMap {
    
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
      converterChanged: CustomEvent,
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
      endChanged: CustomEvent,
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
      scaleChanged: CustomEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      startChanged: CustomEvent,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      trackResizeChanged: CustomEvent,
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
    ): ojTimeAxisEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endChanged = endChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scaleChanged = scaleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startChanged = startChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojTimeAxisEventMap]
    }
    
    extension [Self <: ojTimeAxisEventMap](x: Self) {
      
      inline def setConverterChanged(value: CustomEvent): Self = StObject.set(x, "converterChanged", value.asInstanceOf[js.Any])
      
      inline def setEndChanged(value: CustomEvent): Self = StObject.set(x, "endChanged", value.asInstanceOf[js.Any])
      
      inline def setScaleChanged(value: CustomEvent): Self = StObject.set(x, "scaleChanged", value.asInstanceOf[js.Any])
      
      inline def setStartChanged(value: CustomEvent): Self = StObject.set(x, "startChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojTimeAxisSettableProperties
    extends StObject
       with dvtBaseComponentSettableProperties {
    
    var converter: Converters | Converter[String]
    
    var end: String
    
    var scale: seconds | minutes | hours | days | weeks | months | quarters | years
    
    var start: String
    
    @JSName("translations")
    var translations_ojTimeAxisSettableProperties: LabelAndValue
  }
  object ojTimeAxisSettableProperties {
    
    inline def apply(
      converter: Converters | Converter[String],
      end: String,
      scale: seconds | minutes | hours | days | weeks | months | quarters | years,
      start: String,
      trackResize: on | off,
      translations: LabelAndValue
    ): ojTimeAxisSettableProperties = {
      val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojTimeAxisSettableProperties]
    }
    
    extension [Self <: ojTimeAxisSettableProperties](x: Self) {
      
      inline def setConverter(value: Converters | Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtimeaxis.ojTimeAxisSettableProperties> */
  trait ojTimeAxisSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var converter: js.UndefOr[Converters | Converter[String]] = js.undefined
    
    var end: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[seconds | minutes | hours | days | weeks | months | quarters | years] = js.undefined
    
    var start: js.UndefOr[String] = js.undefined
    
    var trackResize: js.UndefOr[on | off] = js.undefined
    
    var translations: js.UndefOr[LabelAndValue] = js.undefined
  }
  object ojTimeAxisSettablePropertiesLenient {
    
    inline def apply(): ojTimeAxisSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojTimeAxisSettablePropertiesLenient]
    }
    
    extension [Self <: ojTimeAxisSettablePropertiesLenient](x: Self) {
      
      inline def setConverter(value: Converters | Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
      
      inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
      
      inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
