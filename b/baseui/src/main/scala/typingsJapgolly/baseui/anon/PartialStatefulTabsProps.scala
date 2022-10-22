package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.tabsTypesMod.OnChangeHandler
import typingsJapgolly.baseui.tabsTypesMod.StateChangeType
import typingsJapgolly.baseui.tabsTypesMod.StatefulTabsState
import typingsJapgolly.baseui.tabsTypesMod.TabsOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/tabs/types.StatefulTabsProps> */
trait PartialStatefulTabsProps extends StObject {
  
  var children: js.UndefOr[js.Array[Element] | Element] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var initialState: js.UndefOr[StatefulTabsState] = js.undefined
  
  var onChange: js.UndefOr[OnChangeHandler] = js.undefined
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var overrides: js.UndefOr[TabsOverrides] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var stateReducer: js.UndefOr[typingsJapgolly.baseui.tabsTypesMod.StateReducer] = js.undefined
}
object PartialStatefulTabsProps {
  
  inline def apply(): PartialStatefulTabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatefulTabsProps]
  }
  
  extension [Self <: PartialStatefulTabsProps](x: Self) {
    
    inline def setChildren(value: js.Array[Element] | Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInitialState(value: StatefulTabsState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnChange(value: /* a */ ActiveKey => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOverrides(value: TabsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setStateReducer(
      value: (/* stateChangeType */ StateChangeType, /* nextState */ StatefulTabsState, /* currentState */ StatefulTabsState) => StatefulTabsState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
