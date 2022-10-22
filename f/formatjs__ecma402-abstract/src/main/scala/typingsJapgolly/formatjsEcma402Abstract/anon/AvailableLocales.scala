package typingsJapgolly.formatjsEcma402Abstract.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatInternal
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatLocaleInternalData
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableLocales extends StObject {
  
  var availableLocales: Set[String]
  
  var currencyDigitsData: Record[String, Double]
  
  def getDefaultLocale(): String
  
  def getInternalSlots(nf: NumberFormat): NumberFormatInternal
  
  var localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]]
  
  var numberingSystemNames: js.Array[String]
}
object AvailableLocales {
  
  inline def apply(
    availableLocales: Set[String],
    currencyDigitsData: Record[String, Double],
    getDefaultLocale: CallbackTo[String],
    getInternalSlots: NumberFormat => NumberFormatInternal,
    localeData: Record[String, js.UndefOr[NumberFormatLocaleInternalData]],
    numberingSystemNames: js.Array[String]
  ): AvailableLocales = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any], getDefaultLocale = getDefaultLocale.toJsFn, getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], numberingSystemNames = numberingSystemNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableLocales]
  }
  
  extension [Self <: AvailableLocales](x: Self) {
    
    inline def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDigitsData(value: Record[String, Double]): Self = StObject.set(x, "currencyDigitsData", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultLocale(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultLocale", value.toJsFn)
    
    inline def setGetInternalSlots(value: NumberFormat => NumberFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    inline def setLocaleData(value: Record[String, js.UndefOr[NumberFormatLocaleInternalData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemNames(value: js.Array[String]): Self = StObject.set(x, "numberingSystemNames", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemNamesVarargs(value: String*): Self = StObject.set(x, "numberingSystemNames", js.Array(value*))
  }
}
