package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.anon.ConverterType
import typingsJapgolly.wixUiCore.anon.PartialOption
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.AddressOutput
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Handler
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.MapsClient
import typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.MapsClientConstructor
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.AppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsAddressInputAddressInputMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput", "AddressInput")
  @js.native
  open class AddressInput protected () extends PureComponent[AddressInputProps, AddressInputState, Any] {
    def this(props: Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MAddressInput(nextProps: Any): Unit = js.native
    
    def _createOptionFromAddress(address: Any): Option = js.native
    
    def _forceSelectIfNeeded(): js.Promise[Unit] = js.native
    
    def _getAddressOptions(input: String): js.Promise[Unit] = js.native
    
    def _getGeocode(placeId: String, description: String, rawInputValue: String): js.Promise[Unit] = js.native
    def _getGeocode(placeId: Double, description: String, rawInputValue: String): js.Promise[Unit] = js.native
    
    def _getKey(): String = js.native
    
    def _getPlaceDetails(placeId: String, description: String, rawInputValue: String): js.Promise[Unit] = js.native
    def _getPlaceDetails(placeId: Double, description: String, rawInputValue: String): js.Promise[Unit] = js.native
    
    def _handleClientError(e: Any): Unit = js.native
    
    def _handleContentMouseDown(e: Any): Unit = js.native
    
    def _handleOnBlur(): js.Promise[Unit] = js.native
    
    def _handleOnChange(e: ReactEventFrom[HTMLInputElement]): js.Promise[Unit] = js.native
    
    def _handleOnManualInput(value: String): js.Promise[Unit] = js.native
    
    def _invokeOnSelect(value: Any): Unit = js.native
    
    def _onSelect(): js.Promise[Unit] = js.native
    def _onSelect(option: Option): js.Promise[Unit] = js.native
    
    def _options(): js.Array[Option] = js.native
    
    def _renderOption(`val`: Any): Element = js.native
    
    var addressRequestId: Any = js.native
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    var client: MapsClient = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAddressInput(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAddressInput(): Unit = js.native
    
    var currentAddressRequest: Any = js.native
    
    def focus(): Unit = js.native
    
    var geocodeRequestId: Any = js.native
    
    var inputRef: Any = js.native
    
    var inputWithOptionsRef: Any = js.native
    
    var optionWasSelected: Boolean = js.native
    
    var placeDetailsRequestId: Any = js.native
    
    var unmounted: Boolean = js.native
  }
  /* static members */
  object AddressInput {
    
    @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput", "AddressInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput", "AddressInput.defaultProps")
    @js.native
    def defaultProps: ConverterType = js.native
    inline def defaultProps_=(x: ConverterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput", "AddressInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait Converter extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput", "Converter")
  @js.native
  object Converter extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Converter & String] = js.native
    
    @js.native
    sealed trait full
      extends StObject
         with Converter
    /* "full" */ val full: typingsJapgolly.wixUiCore.distEsSrcComponentsAddressInputAddressInputMod.Converter.full & String = js.native
    
    @js.native
    sealed trait simple
      extends StObject
         with Converter
    /* "simple" */ val simple: typingsJapgolly.wixUiCore.distEsSrcComponentsAddressInputAddressInputMod.Converter.simple & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/address-input/AddressInput", "Handler")
  @js.native
  object Handler extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Handler & String] = js.native
    
    /* "geocode" */ val geocode: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Handler.geocode & String = js.native
    
    /* "places" */ val places: typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod.Handler.places & String = js.native
  }
  
  /* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/es/src/components/input-with-options/InputWithOptions.InputWithOptionsProps, 'fixed' | 'flip' | 'moveBy' | 'placement' | 'emptyStateMessage' | 'dynamicWidth'> & {  data-hook :string | undefined,   Client :wix-ui-core.wix-ui-core/dist/es/src/clients/GoogleMaps/types.MapsClientConstructor, onSelect (raw : wix-ui-core.wix-ui-core/dist/es/src/clients/GoogleMaps/types.AddressOutput): void,   apiKey :string | undefined,   clientId :string | undefined,   lang :string | undefined,   instance :string | undefined,   handler :wix-ui-core.wix-ui-core/dist/es/src/clients/GoogleMaps/types.Handler | undefined,   countryCode :string | undefined,   placeholder :string | undefined,   disabled :boolean | undefined,   readOnly :boolean | undefined,   onChange :react.react.ChangeEventHandler<std.HTMLInputElement> | undefined,   onKeyDown :react.react.KeyboardEventHandler<std.HTMLInputElement> | undefined,   onFocus :(): void | undefined,   onBlur :(): void | undefined,   clearSuggestionsOnBlur :boolean | undefined,   onManualInput :(value : string): void | undefined,   filterTypes :std.Array<string> | undefined,   types :std.Array<string> | undefined,   value :string | undefined,   fallbackToManual :boolean | undefined,   forceContentElementVisibility :boolean | undefined,   forceOptions :std.Array<std.Partial<wix-ui-core.wix-ui-core/dist/es/src/components/dropdown-option.Option>> | undefined,   forceSelect :boolean | undefined,   throttleInterval :number | undefined,   locationIcon :react.react.ReactNode | undefined,   style :object | undefined,   inputStyle :react.react.CSSProperties | undefined,   optionStyle :react.react.CSSProperties | undefined,   prefix :react.react.ReactNode | undefined,   suffix :react.react.ReactNode | undefined,   fixedFooter :react.react.ReactNode | undefined,   id :string | undefined,   aria-label :string | undefined,   onError :(err : std.Error): void | undefined,   onClick :(): void | undefined,   onDoubleClick :(): void | undefined,   onMouseEnter :(): void | undefined,   onMouseLeave :(): void | undefined,   converterType :wix-ui-core.wix-ui-core/dist/es/src/components/address-input/AddressInput.Converter | undefined,   inputClassName :string | undefined,   optionsContainerZIndex :number | undefined,   className :string | undefined,   required :boolean | undefined,   externalBaseUrl :string | undefined,   locale :string | undefined,   appendTo :wix-ui-core.wix-ui-core/dist/es/src/components/popover.AppendTo | undefined} */
  trait AddressInputProps extends StObject {
    
    /** Maps client, should implement autocomplete, geocode and placeDetails methods */
    var Client: MapsClientConstructor
    
    /** Maps API key */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /** Element to append the dropdown container to */
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    /** aria-label - accessibility*/
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Remove previously fetched addresses upon blur */
    var clearSuggestionsOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /** Maps client ID */
    var clientId: js.UndefOr[String] = js.undefined
    
    /** A custom formatter for maps API response. Converter of type full is not supported with Atlas provider at the moment. */
    var converterType: js.UndefOr[Converter] = js.undefined
    
    /** Limit addresses to certain country */
    var countryCode: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Sets the input to disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    var emptyStateMessage: js.UndefOr[String] = js.undefined
    
    /** externalBaseUrl to provide to Atlas clients */
    var externalBaseUrl: js.UndefOr[String] = js.undefined
    
    /** If set to `true`, we will attempt to get a Google location from the input's text if there are no suggestions. This is useful when looking for locations for which google does not give suggestions - for example: Apartment/Apt. This is currently not supported with Atlas provider */
    var fallbackToManual: js.UndefOr[Boolean] = js.undefined
    
    /** Lower level filtering of autocomplete result types (see [here](https://developers.google.com/places/supported_types) for list). This is currently not supported with Atlas provider  */
    var filterTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** Fixed footer in content element */
    var fixedFooter: js.UndefOr[Node] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, content element will always be visible, used for preview mode */
    var forceContentElementVisibility: js.UndefOr[Boolean] = js.undefined
    
    /** Options to override default one, used for preview mode */
    var forceOptions: js.UndefOr[js.Array[PartialOption]] = js.undefined
    
    /** Force first option selection when user leaves component */
    var forceSelect: js.UndefOr[Boolean] = js.undefined
    
    /** Address handler - geocode or places. This is currently not supported with Atlas provider */
    var handler: js.UndefOr[Handler] = js.undefined
    
    /** Id */
    var id: js.UndefOr[String] = js.undefined
    
    /** Pass a custom class to the input element */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /** Input inline styles */
    var inputStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Metasite instance for Atlas */
    var instance: js.UndefOr[String] = js.undefined
    
    /** Maps language */
    var lang: js.UndefOr[String] = js.undefined
    
    /** Maps locale */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Node to be rendered in front of each suggestion */
    var locationIcon: js.UndefOr[Node] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    /** Standard input onBlur callback */
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Standard input onChange callback */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    /** Standard input onClick callback */
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Standard input onDoubleClick callback */
    var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Pass errors from Google Client to callback */
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    /** Standard input onFocus callback */
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Standard input onKeyDown callback */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    /** Callback when the user pressed the Enter key or Tab key after he wrote in the Input field - meaning the user selected something not in the list  */
    var onManualInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Standard input onMouseEnter callback */
    var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Standard input onMouseLeave callback */
    var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Handler for when an option is selected */
    def onSelect(raw: AddressOutput): Unit
    
    /** Option inline styles */
    var optionStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Options box z-index */
    var optionsContainerZIndex: js.UndefOr[Double] = js.undefined
    
    /** Placeholder to display */
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    /** Prefix for input */
    var prefix: js.UndefOr[Node] = js.undefined
    
    /** Sets the input to readOnly */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the input to required */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** Inline styles */
    var style: js.UndefOr[js.Object] = js.undefined
    
    /** Suffix for input */
    var suffix: js.UndefOr[Node] = js.undefined
    
    /** Options to override default throttle value, 0 used to disable throttle */
    var throttleInterval: js.UndefOr[Double] = js.undefined
    
    /** Limit the autocomplete to specific types (see [here](https://developers.google.com/places/supported_types#table3) for list) */
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Inputs value */
    var value: js.UndefOr[String] = js.undefined
  }
  object AddressInputProps {
    
    inline def apply(Client: MapsClientConstructor, onSelect: AddressOutput => Callback): AddressInputProps = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: AddressOutput) => onSelect(t0).runNow()))
      __obj.asInstanceOf[AddressInputProps]
    }
    
    extension [Self <: AddressInputProps](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ org.scalajs.dom.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearSuggestionsOnBlur(value: Boolean): Self = StObject.set(x, "clearSuggestionsOnBlur", value.asInstanceOf[js.Any])
      
      inline def setClearSuggestionsOnBlurUndefined: Self = StObject.set(x, "clearSuggestionsOnBlur", js.undefined)
      
      inline def setClient(value: MapsClientConstructor): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setConverterType(value: Converter): Self = StObject.set(x, "converterType", value.asInstanceOf[js.Any])
      
      inline def setConverterTypeUndefined: Self = StObject.set(x, "converterType", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      inline def setEmptyStateMessage(value: String): Self = StObject.set(x, "emptyStateMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyStateMessageUndefined: Self = StObject.set(x, "emptyStateMessage", js.undefined)
      
      inline def setExternalBaseUrl(value: String): Self = StObject.set(x, "externalBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setExternalBaseUrlUndefined: Self = StObject.set(x, "externalBaseUrl", js.undefined)
      
      inline def setFallbackToManual(value: Boolean): Self = StObject.set(x, "fallbackToManual", value.asInstanceOf[js.Any])
      
      inline def setFallbackToManualUndefined: Self = StObject.set(x, "fallbackToManual", js.undefined)
      
      inline def setFilterTypes(value: js.Array[String]): Self = StObject.set(x, "filterTypes", value.asInstanceOf[js.Any])
      
      inline def setFilterTypesUndefined: Self = StObject.set(x, "filterTypes", js.undefined)
      
      inline def setFilterTypesVarargs(value: String*): Self = StObject.set(x, "filterTypes", js.Array(value*))
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedFooter(value: VdomNode): Self = StObject.set(x, "fixedFooter", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFixedFooterNull: Self = StObject.set(x, "fixedFooter", null)
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "fixedFooter", js.Array(value*))
      
      inline def setFixedFooterVdomElement(value: VdomElement): Self = StObject.set(x, "fixedFooter", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setForceContentElementVisibility(value: Boolean): Self = StObject.set(x, "forceContentElementVisibility", value.asInstanceOf[js.Any])
      
      inline def setForceContentElementVisibilityUndefined: Self = StObject.set(x, "forceContentElementVisibility", js.undefined)
      
      inline def setForceOptions(value: js.Array[PartialOption]): Self = StObject.set(x, "forceOptions", value.asInstanceOf[js.Any])
      
      inline def setForceOptionsUndefined: Self = StObject.set(x, "forceOptions", js.undefined)
      
      inline def setForceOptionsVarargs(value: PartialOption*): Self = StObject.set(x, "forceOptions", js.Array(value*))
      
      inline def setForceSelect(value: Boolean): Self = StObject.set(x, "forceSelect", value.asInstanceOf[js.Any])
      
      inline def setForceSelectUndefined: Self = StObject.set(x, "forceSelect", js.undefined)
      
      inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocationIcon(value: VdomNode): Self = StObject.set(x, "locationIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLocationIconNull: Self = StObject.set(x, "locationIcon", null)
      
      inline def setLocationIconUndefined: Self = StObject.set(x, "locationIcon", js.undefined)
      
      inline def setLocationIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "locationIcon", js.Array(value*))
      
      inline def setLocationIconVdomElement(value: VdomElement): Self = StObject.set(x, "locationIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDoubleClick(value: Callback): Self = StObject.set(x, "onDoubleClick", value.toJsFn)
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnError(value: /* err */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnManualInput(value: /* value */ String => Callback): Self = StObject.set(x, "onManualInput", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnManualInputUndefined: Self = StObject.set(x, "onManualInput", js.undefined)
      
      inline def setOnMouseEnter(value: Callback): Self = StObject.set(x, "onMouseEnter", value.toJsFn)
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: Callback): Self = StObject.set(x, "onMouseLeave", value.toJsFn)
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnSelect(value: AddressOutput => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: AddressOutput) => value(t0).runNow()))
      
      inline def setOptionStyle(value: CSSProperties): Self = StObject.set(x, "optionStyle", value.asInstanceOf[js.Any])
      
      inline def setOptionStyleUndefined: Self = StObject.set(x, "optionStyle", js.undefined)
      
      inline def setOptionsContainerZIndex(value: Double): Self = StObject.set(x, "optionsContainerZIndex", value.asInstanceOf[js.Any])
      
      inline def setOptionsContainerZIndexUndefined: Self = StObject.set(x, "optionsContainerZIndex", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefix(value: VdomNode): Self = StObject.set(x, "prefix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prefix", js.Array(value*))
      
      inline def setPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "prefix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setThrottleInterval(value: Double): Self = StObject.set(x, "throttleInterval", value.asInstanceOf[js.Any])
      
      inline def setThrottleIntervalUndefined: Self = StObject.set(x, "throttleInterval", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait AddressInputState extends StObject {
    
    var inputValue: String
    
    var isDirty: Boolean
    
    var options: js.Array[Option]
  }
  object AddressInputState {
    
    inline def apply(inputValue: String, isDirty: Boolean, options: js.Array[Option]): AddressInputState = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInputState]
    }
    
    extension [Self <: AddressInputState](x: Self) {
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
}
