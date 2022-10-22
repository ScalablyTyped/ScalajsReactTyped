package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.checkboxStatefulCheckboxContainerMod.default
import typingsJapgolly.baseui.checkboxTypesMod.CheckboxOverrides
import typingsJapgolly.baseui.checkboxTypesMod.CheckboxReducerState
import typingsJapgolly.baseui.checkboxTypesMod.StatefulContainerChildProps
import typingsJapgolly.baseui.checkboxTypesMod.StatefulContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulCheckboxContainer {
  
  inline def apply(
    stateReducer: (/* stateType */ String, /* nextState */ CheckboxReducerState, /* currentState */ CheckboxReducerState, /* event */ ReactEventFrom[HTMLInputElement]) => CheckboxReducerState
  ): Builder = {
    val __props = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
  
  @JSImport("baseui/checkbox/stateful-checkbox-container", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: /* a */ StatefulContainerChildProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def initialState(value: CheckboxReducerState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onMouseEnter(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    inline def onMouseLeave(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    inline def overrides(value: CheckboxOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
