package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsToggleSwitchToggleSwitchMod.ToggleSwitchProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsToggleSwitchToggleSwitchMod.ToggleSwitchStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleSwitch {
  
  @JSImport("wix-ui-core/dist/es/src", "ToggleSwitch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.ToggleSwitch] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def checkedIcon(value: VdomNode): this.type = set("checkedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def checkedIconNull: this.type = set("checkedIcon", null)
    
    inline def checkedIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("checkedIcon", js.Array(value*))
    
    inline def checkedIconVdomElement(value: VdomElement): this.type = set("checkedIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onChange(value: Callback): this.type = set("onChange", value.toJsFn)
    
    inline def styles(value: ToggleSwitchStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def uncheckedIcon(value: VdomNode): this.type = set("uncheckedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def uncheckedIconNull: this.type = set("uncheckedIcon", null)
    
    inline def uncheckedIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("uncheckedIcon", js.Array(value*))
    
    inline def uncheckedIconVdomElement(value: VdomElement): this.type = set("uncheckedIcon", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ToggleSwitch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToggleSwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
