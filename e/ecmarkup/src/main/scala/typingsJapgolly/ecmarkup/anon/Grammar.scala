package typingsJapgolly.ecmarkup.anon

import org.scalajs.dom.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grammar extends StObject {
  
  var grammar: org.scalajs.dom.Element
  
  var lists: js.Array[HTMLUListElement]
}
object Grammar {
  
  inline def apply(grammar: org.scalajs.dom.Element, lists: js.Array[HTMLUListElement]): Grammar = {
    val __obj = js.Dynamic.literal(grammar = grammar.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar]
  }
  
  extension [Self <: Grammar](x: Self) {
    
    inline def setGrammar(value: org.scalajs.dom.Element): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
    
    inline def setLists(value: js.Array[HTMLUListElement]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsVarargs(value: HTMLUListElement*): Self = StObject.set(x, "lists", js.Array(value*))
  }
}
