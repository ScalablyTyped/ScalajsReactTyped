package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.mod.GriddleComponent
import typingsJapgolly.griddleReact.mod.components.SettingsProps
import typingsJapgolly.griddleReact.mod.components.SettingsToggleProps
import typingsJapgolly.griddleReact.mod.components.SettingsWrapperProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SettingsWrapper {
  
  @JSImport("griddle-react", "components.SettingsWrapper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.griddleReact.mod.components.SettingsWrapper] {
    
    inline def Settings(value: GriddleComponent[SettingsProps]): this.type = set("Settings", value.asInstanceOf[js.Any])
    
    inline def SettingsToggle(value: GriddleComponent[SettingsToggleProps]): this.type = set("SettingsToggle", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def isEnabled(value: Boolean): this.type = set("isEnabled", value.asInstanceOf[js.Any])
    
    inline def isVisible(value: Boolean): this.type = set("isVisible", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SettingsWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SettingsWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
