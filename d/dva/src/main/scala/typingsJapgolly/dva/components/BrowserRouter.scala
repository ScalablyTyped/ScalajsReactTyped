package typingsJapgolly.dva.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouterDom.mod.BrowserRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BrowserRouter {
  def apply(
    basename: String = null,
    forceRefresh: js.UndefOr[Boolean] = js.undefined,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Callback = null,
    keyLength: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BrowserRouterProps, 
    typingsJapgolly.dva.routerMod.BrowserRouter, 
    Unit, 
    BrowserRouterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterDom.mod.BrowserRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.dva.routerMod.BrowserRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterDom.mod.BrowserRouterProps])(children: _*)
  }
  @JSImport("dva/router", "BrowserRouter")
  @js.native
  object componentImport extends js.Object
  
}

