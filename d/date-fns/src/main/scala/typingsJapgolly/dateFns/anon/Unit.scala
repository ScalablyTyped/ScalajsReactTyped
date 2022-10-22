package typingsJapgolly.dateFns.anon

import typingsJapgolly.dateFns.dateFnsStrings.ceil
import typingsJapgolly.dateFns.dateFnsStrings.day
import typingsJapgolly.dateFns.dateFnsStrings.floor
import typingsJapgolly.dateFns.dateFnsStrings.hour
import typingsJapgolly.dateFns.dateFnsStrings.minute
import typingsJapgolly.dateFns.dateFnsStrings.month
import typingsJapgolly.dateFns.dateFnsStrings.round
import typingsJapgolly.dateFns.dateFnsStrings.second
import typingsJapgolly.dateFns.dateFnsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unit extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[typingsJapgolly.dateFns.mod.Locale] = js.undefined
  
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.undefined
  
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.undefined
}
object Unit {
  
  inline def apply(): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unit]
  }
  
  extension [Self <: Unit](x: Self) {
    
    inline def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    inline def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    inline def setLocale(value: typingsJapgolly.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRoundingMethod(value: floor | ceil | round): Self = StObject.set(x, "roundingMethod", value.asInstanceOf[js.Any])
    
    inline def setRoundingMethodUndefined: Self = StObject.set(x, "roundingMethod", js.undefined)
    
    inline def setUnit(value: second | minute | hour | day | month | year): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
