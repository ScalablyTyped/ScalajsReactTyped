package typingsJapgolly.reactRouterGuard.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouterGuard.mod.RouterGuardConfigProps
import typingsJapgolly.reactRouterGuard.mod.RouterGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RouterGuard {
  def apply[T](
    config: js.Array[RouterGuardConfigProps],
    history: History[LocationState] = null,
    loading: Boolean | Element = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RouterGuardProps, 
    typingsJapgolly.reactRouterGuard.mod.RouterGuard[T], 
    Unit, 
    RouterGuardProps
  ] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterGuard.mod.RouterGuardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouterGuard.mod.RouterGuard[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterGuard.mod.RouterGuardProps])(children: _*)
  }
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  object componentImport extends js.Object
  
}

