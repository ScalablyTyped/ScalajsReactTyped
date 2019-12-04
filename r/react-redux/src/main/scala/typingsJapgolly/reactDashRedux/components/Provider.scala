package typingsJapgolly.reactDashRedux.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.Context
import typingsJapgolly.reactDashRedux.reactDashReduxMod.ProviderProps
import typingsJapgolly.reactDashRedux.reactDashReduxMod.ReactReduxContextValue
import typingsJapgolly.redux.reduxMod.Action
import typingsJapgolly.redux.reduxMod.AnyAction
import typingsJapgolly.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply[A /* <: Action[js.Any] */](
    store: Store[_, A],
    context: Context[ReactReduxContextValue[_, AnyAction]] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProviderProps[A], 
    typingsJapgolly.reactDashRedux.reactDashReduxMod.Provider[A], 
    Unit, 
    ProviderProps[A]
  ] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
  
      if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRedux.reactDashReduxMod.ProviderProps[A], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashRedux.reactDashReduxMod.Provider[A]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRedux.reactDashReduxMod.ProviderProps[A]])(children: _*)
  }
  @JSImport("react-redux", "Provider")
  @js.native
  object componentImport extends js.Object
  
}

