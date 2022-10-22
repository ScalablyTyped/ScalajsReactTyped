package typingsJapgolly.reactPlacesAutocomplete

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.googleMaps.google.maps.LatLng
import typingsJapgolly.googleMaps.google.maps.LatLngBounds
import typingsJapgolly.googleMaps.google.maps.LatLngBoundsLiteral
import typingsJapgolly.googleMaps.google.maps.LatLngLiteral
import typingsJapgolly.googleMaps.google.maps.places.ComponentRestrictions
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactPlacesAutocomplete.mod.Suggestion
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.combobox
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.list
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.off
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.option
import typingsJapgolly.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ariaactivedescendant extends StObject {
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: list
    
    var `aria-expanded`: Boolean
    
    var autoComplete: off
    
    var disabled: Boolean
    
    var onBlur: FocusEventHandler[Element]
    
    def onChange(ev: Target): Unit
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var role: combobox
    
    var `type`: text
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Ariaactivedescendant {
    
    inline def apply(
      `aria-expanded`: Boolean,
      disabled: Boolean,
      onBlur: ReactFocusEventFrom[Element & Element] => Callback,
      onChange: Target => Callback,
      onKeyDown: ReactKeyboardEventFrom[Element & Element] => Callback
    ): Ariaactivedescendant = {
      val __obj = js.Dynamic.literal(autoComplete = "off", disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => onBlur(t0).runNow()), onChange = js.Any.fromFunction1((t0: Target) => onChange(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyDown(t0).runNow()), role = "combobox")
      __obj.updateDynamic("aria-autocomplete")("list")
      __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Ariaactivedescendant]
    }
    
    extension [Self <: Ariaactivedescendant](x: Self) {
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-autocomplete`(value: list): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def setAutoComplete(value: off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnChange(value: Target => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setRole(value: combobox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Bounds extends StObject {
    
    var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
    
    var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
    
    var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var radius: js.UndefOr[Double | String] = js.undefined
    
    var sessionToken: js.UndefOr[Any] = js.undefined
    
    var types: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Bounds {
    
    inline def apply(): Bounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
      
      inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
      
      inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSessionToken(value: Any): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var key: Double
    
    var onClick: MouseEventHandler[Element]
    
    var onMouseDown: MouseEventHandler[Element]
    
    var onMouseEnter: MouseEventHandler[Element]
    
    var onMouseLeave: MouseEventHandler[Element]
    
    var onMouseUp: MouseEventHandler[Element]
    
    var onTouchEnd: TouchEventHandler[Element]
    
    var onTouchStart: TouchEventHandler[Element]
    
    var role: option
  }
  object Id {
    
    inline def apply(
      key: Double,
      onClick: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseDown: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseEnter: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseLeave: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseUp: ReactMouseEventFrom[Element & Element] => Callback,
      onTouchEnd: ReactTouchEventFrom[Element & Element] => Callback,
      onTouchStart: ReactTouchEventFrom[Element & Element] => Callback
    ): Id = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onClick(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseDown(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseLeave(t0).runNow()), onMouseUp = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseUp(t0).runNow()), onTouchEnd = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchEnd(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchStart(t0).runNow()), role = "option")
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setRole(value: option): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait MainText extends StObject {
    
    var mainText: String
    
    var secondaryText: String
  }
  object MainText {
    
    inline def apply(mainText: String, secondaryText: String): MainText = {
      val __obj = js.Dynamic.literal(mainText = mainText.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainText]
    }
    
    extension [Self <: MainText](x: Self) {
      
      inline def setMainText(value: String): Self = StObject.set(x, "mainText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  loading :boolean,   suggestions :std.ReadonlyArray<react-places-autocomplete.react-places-autocomplete.Suggestion>, getInputProps <InputProps extends {}>(options : InputProps | undefined): {  type :'text',   autoComplete :'off',   role :'combobox',   aria-autocomplete :'list',   aria-expanded :boolean,   aria-activedescendant :string | undefined,   disabled :boolean,   onKeyDown :react.react.KeyboardEventHandler<std.Element>,   onBlur :react.react.FocusEventHandler<std.Element>,   value :string | undefined, onChange (ev : {  target :{  value :string}}): void} & InputProps, getSuggestionItemProps <SuggestionProps extends {}>(suggestion : react-places-autocomplete.react-places-autocomplete.Suggestion, options : SuggestionProps | undefined): {  key :number,   id :string | undefined,   role :'option',   onMouseEnter :react.react.MouseEventHandler<std.Element>,   onMouseLeave :react.react.MouseEventHandler<std.Element>,   onMouseDown :react.react.MouseEventHandler<std.Element>,   onMouseUp :react.react.MouseEventHandler<std.Element>,   onTouchStart :react.react.TouchEventHandler<std.Element>,   onTouchEnd :react.react.TouchEventHandler<std.Element>,   onClick :react.react.MouseEventHandler<std.Element>} & SuggestionProps}> */
  trait Readonlyloadingbooleansug extends StObject {
    
    val getInputProps: js.Function1[/* options */ js.UndefOr[js.Object], Ariaactivedescendant & js.Object]
    
    val getSuggestionItemProps: js.Function2[/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object], Id & js.Object]
    
    val loading: Boolean
    
    val suggestions: js.Array[Suggestion]
  }
  object Readonlyloadingbooleansug {
    
    inline def apply(
      getInputProps: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant & js.Object,
      getSuggestionItemProps: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id & js.Object,
      loading: Boolean,
      suggestions: js.Array[Suggestion]
    ): Readonlyloadingbooleansug = {
      val __obj = js.Dynamic.literal(getInputProps = js.Any.fromFunction1(getInputProps), getSuggestionItemProps = js.Any.fromFunction2(getSuggestionItemProps), loading = loading.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlyloadingbooleansug]
    }
    
    extension [Self <: Readonlyloadingbooleansug](x: Self) {
      
      inline def setGetInputProps(value: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant & js.Object): Self = StObject.set(x, "getInputProps", js.Any.fromFunction1(value))
      
      inline def setGetSuggestionItemProps(value: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id & js.Object): Self = StObject.set(x, "getSuggestionItemProps", js.Any.fromFunction2(value))
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setSuggestions(value: js.Array[Suggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVarargs(value: Suggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
    }
  }
  
  trait Target extends StObject {
    
    var target: Value
  }
  object Target {
    
    inline def apply(target: Value): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: Value): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
