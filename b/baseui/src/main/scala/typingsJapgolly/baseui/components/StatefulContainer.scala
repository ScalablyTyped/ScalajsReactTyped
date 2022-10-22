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
import typingsJapgolly.baseui.menuTypesMod.RenderItemProps
import typingsJapgolly.baseui.menuTypesMod.RenderProps
import typingsJapgolly.baseui.menuTypesMod.RootRef
import typingsJapgolly.baseui.menuTypesMod.StatefulContainerProps
import typingsJapgolly.baseui.menuTypesMod.StatefulContainerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulContainer {
  
  inline def apply(
    children: RenderProps => Node,
    forceHighlight: Boolean,
    getRequiredItemProps: (/* item */ typingsJapgolly.baseui.menuTypesMod.Item, /* index */ Double) => RenderItemProps,
    initialState: InitialState,
    items: Items,
    keyboardControlNode: `14`,
    onItemSelect: /* a */ typingsJapgolly.baseui.anon.Item => Any,
    stateReducer: (/* changeType */ js.UndefOr[
      click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
    ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState,
    typeAhead: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), forceHighlight = forceHighlight.asInstanceOf[js.Any], getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), initialState = initialState.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], keyboardControlNode = keyboardControlNode.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), stateReducer = js.Any.fromFunction3(stateReducer), typeAhead = typeAhead.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
  
  @JSImport("baseui/menu", "StatefulContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def addMenuToNesting(value: /* ref */ `14` => Callback): this.type = set("addMenuToNesting", js.Any.fromFunction1((t0: /* ref */ `14`) => value(t0).runNow()))
    
    inline def getChildMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    inline def getParentMenu(value: /* ref */ `14` => js.UndefOr[`14` | Null]): this.type = set("getParentMenu", js.Any.fromFunction1(value))
    
    inline def isNestedMenuVisible(value: /* ref */ `14` => Boolean): this.type = set("isNestedMenuVisible", js.Any.fromFunction1(value))
    
    inline def nestedMenuHoverIndex(value: Double): this.type = set("nestedMenuHoverIndex", value.asInstanceOf[js.Any])
    
    inline def onActiveDescendantChange(value: /* id */ js.UndefOr[String] => Any): this.type = set("onActiveDescendantChange", js.Any.fromFunction1(value))
    
    inline def removeMenuFromNesting(value: /* ref */ `14` => Callback): this.type = set("removeMenuFromNesting", js.Any.fromFunction1((t0: /* ref */ `14`) => value(t0).runNow()))
    
    inline def rootRef(value: RootRef): this.type = set("rootRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
