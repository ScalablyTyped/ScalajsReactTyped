package typingsJapgolly.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<json-logic-js.json-logic-js.AllReservedOperationsInterface<AddOps>, '<'> */
trait JsonLogicLessThan[AddOps /* <: AdditionalOperation */]
  extends StObject
     with _RulesLogic[AddOps] {
  
  @JSName("<")
  var Lessthansign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
}
object JsonLogicLessThan {
  
  inline def apply[AddOps /* <: AdditionalOperation */](
    Lessthansign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  ): JsonLogicLessThan[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("<")(Lessthansign.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLogicLessThan[AddOps]]
  }
  
  extension [Self <: JsonLogicLessThan[?], AddOps /* <: AdditionalOperation */](x: Self & JsonLogicLessThan[AddOps]) {
    
    inline def setLessthansign(
      value: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
    ): Self = StObject.set(x, "<", value.asInstanceOf[js.Any])
  }
}
