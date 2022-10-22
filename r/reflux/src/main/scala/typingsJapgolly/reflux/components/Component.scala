package typingsJapgolly.reflux.components

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reflux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Component {
  
  def apply[TOfStore /* <: Instantiable0[Store] */, P, S](p: P): Builder[TOfStore, P, S] = new Builder[TOfStore, P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("reflux", "Component")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TOfStore /* <: Instantiable0[Store] */, P, S] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reflux.mod.Component[TOfStore, P, S]]
  
  implicit def make[TOfStore /* <: Instantiable0[Store] */, P, S](companion: Component.type): Builder[TOfStore, P, S] = new Builder[TOfStore, P, S](js.Array(this.component, js.Dictionary.empty))()
}
