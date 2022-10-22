package typingsJapgolly.sqlstring

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ToSqlString extends StObject {
    
    def toSqlString(): String
  }
  object ToSqlString {
    
    inline def apply(toSqlString: CallbackTo[String]): ToSqlString = {
      val __obj = js.Dynamic.literal(toSqlString = toSqlString.toJsFn)
      __obj.asInstanceOf[ToSqlString]
    }
    
    extension [Self <: ToSqlString](x: Self) {
      
      inline def setToSqlString(value: CallbackTo[String]): Self = StObject.set(x, "toSqlString", value.toJsFn)
    }
  }
}
