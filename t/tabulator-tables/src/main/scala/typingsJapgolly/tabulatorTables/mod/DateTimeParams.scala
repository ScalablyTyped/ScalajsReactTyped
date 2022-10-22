package typingsJapgolly.tabulatorTables.mod

import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeParams
  extends StObject
     with _FormatterParams {
  
  // datetime
  var inputFormat: js.UndefOr[String] = js.undefined
  
  var invalidPlaceholder: js.UndefOr[`true` | String | Double | ValueStringCallback] = js.undefined
  
  var outputFormat: js.UndefOr[String] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
}
object DateTimeParams {
  
  inline def apply(): DateTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeParams]
  }
  
  extension [Self <: DateTimeParams](x: Self) {
    
    inline def setInputFormat(value: String): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
    
    inline def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
    
    inline def setInvalidPlaceholder(value: `true` | String | Double | ValueStringCallback): Self = StObject.set(x, "invalidPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setInvalidPlaceholderFunction1(value: /* value */ Any => String): Self = StObject.set(x, "invalidPlaceholder", js.Any.fromFunction1(value))
    
    inline def setInvalidPlaceholderUndefined: Self = StObject.set(x, "invalidPlaceholder", js.undefined)
    
    inline def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
