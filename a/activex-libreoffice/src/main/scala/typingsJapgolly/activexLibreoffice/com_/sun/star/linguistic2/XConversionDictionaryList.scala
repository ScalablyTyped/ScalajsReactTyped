package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to manage and maintain a list of conversion dictionaries.
  *
  * The dictionaries added to the list may or may not support the {@link com.sun.star.util.XFlushable} interface. If they do those dictionaries have to be
  * flushed upon termination of the dictionary list.
  * @since OOo 1.1.2
  */
trait XConversionDictionaryList
  extends StObject
     with XInterface {
  
  /** @returns the name container interface to the dictionaries in the list.  The interface can be used to add, remove or retrieve dictionaries from the list by */
  val DictionaryContainer: XNameContainer
  
  /**
    * creates a new dictionary and adds it to the dictionary list.
    *
    * The dictionary will be empty and active.
    * @param aName is the name of the dictionary (should be unique).
    * @param aLocale defines the language of the dictionary.
    * @param nConversionDictionaryType One of {@link com.sun.star.linguistic2.ConversionDictionaryType} values.
    * @returns an empty dictionary with the given name, locale and conversion type. `NULL` on failure.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation.
    * @throws ElementExistException when a dictionary with the specified name already exists.
    */
  def addNewDictionary(aName: String, aLocale: Locale, nConversionDictionaryType: Double): XConversionDictionary
  
  /** @returns the name container interface to the dictionaries in the list.  The interface can be used to add, remove or retrieve dictionaries from the list by */
  def getDictionaryContainer(): XNameContainer
  
  /**
    * searches for entries that match the given text.
    *
    * All active dictionaries with matching locales and conversion type will be searched for entries matching the given text.
    *
    * The exact string to be looked for is the substring from the aText parameter that starts at position nStartPos and has the length nLength.
    * @param aText the text where the substring to be looked for will be taken from.
    * @param nStartPos the starting pos of the substring to be looked for.
    * @param nLength the length of the substring to be looked for.
    * @param aLocale Locale the conversion is referred to.
    * @param nConversionDictionaryType specifies the type of conversion the dictionary can be used for. It is one of {@link com.sun.star.linguistic2.Conversio
    * @param eDirection specifies the direction of the conversion to look for. It is one of {@link com.sun.star.linguistic2.ConversionDirection} .
    * @param nTextConversionOptions Combination of {@link com.sun.star.i18n.TextConversionOption} values.
    * @returns the list of entries found. If no entry was found, it is empty.
    * @throws com::sun::star::lang::IllegalArgumentException if the nTextConversionOptions parameter is invalid for the given locale.
    * @throws NoSupportException when **nConversionDictionaryType** is not known by the implementation, or when the locale is not supported (i.e. there are no
    */
  def queryConversions(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    aLocale: Locale,
    nConversionDictionaryType: Double,
    eDirection: ConversionDirection,
    nTextConversionOptions: Double
  ): SafeArray[String]
  
  /**
    * returns the maximum number of characters used as left or right text in entries.
    *
    * All active dictionaries of the specified locale and type will be looked up to get the result.
    *
    * The parameter eDirection specifies if only the left text or the right text from entries should be considered.
    * @param aLocale Locale the conversion is referred to.
    * @param nConversionDictionaryType specifies the type of conversion dictionaries to be looked up. It is one of {@link com.sun.star.linguistic2.ConversionD
    * @param eDirection specifies if the left text or the right text of entries will be used.
    * @see com.sun.star.linguistic2.ConversionDirection
    */
  def queryMaxCharCount(aLocale: Locale, nConversionDictionaryType: Double, eDirection: ConversionDirection): Double
}
object XConversionDictionaryList {
  
  inline def apply(
    DictionaryContainer: XNameContainer,
    acquire: Callback,
    addNewDictionary: (String, Locale, Double) => XConversionDictionary,
    getDictionaryContainer: CallbackTo[XNameContainer],
    queryConversions: (String, Double, Double, Locale, Double, ConversionDirection, Double) => SafeArray[String],
    queryInterface: `type` => Any,
    queryMaxCharCount: (Locale, Double, ConversionDirection) => Double,
    release: Callback
  ): XConversionDictionaryList = {
    val __obj = js.Dynamic.literal(DictionaryContainer = DictionaryContainer.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNewDictionary = js.Any.fromFunction3(addNewDictionary), getDictionaryContainer = getDictionaryContainer.toJsFn, queryConversions = js.Any.fromFunction7(queryConversions), queryInterface = js.Any.fromFunction1(queryInterface), queryMaxCharCount = js.Any.fromFunction3(queryMaxCharCount), release = release.toJsFn)
    __obj.asInstanceOf[XConversionDictionaryList]
  }
  
  extension [Self <: XConversionDictionaryList](x: Self) {
    
    inline def setAddNewDictionary(value: (String, Locale, Double) => XConversionDictionary): Self = StObject.set(x, "addNewDictionary", js.Any.fromFunction3(value))
    
    inline def setDictionaryContainer(value: XNameContainer): Self = StObject.set(x, "DictionaryContainer", value.asInstanceOf[js.Any])
    
    inline def setGetDictionaryContainer(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getDictionaryContainer", value.toJsFn)
    
    inline def setQueryConversions(value: (String, Double, Double, Locale, Double, ConversionDirection, Double) => SafeArray[String]): Self = StObject.set(x, "queryConversions", js.Any.fromFunction7(value))
    
    inline def setQueryMaxCharCount(value: (Locale, Double, ConversionDirection) => Double): Self = StObject.set(x, "queryMaxCharCount", js.Any.fromFunction3(value))
  }
}
