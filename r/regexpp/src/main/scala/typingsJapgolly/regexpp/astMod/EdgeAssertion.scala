package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.end
import typingsJapgolly.regexpp.regexppStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeAssertion
  extends StObject
     with NodeBase
     with BoundaryAssertion {
  
  var kind: start | end
  
  @JSName("parent")
  var parent_EdgeAssertion: Alternative | Quantifier
  
  @JSName("type")
  var type_EdgeAssertion: typingsJapgolly.regexpp.regexppStrings.Assertion
}
object EdgeAssertion {
  
  inline def apply(end: Double, kind: start | end, parent: Alternative | Quantifier, raw: String, start: Double): EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Assertion")
    __obj.asInstanceOf[EdgeAssertion]
  }
  
  extension [Self <: EdgeAssertion](x: Self) {
    
    inline def setKind(value: start | end): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Alternative | Quantifier): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.regexpp.regexppStrings.Assertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
