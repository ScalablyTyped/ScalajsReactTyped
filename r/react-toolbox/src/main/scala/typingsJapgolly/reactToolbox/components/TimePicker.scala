package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToolbox.componentsTimePickerMod.default
import typingsJapgolly.reactToolbox.componentsTimePickerTimePickerMod.TimePickerProps
import typingsJapgolly.reactToolbox.componentsTimePickerTimePickerMod.TimePickerTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.`24hr`
import typingsJapgolly.reactToolbox.reactToolboxStrings.ampm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("react-toolbox/components/time_picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def cancelLabel(value: String): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def format(value: `24hr` | ampm): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def okLabel(value: String): this.type = set("okLabel", value.asInstanceOf[js.Any])
    
    inline def onChange(value: js.Function): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: js.Function): this.type = set("onDismiss", value.asInstanceOf[js.Any])
    
    inline def onEscKeyDown(value: js.Function): this.type = set("onEscKeyDown", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: js.Function): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    
    inline def onOverlayClick(value: js.Function): this.type = set("onOverlayClick", value.asInstanceOf[js.Any])
    
    inline def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    inline def theme(value: TimePickerTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
