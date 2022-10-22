package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewTools extends StObject {
  
  /**
    * Aligns all selected nodes to the current grid
    */
  def alignSelectionToGrid(): Unit
  
  def init(): Unit
  
  /**
    * Moves all of the selected nodes by the specified amount
    * @param dx
    * @param dy
    */
  def moveSelection(dx: Double, dy: Double): Unit
}
object ViewTools {
  
  inline def apply(alignSelectionToGrid: Callback, init: Callback, moveSelection: (Double, Double) => Callback): ViewTools = {
    val __obj = js.Dynamic.literal(alignSelectionToGrid = alignSelectionToGrid.toJsFn, init = init.toJsFn, moveSelection = js.Any.fromFunction2((t0: Double, t1: Double) => (moveSelection(t0, t1)).runNow()))
    __obj.asInstanceOf[ViewTools]
  }
  
  extension [Self <: ViewTools](x: Self) {
    
    inline def setAlignSelectionToGrid(value: Callback): Self = StObject.set(x, "alignSelectionToGrid", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setMoveSelection(value: (Double, Double) => Callback): Self = StObject.set(x, "moveSelection", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
