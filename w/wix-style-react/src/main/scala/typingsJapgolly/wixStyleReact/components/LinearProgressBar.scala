package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesLinearProgressBarMod.LinearProgressBarProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearProgressBar {
  
  @JSImport("wix-style-react", "LinearProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.LinearProgressBar] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def light(value: Boolean): this.type = set("light", value.asInstanceOf[js.Any])
    
    inline def showProgressIndication(value: Boolean): this.type = set("showProgressIndication", value.asInstanceOf[js.Any])
    
    inline def skin(value: standard | success | warning | premium | neutral): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LinearProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LinearProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
