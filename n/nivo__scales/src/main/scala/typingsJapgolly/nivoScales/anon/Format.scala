package typingsJapgolly.nivoScales.anon

import typingsJapgolly.nivoScales.nivoScalesStrings.day
import typingsJapgolly.nivoScales.nivoScalesStrings.hour
import typingsJapgolly.nivoScales.nivoScalesStrings.millisecond
import typingsJapgolly.nivoScales.nivoScalesStrings.minute
import typingsJapgolly.nivoScales.nivoScalesStrings.month
import typingsJapgolly.nivoScales.nivoScalesStrings.second
import typingsJapgolly.nivoScales.nivoScalesStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var precision: js.UndefOr[millisecond | second | minute | hour | day | month | year] = js.undefined
  
  var useUTC: js.UndefOr[Boolean] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPrecision(value: millisecond | second | minute | hour | day | month | year): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
    
    inline def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
  }
}
