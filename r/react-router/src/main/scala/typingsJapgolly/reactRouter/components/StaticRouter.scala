package typingsJapgolly.reactRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouter.mod.StaticRouterContext
import typingsJapgolly.reactRouter.mod.StaticRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticRouter {
  def apply(
    basename: String = null,
    context: StaticRouterContext = null,
    location: String | js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StaticRouterProps, 
    typingsJapgolly.reactRouter.mod.StaticRouter, 
    Unit, 
    StaticRouterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouter.mod.StaticRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouter.mod.StaticRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouter.mod.StaticRouterProps])(children: _*)
  }
  @JSImport("react-router", "StaticRouter")
  @js.native
  object componentImport extends js.Object
  
}

