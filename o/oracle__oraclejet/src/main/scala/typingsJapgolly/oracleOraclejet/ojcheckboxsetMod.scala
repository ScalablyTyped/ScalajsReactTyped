package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
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
import typingsJapgolly.oracleOraclejet.anon.ConverterHint
import typingsJapgolly.oracleOraclejet.anon.Definition
import typingsJapgolly.oracleOraclejet.anon.Instruction
import typingsJapgolly.oracleOraclejet.anon.Required
import typingsJapgolly.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionContext
import typingsJapgolly.oracleOraclejet.ojcheckboxsetMod.ojCheckboxset.OptionsKeys
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelledBy
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.labelledByChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionRenderer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionRendererChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.options
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsKeys
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.optionsKeysChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.required
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcheckboxsetMod {
  
  @js.native
  trait ojCheckboxset[K, D]
    extends StObject
       with editableValue[js.Array[Any], ojCheckboxsetSettableProperties[K, D], js.Array[Any], js.Array[Any]] {
    
    @JSName("addEventListener")
    def addEventListener_labelledByChanged(`type`: labelledByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_labelledByChanged(
      `type`: labelledByChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionRendererChanged(
      `type`: optionRendererChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionRendererChanged(
      `type`: optionRendererChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsChanged(`type`: optionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsChanged(
      `type`: optionsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsKeysChanged(`type`: optionsKeysChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_optionsKeysChanged(
      `type`: optionsKeysChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requiredChanged(`type`: requiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requiredChanged(
      `type`: requiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    @JSName("getProperty")
    def getProperty_labelledBy(property: labelledBy): String | Null = js.native
    @JSName("getProperty")
    def getProperty_optionRenderer(property: optionRenderer): js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
    @JSName("getProperty")
    def getProperty_options(property: options): (DataProvider[K, D]) | Null = js.native
    @JSName("getProperty")
    def getProperty_optionsKeys(property: optionsKeys): js.UndefOr[OptionsKeys] = js.native
    @JSName("getProperty")
    def getProperty_required(property: required): Boolean = js.native
    
    var labelledBy: String | Null = js.native
    
    var onLabelledByChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOptionRendererChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOptionsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOptionsKeysChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onRequiredChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.native
    
    var options: (DataProvider[K, D]) | Null = js.native
    
    var optionsKeys: js.UndefOr[OptionsKeys] = js.native
    
    var required: Boolean = js.native
    
    def setProperties(properties: ojCheckboxsetSettablePropertiesLenient[K, D]): Unit = js.native
    
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy): Unit = js.native
    @JSName("setProperty")
    def setProperty_labelledBy(property: labelledBy, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionRenderer(property: optionRenderer): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionRenderer(property: optionRenderer, value: js.Function1[/* param0 */ OptionContext[D], Element]): Unit = js.native
    @JSName("setProperty")
    def setProperty_options(property: options): Unit = js.native
    @JSName("setProperty")
    def setProperty_options(property: options, value: DataProvider[K, D]): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionsKeys(property: optionsKeys): Unit = js.native
    @JSName("setProperty")
    def setProperty_optionsKeys(property: optionsKeys, value: OptionsKeys): Unit = js.native
    @JSName("setProperty")
    def setProperty_required(property: required, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: Required): Unit = js.native
    
    @JSName("translations")
    var translations_ojCheckboxset: Required = js.native
    
    def validate(): js.Promise[String] = js.native
  }
  object ojCheckboxset {
    
    // tslint:disable-next-line interface-over-type-literal
    trait Option extends StObject {
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var value: Any
    }
    object Option {
      
      inline def apply(value: Any): Option = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      extension [Self <: Option](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait OptionContext[D] extends StObject {
      
      var component: Element
      
      var data: D
      
      var index: Double
    }
    object OptionContext {
      
      inline def apply[D](component: Element, data: D, index: Double): OptionContext[D] = {
        val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
        __obj.asInstanceOf[OptionContext[D]]
      }
      
      extension [Self <: OptionContext[?], D](x: Self & OptionContext[D]) {
        
        inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait OptionsKeys extends StObject {
      
      var label: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object OptionsKeys {
      
      inline def apply(): OptionsKeys = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OptionsKeys]
      }
      
      extension [Self <: OptionsKeys](x: Self) {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
  }
  
  trait ojCheckboxsetEventMap[K, D]
    extends StObject
       with editableValueEventMap[js.Array[Any], ojCheckboxsetSettableProperties[K, D], js.Array[Any], js.Array[Any]] {
    
    var labelledByChanged: CustomEvent
    
    var optionRendererChanged: CustomEvent
    
    var optionsChanged: CustomEvent
    
    var optionsKeysChanged: CustomEvent
    
    var requiredChanged: CustomEvent
  }
  object ojCheckboxsetEventMap {
    
    inline def apply[K, D](
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
      describedByChanged: CustomEvent,
      disabledChanged: CustomEvent,
      displayOptionsChanged: CustomEvent,
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
      helpChanged: CustomEvent,
      helpHintsChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelHintChanged: CustomEvent,
      labelledByChanged: CustomEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      messagesCustomChanged: CustomEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
      optionRendererChanged: CustomEvent,
      optionsChanged: CustomEvent,
      optionsKeysChanged: CustomEvent,
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
      requiredChanged: CustomEvent,
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
      validChanged: CustomEvent,
      valueChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojCheckboxsetEventMap[K, D] = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], labelledByChanged = labelledByChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], optionRendererChanged = optionRendererChanged.asInstanceOf[js.Any], optionsChanged = optionsChanged.asInstanceOf[js.Any], optionsKeysChanged = optionsKeysChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojCheckboxsetEventMap[K, D]]
    }
    
    extension [Self <: ojCheckboxsetEventMap[?, ?], K, D](x: Self & (ojCheckboxsetEventMap[K, D])) {
      
      inline def setLabelledByChanged(value: CustomEvent): Self = StObject.set(x, "labelledByChanged", value.asInstanceOf[js.Any])
      
      inline def setOptionRendererChanged(value: CustomEvent): Self = StObject.set(x, "optionRendererChanged", value.asInstanceOf[js.Any])
      
      inline def setOptionsChanged(value: CustomEvent): Self = StObject.set(x, "optionsChanged", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeysChanged(value: CustomEvent): Self = StObject.set(x, "optionsKeysChanged", value.asInstanceOf[js.Any])
      
      inline def setRequiredChanged(value: CustomEvent): Self = StObject.set(x, "requiredChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojCheckboxsetSettableProperties[K, D]
    extends StObject
       with editableValueSettableProperties[js.Array[Any], js.Array[Any], js.Array[Any]] {
    
    var labelledBy: String | Null
    
    var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
    
    var options: (DataProvider[K, D]) | Null
    
    var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
    
    var required: Boolean
    
    @JSName("translations")
    var translations_ojCheckboxsetSettableProperties: Required
  }
  object ojCheckboxsetSettableProperties {
    
    inline def apply[K, D](
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      required: Boolean,
      translations: Required,
      valid: valid | pending | invalidHidden | invalidShown,
      value: js.Array[Any]
    ): ojCheckboxsetSettableProperties[K, D] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], describedBy = null, labelledBy = null, options = null)
      __obj.asInstanceOf[ojCheckboxsetSettableProperties[K, D]]
    }
    
    extension [Self <: ojCheckboxsetSettableProperties[?, ?], K, D](x: Self & (ojCheckboxsetSettableProperties[K, D])) {
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      inline def setOptionRenderer(value: /* param0 */ OptionContext[D] => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      inline def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
      
      inline def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      inline def setOptions(value: DataProvider[K, D]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeys(value: OptionsKeys): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
      
      inline def setOptionsNull: Self = StObject.set(x, "options", null)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: Required): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojcheckboxset.ojCheckboxsetSettableProperties<K, D>> */
  trait ojCheckboxsetSettablePropertiesLenient[K, D]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var describedBy: js.UndefOr[String | Null] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var displayOptions: js.UndefOr[ConverterHint] = js.undefined
    
    var help: js.UndefOr[Instruction] = js.undefined
    
    var helpHints: js.UndefOr[Definition] = js.undefined
    
    var labelHint: js.UndefOr[String] = js.undefined
    
    var labelledBy: js.UndefOr[String | Null] = js.undefined
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
    
    var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
    
    var options: js.UndefOr[(DataProvider[K, D]) | Null] = js.undefined
    
    var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var translations: js.UndefOr[Required] = js.undefined
    
    var valid: js.UndefOr[
        typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.undefined
    
    var value: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ojCheckboxsetSettablePropertiesLenient {
    
    inline def apply[K, D](): ojCheckboxsetSettablePropertiesLenient[K, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojCheckboxsetSettablePropertiesLenient[K, D]]
    }
    
    extension [Self <: ojCheckboxsetSettablePropertiesLenient[?, ?], K, D](x: Self & (ojCheckboxsetSettablePropertiesLenient[K, D])) {
      
      inline def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      inline def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      inline def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      inline def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      inline def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      inline def setLabelledBy(value: String): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByNull: Self = StObject.set(x, "labelledBy", null)
      
      inline def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      inline def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      inline def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value*))
      
      inline def setOptionRenderer(value: /* param0 */ OptionContext[D] => Element): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      inline def setOptionRendererNull: Self = StObject.set(x, "optionRenderer", null)
      
      inline def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      inline def setOptions(value: DataProvider[K, D]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeys(value: OptionsKeys): Self = StObject.set(x, "optionsKeys", value.asInstanceOf[js.Any])
      
      inline def setOptionsKeysUndefined: Self = StObject.set(x, "optionsKeys", js.undefined)
      
      inline def setOptionsNull: Self = StObject.set(x, "options", null)
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTranslations(value: Required): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
