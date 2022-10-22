package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.videoReact.mod.ControlBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ControlBar {
  
  @JSImport("video-react", "ControlBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoHide(value: Boolean): this.type = set("autoHide", value.asInstanceOf[js.Any])
    
    inline def autoHideTime(value: Double): this.type = set("autoHideTime", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableCompletely(value: Boolean): this.type = set("disableCompletely", value.asInstanceOf[js.Any])
    
    inline def disableDefaultControls(value: Boolean): this.type = set("disableDefaultControls", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ControlBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ControlBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
