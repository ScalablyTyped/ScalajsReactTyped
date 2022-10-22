package typingsJapgolly.griddleReact.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.ActionCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddleActions
  extends StObject
     with PropertyBag[js.UndefOr[ActionCreator[Any]]] {
  
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ Any, Unit]] = js.undefined
  
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
}
object GriddleActions {
  
  inline def apply(): GriddleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleActions]
  }
  
  extension [Self <: GriddleActions](x: Self) {
    
    inline def setOnGetPage(value: /* pageNumber */ Double => Callback): Self = StObject.set(x, "onGetPage", js.Any.fromFunction1((t0: /* pageNumber */ Double) => value(t0).runNow()))
    
    inline def setOnGetPageUndefined: Self = StObject.set(x, "onGetPage", js.undefined)
    
    inline def setOnNext(value: Callback): Self = StObject.set(x, "onNext", value.toJsFn)
    
    inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
    
    inline def setOnPrevious(value: Callback): Self = StObject.set(x, "onPrevious", value.toJsFn)
    
    inline def setOnPreviousUndefined: Self = StObject.set(x, "onPrevious", js.undefined)
    
    inline def setOnSort(value: /* sortProperties */ Any => Callback): Self = StObject.set(x, "onSort", js.Any.fromFunction1((t0: /* sortProperties */ Any) => value(t0).runNow()))
    
    inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
    
    inline def setSetFilter(value: /* filter */ GriddleFilter => Callback): Self = StObject.set(x, "setFilter", js.Any.fromFunction1((t0: /* filter */ GriddleFilter) => value(t0).runNow()))
    
    inline def setSetFilterUndefined: Self = StObject.set(x, "setFilter", js.undefined)
  }
}
