package typingsJapgolly.reactBootstrapTable.mod

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexFilter
  extends StObject
     with _Filter {
  
  /**
    * Default value
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Placeholder text to show in the filter.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Filter type must be 'RegexFilter'
    */
  var `type`: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter
}
object RegexFilter {
  
  inline def apply(): RegexFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RegexFilter")
    __obj.asInstanceOf[RegexFilter]
  }
  
  extension [Self <: RegexFilter](x: Self) {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
