package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassBody
  extends StObject
     with BaseNode {
  
  var body: js.Array[MethodDefinition | PropertyDefinition | StaticBlock]
  
  @JSName("type")
  var type_ClassBody: typingsJapgolly.estree.estreeStrings.ClassBody
}
object ClassBody {
  
  inline def apply(body: js.Array[MethodDefinition | PropertyDefinition | StaticBlock]): ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[ClassBody]
  }
  
  extension [Self <: ClassBody](x: Self) {
    
    inline def setBody(value: js.Array[MethodDefinition | PropertyDefinition | StaticBlock]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: (MethodDefinition | PropertyDefinition | StaticBlock)*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
