package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XSupportedLanguages
  extends StObject
     with XInterface {
  
  val Languages: SafeArray[Double]
  
  def getLanguages(): SafeArray[Double]
  
  def hasLanguage(nLanguage: Double): Boolean
}
object XSupportedLanguages {
  
  inline def apply(
    Languages: SafeArray[Double],
    acquire: Callback,
    getLanguages: CallbackTo[SafeArray[Double]],
    hasLanguage: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XSupportedLanguages = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLanguages = getLanguages.toJsFn, hasLanguage = js.Any.fromFunction1(hasLanguage), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSupportedLanguages]
  }
  
  extension [Self <: XSupportedLanguages](x: Self) {
    
    inline def setGetLanguages(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getLanguages", value.toJsFn)
    
    inline def setHasLanguage(value: Double => Boolean): Self = StObject.set(x, "hasLanguage", js.Any.fromFunction1(value))
    
    inline def setLanguages(value: SafeArray[Double]): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
  }
}
