package typingsJapgolly.reactBootstrapTable.mod

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectFilter
  extends StObject
     with _Filter {
  
  /**
    * Condition. Can be 'eq' (exactly equal) or 'like' (contains the given string). Defaults to 'like'.
    */
  var condition: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    * Default value for the select filter.
    */
  var defaultValue: js.UndefOr[String | Double | Boolean] = js.undefined
  
  /**
    * Options for the filter select.
    */
  var options: SelectFilterOptionsType
  
  /**
    * Placeholder text to show in the filter.
    */
  var selectText: js.UndefOr[String] = js.undefined
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Filter type must be 'SelectFilter'
    */
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  
  /**
    * Disable the empty option in the dropdown filter.
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
}
object SelectFilter {
  
  inline def apply(options: SelectFilterOptionsType): SelectFilter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectFilter")
    __obj.asInstanceOf[SelectFilter]
  }
  
  extension [Self <: SelectFilter](x: Self) {
    
    inline def setCondition(value: FilterCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDefaultValue(value: String | Double | Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setOptions(value: SelectFilterOptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSelectText(value: String): Self = StObject.set(x, "selectText", value.asInstanceOf[js.Any])
    
    inline def setSelectTextUndefined: Self = StObject.set(x, "selectText", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
    
    inline def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
  }
}
