package typingsJapgolly.arangodb.ArangoDB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AqlLiteral extends StObject {
  
  def toAQL(): String
}
object AqlLiteral {
  
  inline def apply(toAQL: CallbackTo[String]): AqlLiteral = {
    val __obj = js.Dynamic.literal(toAQL = toAQL.toJsFn)
    __obj.asInstanceOf[AqlLiteral]
  }
  
  extension [Self <: AqlLiteral](x: Self) {
    
    inline def setToAQL(value: CallbackTo[String]): Self = StObject.set(x, "toAQL", value.toJsFn)
  }
}
