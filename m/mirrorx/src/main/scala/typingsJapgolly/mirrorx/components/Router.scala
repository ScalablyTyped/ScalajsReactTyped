package typingsJapgolly.mirrorx.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.mirrorx.mod.ConnectedRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  def apply[State](
    history: History[LocationState] = null,
    store: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ConnectedRouterProps[State], 
    typingsJapgolly.mirrorx.mod.Router[State], 
    Unit, 
    ConnectedRouterProps[State]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mirrorx.mod.ConnectedRouterProps[State], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mirrorx.mod.Router[State]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mirrorx.mod.ConnectedRouterProps[State]])(children: _*)
  }
  @JSImport("mirrorx", "Router")
  @js.native
  object componentImport extends js.Object
  
}

