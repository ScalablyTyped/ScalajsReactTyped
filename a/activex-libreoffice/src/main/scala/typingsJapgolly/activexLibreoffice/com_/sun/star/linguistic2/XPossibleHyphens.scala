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
  * Gives information about a word's possible hyphenation points.
  *
  * Example: In German pre-spelling-reform you may have the following: getWord: Dampfschiffahrt getPossibleHyphens: Dampf=schiff=fahrt
  * getOrigHyphensPositions: 4, 9 That is "Dampfschiffahrt" can be hyphenated after the "pf" (4) and between the double "ff" (9). And if you are going to
  * hyphenate it at position 9 you will get an additional "f" before the hyphen character.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XPossibleHyphens
  extends StObject
     with XInterface {
  
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  val HyphenationPositions: SafeArray[Double]
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  val PossibleHyphens: String
  
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  val Word: String
  
  /** @returns an ascending sequence of numbers where each number is an offset within the original word which denotes a hyphenation position corresponding to on */
  def getHyphenationPositions(): SafeArray[Double]
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns a string depicting the word with all hyphen positions which are represented by "=" characters. If there are any alternative spellings, the word w */
  def getPossibleHyphens(): String
  
  /** @returns the word for which the information of possible hyphenation points was obtained. */
  def getWord(): String
}
object XPossibleHyphens {
  
  inline def apply(
    HyphenationPositions: SafeArray[Double],
    Locale: Locale,
    PossibleHyphens: String,
    Word: String,
    acquire: Callback,
    getHyphenationPositions: CallbackTo[SafeArray[Double]],
    getLocale: CallbackTo[Locale],
    getPossibleHyphens: CallbackTo[String],
    getWord: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XPossibleHyphens = {
    val __obj = js.Dynamic.literal(HyphenationPositions = HyphenationPositions.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], PossibleHyphens = PossibleHyphens.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = acquire.toJsFn, getHyphenationPositions = getHyphenationPositions.toJsFn, getLocale = getLocale.toJsFn, getPossibleHyphens = getPossibleHyphens.toJsFn, getWord = getWord.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPossibleHyphens]
  }
  
  extension [Self <: XPossibleHyphens](x: Self) {
    
    inline def setGetHyphenationPositions(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getHyphenationPositions", value.toJsFn)
    
    inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setGetPossibleHyphens(value: CallbackTo[String]): Self = StObject.set(x, "getPossibleHyphens", value.toJsFn)
    
    inline def setGetWord(value: CallbackTo[String]): Self = StObject.set(x, "getWord", value.toJsFn)
    
    inline def setHyphenationPositions(value: SafeArray[Double]): Self = StObject.set(x, "HyphenationPositions", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setPossibleHyphens(value: String): Self = StObject.set(x, "PossibleHyphens", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
  }
}
