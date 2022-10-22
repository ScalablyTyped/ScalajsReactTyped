package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to default {@link com.sun.star.text.NumberingRules} according to a given locale information.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.lang.Locale
  * @version 1.0
  */
trait XDefaultNumberingProvider
  extends StObject
     with XInterface {
  
  /**
    * provides access to outline numberings according to a given {@link com.sun.star.lang.Locale} .
    *
    * In contrast to outline numberings the continuous numberings consist of level using the equal settings in all numbering levels.
    * @see com.sun.star.text.NumberingLevel
    * @see com.sun.star.lang.Locale
    */
  def getDefaultContinuousNumberingLevels(aLocale: Locale): SafeArray[PropertyValues]
  
  /**
    * provides access to outline numberings according to a given {@link com.sun.star.lang.Locale} .
    *
    * Outline numberings usually consist of levels with different settings.
    * @see com.sun.star.text.NumberingLevel
    */
  def getDefaultOutlineNumberings(aLocale: Locale): SafeArray[XIndexAccess]
}
object XDefaultNumberingProvider {
  
  inline def apply(
    acquire: Callback,
    getDefaultContinuousNumberingLevels: Locale => SafeArray[PropertyValues],
    getDefaultOutlineNumberings: Locale => SafeArray[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XDefaultNumberingProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDefaultContinuousNumberingLevels = js.Any.fromFunction1(getDefaultContinuousNumberingLevels), getDefaultOutlineNumberings = js.Any.fromFunction1(getDefaultOutlineNumberings), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDefaultNumberingProvider]
  }
  
  extension [Self <: XDefaultNumberingProvider](x: Self) {
    
    inline def setGetDefaultContinuousNumberingLevels(value: Locale => SafeArray[PropertyValues]): Self = StObject.set(x, "getDefaultContinuousNumberingLevels", js.Any.fromFunction1(value))
    
    inline def setGetDefaultOutlineNumberings(value: Locale => SafeArray[XIndexAccess]): Self = StObject.set(x, "getDefaultOutlineNumberings", js.Any.fromFunction1(value))
  }
}
