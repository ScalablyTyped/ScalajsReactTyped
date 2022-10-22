package typingsJapgolly.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerStatic extends StObject {
  
  def splitByPunctuation(input: String): js.Array[String]
}
object TokenizerStatic {
  
  inline def apply(splitByPunctuation: String => js.Array[String]): TokenizerStatic = {
    val __obj = js.Dynamic.literal(splitByPunctuation = js.Any.fromFunction1(splitByPunctuation))
    __obj.asInstanceOf[TokenizerStatic]
  }
  
  extension [Self <: TokenizerStatic](x: Self) {
    
    inline def setSplitByPunctuation(value: String => js.Array[String]): Self = StObject.set(x, "splitByPunctuation", js.Any.fromFunction1(value))
  }
}
