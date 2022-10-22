package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.MenuItemContextKeys> */
trait MenuItemContext[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var isOnlyResult: js.UndefOr[Boolean] = js.undefined
  
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.undefined
  
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.undefined
}
object MenuItemContext {
  
  inline def apply[T /* <: TypeaheadModel */](): MenuItemContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemContext[T]]
  }
  
  extension [Self <: MenuItemContext[?], T /* <: TypeaheadModel */](x: Self & MenuItemContext[T]) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setIsOnlyResult(value: Boolean): Self = StObject.set(x, "isOnlyResult", value.asInstanceOf[js.Any])
    
    inline def setIsOnlyResultUndefined: Self = StObject.set(x, "isOnlyResult", js.undefined)
    
    inline def setOnActiveItemChange(value: /* options */ T => Callback): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction1((t0: /* options */ T) => value(t0).runNow()))
    
    inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
    
    inline def setOnInitialItemChange(value: /* option */ T => Callback): Self = StObject.set(x, "onInitialItemChange", js.Any.fromFunction1((t0: /* option */ T) => value(t0).runNow()))
    
    inline def setOnInitialItemChangeUndefined: Self = StObject.set(x, "onInitialItemChange", js.undefined)
    
    inline def setOnMenuItemClick(value: (/* option */ T, /* e */ Event) => Callback): Self = StObject.set(x, "onMenuItemClick", js.Any.fromFunction2((t0: /* option */ T, t1: /* e */ Event) => (value(t0, t1)).runNow()))
    
    inline def setOnMenuItemClickUndefined: Self = StObject.set(x, "onMenuItemClick", js.undefined)
  }
}
