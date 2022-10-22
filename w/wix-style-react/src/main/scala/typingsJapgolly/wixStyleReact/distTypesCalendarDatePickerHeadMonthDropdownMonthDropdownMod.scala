package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Months
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarDatePickerHeadMonthDropdownMonthDropdownMod {
  
  object default {
    
    inline def apply(hasClassNameMonthsDateOnChangeAriaLabelAriaLabelledBy: Months): Element = ^.asInstanceOf[js.Dynamic].apply(hasClassNameMonthsDateOnChangeAriaLabelAriaLabelledBy.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.ariaLabelledBy")
      @js.native
      val ariaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.date")
      @js.native
      val date: Validator[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.months")
      @js.native
      val months: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/DatePickerHead/MonthDropdown/MonthDropdown", "default.propTypes.onChange")
      @js.native
      val onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
}
