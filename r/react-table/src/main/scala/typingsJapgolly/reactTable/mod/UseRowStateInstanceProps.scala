package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRowStateInstanceProps[D /* <: js.Object */] extends StObject {
  
  def setCellState(rowPath: js.Array[String], columnId: IdType[D], updater: UseRowUpdater[Any]): Unit
  
  def setRowState(rowPath: js.Array[String], updater: UseRowUpdater[Any]): Unit
}
object UseRowStateInstanceProps {
  
  inline def apply[D /* <: js.Object */](
    setCellState: (js.Array[String], IdType[D], UseRowUpdater[Any]) => Callback,
    setRowState: (js.Array[String], UseRowUpdater[Any]) => Callback
  ): UseRowStateInstanceProps[D] = {
    val __obj = js.Dynamic.literal(setCellState = js.Any.fromFunction3((t0: js.Array[String], t1: IdType[D], t2: UseRowUpdater[Any]) => (setCellState(t0, t1, t2)).runNow()), setRowState = js.Any.fromFunction2((t0: js.Array[String], t1: UseRowUpdater[Any]) => (setRowState(t0, t1)).runNow()))
    __obj.asInstanceOf[UseRowStateInstanceProps[D]]
  }
  
  extension [Self <: UseRowStateInstanceProps[?], D /* <: js.Object */](x: Self & UseRowStateInstanceProps[D]) {
    
    inline def setSetCellState(value: (js.Array[String], IdType[D], UseRowUpdater[Any]) => Callback): Self = StObject.set(x, "setCellState", js.Any.fromFunction3((t0: js.Array[String], t1: IdType[D], t2: UseRowUpdater[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetRowState(value: (js.Array[String], UseRowUpdater[Any]) => Callback): Self = StObject.set(x, "setRowState", js.Any.fromFunction2((t0: js.Array[String], t1: UseRowUpdater[Any]) => (value(t0, t1)).runNow()))
  }
}
