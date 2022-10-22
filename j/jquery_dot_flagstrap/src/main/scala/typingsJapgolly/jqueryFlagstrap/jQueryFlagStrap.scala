package typingsJapgolly.jqueryFlagstrap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jQueryFlagStrap {
  
  trait FlagStrapOptions extends StObject {
    
    /**
      * Default: "btn-md"
      * The bootstrap button size `class` for this drop down
      */
    var buttonSize: String
    
    /**
      * Default: "btn-default"
      * The bootstrap button type `class` for this drop down
      */
    var buttonType: String
    
    /**
      * Default: (all)
      * Only show specific countries
      * Example:
      * 
      * {"GB": "United Kingdom", "US": "United States"}
      * 
      * will only show the USA and UK.
      */
    var countries: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Default: uniquely generated
      * the `id` attribute for the actual `select` input
      */
    var inputId: js.UndefOr[String] = js.undefined
    
    /**
      * Default: uniquely generated
      * the `name` attribute for the actual `select` input
      */
    var inputName: String
    
    /**
      * Default: "20px"
      * The `margin` between `flag` and `text label`
      */
    var labelMargin: String
    
    /**
      * Default: null
      * This callback gets called each time the select is changed. It receives two parameters, the new value, and the select element.
      */
    var onSelect: js.UndefOr[js.Function2[/* value */ Any, /* element */ Any, Unit]] = js.undefined
    
    /**
      * Default: {value: "", text: "Please select a country"}
      * Set the placeholder value and text. To disable the placeholder define as (boolean) false.
      */
    var placeholder: Boolean | FlagStrapPlaceholderOptions
    
    /**
      * Default: false
      * Scrollable or full height drop down
      */
    var scrollable: Boolean
    
    /**
      * Default: "250px"
      * `max-height` for the scrollable drop down
      */
    var scrollableHeight: js.UndefOr[String] = js.undefined
  }
  object FlagStrapOptions {
    
    inline def apply(
      buttonSize: String,
      buttonType: String,
      inputName: String,
      labelMargin: String,
      placeholder: Boolean | FlagStrapPlaceholderOptions,
      scrollable: Boolean
    ): FlagStrapOptions = {
      val __obj = js.Dynamic.literal(buttonSize = buttonSize.asInstanceOf[js.Any], buttonType = buttonType.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], labelMargin = labelMargin.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], scrollable = scrollable.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagStrapOptions]
    }
    
    extension [Self <: FlagStrapOptions](x: Self) {
      
      inline def setButtonSize(value: String): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
      
      inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setCountries(value: js.Object): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      inline def setLabelMargin(value: String): Self = StObject.set(x, "labelMargin", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: (/* value */ Any, /* element */ Any) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* value */ Any, t1: /* element */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPlaceholder(value: Boolean | FlagStrapPlaceholderOptions): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableHeight(value: String): Self = StObject.set(x, "scrollableHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollableHeightUndefined: Self = StObject.set(x, "scrollableHeight", js.undefined)
    }
  }
  
  trait FlagStrapPlaceholderOptions extends StObject {
    
    var text: String
    
    var value: String
  }
  object FlagStrapPlaceholderOptions {
    
    inline def apply(text: String, value: String): FlagStrapPlaceholderOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagStrapPlaceholderOptions]
    }
    
    extension [Self <: FlagStrapPlaceholderOptions](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlagStrapStatic extends StObject {
    
    var flagStrap: js.UndefOr[Unit] = js.undefined
  }
  object FlagStrapStatic {
    
    inline def apply(): FlagStrapStatic = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagStrapStatic]
    }
    
    extension [Self <: FlagStrapStatic](x: Self) {
      
      inline def setFlagStrap(value: Unit): Self = StObject.set(x, "flagStrap", value.asInstanceOf[js.Any])
      
      inline def setFlagStrapUndefined: Self = StObject.set(x, "flagStrap", js.undefined)
    }
  }
}
