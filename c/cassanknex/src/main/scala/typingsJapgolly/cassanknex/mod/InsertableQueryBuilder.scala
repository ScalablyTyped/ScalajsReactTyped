package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertableQueryBuilder extends StObject {
  
  def ifNotExists(): this.type
  
  def into(table: String): this.type
}
object InsertableQueryBuilder {
  
  inline def apply(ifNotExists: CallbackTo[InsertableQueryBuilder], into: String => InsertableQueryBuilder): InsertableQueryBuilder = {
    val __obj = js.Dynamic.literal(ifNotExists = ifNotExists.toJsFn, into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[InsertableQueryBuilder]
  }
  
  extension [Self <: InsertableQueryBuilder](x: Self) {
    
    inline def setIfNotExists(value: CallbackTo[InsertableQueryBuilder]): Self = StObject.set(x, "ifNotExists", value.toJsFn)
    
    inline def setInto(value: String => InsertableQueryBuilder): Self = StObject.set(x, "into", js.Any.fromFunction1(value))
  }
}
