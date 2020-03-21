package typingsJapgolly.wouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wouter.PartialRouterPropschildre
import typingsJapgolly.wouter.mod.DefaultParams
import typingsJapgolly.wouter.mod.LocationHookOptions
import typingsJapgolly.wouter.mod.LocationTuple
import typingsJapgolly.wouter.mod.Match
import typingsJapgolly.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  def apply(
    base: Path = null,
    hook: /* options */ js.UndefOr[LocationHookOptions] => CallbackTo[LocationTuple] = null,
    matcher: (/* pattern */ Path, /* path */ Path) => CallbackTo[Match[DefaultParams]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PartialRouterPropschildre, 
    MountedWithRawType[
      PartialRouterPropschildre, 
      js.Object, 
      RawMounted[PartialRouterPropschildre, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.wouter.mod.LocationHookOptions]) => hook(t0).runNow()))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2((t0: /* pattern */ typingsJapgolly.wouter.mod.Path, t1: /* path */ typingsJapgolly.wouter.mod.Path) => matcher(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.wouter.PartialRouterPropschildre, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.wouter.PartialRouterPropschildre])(children: _*)
  }
  @JSImport("wouter", "Router")
  @js.native
  object componentImport extends js.Object
  
}

