package typingsJapgolly.nlcst.mod

import typingsJapgolly.nlcst.nlcstStrings.PunctuationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Punctuation
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_Punctuation: PunctuationNode
}
object Punctuation {
  
  inline def apply(value: Any): Punctuation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PunctuationNode")
    __obj.asInstanceOf[Punctuation]
  }
  
  extension [Self <: Punctuation](x: Self) {
    
    inline def setType(value: PunctuationNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
