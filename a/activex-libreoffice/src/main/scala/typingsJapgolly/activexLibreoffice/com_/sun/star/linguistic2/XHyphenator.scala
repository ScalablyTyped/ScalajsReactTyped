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
  * provides functionality for hyphenation of single words.
  *
  * Its three main functionalities are to provide a suitable position for breaking lines within a word, query about the existence of an alternative
  * spelling at a specific position of a word and provide a list of possible hyphenation positions within a word.
  *
  * A hyphenation position for a word with n characters is represented by a value in the range from 0 to n-2, indicating the position of the character
  * after which the hyphenation is done. That is, it is after the first and before the last character.
  *
  * A valid hyphenation position is a hyphenation position that fulfills all the restrictions implied by the properties MinLeading, MinTrailing and
  * MinWordLength.
  * @see com.sun.star.linguistic2.LinguProperties
  * @see com.sun.star.linguistic2.XSupportedLocales
  */
trait XHyphenator
  extends StObject
     with XSupportedLocales {
  
  /**
    * returns information about all possible hyphenation positions of a word.
    * @param aWord is the word for which information about the possible hyphenation positions is to be retrieved.
    * @param aLocale defines the language of the word.  If the language is not supported, an IllegalArgumentException exception is raised.
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns an {@link com.sun.star.linguistic2.XPossibleHyphens} for the given word and language if there are any hyphenation positions. `NULL` otherwise.
    * @see com.sun.star.linguistic2.XPossibleHyphens
    * @see com.sun.star.lang.Locale
    */
  def createPossibleHyphens(aWord: String, aLocale: Locale, aProperties: PropertyValues): XPossibleHyphens
  
  /**
    * tries to find a valid hyphenation position relative to the beginning of a word.
    *
    * Note: Some languages, for example Arabic, are written from right to left.
    * @param aWord is the word to be hyphenated.
    * @param aLocale defines the language to be used.  If the language is not supported, an IllegalArgumentException exception is raised.
    * @param nMaxLeading specifies the maximum number of characters to remain before the hyphen in the hyphenated word.  It has to be greater than or equal to 0.
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns the {@link XHyphenatedWord} for the last valid hyphenation position that is less than or equal to nMaxLeading - 1. If there is no such valid hyph
    * @see com.sun.star.linguistic2.XHyphenatedWord
    * @see com.sun.star.lang.Locale
    */
  def hyphenate(aWord: String, aLocale: Locale, nMaxLeading: Double, aProperties: PropertyValues): XHyphenatedWord
  
  /**
    * checks whether hyphenation at a position in a word will result in an alternative spelling or not.
    *
    * An alternative spelling position is a hyphen position where, if hyphenation is done here, the writing of the word changes. Example: "B&auml;cker" in
    * German pre spelling-reform becomes "B&auml;kker" if hyphenation is done after the "c".
    *
    * The hyphenation position does not need to be a valid one to be an alternative spelling position.
    * @param aWord is the original word to be looked at for having an alternative spelling, if hyphenation is done at position nIndex.
    * @param aLocale specifies the language to be used.  If the language is not supported, an IllegalArgumentException exception is raised.
    * @param nIndex is the position in the word to be looked at.  If the length of the word is n, the value of this parameter has to be in the range from 0 to n-2.
    * @param aProperties provides property values to be used for this function call only. It is usually empty in order to use the default values supplied with
    * @returns the information about the alternative spelling found at the specified position. Otherwise, if no alternative spelling was found, `NULL` is returned.
    * @see com.sun.star.linguistic2.XHyphenatedWord
    * @see com.sun.star.lang.Locale
    */
  def queryAlternativeSpelling(aWord: String, aLocale: Locale, nIndex: Double, aProperties: PropertyValues): XHyphenatedWord
}
object XHyphenator {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: Callback,
    createPossibleHyphens: (String, Locale, PropertyValues) => XPossibleHyphens,
    getLocales: CallbackTo[SafeArray[Locale]],
    hasLocale: Locale => Boolean,
    hyphenate: (String, Locale, Double, PropertyValues) => XHyphenatedWord,
    queryAlternativeSpelling: (String, Locale, Double, PropertyValues) => XHyphenatedWord,
    queryInterface: `type` => Any,
    release: Callback
  ): XHyphenator = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = acquire.toJsFn, createPossibleHyphens = js.Any.fromFunction3(createPossibleHyphens), getLocales = getLocales.toJsFn, hasLocale = js.Any.fromFunction1(hasLocale), hyphenate = js.Any.fromFunction4(hyphenate), queryAlternativeSpelling = js.Any.fromFunction4(queryAlternativeSpelling), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHyphenator]
  }
  
  extension [Self <: XHyphenator](x: Self) {
    
    inline def setCreatePossibleHyphens(value: (String, Locale, PropertyValues) => XPossibleHyphens): Self = StObject.set(x, "createPossibleHyphens", js.Any.fromFunction3(value))
    
    inline def setHyphenate(value: (String, Locale, Double, PropertyValues) => XHyphenatedWord): Self = StObject.set(x, "hyphenate", js.Any.fromFunction4(value))
    
    inline def setQueryAlternativeSpelling(value: (String, Locale, Double, PropertyValues) => XHyphenatedWord): Self = StObject.set(x, "queryAlternativeSpelling", js.Any.fromFunction4(value))
  }
}
