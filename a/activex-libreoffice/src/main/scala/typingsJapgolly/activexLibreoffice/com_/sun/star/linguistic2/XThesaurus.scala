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
  * allows for the retrieval of possible meanings for a given word and language.
  *
  * The meaning of a word is in essence a descriptive text for that word. Each meaning may have several synonyms where a synonym is a word (or small text)
  * with the same or similar meaning.
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XThesaurus
  extends StObject
     with XSupportedLocales {
  
  /**
    * @param aTerm the word to query for its meanings.
    * @param aLocale specifies the language of the word.  If the language is not supported, an {@link com.sun.star.lang.IllegalArgumentException} exception is
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns a list of meanings for the given word and language.
    * @see com.sun.star.lang.Locale
    * @see com.sun.star.linguistic2.XMeaning
    */
  def queryMeanings(aTerm: String, aLocale: Locale, aProperties: PropertyValues): SafeArray[XMeaning]
}
object XThesaurus {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: Callback,
    getLocales: CallbackTo[SafeArray[Locale]],
    hasLocale: Locale => Boolean,
    queryInterface: `type` => Any,
    queryMeanings: (String, Locale, PropertyValues) => SafeArray[XMeaning],
    release: Callback
  ): XThesaurus = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLocales = getLocales.toJsFn, hasLocale = js.Any.fromFunction1(hasLocale), queryInterface = js.Any.fromFunction1(queryInterface), queryMeanings = js.Any.fromFunction3(queryMeanings), release = release.toJsFn)
    __obj.asInstanceOf[XThesaurus]
  }
  
  extension [Self <: XThesaurus](x: Self) {
    
    inline def setQueryMeanings(value: (String, Locale, PropertyValues) => SafeArray[XMeaning]): Self = StObject.set(x, "queryMeanings", js.Any.fromFunction3(value))
  }
}
