package typingsJapgolly.reactDashRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouterContext
import typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticRouter {
  def apply(
    basename: String = null,
    context: StaticRouterContext = null,
    location: String | js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StaticRouterProps, 
    typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouter, 
    Unit, 
    StaticRouterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouter](js.constructorOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouter])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticRouterProps])(children: _*)
  }
}

