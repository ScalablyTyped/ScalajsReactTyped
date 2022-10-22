package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stemmer extends StObject {
  
  def attach(): Unit
  
  def stem(token: String): String
  
  def tokenizeAndStem(text: String): js.Array[String]
}
object Stemmer {
  
  inline def apply(attach: Callback, stem: String => String, tokenizeAndStem: String => js.Array[String]): Stemmer = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, stem = js.Any.fromFunction1(stem), tokenizeAndStem = js.Any.fromFunction1(tokenizeAndStem))
    __obj.asInstanceOf[Stemmer]
  }
  
  extension [Self <: Stemmer](x: Self) {
    
    inline def setAttach(value: Callback): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setStem(value: String => String): Self = StObject.set(x, "stem", js.Any.fromFunction1(value))
    
    inline def setTokenizeAndStem(value: String => js.Array[String]): Self = StObject.set(x, "tokenizeAndStem", js.Any.fromFunction1(value))
  }
}
