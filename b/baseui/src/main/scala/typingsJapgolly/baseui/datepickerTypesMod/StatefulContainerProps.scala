package typingsJapgolly.baseui.datepickerTypesMod

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.`2`
import typingsJapgolly.baseui.anon.`9`
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerProps[Props, T] extends StObject {
  
  var adapter: js.UndefOr[DateIOAdapter[T]] = js.undefined
  
  def children(a: Props): Node
  
  /** Initial state of an uncontrolled datepicker component. */
  var initialState: js.UndefOr[ContainerState[T]] = js.undefined
  
  /** When single picker, fn is called when date/time is selected. When range picker, fn is called when both start and end are selected. */
  var onChange: js.UndefOr[js.Function1[/* a */ `9`[T], Any]] = js.undefined
  
  /** When single picker, fn is called when date/time is selected. When range picker, fn is called when either start or end date changes. */
  var onRangeChange: js.UndefOr[js.Function1[/* a */ `2`[T], Any]] = js.undefined
  
  /** Should the date value be stored as an array or single value. */
  var range: js.UndefOr[Boolean] = js.undefined
  
  /** A state change handler. */
  var stateReducer: js.UndefOr[StateReducer[T]] = js.undefined
}
object StatefulContainerProps {
  
  inline def apply[Props, T](children: Props => Node): StatefulContainerProps[Props, T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[StatefulContainerProps[Props, T]]
  }
  
  extension [Self <: StatefulContainerProps[?, ?], Props, T](x: Self & (StatefulContainerProps[Props, T])) {
    
    inline def setAdapter(value: DateIOAdapter[T]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setChildren(value: Props => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setInitialState(value: ContainerState[T]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnChange(value: /* a */ `9`[T] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnRangeChange(value: /* a */ `2`[T] => Any): Self = StObject.set(x, "onRangeChange", js.Any.fromFunction1(value))
    
    inline def setOnRangeChangeUndefined: Self = StObject.set(x, "onRangeChange", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStateReducer(
      value: (/* stateType */ StateChangeType, /* nextState */ ContainerState[T], /* currentState */ ContainerState[T]) => ContainerState[T]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
