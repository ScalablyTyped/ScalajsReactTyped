package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoWhileStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var body: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_DoWhileStatement: typingsJapgolly.estree.estreeStrings.DoWhileStatement
}
object DoWhileStatement {
  
  inline def apply(body: Statement, test: Expression): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[DoWhileStatement]
  }
  
  extension [Self <: DoWhileStatement](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
