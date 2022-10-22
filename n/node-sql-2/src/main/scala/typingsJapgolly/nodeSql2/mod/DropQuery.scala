package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropQuery
  extends StObject
     with Executable {
  
  def ifExists(): Executable
}
object DropQuery {
  
  inline def apply(ifExists: CallbackTo[Executable], toQuery: CallbackTo[QueryLike]): DropQuery = {
    val __obj = js.Dynamic.literal(ifExists = ifExists.toJsFn, toQuery = toQuery.toJsFn)
    __obj.asInstanceOf[DropQuery]
  }
  
  extension [Self <: DropQuery](x: Self) {
    
    inline def setIfExists(value: CallbackTo[Executable]): Self = StObject.set(x, "ifExists", value.toJsFn)
  }
}
