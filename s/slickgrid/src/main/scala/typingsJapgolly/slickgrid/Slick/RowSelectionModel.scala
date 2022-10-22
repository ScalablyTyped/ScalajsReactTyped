package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionModel[T /* <: SlickData */, E]
  extends StObject
     with SelectionModel[T, E] {
  
  def getSelectedRanges(): js.Array[Double]
  
  def getSelectedRows(): js.Array[Double]
  
  def setSelectedRanges(ranges: js.Array[Double]): Unit
  
  def setSelectedRows(rows: js.Array[Double]): Unit
}
object RowSelectionModel {
  
  inline def apply[T /* <: SlickData */, E](
    destroy: Callback,
    getSelectedRanges: CallbackTo[js.Array[Double]],
    getSelectedRows: CallbackTo[js.Array[Double]],
    init: Grid[T] => Callback,
    onSelectedRangesChanged: Event[E],
    setSelectedRanges: js.Array[Double] => Callback,
    setSelectedRows: js.Array[Double] => Callback
  ): RowSelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getSelectedRanges = getSelectedRanges.toJsFn, getSelectedRows = getSelectedRows.toJsFn, init = js.Any.fromFunction1((t0: Grid[T]) => init(t0).runNow()), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any], setSelectedRanges = js.Any.fromFunction1((t0: js.Array[Double]) => setSelectedRanges(t0).runNow()), setSelectedRows = js.Any.fromFunction1((t0: js.Array[Double]) => setSelectedRows(t0).runNow()))
    __obj.asInstanceOf[RowSelectionModel[T, E]]
  }
  
  extension [Self <: RowSelectionModel[?, ?], T /* <: SlickData */, E](x: Self & (RowSelectionModel[T, E])) {
    
    inline def setGetSelectedRanges(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getSelectedRanges", value.toJsFn)
    
    inline def setGetSelectedRows(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getSelectedRows", value.toJsFn)
    
    inline def setSetSelectedRanges(value: js.Array[Double] => Callback): Self = StObject.set(x, "setSelectedRanges", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSetSelectedRows(value: js.Array[Double] => Callback): Self = StObject.set(x, "setSelectedRows", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
  }
}
