package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows for spell checking.
  *
  * It is possible to simply check if a word, in a specified language, is correct or additionally, if it was misspelled, some proposals how it might be
  * correctly written.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XSpellChecker
  extends StObject
     with XSupportedLocales {
  
  /**
    * checks if a word is spelled correctly in a given language.
    * @param aWord the word to be checked.
    * @param aLocale the Locale (language) to be used. If the Locale is empty, the word is spelled correctly by definition.  If **aLocale** is not supported a
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns `TRUE` if the word is spelled correctly using the specified language, `FALSE` otherwise.
    * @see com.sun.star.lang.Locale
    */
  def isValid(aWord: String, aLocale: Locale, aProperties: PropertyValues): Boolean
  
  /**
    * This method checks if a word is spelled correctly in a given language.
    * @param aWord the word to be checked.
    * @param aLocale the language to be used.  If the language is not supported an IllegalArgumentException exception is raised.
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns `NULL` if **aWord** is spelled correctly using **aLocale** . Otherwise, an {@link XSpellAlternatives} object with information about the reason of
    * @see com.sun.star.linguistic2.XSpellAlternatives
    * @see com.sun.star.lang.Locale
    */
  def spell(aWord: String, aLocale: Locale, aProperties: PropertyValues): XSpellAlternatives
}
object XSpellChecker {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: Callback,
    getLocales: CallbackTo[SafeArray[Locale]],
    hasLocale: Locale => Boolean,
    isValid: (String, Locale, PropertyValues) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    spell: (String, Locale, PropertyValues) => XSpellAlternatives
  ): XSpellChecker = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLocales = getLocales.toJsFn, hasLocale = js.Any.fromFunction1(hasLocale), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, spell = js.Any.fromFunction3(spell))
    __obj.asInstanceOf[XSpellChecker]
  }
  
  extension [Self <: XSpellChecker](x: Self) {
    
    inline def setIsValid(value: (String, Locale, PropertyValues) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction3(value))
    
    inline def setSpell(value: (String, Locale, PropertyValues) => XSpellAlternatives): Self = StObject.set(x, "spell", js.Any.fromFunction3(value))
  }
}
