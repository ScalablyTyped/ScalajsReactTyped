package typingsJapgolly.reactRouterGuard.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.history.mod.History
import typingsJapgolly.reactRouterGuard.mod.RouterGuardConfigProps
import typingsJapgolly.reactRouterGuard.mod.RouterGuardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterGuard {
  
  inline def apply[T](config: js.Array[RouterGuardConfigProps]): Builder[T] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[RouterGuardProps]))
  }
  
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterGuard.mod.RouterGuard[T]] {
    
    inline def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean | Element): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingVdomElement(value: VdomElement): this.type = set("loading", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: RouterGuardProps): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
