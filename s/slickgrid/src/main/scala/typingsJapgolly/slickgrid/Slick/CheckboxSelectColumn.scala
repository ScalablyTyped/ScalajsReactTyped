package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxSelectColumn[T /* <: SlickData */]
  extends StObject
     with Plugin[T] {
  
  def getColumnDefinition(): ColumnMetadata[T]
}
object CheckboxSelectColumn {
  
  inline def apply[T /* <: SlickData */](destroy: Callback, getColumnDefinition: CallbackTo[ColumnMetadata[T]], init: Grid[T] => Callback): CheckboxSelectColumn[T] = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getColumnDefinition = getColumnDefinition.toJsFn, init = js.Any.fromFunction1((t0: Grid[T]) => init(t0).runNow()))
    __obj.asInstanceOf[CheckboxSelectColumn[T]]
  }
  
  extension [Self <: CheckboxSelectColumn[?], T /* <: SlickData */](x: Self & CheckboxSelectColumn[T]) {
    
    inline def setGetColumnDefinition(value: CallbackTo[ColumnMetadata[T]]): Self = StObject.set(x, "getColumnDefinition", value.toJsFn)
  }
}
