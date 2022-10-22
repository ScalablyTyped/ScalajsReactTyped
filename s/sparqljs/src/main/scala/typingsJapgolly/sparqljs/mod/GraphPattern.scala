package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphPattern
  extends StObject
     with BlockPattern
     with _Expression {
  
  var name: IriTerm
  
  var patterns: js.Array[Pattern]
  
  var `type`: graph
}
object GraphPattern {
  
  inline def apply(name: IriTerm, patterns: js.Array[Pattern]): GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[GraphPattern]
  }
  
  extension [Self <: GraphPattern](x: Self) {
    
    inline def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setType(value: graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
