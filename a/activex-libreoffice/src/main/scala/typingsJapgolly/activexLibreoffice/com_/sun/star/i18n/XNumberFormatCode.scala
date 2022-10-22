package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access number format codes defined in locale data. */
trait XNumberFormatCode
  extends StObject
     with XInterface {
  
  /**
    * returns all format codes for a given **nFormatUsage** and locale.
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCode(nFormatUsage: Double, rLocale: Locale): SafeArray[NumberFormatCode]
  
  /**
    * returns all format codes for a given locale.
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCodes(rLocale: Locale): SafeArray[NumberFormatCode]
  
  /**
    * returns the default number format code of a specific category (usage group) for a given locale and format length type.
    * @param nFormatType one of the constants listed in {@link KNumberFormatType}
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getDefault(nFormatType: Double, nFormatUsage: Double, rLocale: Locale): NumberFormatCode
  
  /**
    * returns the number format pointed to by **nFormatIndex** for a given locale.
    * @param nFormatIndex one of {@link NumberFormatIndex} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getFormatCode(nFormatIndex: Double, rLocale: Locale): NumberFormatCode
}
object XNumberFormatCode {
  
  inline def apply(
    acquire: Callback,
    getAllFormatCode: (Double, Locale) => SafeArray[NumberFormatCode],
    getAllFormatCodes: Locale => SafeArray[NumberFormatCode],
    getDefault: (Double, Double, Locale) => NumberFormatCode,
    getFormatCode: (Double, Locale) => NumberFormatCode,
    queryInterface: `type` => Any,
    release: Callback
  ): XNumberFormatCode = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getAllFormatCode = js.Any.fromFunction2(getAllFormatCode), getAllFormatCodes = js.Any.fromFunction1(getAllFormatCodes), getDefault = js.Any.fromFunction3(getDefault), getFormatCode = js.Any.fromFunction2(getFormatCode), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumberFormatCode]
  }
  
  extension [Self <: XNumberFormatCode](x: Self) {
    
    inline def setGetAllFormatCode(value: (Double, Locale) => SafeArray[NumberFormatCode]): Self = StObject.set(x, "getAllFormatCode", js.Any.fromFunction2(value))
    
    inline def setGetAllFormatCodes(value: Locale => SafeArray[NumberFormatCode]): Self = StObject.set(x, "getAllFormatCodes", js.Any.fromFunction1(value))
    
    inline def setGetDefault(value: (Double, Double, Locale) => NumberFormatCode): Self = StObject.set(x, "getDefault", js.Any.fromFunction3(value))
    
    inline def setGetFormatCode(value: (Double, Locale) => NumberFormatCode): Self = StObject.set(x, "getFormatCode", js.Any.fromFunction2(value))
  }
}
