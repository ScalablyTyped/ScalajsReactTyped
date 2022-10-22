package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Stepper.StepLabelProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StepLabel {
  
  @JSImport("material-ui", "StepLabel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.StepLabel] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def completed(value: Boolean): this.type = set("completed", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def icon(value: Node | String | Double): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconContainerStyle(value: CSSProperties): this.type = set("iconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StepLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
