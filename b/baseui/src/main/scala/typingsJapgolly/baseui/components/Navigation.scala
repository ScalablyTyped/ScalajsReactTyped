package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonEventItem
import typingsJapgolly.baseui.sideNavigationMod.Item
import typingsJapgolly.baseui.sideNavigationMod.NavigationOverrides
import typingsJapgolly.baseui.sideNavigationMod.NavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation {
  def apply(
    activeItemId: String,
    activePredicate: (/* item */ js.Any, /* activeItemId */ String) => CallbackTo[Boolean] = null,
    items: js.Array[Item] = null,
    mapItem: /* item */ Item => CallbackTo[Item] = null,
    onChange: /* args */ AnonEventItem => CallbackTo[js.Any] = null,
    overrides: NavigationOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NavigationProps, 
    typingsJapgolly.baseui.sideNavigationMod.Navigation, 
    Unit, 
    NavigationProps
  ] = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any])
  
      if (activePredicate != null) __obj.updateDynamic("activePredicate")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* activeItemId */ java.lang.String) => activePredicate(t0, t1).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (mapItem != null) __obj.updateDynamic("mapItem")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.baseui.sideNavigationMod.Item) => mapItem(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventItem) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.sideNavigationMod.NavigationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.sideNavigationMod.Navigation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.sideNavigationMod.NavigationProps])(children: _*)
  }
  @JSImport("baseui/side-navigation", "Navigation")
  @js.native
  object componentImport extends js.Object
  
}

