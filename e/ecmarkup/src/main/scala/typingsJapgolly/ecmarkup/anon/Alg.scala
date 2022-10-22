package typingsJapgolly.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  var alg: org.scalajs.dom.Element
  
  var grammar: org.scalajs.dom.Element
}
object Alg {
  
  inline def apply(alg: org.scalajs.dom.Element, grammar: org.scalajs.dom.Element): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
  
  extension [Self <: Alg](x: Self) {
    
    inline def setAlg(value: org.scalajs.dom.Element): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setGrammar(value: org.scalajs.dom.Element): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
  }
}
