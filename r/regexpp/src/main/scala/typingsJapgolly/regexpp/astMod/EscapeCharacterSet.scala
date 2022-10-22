package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.digit
import typingsJapgolly.regexpp.regexppStrings.space
import typingsJapgolly.regexpp.regexppStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EscapeCharacterSet
  extends StObject
     with NodeBase
     with CharacterClassElement
     with CharacterSet {
  
  var kind: digit | space | word
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_EscapeCharacterSet: Alternative | Quantifier | CharacterClass
  
  @JSName("type")
  var type_EscapeCharacterSet: typingsJapgolly.regexpp.regexppStrings.CharacterSet
}
object EscapeCharacterSet {
  
  inline def apply(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double
  ): EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[EscapeCharacterSet]
  }
  
  extension [Self <: EscapeCharacterSet](x: Self) {
    
    inline def setKind(value: digit | space | word): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier | CharacterClass): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.regexpp.regexppStrings.CharacterSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
