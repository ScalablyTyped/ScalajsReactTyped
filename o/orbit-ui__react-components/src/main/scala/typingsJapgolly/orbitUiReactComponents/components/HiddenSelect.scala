package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distSelectSrcHiddenSelectMod.HiddenSelectProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HiddenSelect {
  
  @JSImport("@orbit-ui/react-components", "HiddenSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    
    inline def validationState(value: valid | invalid): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HiddenSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HiddenSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
