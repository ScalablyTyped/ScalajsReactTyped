package typingsJapgolly.winrtUwp.Windows.Data.Text

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A segmenter class that is able to segment provided text into units appropriate for selecting text by words. */
trait SelectableWordsSegmenter extends StObject {
  
  /**
    * Determines and returns the selectable word which contains or follows a specified index into the provided text.
    * @param text Provided text in which a word is to be selected.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @return A SelectableWordSegment that represents the selected word.
    */
  def getTokenAt(text: String, startIndex: Double): SelectableWordSegment
  
  /**
    * Determines and returns all of the selectable words in the provided text.
    * @param text Provided text containing words to be selected.
    * @return A collection of SelectableWordSegment objects that represent the selectable words.
    */
  def getTokens(text: String): IVectorView[SelectableWordSegment]
  
  /** Gets the language of the rules used by this SelectableWordsSegmenter object. */
  var resolvedLanguage: String
  
  /**
    * Calls the provided handler with two iterators that iterate through the selectable words prior to and following a given index into the provided text.
    * @param text Provided text containing words to be selected.
    * @param startIndex A zero-based index into text. It must be less than the length of text.
    * @param handler The function that receives the iterators.
    */
  def tokenize(text: String, startIndex: Double, handler: SelectableWordSegmentsTokenizingHandler): Unit
}
object SelectableWordsSegmenter {
  
  inline def apply(
    getTokenAt: (String, Double) => SelectableWordSegment,
    getTokens: String => IVectorView[SelectableWordSegment],
    resolvedLanguage: String,
    tokenize: (String, Double, SelectableWordSegmentsTokenizingHandler) => Callback
  ): SelectableWordsSegmenter = {
    val __obj = js.Dynamic.literal(getTokenAt = js.Any.fromFunction2(getTokenAt), getTokens = js.Any.fromFunction1(getTokens), resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3((t0: String, t1: Double, t2: SelectableWordSegmentsTokenizingHandler) => (tokenize(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[SelectableWordsSegmenter]
  }
  
  extension [Self <: SelectableWordsSegmenter](x: Self) {
    
    inline def setGetTokenAt(value: (String, Double) => SelectableWordSegment): Self = StObject.set(x, "getTokenAt", js.Any.fromFunction2(value))
    
    inline def setGetTokens(value: String => IVectorView[SelectableWordSegment]): Self = StObject.set(x, "getTokens", js.Any.fromFunction1(value))
    
    inline def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: (String, Double, SelectableWordSegmentsTokenizingHandler) => Callback): Self = StObject.set(x, "tokenize", js.Any.fromFunction3((t0: String, t1: Double, t2: SelectableWordSegmentsTokenizingHandler) => (value(t0, t1, t2)).runNow()))
  }
}
