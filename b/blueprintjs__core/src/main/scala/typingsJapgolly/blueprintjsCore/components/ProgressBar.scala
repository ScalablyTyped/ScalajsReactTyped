package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsProgressBarProgressBarMod.IProgressBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @JSImport("@blueprintjs/core", "ProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.ProgressBar] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def stripes(value: Boolean): this.type = set("stripes", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
