package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives information obtained by a successful hyphenation attempt.
  *
  * This interface is used as a return value for some of the hyphenator functions.
  * @see com.sun.star.linguistic2.XHyphenator
  */
trait XHyphenatedWord
  extends StObject
     with XInterface {
  
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  val HyphenPos: Double
  
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  val HyphenatedWord: String
  
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  val HyphenationPos: Double
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  val Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was hyphenated. */
  val Word: String
  
  /** @returns the position of the hyphen in the hyphenated word.  The value has to be in the range from 0 (after the first character) to m-2 (before the last c */
  def getHyphenPos(): Double
  
  /** @returns the hyphenated word as it should be written (without the hyphen character). */
  def getHyphenatedWord(): String
  
  /** @returns the position where hyphenation was applied in the word.  The value has to be in the range from 0 (after the first character) to n-2 (before the l */
  def getHyphenationPos(): Double
  
  /**
    * @returns the language of the hyphenated word.
    * @see com.sun.star.lang.Locale
    */
  def getLocale(): typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was hyphenated. */
  def getWord(): String
  
  /**
    * is used to query if the hyphenation result is an alternative spelling.
    *
    * A hyphenation result is an alternative spelling if the hyphenated word is different from the word that was hyphenated.
    * @returns `TRUE` if it is an alternative spelling, `FALSE` otherwise.
    */
  def isAlternativeSpelling(): Boolean
}
object XHyphenatedWord {
  
  inline def apply(
    HyphenPos: Double,
    HyphenatedWord: String,
    HyphenationPos: Double,
    Locale: Locale,
    Word: String,
    acquire: Callback,
    getHyphenPos: CallbackTo[Double],
    getHyphenatedWord: CallbackTo[String],
    getHyphenationPos: CallbackTo[Double],
    getLocale: CallbackTo[Locale],
    getWord: CallbackTo[String],
    isAlternativeSpelling: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XHyphenatedWord = {
    val __obj = js.Dynamic.literal(HyphenPos = HyphenPos.asInstanceOf[js.Any], HyphenatedWord = HyphenatedWord.asInstanceOf[js.Any], HyphenationPos = HyphenationPos.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = acquire.toJsFn, getHyphenPos = getHyphenPos.toJsFn, getHyphenatedWord = getHyphenatedWord.toJsFn, getHyphenationPos = getHyphenationPos.toJsFn, getLocale = getLocale.toJsFn, getWord = getWord.toJsFn, isAlternativeSpelling = isAlternativeSpelling.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHyphenatedWord]
  }
  
  extension [Self <: XHyphenatedWord](x: Self) {
    
    inline def setGetHyphenPos(value: CallbackTo[Double]): Self = StObject.set(x, "getHyphenPos", value.toJsFn)
    
    inline def setGetHyphenatedWord(value: CallbackTo[String]): Self = StObject.set(x, "getHyphenatedWord", value.toJsFn)
    
    inline def setGetHyphenationPos(value: CallbackTo[Double]): Self = StObject.set(x, "getHyphenationPos", value.toJsFn)
    
    inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setGetWord(value: CallbackTo[String]): Self = StObject.set(x, "getWord", value.toJsFn)
    
    inline def setHyphenPos(value: Double): Self = StObject.set(x, "HyphenPos", value.asInstanceOf[js.Any])
    
    inline def setHyphenatedWord(value: String): Self = StObject.set(x, "HyphenatedWord", value.asInstanceOf[js.Any])
    
    inline def setHyphenationPos(value: Double): Self = StObject.set(x, "HyphenationPos", value.asInstanceOf[js.Any])
    
    inline def setIsAlternativeSpelling(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAlternativeSpelling", value.toJsFn)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
  }
}
