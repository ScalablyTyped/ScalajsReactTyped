package typingsJapgolly.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarEle extends StObject {
  
  var grammar: typingsJapgolly.grammarkdown.mod.Grammar
  
  var grammarEle: org.scalajs.dom.Element
}
object GrammarEle {
  
  inline def apply(grammar: typingsJapgolly.grammarkdown.mod.Grammar, grammarEle: org.scalajs.dom.Element): GrammarEle = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], grammarEle = grammarEle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarEle]
  }
  
  extension [Self <: GrammarEle](x: Self) {
    
    inline def setGrammar(value: typingsJapgolly.grammarkdown.mod.Grammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    inline def setGrammarEle(value: org.scalajs.dom.Element): Self = StObject.set(x, "grammarEle", value.asInstanceOf[js.Any])
  }
}
