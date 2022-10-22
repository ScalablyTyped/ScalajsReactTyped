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
import typingsJapgolly.oracleOraclejet.anon.ConverterHint
import typingsJapgolly.oracleOraclejet.anon.Definition
import typingsJapgolly.oracleOraclejet.anon.Instruction
import typingsJapgolly.oracleOraclejet.anon.NumberRange
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typingsJapgolly.oracleOraclejet.ojmessagingMod.^
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Validator
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autocomplete
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autocompleteChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autofocus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.autofocusChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converter
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.max
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.min
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.number
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.pending
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholder
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.required
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.step
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.text
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validators
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.virtualKeyboard
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.virtualKeyboardChanged
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojinputnumberMod {
  
  @js.native
  trait ojInputNumber
    extends StObject
       with editableValue[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
    
    def addEventListener(`type`: autocompleteChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    def addEventListener(
      `type`: autocompleteChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: virtualKeyboardChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    def addEventListener(
      `type`: virtualKeyboardChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_asyncValidatorsChanged(
      `type`: asyncValidatorsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_asyncValidatorsChanged(
      `type`: asyncValidatorsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autofocusChanged(`type`: autofocusChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autofocusChanged(
      `type`: autofocusChanged,
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
    def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxChanged(
      `type`: maxChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_minChanged(
      `type`: minChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_placeholderChanged(`type`: placeholderChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_placeholderChanged(
      `type`: placeholderChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rawValueChanged(`type`: rawValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rawValueChanged(
      `type`: rawValueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readonlyChanged(
      `type`: readonlyChanged_,
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
    @JSName("addEventListener")
    def addEventListener_stepChanged(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepChanged(
      `type`: stepChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_validatorsChanged(`type`: validatorsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_validatorsChanged(
      `type`: validatorsChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var asyncValidators: js.Array[AsyncValidator[Double]] = js.native
    
    var autocomplete: on | off | String = js.native
    
    var converter: Converter[Double] | RegisteredConverter = js.native
    
    @JSName("getProperty")
    def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[Double]] = js.native
    @JSName("getProperty")
    def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
    @JSName("getProperty")
    def getProperty_autofocus(property: autofocus): Boolean = js.native
    @JSName("getProperty")
    def getProperty_converter(property: converter): Converter[Double] | RegisteredConverter = js.native
    @JSName("getProperty")
    def getProperty_max(property: max): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_min(property: min): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_placeholder(property: placeholder): String | Null = js.native
    @JSName("getProperty")
    def getProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue): String = js.native
    @JSName("getProperty")
    def getProperty_readonly(property: readonly_): Boolean | Null = js.native
    @JSName("getProperty")
    def getProperty_required(property: required): Boolean = js.native
    @JSName("getProperty")
    def getProperty_step(property: step): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_validators(property: validators): js.Array[Validator[Double] | RegisteredValidator] = js.native
    @JSName("getProperty")
    def getProperty_virtualKeyboard(property: virtualKeyboard): auto | number | text = js.native
    
    var max: Double | Null = js.native
    
    var min: Double | Null = js.native
    
    var onAsyncValidatorsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onAutocompleteChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onAutofocusChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onConverterChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onMaxChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onMinChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onPlaceholderChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onRawValueChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onReadonlyChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onRequiredChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onStepChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onValidatorsChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onVirtualKeyboardChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var placeholder: String | Null = js.native
    
    val rawValue: String = js.native
    
    var readonly: Boolean | Null = js.native
    
    var required: Boolean = js.native
    
    def setProperties(properties: ojInputNumberSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: autocomplete, value: on | off): Unit = js.native
    def setProperty(property: virtualKeyboard, value: auto | number | text): Unit = js.native
    @JSName("setProperty")
    def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[Double]]): Unit = js.native
    @JSName("setProperty")
    def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: Converter[Double]): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
    @JSName("setProperty")
    def setProperty_max(property: max): Unit = js.native
    @JSName("setProperty")
    def setProperty_max(property: max, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_min(property: min): Unit = js.native
    @JSName("setProperty")
    def setProperty_min(property: min, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_placeholder(property: placeholder): Unit = js.native
    @JSName("setProperty")
    def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_readonly(property: readonly_): Unit = js.native
    @JSName("setProperty")
    def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_required(property: required, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_step(property: step): Unit = js.native
    @JSName("setProperty")
    def setProperty_step(property: step, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: NumberRange): Unit = js.native
    @JSName("setProperty")
    def setProperty_validators(property: validators, value: js.Array[Validator[Double] | RegisteredValidator]): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value): Unit = js.native
    
    var step: Double | Null = js.native
    
    def stepDown(): Unit = js.native
    def stepDown(steps: Double): Unit = js.native
    
    def stepUp(): Unit = js.native
    def stepUp(steps: Double): Unit = js.native
    
    @JSName("translations")
    var translations_ojInputNumber: NumberRange = js.native
    
    def validate(): js.Promise[String] = js.native
    
    var validators: js.Array[Validator[Double] | RegisteredValidator] = js.native
    
    var virtualKeyboard: auto | number | text = js.native
  }
  object ojInputNumber {
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
  }
  
  trait ojInputNumberEventMap
    extends StObject
       with editableValueEventMap[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
    
    var asyncValidatorsChanged: CustomEvent
    
    var autocompleteChanged: CustomEvent
    
    var autofocusChanged: CustomEvent
    
    var converterChanged: CustomEvent
    
    var maxChanged: CustomEvent
    
    var minChanged: CustomEvent
    
    var placeholderChanged: CustomEvent
    
    var rawValueChanged: CustomEvent
    
    var readonlyChanged: CustomEvent
    
    var requiredChanged: CustomEvent
    
    var stepChanged: CustomEvent
    
    var validatorsChanged: CustomEvent
    
    var virtualKeyboardChanged: CustomEvent
  }
  object ojInputNumberEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      asyncValidatorsChanged: CustomEvent,
      autocompleteChanged: CustomEvent,
      autofocusChanged: CustomEvent,
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
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      maxChanged: CustomEvent,
      messagesCustomChanged: CustomEvent,
      minChanged: CustomEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      placeholderChanged: CustomEvent,
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
      rawValueChanged: CustomEvent,
      readonlyChanged: CustomEvent,
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
      stepChanged: CustomEvent,
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
      validatorsChanged: CustomEvent,
      valueChanged: CustomEvent,
      virtualKeyboardChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojInputNumberEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asyncValidatorsChanged = asyncValidatorsChanged.asInstanceOf[js.Any], autocompleteChanged = autocompleteChanged.asInstanceOf[js.Any], autofocusChanged = autofocusChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], placeholderChanged = placeholderChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rawValueChanged = rawValueChanged.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], stepChanged = stepChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], validatorsChanged = validatorsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], virtualKeyboardChanged = virtualKeyboardChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojInputNumberEventMap]
    }
    
    extension [Self <: ojInputNumberEventMap](x: Self) {
      
      inline def setAsyncValidatorsChanged(value: CustomEvent): Self = StObject.set(x, "asyncValidatorsChanged", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteChanged(value: CustomEvent): Self = StObject.set(x, "autocompleteChanged", value.asInstanceOf[js.Any])
      
      inline def setAutofocusChanged(value: CustomEvent): Self = StObject.set(x, "autofocusChanged", value.asInstanceOf[js.Any])
      
      inline def setConverterChanged(value: CustomEvent): Self = StObject.set(x, "converterChanged", value.asInstanceOf[js.Any])
      
      inline def setMaxChanged(value: CustomEvent): Self = StObject.set(x, "maxChanged", value.asInstanceOf[js.Any])
      
      inline def setMinChanged(value: CustomEvent): Self = StObject.set(x, "minChanged", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderChanged(value: CustomEvent): Self = StObject.set(x, "placeholderChanged", value.asInstanceOf[js.Any])
      
      inline def setRawValueChanged(value: CustomEvent): Self = StObject.set(x, "rawValueChanged", value.asInstanceOf[js.Any])
      
      inline def setReadonlyChanged(value: CustomEvent): Self = StObject.set(x, "readonlyChanged", value.asInstanceOf[js.Any])
      
      inline def setRequiredChanged(value: CustomEvent): Self = StObject.set(x, "requiredChanged", value.asInstanceOf[js.Any])
      
      inline def setStepChanged(value: CustomEvent): Self = StObject.set(x, "stepChanged", value.asInstanceOf[js.Any])
      
      inline def setValidatorsChanged(value: CustomEvent): Self = StObject.set(x, "validatorsChanged", value.asInstanceOf[js.Any])
      
      inline def setVirtualKeyboardChanged(value: CustomEvent): Self = StObject.set(x, "virtualKeyboardChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojInputNumberSettableProperties
    extends StObject
       with editableValueSettableProperties[Double | Null, Double | Null, String] {
    
    var asyncValidators: js.Array[AsyncValidator[Double]]
    
    var autocomplete: on | off | String
    
    var autofocus: Boolean
    
    var converter: Converter[Double] | RegisteredConverter
    
    var max: Double | Null
    
    var min: Double | Null
    
    var placeholder: String | Null
    
    val rawValue: String
    
    var readonly: Boolean | Null
    
    var required: Boolean
    
    var step: Double | Null
    
    @JSName("translations")
    var translations_ojInputNumberSettableProperties: NumberRange
    
    var validators: js.Array[Validator[Double] | RegisteredValidator]
    
    var virtualKeyboard: auto | number | text
  }
  object ojInputNumberSettableProperties {
    
    inline def apply(
      asyncValidators: js.Array[AsyncValidator[Double]],
      autocomplete: on | off | String,
      autofocus: Boolean,
      converter: Converter[Double] | RegisteredConverter,
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      rawValue: String,
      required: Boolean,
      translations: NumberRange,
      valid: valid | pending | invalidHidden | invalidShown,
      validators: js.Array[Validator[Double] | RegisteredValidator],
      virtualKeyboard: auto | number | text
    ): ojInputNumberSettableProperties = {
      val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any], describedBy = null, max = null, min = null, placeholder = null, readonly = null, step = null, value = null)
      __obj.asInstanceOf[ojInputNumberSettableProperties]
    }
    
    extension [Self <: ojInputNumberSettableProperties](x: Self) {
      
      inline def setAsyncValidators(value: js.Array[AsyncValidator[Double]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
      
      inline def setAsyncValidatorsVarargs(value: AsyncValidator[Double]*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
      
      inline def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setConverter(value: Converter[Double] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxNull: Self = StObject.set(x, "max", null)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinNull: Self = StObject.set(x, "min", null)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepNull: Self = StObject.set(x, "step", null)
      
      inline def setTranslations(value: NumberRange): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setValidators(value: js.Array[Validator[Double] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setValidatorsVarargs(value: (Validator[Double] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value*))
      
      inline def setVirtualKeyboard(value: auto | number | text): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojinputnumber.ojInputNumberSettableProperties> */
  trait ojInputNumberSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var asyncValidators: js.UndefOr[js.Array[AsyncValidator[Double]]] = js.undefined
    
    var autocomplete: js.UndefOr[on | off | String] = js.undefined
    
    var autofocus: js.UndefOr[Boolean] = js.undefined
    
    var converter: js.UndefOr[Converter[Double] | RegisteredConverter] = js.undefined
    
    var describedBy: js.UndefOr[String | Null] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var displayOptions: js.UndefOr[ConverterHint] = js.undefined
    
    var help: js.UndefOr[Instruction] = js.undefined
    
    var helpHints: js.UndefOr[Definition] = js.undefined
    
    var labelHint: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double | Null] = js.undefined
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.undefined
    
    var min: js.UndefOr[Double | Null] = js.undefined
    
    var placeholder: js.UndefOr[String | Null] = js.undefined
    
    var rawValue: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean | Null] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double | Null] = js.undefined
    
    var translations: js.UndefOr[NumberRange] = js.undefined
    
    var valid: js.UndefOr[
        typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.undefined
    
    var validators: js.UndefOr[js.Array[Validator[Double] | RegisteredValidator]] = js.undefined
    
    var value: js.UndefOr[Double | Null] = js.undefined
    
    var virtualKeyboard: js.UndefOr[auto | number | text] = js.undefined
  }
  object ojInputNumberSettablePropertiesLenient {
    
    inline def apply(): ojInputNumberSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojInputNumberSettablePropertiesLenient]
    }
    
    extension [Self <: ojInputNumberSettablePropertiesLenient](x: Self) {
      
      inline def setAsyncValidators(value: js.Array[AsyncValidator[Double]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
      
      inline def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
      
      inline def setAsyncValidatorsVarargs(value: AsyncValidator[Double]*): Self = StObject.set(x, "asyncValidators", js.Array(value*))
      
      inline def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setConverter(value: Converter[Double] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
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
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxNull: Self = StObject.set(x, "max", null)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      inline def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      inline def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value*))
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinNull: Self = StObject.set(x, "min", null)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepNull: Self = StObject.set(x, "step", null)
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTranslations(value: NumberRange): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      inline def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValidators(value: js.Array[Validator[Double] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      inline def setValidatorsVarargs(value: (Validator[Double] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVirtualKeyboard(value: auto | number | text): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
      
      inline def setVirtualKeyboardUndefined: Self = StObject.set(x, "virtualKeyboard", js.undefined)
    }
  }
}
