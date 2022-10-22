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
  * Gives access to the results of failed spell checking attempts and may provide spelling alternatives.
  *
  * This is used by the {@link com.sun.star.linguistic2.XSpellChecker.spell()} function when the word was not found to be correct. Suggestions for other
  * words to be used may be provided along with a failure-type that may specify why the word was not correct.
  * @see com.sun.star.linguistic2.SpellFailure
  */
trait XSpellAlternatives
  extends StObject
     with XInterface {
  
  /** @returns the sequence of suggested spelling alternatives. */
  val Alternatives: SafeArray[String]
  
  /** @returns the number of suggested spelling alternatives available. */
  val AlternativesCount: Double
  
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  val FailureType: Double
  
  /** @returns the Locale which specifies the language of the misspelled word. */
  val Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was misspelled. */
  val Word: String
  
  /** @returns the sequence of suggested spelling alternatives. */
  def getAlternatives(): SafeArray[String]
  
  /** @returns the number of suggested spelling alternatives available. */
  def getAlternativesCount(): Double
  
  /**
    * @returns the type (reason) for spell checking to have failed verification.
    * @see com.sun.star.linguistic2.SpellFailure
    */
  def getFailureType(): Double
  
  /** @returns the Locale which specifies the language of the misspelled word. */
  def getLocale(): typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** @returns the word that was misspelled. */
  def getWord(): String
}
object XSpellAlternatives {
  
  inline def apply(
    Alternatives: SafeArray[String],
    AlternativesCount: Double,
    FailureType: Double,
    Locale: Locale,
    Word: String,
    acquire: Callback,
    getAlternatives: CallbackTo[SafeArray[String]],
    getAlternativesCount: CallbackTo[Double],
    getFailureType: CallbackTo[Double],
    getLocale: CallbackTo[Locale],
    getWord: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XSpellAlternatives = {
    val __obj = js.Dynamic.literal(Alternatives = Alternatives.asInstanceOf[js.Any], AlternativesCount = AlternativesCount.asInstanceOf[js.Any], FailureType = FailureType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Word = Word.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAlternatives = getAlternatives.toJsFn, getAlternativesCount = getAlternativesCount.toJsFn, getFailureType = getFailureType.toJsFn, getLocale = getLocale.toJsFn, getWord = getWord.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSpellAlternatives]
  }
  
  extension [Self <: XSpellAlternatives](x: Self) {
    
    inline def setAlternatives(value: SafeArray[String]): Self = StObject.set(x, "Alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesCount(value: Double): Self = StObject.set(x, "AlternativesCount", value.asInstanceOf[js.Any])
    
    inline def setFailureType(value: Double): Self = StObject.set(x, "FailureType", value.asInstanceOf[js.Any])
    
    inline def setGetAlternatives(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAlternatives", value.toJsFn)
    
    inline def setGetAlternativesCount(value: CallbackTo[Double]): Self = StObject.set(x, "getAlternativesCount", value.toJsFn)
    
    inline def setGetFailureType(value: CallbackTo[Double]): Self = StObject.set(x, "getFailureType", value.toJsFn)
    
    inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setGetWord(value: CallbackTo[String]): Self = StObject.set(x, "getWord", value.toJsFn)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "Word", value.asInstanceOf[js.Any])
  }
}
