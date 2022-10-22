package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.CurrentAny
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.phoneInputTypesMod.CountrySelectProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputCountrySelectMod {
  
  object default {
    
    inline def apply(props: CountrySelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/phone-input/country-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.error")
      @js.native
      def error: Boolean = js.native
      inline def error_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.inputRef")
      @js.native
      def inputRef: CurrentAny = js.native
      inline def inputRef_=(x: CurrentAny): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.maxDropdownHeight")
      @js.native
      def maxDropdownHeight: String = js.native
      inline def maxDropdownHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.maxDropdownWidth")
      @js.native
      def maxDropdownWidth: String = js.native
      inline def maxDropdownWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDropdownWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.positive")
      @js.native
      def positive: Boolean = js.native
      inline def positive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positive")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/phone-input/country-select", "default.defaultProps.size")
      @js.native
      def size: default_ = js.native
      inline def size_=(x: default_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
}
