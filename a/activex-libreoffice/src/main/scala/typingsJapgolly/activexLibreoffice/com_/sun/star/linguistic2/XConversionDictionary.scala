package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows the user to access a conversion dictionary.
  *
  * The dictionary consists of entries (pairs) of the form ( aLeftText, aRightText ). Those pairs can be added and removed. Also it can be looked for all
  * entries where the left text or the right text matches a given text. Thus it can be used for conversions in both directions.
  *
  * Restrictions to what has to be the left and right text are usually given by specific services implementing this interface.
  * @see com.sun.star.linguistic2.ConversionDictionary
  * @see com.sun.star.linguistic2.HangulHanjaConversionDictionary
  * @since OOo 1.1.2
  */
trait XConversionDictionary
  extends StObject
     with XInterface {
  
  /**
    * @returns the conversion type supported by the dictionary.
    * @see com.sun.star.linguistic2.ConversionDictionaryType
    */
  val ConversionType: Double
  
  /**
    * @returns the language supported by the dictionary.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the name of the dictionary. */
  val Name: String
  
  /**
    * is used to add a conversion pair to the dictionary.
    * @param aLeftText the left text of the pair to be added.
    * @param aRightText the right text of the pair to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if the arguments are invalid. For example if the specifications defined by the service implementin
    * @throws com::sun::star::container::ElementExistException if such an entry already exists.
    */
  def addEntry(aLeftText: String, aRightText: String): Unit
  
  /** removes all entries from the dictionary. */
  def clear(): Unit
  
  /**
    * @param eDirection specifies if all left or all right parts of the entries should be returned.
    * @returns a list of all left or right parts of the dictionaries entries.
    */
  def getConversionEntries(eDirection: ConversionDirection): SafeArray[String]
  
  /**
    * @returns the conversion type supported by the dictionary.
    * @see com.sun.star.linguistic2.ConversionDictionaryType
    */
  def getConversionType(): Double
  
  /**
    * searches for entries or conversions that match the given text.
    *
    * The exact string to be looked for is the substring from the aText parameter that starts at position nStartPos and has the length nLength.
    * @param aText the text where the substring to be looked for will be taken from. Depending on the conversion direction parameter it specifies either the l
    * @param nStartPos the starting pos of the substring to be looked for.
    * @param nLength the length of the substring to be looked for.
    * @param eDirection specifies the direction of the conversion to look for. It is one of {@link com.sun.star.linguistic2.ConversionDirection} .
    * @param nTextConversionOptions Combination of {@link com.sun.star.i18n.TextConversionOption} values.
    * @returns the list of conversions found for the supplied text. If no nothing was found, it is empty.
    * @throws com::sun::star::lang::IllegalArgumentException if the locale is not supported by the dictionary or if nTextConversionOptions is invalid for the g
    */
  def getConversions(
    aText: String,
    nStartPos: Double,
    nLength: Double,
    eDirection: ConversionDirection,
    nTextConversionOptions: Double
  ): SafeArray[String]
  
  /**
    * @returns the language supported by the dictionary.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /**
    * returns the maximum number of characters used as left or right text in entries.
    * @param eDirection specifies if the left text or the right text of entries will be used.
    * @see com.sun.star.linguistic2.ConversionDirection
    */
  def getMaxCharCount(eDirection: ConversionDirection): Double
  
  /** @returns the name of the dictionary. */
  def getName(): String
  
  /** @returns `TRUE` if the dictionary is active, `FALSE` otherwise. */
  def isActive(): Boolean
  
  /**
    * removes a conversion pair from the dictionary.
    * @param aLeftText the left text of the pair to be removed.
    * @param aRightText the right text of the pair to be removed.
    * @throws com::sun::star::container::NoSuchElementException if there is no such entry.
    */
  def removeEntry(aLeftText: String, aRightText: String): Unit
  
  /**
    * specifies whether the dictionary should be used or not .
    * @param bActivate `TRUE` if the dictionary should be used, `FALSE` otherwise.
    */
  def setActive(bActivate: Boolean): Unit
}
object XConversionDictionary {
  
  inline def apply(
    ConversionType: Double,
    Locale: Locale,
    Name: String,
    acquire: Callback,
    addEntry: (String, String) => Callback,
    clear: Callback,
    getConversionEntries: ConversionDirection => SafeArray[String],
    getConversionType: CallbackTo[Double],
    getConversions: (String, Double, Double, ConversionDirection, Double) => SafeArray[String],
    getLocale: CallbackTo[Locale],
    getMaxCharCount: ConversionDirection => Double,
    getName: CallbackTo[String],
    isActive: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEntry: (String, String) => Callback,
    setActive: Boolean => Callback
  ): XConversionDictionary = {
    val __obj = js.Dynamic.literal(ConversionType = ConversionType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEntry = js.Any.fromFunction2((t0: String, t1: String) => (addEntry(t0, t1)).runNow()), clear = clear.toJsFn, getConversionEntries = js.Any.fromFunction1(getConversionEntries), getConversionType = getConversionType.toJsFn, getConversions = js.Any.fromFunction5(getConversions), getLocale = getLocale.toJsFn, getMaxCharCount = js.Any.fromFunction1(getMaxCharCount), getName = getName.toJsFn, isActive = isActive.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEntry = js.Any.fromFunction2((t0: String, t1: String) => (removeEntry(t0, t1)).runNow()), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()))
    __obj.asInstanceOf[XConversionDictionary]
  }
  
  extension [Self <: XConversionDictionary](x: Self) {
    
    inline def setAddEntry(value: (String, String) => Callback): Self = StObject.set(x, "addEntry", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setConversionType(value: Double): Self = StObject.set(x, "ConversionType", value.asInstanceOf[js.Any])
    
    inline def setGetConversionEntries(value: ConversionDirection => SafeArray[String]): Self = StObject.set(x, "getConversionEntries", js.Any.fromFunction1(value))
    
    inline def setGetConversionType(value: CallbackTo[Double]): Self = StObject.set(x, "getConversionType", value.toJsFn)
    
    inline def setGetConversions(value: (String, Double, Double, ConversionDirection, Double) => SafeArray[String]): Self = StObject.set(x, "getConversions", js.Any.fromFunction5(value))
    
    inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setGetMaxCharCount(value: ConversionDirection => Double): Self = StObject.set(x, "getMaxCharCount", js.Any.fromFunction1(value))
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRemoveEntry(value: (String, String) => Callback): Self = StObject.set(x, "removeEntry", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetActive(value: Boolean => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
