package typingsJapgolly.glaze.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.glaze.distTypesStyleInjectorContextMod.StyleInjectorProviderProps
import typingsJapgolly.glaze.distTypesStyleInjectorMod.StyleInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleInjectorProvider {
  
  @JSImport("glaze", "StyleInjectorProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def injector(value: StyleInjector): this.type = set("injector", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StyleInjectorProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StyleInjectorProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
