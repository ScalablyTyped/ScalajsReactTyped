package typingsJapgolly.gatsbyjsReachRouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachRouter.mod.NavigateFn
import typingsJapgolly.reachRouter.mod.RedirectProps
import typingsJapgolly.reachRouter.mod.RouteComponentProps
import typingsJapgolly.reachRouter.mod.WindowLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Redirect {
  
  inline def apply[TState](to: String): Builder[TState] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder[TState](js.Array(this.component, __props.asInstanceOf[RouteComponentProps[RedirectProps[TState]]]))
  }
  
  @JSImport("@gatsbyjs/reach-router", "Redirect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TState] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.gatsbyjsReachRouter.mod.Redirect[TState]] {
    
    inline def default(value: Boolean): this.type = set("default", value.asInstanceOf[js.Any])
    
    inline def from(value: String): this.type = set("from", value.asInstanceOf[js.Any])
    
    inline def location(value: WindowLocation[Any]): this.type = set("location", value.asInstanceOf[js.Any])
    
    inline def navigate(value: NavigateFn): this.type = set("navigate", value.asInstanceOf[js.Any])
    
    inline def noThrow(value: Boolean): this.type = set("noThrow", value.asInstanceOf[js.Any])
    
    inline def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    inline def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    
    inline def state(value: TState): this.type = set("state", value.asInstanceOf[js.Any])
    
    inline def uri(value: String): this.type = set("uri", value.asInstanceOf[js.Any])
  }
  
  def withProps[TState](p: RouteComponentProps[RedirectProps[TState]]): Builder[TState] = new Builder[TState](js.Array(this.component, p.asInstanceOf[js.Any]))
}
