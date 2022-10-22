package typingsJapgolly.reactRedux.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactRedux.esComponentsContextMod.ReactReduxContextValue
import typingsJapgolly.reactRedux.esComponentsProviderMod.ProviderProps
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply[A /* <: Action[Any] */](store: Store[Any, A]): Builder[A] = {
    val __props = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    new Builder[A](js.Array(this.component, __props.asInstanceOf[ProviderProps[A, Any]]))
  }
  
  @JSImport("react-redux", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[A /* <: Action[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def context(value: Context[ReactReduxContextValue[Any, A]]): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def serverState(value: Any): this.type = set("serverState", value.asInstanceOf[js.Any])
  }
  
  def withProps[A /* <: Action[Any] */](p: ProviderProps[A, Any]): Builder[A] = new Builder[A](js.Array(this.component, p.asInstanceOf[js.Any]))
}
