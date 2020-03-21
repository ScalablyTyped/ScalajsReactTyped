package typingsJapgolly.reduxRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.LocationDescriptor
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.RedirectProps
import typingsJapgolly.reduxRouter.mod.ReduxRouter.Redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxRouterRedirect {
  def apply(
    to: LocationDescriptor[LocationState],
    exact: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    path: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RedirectProps, Redirect, Unit, RedirectProps] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouter.mod.RedirectProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxRouter.mod.ReduxRouter.Redirect](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouter.mod.RedirectProps])(children: _*)
  }
  @JSImport("redux-router", "ReduxRouter.Redirect")
  @js.native
  object componentImport extends js.Object
  
}

