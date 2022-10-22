package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.helpersTypesMod.BaseProviderOverrides
import typingsJapgolly.baseui.helpersTypesMod.BaseProviderProps
import typingsJapgolly.baseui.stylesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseProvider {
  
  inline def apply(theme: Theme): Builder = {
    val __props = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BaseProviderProps]))
  }
  
  @JSImport("baseui", "BaseProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def overrides(value: BaseProviderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BaseProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
