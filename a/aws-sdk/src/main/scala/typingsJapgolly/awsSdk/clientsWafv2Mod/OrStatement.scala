package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrStatement extends StObject {
  
  /**
    * The statements to combine with OR logic. You can use any statements that can be nested.
    */
  var Statements: typingsJapgolly.awsSdk.clientsWafv2Mod.Statements
}
object OrStatement {
  
  inline def apply(Statements: Statements): OrStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrStatement]
  }
  
  extension [Self <: OrStatement](x: Self) {
    
    inline def setStatements(value: Statements): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
