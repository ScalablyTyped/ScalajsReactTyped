package typingsJapgolly.reactBootstrapTableNext.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick[T /* <: js.Object */, E] extends StObject {
  
  def onClick(e: Any, column: ColumnDescription[T, E], columnIndex: Double): Unit
}
object OnClick {
  
  inline def apply[T /* <: js.Object */, E](onClick: (Any, ColumnDescription[T, E], Double) => Callback): OnClick[T, E] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3((t0: Any, t1: ColumnDescription[T, E], t2: Double) => (onClick(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[OnClick[T, E]]
  }
  
  extension [Self <: OnClick[?, ?], T /* <: js.Object */, E](x: Self & (OnClick[T, E])) {
    
    inline def setOnClick(value: (Any, ColumnDescription[T, E], Double) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction3((t0: Any, t1: ColumnDescription[T, E], t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
