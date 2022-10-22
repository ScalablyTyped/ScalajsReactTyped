package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorProps
import typingsJapgolly.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorState
import typingsJapgolly.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorTooltipPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatusIndicator {
  
  @JSImport("wix-style-react", "StatusIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.StatusIndicator] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def status(value: StatusIndicatorState): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def tooltipPlacement(value: StatusIndicatorTooltipPlacement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StatusIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatusIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
