package typingsJapgolly.dva.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dva.routerMod.routerRedux.ConnectedRouter
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouterRedux.mod.ConnectedRouterProps
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RouterReduxConnectedRouter {
  def apply[State](
    history: History[LocationState],
    store: Store[State, AnyAction] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ConnectedRouterProps[State], ConnectedRouter[State], Unit, ConnectedRouterProps[State]] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
  
      if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouterRedux.mod.ConnectedRouterProps[State], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.dva.routerMod.routerRedux.ConnectedRouter[State]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouterRedux.mod.ConnectedRouterProps[State]])(children: _*)
  }
  @JSImport("dva/router", "routerRedux.ConnectedRouter")
  @js.native
  object componentImport extends js.Object
  
}

