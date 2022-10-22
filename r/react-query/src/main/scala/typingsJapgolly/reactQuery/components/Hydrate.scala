package typingsJapgolly.reactQuery.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactQuery.typesCoreHydrationMod.HydrateOptions
import typingsJapgolly.reactQuery.typesReactHydrateMod.HydrateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hydrate {
  
  @JSImport("react-query", "Hydrate_")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def options(value: HydrateOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def state(value: Any): this.type = set("state", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Hydrate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HydrateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
