package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsCircularProgressBarCircularProgressBarMod.CircularProgressBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircularProgressBar {
  
  @JSImport("wix-ui-core/dist/es/src", "CircularProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorIcon(value: VdomElement): this.type = set("errorIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def errorLabel(value: String): this.type = set("errorLabel", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def showProgressIndication(value: Boolean): this.type = set("showProgressIndication", value.asInstanceOf[js.Any])
    
    inline def size(value: Double | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def successIcon(value: VdomElement): this.type = set("successIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CircularProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CircularProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
