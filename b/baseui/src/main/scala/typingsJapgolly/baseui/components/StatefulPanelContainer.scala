package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.accordionTypesMod.PanelState
import typingsJapgolly.baseui.accordionTypesMod.StateChangeType
import typingsJapgolly.baseui.accordionTypesMod.StatefulPanelContainerProps
import typingsJapgolly.baseui.anon.ExpandedBoolean
import typingsJapgolly.baseui.anon.OmitPanelPropschildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulPanelContainer {
  
  inline def apply(children: OmitPanelPropschildren => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulPanelContainerProps]))
  }
  
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.accordionMod.StatefulPanelContainer] {
    
    inline def initialState(value: PanelState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ ExpandedBoolean => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def stateReducer(
      value: (/* stateChangeType */ StateChangeType, /* nextState */ PanelState, /* currentState */ PanelState) => PanelState
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulPanelContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
