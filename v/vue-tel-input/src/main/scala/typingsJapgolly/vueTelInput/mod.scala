package typingsJapgolly.vueTelInput

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-tel-input", JSImport.Default)
  @js.native
  val default: VueTelInputConstructor = js.native
  
  @JSImport("vue-tel-input", "VueTelInput")
  @js.native
  val VueTelInput: VueTelInputConstructor = js.native
  
  trait VueTelInputComputed extends StObject {
    
    def filteredCountries(): js.Array[String]
    
    def formattedResult(): String
    
    def mode(): String
    
    def response(): VueTelInputResponse
    
    def sortedCountries(): js.Array[String]
    
    def state(): Boolean
  }
  object VueTelInputComputed {
    
    inline def apply(
      filteredCountries: CallbackTo[js.Array[String]],
      formattedResult: CallbackTo[String],
      mode: CallbackTo[String],
      response: CallbackTo[VueTelInputResponse],
      sortedCountries: CallbackTo[js.Array[String]],
      state: CallbackTo[Boolean]
    ): VueTelInputComputed = {
      val __obj = js.Dynamic.literal(filteredCountries = filteredCountries.toJsFn, formattedResult = formattedResult.toJsFn, mode = mode.toJsFn, response = response.toJsFn, sortedCountries = sortedCountries.toJsFn, state = state.toJsFn)
      __obj.asInstanceOf[VueTelInputComputed]
    }
    
    extension [Self <: VueTelInputComputed](x: Self) {
      
      inline def setFilteredCountries(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "filteredCountries", value.toJsFn)
      
      inline def setFormattedResult(value: CallbackTo[String]): Self = StObject.set(x, "formattedResult", value.toJsFn)
      
      inline def setMode(value: CallbackTo[String]): Self = StObject.set(x, "mode", value.toJsFn)
      
      inline def setResponse(value: CallbackTo[VueTelInputResponse]): Self = StObject.set(x, "response", value.toJsFn)
      
      inline def setSortedCountries(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "sortedCountries", value.toJsFn)
      
      inline def setState(value: CallbackTo[Boolean]): Self = StObject.set(x, "state", value.toJsFn)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait VueTelInputConstructor extends StObject {
    
    var computed: VueTelInputComputed
    
    def data(): VueTelInputData
    
    var directives: VueTelInputDirective
    
    var install: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<never> */ Any
    
    var methods: VueTelInputMethods
    
    var props: VueTelInputProps
    
    var watch: VueTelInputWatch
  }
  object VueTelInputConstructor {
    
    inline def apply(
      computed: VueTelInputComputed,
      data: CallbackTo[VueTelInputData],
      directives: VueTelInputDirective,
      install: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<never> */ Any,
      methods: VueTelInputMethods,
      props: VueTelInputProps,
      watch: VueTelInputWatch
    ): VueTelInputConstructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, directives = directives.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputConstructor]
    }
    
    extension [Self <: VueTelInputConstructor](x: Self) {
      
      inline def setComputed(value: VueTelInputComputed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[VueTelInputData]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setDirectives(value: VueTelInputDirective): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setInstall(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFunction<never> */ Any
      ): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: VueTelInputMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VueTelInputProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: VueTelInputWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputCountryOption extends StObject {
    
    var iso2: String
  }
  object VueTelInputCountryOption {
    
    inline def apply(iso2: String): VueTelInputCountryOption = {
      val __obj = js.Dynamic.literal(iso2 = iso2.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputCountryOption]
    }
    
    extension [Self <: VueTelInputCountryOption](x: Self) {
      
      inline def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputData extends StObject {
    
    var activeCountry: VueTelInputCountryOption
    
    var open: Boolean
    
    var phone: String
    
    var selectedIndex: Any
    
    var typeToFindInput: String
    
    var typeToFindTimer: Any
  }
  object VueTelInputData {
    
    inline def apply(
      activeCountry: VueTelInputCountryOption,
      open: Boolean,
      phone: String,
      selectedIndex: Any,
      typeToFindInput: String,
      typeToFindTimer: Any
    ): VueTelInputData = {
      val __obj = js.Dynamic.literal(activeCountry = activeCountry.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], typeToFindInput = typeToFindInput.asInstanceOf[js.Any], typeToFindTimer = typeToFindTimer.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputData]
    }
    
    extension [Self <: VueTelInputData](x: Self) {
      
      inline def setActiveCountry(value: VueTelInputCountryOption): Self = StObject.set(x, "activeCountry", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Any): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setTypeToFindInput(value: String): Self = StObject.set(x, "typeToFindInput", value.asInstanceOf[js.Any])
      
      inline def setTypeToFindTimer(value: Any): Self = StObject.set(x, "typeToFindTimer", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputDirective extends StObject {
    
    var `click-outside`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveOptions */ Any
  }
  object VueTelInputDirective {
    
    inline def apply(
      `click-outside`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveOptions */ Any
    ): VueTelInputDirective = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("click-outside")(`click-outside`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputDirective]
    }
    
    extension [Self <: VueTelInputDirective](x: Self) {
      
      inline def `setClick-outside`(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DirectiveOptions */ Any
      ): Self = StObject.set(x, "click-outside", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputDowndownOption extends StObject {
    
    var disabledDialCode: Boolean
  }
  object VueTelInputDowndownOption {
    
    inline def apply(disabledDialCode: Boolean): VueTelInputDowndownOption = {
      val __obj = js.Dynamic.literal(disabledDialCode = disabledDialCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputDowndownOption]
    }
    
    extension [Self <: VueTelInputDowndownOption](x: Self) {
      
      inline def setDisabledDialCode(value: Boolean): Self = StObject.set(x, "disabledDialCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputInputOption extends StObject {
    
    var showDialCode: Boolean
  }
  object VueTelInputInputOption {
    
    inline def apply(showDialCode: Boolean): VueTelInputInputOption = {
      val __obj = js.Dynamic.literal(showDialCode = showDialCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputInputOption]
    }
    
    extension [Self <: VueTelInputInputOption](x: Self) {
      
      inline def setShowDialCode(value: Boolean): Self = StObject.set(x, "showDialCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputMethods extends StObject {
    
    def choose(country: Any): Unit
    
    def clickedOutside(): Unit
    
    def findCountry(iso: String): js.Array[Any]
    
    def getCountries(list: js.Array[Any]): js.Array[Any]
    
    def getItemClass(index: Double, iso2: String): Any
    
    def initializeCountry(): Unit
    
    def keyboardNav(e: Event): Unit
    
    def onBlur(): Unit
    
    def onInput(): Unit
    
    def reset(): Unit
    
    def toggleDropdown(): Unit
  }
  object VueTelInputMethods {
    
    inline def apply(
      choose: Any => Callback,
      clickedOutside: Callback,
      findCountry: String => js.Array[Any],
      getCountries: js.Array[Any] => js.Array[Any],
      getItemClass: (Double, String) => Any,
      initializeCountry: Callback,
      keyboardNav: Event => Callback,
      onBlur: Callback,
      onInput: Callback,
      reset: Callback,
      toggleDropdown: Callback
    ): VueTelInputMethods = {
      val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1((t0: Any) => choose(t0).runNow()), clickedOutside = clickedOutside.toJsFn, findCountry = js.Any.fromFunction1(findCountry), getCountries = js.Any.fromFunction1(getCountries), getItemClass = js.Any.fromFunction2(getItemClass), initializeCountry = initializeCountry.toJsFn, keyboardNav = js.Any.fromFunction1((t0: Event) => keyboardNav(t0).runNow()), onBlur = onBlur.toJsFn, onInput = onInput.toJsFn, reset = reset.toJsFn, toggleDropdown = toggleDropdown.toJsFn)
      __obj.asInstanceOf[VueTelInputMethods]
    }
    
    extension [Self <: VueTelInputMethods](x: Self) {
      
      inline def setChoose(value: Any => Callback): Self = StObject.set(x, "choose", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setClickedOutside(value: Callback): Self = StObject.set(x, "clickedOutside", value.toJsFn)
      
      inline def setFindCountry(value: String => js.Array[Any]): Self = StObject.set(x, "findCountry", js.Any.fromFunction1(value))
      
      inline def setGetCountries(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "getCountries", js.Any.fromFunction1(value))
      
      inline def setGetItemClass(value: (Double, String) => Any): Self = StObject.set(x, "getItemClass", js.Any.fromFunction2(value))
      
      inline def setInitializeCountry(value: Callback): Self = StObject.set(x, "initializeCountry", value.toJsFn)
      
      inline def setKeyboardNav(value: Event => Callback): Self = StObject.set(x, "keyboardNav", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnInput(value: Callback): Self = StObject.set(x, "onInput", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setToggleDropdown(value: Callback): Self = StObject.set(x, "toggleDropdown", value.toJsFn)
    }
  }
  
  trait VueTelInputProps extends StObject {
    
    var autocomplete: String
    
    var defaultCountry: String
    
    var disabled: Boolean
    
    var disabledFetchingCountry: Boolean
    
    var disabledFormatting: Boolean
    
    var dropdownOptions: VueTelInputDowndownOption
    
    var enabledCountryCode: Boolean
    
    var enabledFlags: Boolean
    
    var ignoredCountries: js.Array[Any]
    
    var inputClasses: String
    
    var inputOptions: VueTelInputInputOption
    
    var invalidMsg: String
    
    var maxLen: Double
    
    var name: String
    
    var onlyCountries: js.Array[Any]
    
    var placeholder: String
    
    var preferredCountries: Boolean
    
    var required: Boolean
    
    var value: String
    
    var wrapperClasses: String
  }
  object VueTelInputProps {
    
    inline def apply(
      autocomplete: String,
      defaultCountry: String,
      disabled: Boolean,
      disabledFetchingCountry: Boolean,
      disabledFormatting: Boolean,
      dropdownOptions: VueTelInputDowndownOption,
      enabledCountryCode: Boolean,
      enabledFlags: Boolean,
      ignoredCountries: js.Array[Any],
      inputClasses: String,
      inputOptions: VueTelInputInputOption,
      invalidMsg: String,
      maxLen: Double,
      name: String,
      onlyCountries: js.Array[Any],
      placeholder: String,
      preferredCountries: Boolean,
      required: Boolean,
      value: String,
      wrapperClasses: String
    ): VueTelInputProps = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], defaultCountry = defaultCountry.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledFetchingCountry = disabledFetchingCountry.asInstanceOf[js.Any], disabledFormatting = disabledFormatting.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any], enabledCountryCode = enabledCountryCode.asInstanceOf[js.Any], enabledFlags = enabledFlags.asInstanceOf[js.Any], ignoredCountries = ignoredCountries.asInstanceOf[js.Any], inputClasses = inputClasses.asInstanceOf[js.Any], inputOptions = inputOptions.asInstanceOf[js.Any], invalidMsg = invalidMsg.asInstanceOf[js.Any], maxLen = maxLen.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onlyCountries = onlyCountries.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preferredCountries = preferredCountries.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], wrapperClasses = wrapperClasses.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputProps]
    }
    
    extension [Self <: VueTelInputProps](x: Self) {
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledFetchingCountry(value: Boolean): Self = StObject.set(x, "disabledFetchingCountry", value.asInstanceOf[js.Any])
      
      inline def setDisabledFormatting(value: Boolean): Self = StObject.set(x, "disabledFormatting", value.asInstanceOf[js.Any])
      
      inline def setDropdownOptions(value: VueTelInputDowndownOption): Self = StObject.set(x, "dropdownOptions", value.asInstanceOf[js.Any])
      
      inline def setEnabledCountryCode(value: Boolean): Self = StObject.set(x, "enabledCountryCode", value.asInstanceOf[js.Any])
      
      inline def setEnabledFlags(value: Boolean): Self = StObject.set(x, "enabledFlags", value.asInstanceOf[js.Any])
      
      inline def setIgnoredCountries(value: js.Array[Any]): Self = StObject.set(x, "ignoredCountries", value.asInstanceOf[js.Any])
      
      inline def setIgnoredCountriesVarargs(value: Any*): Self = StObject.set(x, "ignoredCountries", js.Array(value*))
      
      inline def setInputClasses(value: String): Self = StObject.set(x, "inputClasses", value.asInstanceOf[js.Any])
      
      inline def setInputOptions(value: VueTelInputInputOption): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
      
      inline def setInvalidMsg(value: String): Self = StObject.set(x, "invalidMsg", value.asInstanceOf[js.Any])
      
      inline def setMaxLen(value: Double): Self = StObject.set(x, "maxLen", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnlyCountries(value: js.Array[Any]): Self = StObject.set(x, "onlyCountries", value.asInstanceOf[js.Any])
      
      inline def setOnlyCountriesVarargs(value: Any*): Self = StObject.set(x, "onlyCountries", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPreferredCountries(value: Boolean): Self = StObject.set(x, "preferredCountries", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWrapperClasses(value: String): Self = StObject.set(x, "wrapperClasses", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputResponse extends StObject {
    
    var country: VueTelInputCountryOption
    
    var isValid: Boolean
    
    var number: String
  }
  object VueTelInputResponse {
    
    inline def apply(country: VueTelInputCountryOption, isValid: Boolean, number: String): VueTelInputResponse = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTelInputResponse]
    }
    
    extension [Self <: VueTelInputResponse](x: Self) {
      
      inline def setCountry(value: VueTelInputCountryOption): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueTelInputWatch extends StObject {
    
    def state(value: Any): Unit
    
    def value(): Unit
  }
  object VueTelInputWatch {
    
    inline def apply(state: Any => Callback, value: Callback): VueTelInputWatch = {
      val __obj = js.Dynamic.literal(state = js.Any.fromFunction1((t0: Any) => state(t0).runNow()), value = value.toJsFn)
      __obj.asInstanceOf[VueTelInputWatch]
    }
    
    extension [Self <: VueTelInputWatch](x: Self) {
      
      inline def setState(value: Any => Callback): Self = StObject.set(x, "state", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setValue(value: Callback): Self = StObject.set(x, "value", value.toJsFn)
    }
  }
  
  type _To = VueTelInputConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueTelInputConstructor = default
}
