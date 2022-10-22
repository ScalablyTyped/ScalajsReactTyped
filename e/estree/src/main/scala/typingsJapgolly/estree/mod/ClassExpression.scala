package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassExpression
  extends StObject
     with BaseClass
     with Class {
  
  var id: js.UndefOr[Identifier | Null] = js.undefined
  
  @JSName("type")
  var type_ClassExpression: typingsJapgolly.estree.estreeStrings.ClassExpression
}
object ClassExpression {
  
  inline def apply(body: ClassBody): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[ClassExpression]
  }
  
  extension [Self <: ClassExpression](x: Self) {
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ClassExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
