package typingsJapgolly.dva.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouterDom.mod.HashRouterProps
import typingsJapgolly.reactRouterDom.reactRouterDomStrings.hashbang
import typingsJapgolly.reactRouterDom.reactRouterDomStrings.noslash
import typingsJapgolly.reactRouterDom.reactRouterDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HashRouter {
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Callback = null,
    hashType: slash | noslash | hashbang = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HashRouterProps, typingsJapgolly.dva.routerMod.HashRouter, Unit, HashRouterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterDom.mod.HashRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.dva.routerMod.HashRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterDom.mod.HashRouterProps])(children: _*)
  }
  @JSImport("dva/router", "HashRouter")
  @js.native
  object componentImport extends js.Object
  
}

