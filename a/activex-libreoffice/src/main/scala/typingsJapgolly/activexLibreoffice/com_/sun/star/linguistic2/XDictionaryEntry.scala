package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interfaces gives access to a dictionary entry.
  *
  * A dictionary entry can supply a word and its hyphenation and indicate if it is a negative word. If it is a negative entry it may supply a replacement
  * text to be used instead of the entry word.
  *
  * Hyphenation positions are represented by an "=" in the word. If the "=" is the last character of the word this means it should not be hyphenated. If
  * there is no "=" charter in the word, hyphenation positions will be determined automatically (i.e., from the hyphenator service alone).
  *
  * Entries whose words only differ in hyphenation are considered to be equal. Also a "." at the end of the word will make no difference.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.uno.XInterface
  */
trait XDictionaryEntry
  extends StObject
     with XInterface {
  
  /** @returns the word defining this entry. */
  val DictionaryWord: String
  
  /**
    * is the suggested replacement text for negative words.
    *
    * It is undefined if the entry is not negative.
    * @returns the replacement text for a negative entry. An empty string indicates that no replacement text is provided.
    */
  val ReplacementText: String
  
  /** @returns the word defining this entry. */
  def getDictionaryWord(): String
  
  /**
    * is the suggested replacement text for negative words.
    *
    * It is undefined if the entry is not negative.
    * @returns the replacement text for a negative entry. An empty string indicates that no replacement text is provided.
    */
  def getReplacementText(): String
  
  /** @returns `TRUE` if the word (entry) is a negative one and should not be used, `FALSE` otherwise. */
  def isNegative(): Boolean
}
object XDictionaryEntry {
  
  inline def apply(
    DictionaryWord: String,
    ReplacementText: String,
    acquire: Callback,
    getDictionaryWord: CallbackTo[String],
    getReplacementText: CallbackTo[String],
    isNegative: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XDictionaryEntry = {
    val __obj = js.Dynamic.literal(DictionaryWord = DictionaryWord.asInstanceOf[js.Any], ReplacementText = ReplacementText.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDictionaryWord = getDictionaryWord.toJsFn, getReplacementText = getReplacementText.toJsFn, isNegative = isNegative.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDictionaryEntry]
  }
  
  extension [Self <: XDictionaryEntry](x: Self) {
    
    inline def setDictionaryWord(value: String): Self = StObject.set(x, "DictionaryWord", value.asInstanceOf[js.Any])
    
    inline def setGetDictionaryWord(value: CallbackTo[String]): Self = StObject.set(x, "getDictionaryWord", value.toJsFn)
    
    inline def setGetReplacementText(value: CallbackTo[String]): Self = StObject.set(x, "getReplacementText", value.toJsFn)
    
    inline def setIsNegative(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNegative", value.toJsFn)
    
    inline def setReplacementText(value: String): Self = StObject.set(x, "ReplacementText", value.asInstanceOf[js.Any])
  }
}
