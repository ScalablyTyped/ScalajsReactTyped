package typingsJapgolly.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeBase extends StObject {
  
  var end: Double
  
  var parent: Null | RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
  
  var raw: String
  
  var start: Double
  
  var `type`: typingsJapgolly.regexpp.regexppStrings.RegExpLiteral | typingsJapgolly.regexpp.regexppStrings.Pattern | typingsJapgolly.regexpp.regexppStrings.Alternative | typingsJapgolly.regexpp.regexppStrings.Group | typingsJapgolly.regexpp.regexppStrings.CapturingGroup | typingsJapgolly.regexpp.regexppStrings.Quantifier | typingsJapgolly.regexpp.regexppStrings.CharacterClass | typingsJapgolly.regexpp.regexppStrings.Assertion | typingsJapgolly.regexpp.regexppStrings.CharacterClassRange | typingsJapgolly.regexpp.regexppStrings.CharacterSet | typingsJapgolly.regexpp.regexppStrings.Character | typingsJapgolly.regexpp.regexppStrings.Backreference | typingsJapgolly.regexpp.regexppStrings.Flags
}
object NodeBase {
  
  inline def apply(
    end: Double,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.RegExpLiteral | typingsJapgolly.regexpp.regexppStrings.Pattern | typingsJapgolly.regexpp.regexppStrings.Alternative | typingsJapgolly.regexpp.regexppStrings.Group | typingsJapgolly.regexpp.regexppStrings.CapturingGroup | typingsJapgolly.regexpp.regexppStrings.Quantifier | typingsJapgolly.regexpp.regexppStrings.CharacterClass | typingsJapgolly.regexpp.regexppStrings.Assertion | typingsJapgolly.regexpp.regexppStrings.CharacterClassRange | typingsJapgolly.regexpp.regexppStrings.CharacterSet | typingsJapgolly.regexpp.regexppStrings.Character | typingsJapgolly.regexpp.regexppStrings.Backreference | typingsJapgolly.regexpp.regexppStrings.Flags
  ): NodeBase = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parent = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeBase]
  }
  
  extension [Self <: NodeBase](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setParent(
      value: RegExpLiteral | Pattern | Group | CapturingGroup | LookaroundAssertion | Alternative | Quantifier | CharacterClass | CharacterClassRange
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: typingsJapgolly.regexpp.regexppStrings.RegExpLiteral | typingsJapgolly.regexpp.regexppStrings.Pattern | typingsJapgolly.regexpp.regexppStrings.Alternative | typingsJapgolly.regexpp.regexppStrings.Group | typingsJapgolly.regexpp.regexppStrings.CapturingGroup | typingsJapgolly.regexpp.regexppStrings.Quantifier | typingsJapgolly.regexpp.regexppStrings.CharacterClass | typingsJapgolly.regexpp.regexppStrings.Assertion | typingsJapgolly.regexpp.regexppStrings.CharacterClassRange | typingsJapgolly.regexpp.regexppStrings.CharacterSet | typingsJapgolly.regexpp.regexppStrings.Character | typingsJapgolly.regexpp.regexppStrings.Backreference | typingsJapgolly.regexpp.regexppStrings.Flags
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
