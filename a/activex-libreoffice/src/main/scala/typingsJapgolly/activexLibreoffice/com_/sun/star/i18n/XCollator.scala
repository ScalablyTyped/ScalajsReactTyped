package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides locale-sensitive collation algorithms for string comparison. */
trait XCollator
  extends StObject
     with XInterface {
  
  /**
    * Compare 2 strings in specific locale and algorithm.
    * @param aStr1 First string.
    * @param aStr2 Second string.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareString(aStr1: String, aStr2: String): Double
  
  /**
    * Compare 2 substrings in specific locale and algorithm.
    * @param aStr1 First string.
    * @param nOff1 Offset (from 0) of the first string.
    * @param nLen1 Length (from offset) of the first substring.
    * @param aStr2 Second string
    * @param nOff2 Offset (from 0) of the second string.
    * @param nLen2 Length (from offset) of the second substring.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareSubstring(aStr1: String, nOff1: Double, nLen1: Double, aStr2: String, nOff2: Double, nLen2: Double): Double
  
  /**
    * List all collator algorithms for a given locale.
    * @param aLocale The locale for which to list algorithms.
    * @returns A sequence of algorithm names.
    */
  def listCollatorAlgorithms(aLocale: Locale): SafeArray[String]
  
  /**
    * List all end user collator options for a given algorithm.
    * @param aAlgorithmName The algorithm name for this collator.
    * @returns An array of end user options available for the algorithm.
    */
  def listCollatorOptions(aAlgorithmName: String): SafeArray[Double]
  
  /**
    * Load a particular collator algorithm for the locale.
    * @param aAlgorithmName The algorithm to load.
    * @param aLocale The locale for this collator.
    * @param nCollatorOptions A mask of {@link CollatorOptions} .
    * @returns Returns 0 when loading was successful, otherwise throws runtime exception.
    */
  def loadCollatorAlgorithm(aAlgorithmName: String, aLocale: Locale, nCollatorOptions: Double): Double
  
  /**
    * Load a collator algorithm with options chosen by end user.
    * @param aAlgorithmName The algorithm name to load.
    * @param aLocale The locale for this collator.
    * @param aCollatorOptions A sequence of end user collator options like those returned by {@link XCollator.listCollatorOptions()} .
    */
  def loadCollatorAlgorithmWithEndUserOption(aAlgorithmName: String, aLocale: Locale, aCollatorOptions: SeqEquiv[Double]): Unit
  
  /**
    * Load the collator with default algorithm defined in locale data.
    * @param aLocale The locale for this collator.
    * @param nCollatorOptions A mask of {@link CollatorOptions} .
    * @returns Returns 0 when loading was successful, otherwise throws runtime exception. In fact the return value should be ignored and the exception be caught
    */
  def loadDefaultCollator(aLocale: Locale, nCollatorOptions: Double): Double
}
object XCollator {
  
  inline def apply(
    acquire: Callback,
    compareString: (String, String) => Double,
    compareSubstring: (String, Double, Double, String, Double, Double) => Double,
    listCollatorAlgorithms: Locale => SafeArray[String],
    listCollatorOptions: String => SafeArray[Double],
    loadCollatorAlgorithm: (String, Locale, Double) => Double,
    loadCollatorAlgorithmWithEndUserOption: (String, Locale, SeqEquiv[Double]) => Callback,
    loadDefaultCollator: (Locale, Double) => Double,
    queryInterface: `type` => Any,
    release: Callback
  ): XCollator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, compareString = js.Any.fromFunction2(compareString), compareSubstring = js.Any.fromFunction6(compareSubstring), listCollatorAlgorithms = js.Any.fromFunction1(listCollatorAlgorithms), listCollatorOptions = js.Any.fromFunction1(listCollatorOptions), loadCollatorAlgorithm = js.Any.fromFunction3(loadCollatorAlgorithm), loadCollatorAlgorithmWithEndUserOption = js.Any.fromFunction3((t0: String, t1: Locale, t2: SeqEquiv[Double]) => (loadCollatorAlgorithmWithEndUserOption(t0, t1, t2)).runNow()), loadDefaultCollator = js.Any.fromFunction2(loadDefaultCollator), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCollator]
  }
  
  extension [Self <: XCollator](x: Self) {
    
    inline def setCompareString(value: (String, String) => Double): Self = StObject.set(x, "compareString", js.Any.fromFunction2(value))
    
    inline def setCompareSubstring(value: (String, Double, Double, String, Double, Double) => Double): Self = StObject.set(x, "compareSubstring", js.Any.fromFunction6(value))
    
    inline def setListCollatorAlgorithms(value: Locale => SafeArray[String]): Self = StObject.set(x, "listCollatorAlgorithms", js.Any.fromFunction1(value))
    
    inline def setListCollatorOptions(value: String => SafeArray[Double]): Self = StObject.set(x, "listCollatorOptions", js.Any.fromFunction1(value))
    
    inline def setLoadCollatorAlgorithm(value: (String, Locale, Double) => Double): Self = StObject.set(x, "loadCollatorAlgorithm", js.Any.fromFunction3(value))
    
    inline def setLoadCollatorAlgorithmWithEndUserOption(value: (String, Locale, SeqEquiv[Double]) => Callback): Self = StObject.set(x, "loadCollatorAlgorithmWithEndUserOption", js.Any.fromFunction3((t0: String, t1: Locale, t2: SeqEquiv[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setLoadDefaultCollator(value: (Locale, Double) => Double): Self = StObject.set(x, "loadDefaultCollator", js.Any.fromFunction2(value))
  }
}
