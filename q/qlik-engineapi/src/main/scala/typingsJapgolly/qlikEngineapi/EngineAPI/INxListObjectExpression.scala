package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxListObjectExpression...
  */
trait INxListObjectExpression extends StObject {
  
  /**
    * Gives information on the error.
    * >> This parameter is optional.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.undefined
  
  /**
    * Value of the expression.
    */
  var qExpr: String
}
object INxListObjectExpression {
  
  inline def apply(qExpr: String): INxListObjectExpression = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpression]
  }
  
  extension [Self <: INxListObjectExpression](x: Self) {
    
    inline def setQError(value: INxLayoutErrors): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    inline def setQErrorUndefined: Self = StObject.set(x, "qError", js.undefined)
    
    inline def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
  }
}
