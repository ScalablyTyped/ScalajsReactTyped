package typingsJapgolly.reactRedux.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactRedux.mod.ProviderProps
import typingsJapgolly.reactRedux.mod.ReactReduxContextValue
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply[A /* <: Action[js.Any] */](
    store: Store[_, A],
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ProviderProps[A], typingsJapgolly.reactRedux.mod.Provider[A], Unit, ProviderProps[A]] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
      if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRedux.mod.ProviderProps[A], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRedux.mod.Provider[A]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRedux.mod.ProviderProps[A]])(children: _*)
  }
  @JSImport("react-redux", "Provider")
  @js.native
  object componentImport extends js.Object
  
}

