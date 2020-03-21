package typingsJapgolly.reactRouterNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.LocationDescriptor
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouterNative.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  def apply(
    to: LocationDescriptor[LocationState],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    component: ComponentType[_] = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LinkProps, typingsJapgolly.reactRouterNative.mod.Link, Unit, LinkProps] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterNative.mod.LinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouterNative.mod.Link](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterNative.mod.LinkProps])(children: _*)
  }
  @JSImport("react-router-native", "Link")
  @js.native
  object componentImport extends js.Object
  
}

