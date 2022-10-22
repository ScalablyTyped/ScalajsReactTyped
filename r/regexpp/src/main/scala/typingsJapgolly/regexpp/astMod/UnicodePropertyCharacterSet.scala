package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnicodePropertyCharacterSet
  extends StObject
     with NodeBase
     with CharacterClassElement
     with CharacterSet {
  
  var key: String
  
  var kind: property
  
  var negate: Boolean
  
  @JSName("parent")
  var parent_UnicodePropertyCharacterSet: Alternative | Quantifier | CharacterClass
  
  @JSName("type")
  var type_UnicodePropertyCharacterSet: typingsJapgolly.regexpp.regexppStrings.CharacterSet
  
  var value: String | Null
}
object UnicodePropertyCharacterSet {
  
  inline def apply(
    end: Double,
    key: String,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double
  ): UnicodePropertyCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = "property", negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("CharacterSet")
    __obj.asInstanceOf[UnicodePropertyCharacterSet]
  }
  
  extension [Self <: UnicodePropertyCharacterSet](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: property): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier | CharacterClass): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.regexpp.regexppStrings.CharacterSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
