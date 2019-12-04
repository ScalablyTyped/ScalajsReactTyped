package typingsJapgolly.reactDashRouterDashDom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps
import typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomStrings.hashbang
import typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomStrings.noslash
import typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HashRouter {
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Callback = null,
    hashType: slash | noslash | hashbang = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HashRouterProps, 
    typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouter, 
    Unit, 
    HashRouterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.HashRouterProps])(children: _*)
  }
  @JSImport("react-router-dom", "HashRouter")
  @js.native
  object componentImport extends js.Object
  
}

