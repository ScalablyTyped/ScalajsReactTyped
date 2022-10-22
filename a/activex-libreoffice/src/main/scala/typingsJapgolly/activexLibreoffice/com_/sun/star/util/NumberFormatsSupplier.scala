package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides an supplier of number formats
  * @see NumberFormats
  * @see NumberFormatter
  * @since OOo 1.1.2
  */
trait NumberFormatsSupplier
  extends StObject
     with XNumberFormatsSupplier {
  
  /** Create using default locale. */
  def createWithDefaultLocale(): Unit
  
  /**
    * Create using specific locale.
    * @param Locale the locale of the number formats supplier
    */
  def createWithLocale(Locale: Locale): Unit
}
object NumberFormatsSupplier {
  
  inline def apply(
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    acquire: Callback,
    createWithDefaultLocale: Callback,
    createWithLocale: Locale => Callback,
    getNumberFormatSettings: CallbackTo[XPropertySet],
    getNumberFormats: CallbackTo[XNumberFormats],
    queryInterface: `type` => Any,
    release: Callback
  ): NumberFormatsSupplier = {
    val __obj = js.Dynamic.literal(NumberFormatSettings = NumberFormatSettings.asInstanceOf[js.Any], NumberFormats = NumberFormats.asInstanceOf[js.Any], acquire = acquire.toJsFn, createWithDefaultLocale = createWithDefaultLocale.toJsFn, createWithLocale = js.Any.fromFunction1((t0: Locale) => createWithLocale(t0).runNow()), getNumberFormatSettings = getNumberFormatSettings.toJsFn, getNumberFormats = getNumberFormats.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[NumberFormatsSupplier]
  }
  
  extension [Self <: NumberFormatsSupplier](x: Self) {
    
    inline def setCreateWithDefaultLocale(value: Callback): Self = StObject.set(x, "createWithDefaultLocale", value.toJsFn)
    
    inline def setCreateWithLocale(value: Locale => Callback): Self = StObject.set(x, "createWithLocale", js.Any.fromFunction1((t0: Locale) => value(t0).runNow()))
  }
}
