package typingsJapgolly.reduxRouter.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.LocationDescriptor
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.MemoryRouterProps
import typingsJapgolly.reduxRouter.mod.ReduxRouter.MemoryRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxRouterMemoryRouter {
  def apply(
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Callback = null,
    initialEntries: js.Array[LocationDescriptor[LocationState]] = null,
    initialIndex: Int | Double = null,
    keyLength: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MemoryRouterProps, MemoryRouter, Unit, MemoryRouterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (initialEntries != null) __obj.updateDynamic("initialEntries")(initialEntries.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouter.mod.MemoryRouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reduxRouter.mod.ReduxRouter.MemoryRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouter.mod.MemoryRouterProps])(children: _*)
  }
  @JSImport("redux-router", "ReduxRouter.MemoryRouter")
  @js.native
  object componentImport extends js.Object
  
}

