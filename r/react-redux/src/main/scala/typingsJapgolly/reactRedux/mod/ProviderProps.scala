package typingsJapgolly.reactRedux.mod

import typingsJapgolly.react.mod.Context
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps[A /* <: Action[_] */] extends js.Object {
  /**
    * Optional context to be used internally in react-redux. Use React.createContext() to create a context to be used.
    * If this is used, generate own connect HOC by using connectAdvanced, supplying the same context provided to the
    * Provider. Initial value doesn't matter, as it is overwritten with the internal state of Provider.
    */
  var context: js.UndefOr[Context[ReactReduxContextValue[_, AnyAction]]] = js.undefined
  /**
    * The single Redux store in your application.
    */
  var store: Store[_, A]
}

object ProviderProps {
  @scala.inline
  def apply[A /* <: Action[_] */](store: Store[_, A], context: Context[ReactReduxContextValue[_, AnyAction]] = null): ProviderProps[A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[A]]
  }
}

