package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonItem
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.focus
import typingsJapgolly.baseui.baseuiStrings.mouseEnter
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.baseui.menuMod.ItemsT
import typingsJapgolly.baseui.menuMod.RenderItemProps
import typingsJapgolly.baseui.menuMod.RenderProps
import typingsJapgolly.baseui.menuMod.StatefulContainerProps
import typingsJapgolly.baseui.menuMod.StatefulContainerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulContainer {
  def apply(
    items: ItemsT,
    addMenuToNesting: /* ref */ Ref => Callback = null,
    getChildMenu: /* ref */ Ref => Callback = null,
    getParentMenu: /* ref */ Ref => Callback = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => CallbackTo[RenderItemProps] = null,
    initialState: StatefulContainerState = null,
    onItemSelect: /* args */ AnonItem => CallbackTo[js.Any] = null,
    removeMenuFromNesting: /* ref */ Ref => Callback = null,
    rootRef: Ref = null,
    stateReducer: (/* changeType */ moveDown | moveUp | reset | click | focus | mouseEnter, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => CallbackTo[StatefulContainerState] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* args */ RenderProps => CallbackTo[Node] = null
  ): UnmountedWithRoot[
    StatefulContainerProps, 
    typingsJapgolly.baseui.menuMod.StatefulContainer, 
    Unit, 
    StatefulContainerProps
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.menuMod.RenderProps) => children(t0).runNow()))
    if (addMenuToNesting != null) __obj.updateDynamic("addMenuToNesting")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.Ref) => addMenuToNesting(t0).runNow()))
    if (getChildMenu != null) __obj.updateDynamic("getChildMenu")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.Ref) => getChildMenu(t0).runNow()))
    if (getParentMenu != null) __obj.updateDynamic("getParentMenu")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.Ref) => getParentMenu(t0).runNow()))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* index */ scala.Double) => getRequiredItemProps(t0, t1).runNow()))
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonItem) => onItemSelect(t0).runNow()))
    if (removeMenuFromNesting != null) __obj.updateDynamic("removeMenuFromNesting")(js.Any.fromFunction1((t0: /* ref */ japgolly.scalajs.react.raw.React.Ref) => removeMenuFromNesting(t0).runNow()))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* changeType */ typingsJapgolly.baseui.baseuiStrings.moveDown | typingsJapgolly.baseui.baseuiStrings.moveUp | typingsJapgolly.baseui.baseuiStrings.reset | typingsJapgolly.baseui.baseuiStrings.click | typingsJapgolly.baseui.baseuiStrings.focus | typingsJapgolly.baseui.baseuiStrings.mouseEnter, t1: /* changes */ typingsJapgolly.baseui.menuMod.StatefulContainerState, t2: /* currentState */ typingsJapgolly.baseui.menuMod.StatefulContainerState) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.menuMod.StatefulContainerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.baseui.menuMod.StatefulContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.menuMod.StatefulContainerProps])
  }
  @JSImport("baseui/menu", "StatefulContainer")
  @js.native
  object componentImport extends js.Object
  
}

