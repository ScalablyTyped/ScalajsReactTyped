package typingsJapgolly.dva.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.distLibComponentsMod.OutletProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Outlet {
  
  @JSImport("dva/router", "Outlet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def context(value: Any): this.type = set("context", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Outlet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OutletProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
