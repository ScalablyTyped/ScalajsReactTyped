package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.NewState
import typingsJapgolly.baseui.anon.OmitListPropschildren
import typingsJapgolly.baseui.dndListTypesMod.ListOverrides
import typingsJapgolly.baseui.dndListTypesMod.State
import typingsJapgolly.baseui.dndListTypesMod.StateChangeType
import typingsJapgolly.baseui.dndListTypesMod.StatefulComponentContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulListContainer {
  
  inline def apply(children: OmitListPropschildren => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulComponentContainerProps]))
  }
  
  @JSImport("baseui/dnd-list", "StatefulListContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.dndListMod.StatefulListContainer] {
    
    inline def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* params */ NewState => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def removable(value: Boolean): this.type = set("removable", value.asInstanceOf[js.Any])
    
    inline def removableByMove(value: Boolean): this.type = set("removableByMove", value.asInstanceOf[js.Any])
    
    inline def stateReducer(
      value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulComponentContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
