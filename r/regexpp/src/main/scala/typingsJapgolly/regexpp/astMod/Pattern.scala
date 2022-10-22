package typingsJapgolly.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern
  extends StObject
     with NodeBase
     with BranchNode {
  
  var alternatives: js.Array[Alternative]
  
  @JSName("parent")
  var parent_Pattern: RegExpLiteral | Null
  
  @JSName("type")
  var type_Pattern: typingsJapgolly.regexpp.regexppStrings.Pattern
}
object Pattern {
  
  inline def apply(alternatives: js.Array[Alternative], end: Double, raw: String, start: Double): Pattern = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")("Pattern")
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value*))
    
    inline def setParent(value: RegExpLiteral): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setType(value: typingsJapgolly.regexpp.regexppStrings.Pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
