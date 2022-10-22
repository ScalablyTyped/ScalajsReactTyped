package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.AppContainer
import typingsJapgolly.baseui.layerTypesMod.LayersManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LayersManager {
  
  @JSImport("baseui/layer", "LayersManager")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.layerMod.LayersManager] {
    
    inline def overrides(value: AppContainer): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LayersManager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LayersManagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
