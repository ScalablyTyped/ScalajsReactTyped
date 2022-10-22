package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionModel[T /* <: SlickData */, E] extends StObject {
  
  /**
    * A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
    **/
  def destroy(): Unit
  
  /**
    * An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
    **/
  def init(grid: Grid[T]): Unit
  
  var onSelectedRangesChanged: Event[E]
}
object SelectionModel {
  
  inline def apply[T /* <: SlickData */, E](destroy: Callback, init: Grid[T] => Callback, onSelectedRangesChanged: Event[E]): SelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, init = js.Any.fromFunction1((t0: Grid[T]) => init(t0).runNow()), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionModel[T, E]]
  }
  
  extension [Self <: SelectionModel[?, ?], T /* <: SlickData */, E](x: Self & (SelectionModel[T, E])) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setInit(value: Grid[T] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Grid[T]) => value(t0).runNow()))
    
    inline def setOnSelectedRangesChanged(value: Event[E]): Self = StObject.set(x, "onSelectedRangesChanged", value.asInstanceOf[js.Any])
  }
}
