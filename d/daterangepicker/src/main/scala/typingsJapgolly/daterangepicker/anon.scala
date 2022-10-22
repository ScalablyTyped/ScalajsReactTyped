package typingsJapgolly.daterangepicker

import typingsJapgolly.daterangepicker.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultOptions extends StObject {
    
    var defaultOptions: js.UndefOr[Options] = js.undefined
  }
  object DefaultOptions {
    
    inline def apply(): DefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setDefaultOptions(value: Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    }
  }
  
  /* Inlined std.Required<daterangepicker.daterangepicker.Locale> */
  trait RequiredLocale extends StObject {
    
    var applyLabel: String
    
    var cancelLabel: String
    
    var customRangeLabel: String
    
    var daysOfWeek: js.Array[String]
    
    var firstDay: Double
    
    var format: String
    
    var fromLabel: String
    
    var monthNames: js.Array[String]
    
    var separator: String
    
    var toLabel: String
    
    var weekLabel: String
  }
  object RequiredLocale {
    
    inline def apply(
      applyLabel: String,
      cancelLabel: String,
      customRangeLabel: String,
      daysOfWeek: js.Array[String],
      firstDay: Double,
      format: String,
      fromLabel: String,
      monthNames: js.Array[String],
      separator: String,
      toLabel: String,
      weekLabel: String
    ): RequiredLocale = {
      val __obj = js.Dynamic.literal(applyLabel = applyLabel.asInstanceOf[js.Any], cancelLabel = cancelLabel.asInstanceOf[js.Any], customRangeLabel = customRangeLabel.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], fromLabel = fromLabel.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], toLabel = toLabel.asInstanceOf[js.Any], weekLabel = weekLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredLocale]
    }
    
    extension [Self <: RequiredLocale](x: Self) {
      
      inline def setApplyLabel(value: String): Self = StObject.set(x, "applyLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCustomRangeLabel(value: String): Self = StObject.set(x, "customRangeLabel", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekVarargs(value: String*): Self = StObject.set(x, "daysOfWeek", js.Array(value*))
      
      inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFromLabel(value: String): Self = StObject.set(x, "fromLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value*))
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setToLabel(value: String): Self = StObject.set(x, "toLabel", value.asInstanceOf[js.Any])
      
      inline def setWeekLabel(value: String): Self = StObject.set(x, "weekLabel", value.asInstanceOf[js.Any])
    }
  }
}
