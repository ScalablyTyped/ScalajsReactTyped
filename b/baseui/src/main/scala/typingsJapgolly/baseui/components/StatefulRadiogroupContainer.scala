package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.radioStatefulRadiogroupContainerMod.default
import typingsJapgolly.baseui.radioTypesMod.RadioGroupOverrides
import typingsJapgolly.baseui.radioTypesMod.RadioGroupProps
import typingsJapgolly.baseui.radioTypesMod.State
import typingsJapgolly.baseui.radioTypesMod.StatefulContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulRadiogroupContainer {
  
  inline def apply(
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ ReactEventFrom[HTMLInputElement]) => State
  ): Builder = {
    val __props = js.Dynamic.literal(stateReducer = js.Any.fromFunction4(stateReducer))
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
  
  @JSImport("baseui/radio/stateful-radiogroup-container", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: /* props */ RadioGroupProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: RadioGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
