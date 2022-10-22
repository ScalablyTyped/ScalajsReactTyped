package typingsJapgolly.regexpp.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backreference
  extends StObject
     with NodeBase
     with LeafNode
     with QuantifiableElement {
  
  @JSName("parent")
  var parent_Backreference: Alternative | Quantifier
  
  var ref: Double | String
  
  var resolved: CapturingGroup
  
  @JSName("type")
  var type_Backreference: typingsJapgolly.regexpp.regexppStrings.Backreference
}
object Backreference {
  
  inline def apply(
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    ref: Double | String,
    resolved: CapturingGroup,
    start: Double
  ): Backreference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Backreference")
    __obj.asInstanceOf[Backreference]
  }
  
  extension [Self <: Backreference](x: Self) {
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Double | String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: CapturingGroup): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.regexpp.regexppStrings.Backreference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
