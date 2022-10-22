package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.videoReact.mod.VolumeMenuButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VolumeMenuButton {
  
  @JSImport("video-react", "VolumeMenuButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VolumeMenuButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VolumeMenuButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
