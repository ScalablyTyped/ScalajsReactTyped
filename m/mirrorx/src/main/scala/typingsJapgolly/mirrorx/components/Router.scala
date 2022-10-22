package typingsJapgolly.mirrorx.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.history.mod.History
import typingsJapgolly.mirrorx.mod.ConnectedRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  inline def apply[State](): Builder[State] = {
    val __props = js.Dynamic.literal()
    new Builder[State](js.Array(this.component, __props.asInstanceOf[ConnectedRouterProps[State]]))
  }
  
  @JSImport("mirrorx", "Router")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[State] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mirrorx.mod.Router[State]] {
    
    inline def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
    
    inline def store(value: Any): this.type = set("store", value.asInstanceOf[js.Any])
  }
  
  implicit def make[State](companion: Router.type): Builder[State] = new Builder[State](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[State](p: ConnectedRouterProps[State]): Builder[State] = new Builder[State](js.Array(this.component, p.asInstanceOf[js.Any]))
}
