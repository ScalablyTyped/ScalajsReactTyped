package typingsJapgolly.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterClassRange
  extends StObject
     with NodeBase
     with BranchNode
     with CharacterClassElement {
  
  var max: Character
  
  var min: Character
  
  @JSName("parent")
  var parent_CharacterClassRange: CharacterClass
  
  @JSName("type")
  var type_CharacterClassRange: typingsJapgolly.regexpp.regexppStrings.CharacterClassRange
}
object CharacterClassRange {
  
  inline def apply(end: Double, max: Character, min: Character, parent: CharacterClass, raw: String, start: Double): CharacterClassRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CharacterClassRange")
    __obj.asInstanceOf[CharacterClassRange]
  }
  
  extension [Self <: CharacterClassRange](x: Self) {
    
    inline def setMax(value: Character): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Character): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setParent(value: CharacterClass): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.regexpp.regexppStrings.CharacterClassRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
