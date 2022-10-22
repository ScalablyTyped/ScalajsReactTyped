package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import typingsJapgolly.baseui.selectTypesMod.SelectOverrides
import typingsJapgolly.baseui.selectTypesMod.SelectProps
import typingsJapgolly.baseui.selectTypesMod.State
import typingsJapgolly.baseui.selectTypesMod.StatefulContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulSelectContainer {
  
  inline def apply(
    children: SelectProps => Node,
    initialState: State,
    onChange: OnChangeParams => Any,
    overrides: SelectOverrides,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State
  ): Default[typingsJapgolly.baseui.selectMod.StatefulSelectContainer] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), initialState = initialState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), overrides = overrides.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer))
    new Default[typingsJapgolly.baseui.selectMod.StatefulSelectContainer](js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
  
  @JSImport("baseui/select", "StatefulSelectContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StatefulContainerProps): Default[typingsJapgolly.baseui.selectMod.StatefulSelectContainer] = new Default[typingsJapgolly.baseui.selectMod.StatefulSelectContainer](js.Array(this.component, p.asInstanceOf[js.Any]))
}
