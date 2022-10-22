package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XSpellChecker1
  extends StObject
     with XSupportedLanguages {
  
  def isValid(aWord: String, nLanguage: Double, aProperties: PropertyValues): Boolean
  
  def spell(aWord: String, nLanguage: Double, aProperties: PropertyValues): XSpellAlternatives
}
object XSpellChecker1 {
  
  inline def apply(
    Languages: SafeArray[Double],
    acquire: Callback,
    getLanguages: CallbackTo[SafeArray[Double]],
    hasLanguage: Double => Boolean,
    isValid: (String, Double, PropertyValues) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    spell: (String, Double, PropertyValues) => XSpellAlternatives
  ): XSpellChecker1 = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLanguages = getLanguages.toJsFn, hasLanguage = js.Any.fromFunction1(hasLanguage), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, spell = js.Any.fromFunction3(spell))
    __obj.asInstanceOf[XSpellChecker1]
  }
  
  extension [Self <: XSpellChecker1](x: Self) {
    
    inline def setIsValid(value: (String, Double, PropertyValues) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction3(value))
    
    inline def setSpell(value: (String, Double, PropertyValues) => XSpellAlternatives): Self = StObject.set(x, "spell", js.Any.fromFunction3(value))
  }
}
