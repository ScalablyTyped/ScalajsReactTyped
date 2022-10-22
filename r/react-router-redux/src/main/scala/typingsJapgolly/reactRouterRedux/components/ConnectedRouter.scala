package typingsJapgolly.reactRouterRedux.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.history.mod.History
import typingsJapgolly.reactRouterRedux.mod.ConnectedRouterProps
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConnectedRouter {
  
  inline def apply[State](history: History): Builder[State] = {
    val __props = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    new Builder[State](js.Array(this.component, __props.asInstanceOf[ConnectedRouterProps[State]]))
  }
  
  @JSImport("react-router-redux", "ConnectedRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[State] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterRedux.mod.ConnectedRouter[State]] {
    
    inline def store(value: Store[State, AnyAction]): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  def withProps[State](p: ConnectedRouterProps[State]): Builder[State] = new Builder[State](js.Array(this.component, p.asInstanceOf[js.Any]))
}
