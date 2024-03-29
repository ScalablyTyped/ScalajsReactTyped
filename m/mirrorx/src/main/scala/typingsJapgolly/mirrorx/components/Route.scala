package typingsJapgolly.mirrorx.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mirrorx.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object Route {
  
  def apply[T /* <: RouteProps */](p: T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("mirrorx", "Route")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: RouteProps */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mirrorx.mod.Route[T]]
  
  implicit def make[T /* <: RouteProps */](companion: Route.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
