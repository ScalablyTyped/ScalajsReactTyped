package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to locale specific ordinal suffix systems.
  * @since OOo 2.2
  */
trait XOrdinalSuffix
  extends StObject
     with XInterface {
  
  /**
    * Returns all the possible ordinal suffixes for the number.
    *
    * This method will provide "<b>st</b>", "<b>nd</b>", "<b>rd</b>", "<b>th</b>" for an English locale, depending on the provided number. In some locales
    * like French, Italian or Spanish it ca return several suffixes for one number.
    *
    * Examples: for the number '1', the values will be **st** in English, but **er** and **re** in French. All these values may depend on the underlying
    * version of ICU.
    */
  def getOrdinalSuffix(nNumber: Double, aLocale: Locale): SafeArray[String]
}
object XOrdinalSuffix {
  
  inline def apply(
    acquire: Callback,
    getOrdinalSuffix: (Double, Locale) => SafeArray[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XOrdinalSuffix = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getOrdinalSuffix = js.Any.fromFunction2(getOrdinalSuffix), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XOrdinalSuffix]
  }
  
  extension [Self <: XOrdinalSuffix](x: Self) {
    
    inline def setGetOrdinalSuffix(value: (Double, Locale) => SafeArray[String]): Self = StObject.set(x, "getOrdinalSuffix", js.Any.fromFunction2(value))
  }
}
