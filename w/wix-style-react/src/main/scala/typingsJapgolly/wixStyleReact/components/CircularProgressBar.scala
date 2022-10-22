package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarProps
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSize
import typingsJapgolly.wixStyleReact.distTypesCircularProgressBarMod.CircularProgressBarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircularProgressBar {
  
  @JSImport("wix-style-react", "CircularProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CircularProgressBar] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorLabel(value: String): this.type = set("errorLabel", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    
    inline def showProgressIndication(value: Boolean): this.type = set("showProgressIndication", value.asInstanceOf[js.Any])
    
    inline def size(value: CircularProgressBarSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: CircularProgressBarSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CircularProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CircularProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
