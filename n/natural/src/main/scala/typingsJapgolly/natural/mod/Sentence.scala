package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sentence extends StObject {
  
  def addTaggedWord(token: String, tag: String): Unit
  
  var taggedWords: js.Array[TaggedWord]
}
object Sentence {
  
  inline def apply(addTaggedWord: (String, String) => Callback, taggedWords: js.Array[TaggedWord]): Sentence = {
    val __obj = js.Dynamic.literal(addTaggedWord = js.Any.fromFunction2((t0: String, t1: String) => (addTaggedWord(t0, t1)).runNow()), taggedWords = taggedWords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentence]
  }
  
  extension [Self <: Sentence](x: Self) {
    
    inline def setAddTaggedWord(value: (String, String) => Callback): Self = StObject.set(x, "addTaggedWord", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setTaggedWords(value: js.Array[TaggedWord]): Self = StObject.set(x, "taggedWords", value.asInstanceOf[js.Any])
    
    inline def setTaggedWordsVarargs(value: TaggedWord*): Self = StObject.set(x, "taggedWords", js.Array(value*))
  }
}
