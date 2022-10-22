package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ValueExpression... Where <expression> is a string.
  */
trait IValueExpr extends StObject {
  
  var qv: String
}
object IValueExpr {
  
  inline def apply(qv: String): IValueExpr = {
    val __obj = js.Dynamic.literal(qv = qv.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueExpr]
  }
  
  extension [Self <: IValueExpr](x: Self) {
    
    inline def setQv(value: String): Self = StObject.set(x, "qv", value.asInstanceOf[js.Any])
  }
}
