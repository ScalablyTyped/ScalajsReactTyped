package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ActiveKey
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.tabsTypesMod.StateChangeType
import typingsJapgolly.baseui.tabsTypesMod.StatefulTabsProps
import typingsJapgolly.baseui.tabsTypesMod.StatefulTabsState
import typingsJapgolly.baseui.tabsTypesMod.TabsOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulTabs {
  
  inline def apply(
    children: js.Array[Element] | Element,
    stateReducer: (/* stateChangeType */ StateChangeType, /* nextState */ StatefulTabsState, /* currentState */ StatefulTabsState) => StatefulTabsState
  ): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer))
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulTabsProps]))
  }
  
  @JSImport("baseui/tabs", "StatefulTabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.tabsMod.StatefulTabs] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def initialState(value: StatefulTabsState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ ActiveKey => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def overrides(value: TabsOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulTabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
