package typingsJapgolly.reactMdAutocomplete

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdAutocomplete.anon.FilterFunctionOptions
import typingsJapgolly.reactMdAutocomplete.anon.RequiredFixedPositioningT
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteData
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteFilterFunction
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteHandler
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteListboxPositionOptions
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteResult
import typingsJapgolly.reactMdList.typesListMod.ListElement
import typingsJapgolly.reactMdUtils.typesWiaAriaMovementUseKeyboardMovementMod.ItemRefList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseAutoCompleteMod {
  
  @JSImport("@react-md/autocomplete/types/useAutoComplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoComplete")(hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete.asInstanceOf[js.Any]).asInstanceOf[AutoCompleteReturnValue]
  
  trait AutoCompleteOptions
    extends StObject
       with EventHandlers
       with OptionalAutoCompleteProps
       with RequiredAutoCompleteProps
       with AutoCompleteListboxPositionOptions {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var forwardedRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var isInlineAutocomplete: Boolean
    
    var isListAutocomplete: Boolean
    
    var propValue: js.UndefOr[String] = js.undefined
    
    var suggestionsId: String
  }
  object AutoCompleteOptions {
    
    inline def apply(
      clearOnAutoComplete: Boolean,
      data: js.Array[AutoCompleteData],
      filter: AutoCompleteFilterFunction[js.Object],
      filterOnNoValue: Boolean,
      filterOptions: FilterFunctionOptions,
      getResultId: (/* id */ String, /* index */ Double) => String,
      getResultValue: (/* datum */ AutoCompleteData, /* valueKey */ String) => String,
      isInlineAutocomplete: Boolean,
      isListAutocomplete: Boolean,
      suggestionsId: String,
      valueKey: String
    ): AutoCompleteOptions = {
      val __obj = js.Dynamic.literal(clearOnAutoComplete = clearOnAutoComplete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterOnNoValue = filterOnNoValue.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], getResultId = js.Any.fromFunction2(getResultId), getResultValue = js.Any.fromFunction2(getResultValue), isInlineAutocomplete = isInlineAutocomplete.asInstanceOf[js.Any], isListAutocomplete = isListAutocomplete.asInstanceOf[js.Any], suggestionsId = suggestionsId.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteOptions]
    }
    
    extension [Self <: AutoCompleteOptions](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setForwardedRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setIsInlineAutocomplete(value: Boolean): Self = StObject.set(x, "isInlineAutocomplete", value.asInstanceOf[js.Any])
      
      inline def setIsListAutocomplete(value: Boolean): Self = StObject.set(x, "isListAutocomplete", value.asInstanceOf[js.Any])
      
      inline def setPropValue(value: String): Self = StObject.set(x, "propValue", value.asInstanceOf[js.Any])
      
      inline def setPropValueUndefined: Self = StObject.set(x, "propValue", js.undefined)
      
      inline def setSuggestionsId(value: String): Self = StObject.set(x, "suggestionsId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutoCompleteReturnValue extends StObject {
    
    var activeId: String = js.native
    
    var filteredData: js.Array[AutoCompleteData] = js.native
    
    var fixedStyle: js.UndefOr[CSSProperties] = js.native
    
    def handleAutoComplete(index: Double): Unit = js.native
    
    var handleBlur: FocusEventHandler[HTMLInputElement] = js.native
    
    var handleChange: ChangeEventHandler[HTMLInputElement] = js.native
    
    var handleClick: MouseEventHandler[HTMLInputElement] = js.native
    
    var handleFocus: FocusEventHandler[HTMLInputElement] = js.native
    
    var handleKeyDown: KeyboardEventHandler[HTMLInputElement] = js.native
    
    var itemRefs: ItemRefList[HTMLLIElement] = js.native
    
    var listboxRef: Ref[ListElement] = js.native
    
    var `match`: String = js.native
    
    def ref(): Unit = js.native
    def ref(instance: HTMLInputElement): Unit = js.native
    
    var transitionHooks: RequiredFixedPositioningT = js.native
    
    var value: String = js.native
    
    var visible: Boolean = js.native
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLInputElement>, 'onBlur' | 'onFocus' | 'onChange' | 'onClick' | 'onKeyDown'> */
  trait EventHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  }
  object EventHandlers {
    
    inline def apply(): EventHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'onAutoComplete' | 'disableShowOnFocus'> */
  trait OptionalAutoCompleteProps extends StObject {
    
    var disableShowOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var onAutoComplete: js.UndefOr[AutoCompleteHandler] = js.undefined
  }
  object OptionalAutoCompleteProps {
    
    inline def apply(): OptionalAutoCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalAutoCompleteProps]
    }
    
    extension [Self <: OptionalAutoCompleteProps](x: Self) {
      
      inline def setDisableShowOnFocus(value: Boolean): Self = StObject.set(x, "disableShowOnFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableShowOnFocusUndefined: Self = StObject.set(x, "disableShowOnFocus", js.undefined)
      
      inline def setOnAutoComplete(value: /* result */ AutoCompleteResult => Callback): Self = StObject.set(x, "onAutoComplete", js.Any.fromFunction1((t0: /* result */ AutoCompleteResult) => value(t0).runNow()))
      
      inline def setOnAutoCompleteUndefined: Self = StObject.set(x, "onAutoComplete", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'data' | 'filter' | 'filterOptions' | 'filterOnNoValue' | 'valueKey' | 'getResultId' | 'getResultValue' | 'clearOnAutoComplete'>> */
  trait RequiredAutoCompleteProps extends StObject {
    
    var clearOnAutoComplete: Boolean
    
    var data: js.Array[AutoCompleteData]
    
    var filter: AutoCompleteFilterFunction[js.Object]
    
    var filterOnNoValue: Boolean
    
    var filterOptions: FilterFunctionOptions
    
    var getResultId: js.Function2[/* id */ String, /* index */ Double, String]
    
    var getResultValue: js.Function2[/* datum */ AutoCompleteData, /* valueKey */ String, String]
    
    var valueKey: String
  }
  object RequiredAutoCompleteProps {
    
    inline def apply(
      clearOnAutoComplete: Boolean,
      data: js.Array[AutoCompleteData],
      filter: AutoCompleteFilterFunction[js.Object],
      filterOnNoValue: Boolean,
      filterOptions: FilterFunctionOptions,
      getResultId: (/* id */ String, /* index */ Double) => String,
      getResultValue: (/* datum */ AutoCompleteData, /* valueKey */ String) => String,
      valueKey: String
    ): RequiredAutoCompleteProps = {
      val __obj = js.Dynamic.literal(clearOnAutoComplete = clearOnAutoComplete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterOnNoValue = filterOnNoValue.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], getResultId = js.Any.fromFunction2(getResultId), getResultValue = js.Any.fromFunction2(getResultValue), valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredAutoCompleteProps]
    }
    
    extension [Self <: RequiredAutoCompleteProps](x: Self) {
      
      inline def setClearOnAutoComplete(value: Boolean): Self = StObject.set(x, "clearOnAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[AutoCompleteData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: AutoCompleteData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFilter(value: AutoCompleteFilterFunction[js.Object]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction3(
        value: (/* query */ String, /* data */ js.Array[AutoCompleteData], /* options */ typingsJapgolly.reactMdAutocomplete.typesTypesMod.FilterFunctionOptions[js.Object]) => js.Array[AutoCompleteData]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterOnNoValue(value: Boolean): Self = StObject.set(x, "filterOnNoValue", value.asInstanceOf[js.Any])
      
      inline def setFilterOptions(value: FilterFunctionOptions): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      inline def setGetResultId(value: (/* id */ String, /* index */ Double) => String): Self = StObject.set(x, "getResultId", js.Any.fromFunction2(value))
      
      inline def setGetResultValue(value: (/* datum */ AutoCompleteData, /* valueKey */ String) => String): Self = StObject.set(x, "getResultValue", js.Any.fromFunction2(value))
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
}
