package typingsJapgolly.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compound
  extends StObject
     with Expression
     with CoreExpression {
  
  var body: js.Array[Expression]
  
  @JSName("type")
  var type_Compound: typingsJapgolly.jsep.jsepStrings.Compound
}
object Compound {
  
  inline def apply(body: js.Array[Expression]): Compound = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Compound")
    __obj.asInstanceOf[Compound]
  }
  
  extension [Self <: Compound](x: Self) {
    
    inline def setBody(value: js.Array[Expression]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Expression*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.jsep.jsepStrings.Compound): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
