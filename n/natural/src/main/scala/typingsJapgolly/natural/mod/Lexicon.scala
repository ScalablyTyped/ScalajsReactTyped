package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lexicon extends StObject {
  
  var defaultCategory: String
  
  def parseLexicon(data: String): Unit
  
  def tagWord(word: String): js.Array[String]
}
object Lexicon {
  
  inline def apply(defaultCategory: String, parseLexicon: String => Callback, tagWord: String => js.Array[String]): Lexicon = {
    val __obj = js.Dynamic.literal(defaultCategory = defaultCategory.asInstanceOf[js.Any], parseLexicon = js.Any.fromFunction1((t0: String) => parseLexicon(t0).runNow()), tagWord = js.Any.fromFunction1(tagWord))
    __obj.asInstanceOf[Lexicon]
  }
  
  extension [Self <: Lexicon](x: Self) {
    
    inline def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setParseLexicon(value: String => Callback): Self = StObject.set(x, "parseLexicon", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTagWord(value: String => js.Array[String]): Self = StObject.set(x, "tagWord", js.Any.fromFunction1(value))
  }
}
