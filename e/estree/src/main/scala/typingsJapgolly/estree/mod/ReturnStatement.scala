package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var argument: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_ReturnStatement: typingsJapgolly.estree.estreeStrings.ReturnStatement
}
object ReturnStatement {
  
  inline def apply(): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement]
  }
  
  extension [Self <: ReturnStatement](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
