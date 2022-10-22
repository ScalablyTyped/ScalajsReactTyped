package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuery
  extends StObject
     with Executable {
  
  def ifNotExists(): Executable
}
object CreateQuery {
  
  inline def apply(ifNotExists: CallbackTo[Executable], toQuery: CallbackTo[QueryLike]): CreateQuery = {
    val __obj = js.Dynamic.literal(ifNotExists = ifNotExists.toJsFn, toQuery = toQuery.toJsFn)
    __obj.asInstanceOf[CreateQuery]
  }
  
  extension [Self <: CreateQuery](x: Self) {
    
    inline def setIfNotExists(value: CallbackTo[Executable]): Self = StObject.set(x, "ifNotExists", value.toJsFn)
  }
}
