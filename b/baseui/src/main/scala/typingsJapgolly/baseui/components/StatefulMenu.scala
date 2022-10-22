package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.PartialStatefulContainerS
import typingsJapgolly.baseui.anon.`14`
import typingsJapgolly.baseui.baseuiStrings.character
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.enter_
import typingsJapgolly.baseui.baseuiStrings.focus
import typingsJapgolly.baseui.baseuiStrings.mouseEnter
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.baseui.menuTypesMod.InitialState
import typingsJapgolly.baseui.menuTypesMod.Items
import typingsJapgolly.baseui.menuTypesMod.MenuOverrides
import typingsJapgolly.baseui.menuTypesMod.RenderItemProps
import typingsJapgolly.baseui.menuTypesMod.RenderProps
import typingsJapgolly.baseui.menuTypesMod.RootRef
import typingsJapgolly.baseui.menuTypesMod.StatefulContainerState
import typingsJapgolly.baseui.menuTypesMod.StatefulMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulMenu {
  
  inline def apply(items: Items): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulMenuProps]))
  }
  
  @JSImport("baseui/menu", "StatefulMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.menuMod.StatefulMenu] {
    
    inline def addMenuToNesting(value: /* ref */ `14` => Callback): this.type = set("addMenuToNesting", js.Any.fromFunction1((t0: /* ref */ `14`) => value(t0).runNow()))
    
    inline def children(value: /* a */ RenderProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def getChildMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    inline def getParentMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): this.type = set("getParentMenu", js.Any.fromFunction1(value))
    
    inline def getRequiredItemProps(
      value: (/* item */ typingsJapgolly.baseui.menuTypesMod.Item, /* index */ Double) => RenderItemProps
    ): this.type = set("getRequiredItemProps", js.Any.fromFunction2(value))
    
    inline def initialState(value: InitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def isNestedMenuVisible(value: /* ref */ `14` => Boolean): this.type = set("isNestedMenuVisible", js.Any.fromFunction1(value))
    
    inline def nestedMenuHoverIndex(value: Double): this.type = set("nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def onActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): this.type = set("onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def onItemSelect(value: /* a */ typingsJapgolly.baseui.anon.Item => Any): this.type = set("onItemSelect", js.Any.fromFunction1(value))
    
    inline def overrides(value: MenuOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def removeMenuFromNesting(value: /* ref */ `14` => Callback): this.type = set("removeMenuFromNesting", js.Any.fromFunction1((t0: /* ref */ `14`) => value(t0).runNow()))
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    inline def rootRef(value: RootRef): this.type = set("rootRef", value.asInstanceOf[js.Any])
    
    inline def stateReducer(
      value: (/* changeType */ js.UndefOr[
          click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
        ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState
    ): this.type = set("stateReducer", js.Any.fromFunction3(value))
    
    inline def typeAhead(value: Boolean): this.type = set("typeAhead", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
