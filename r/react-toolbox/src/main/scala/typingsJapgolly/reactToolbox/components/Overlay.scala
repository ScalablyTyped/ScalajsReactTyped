package typingsJapgolly.reactToolbox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToolbox.componentsOverlayMod.default
import typingsJapgolly.reactToolbox.componentsOverlayOverlayMod.OverlayProps
import typingsJapgolly.reactToolbox.componentsOverlayOverlayMod.OverlayTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @JSImport("react-toolbox/components/overlay", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def invisible(value: Boolean): this.type = set("invisible", value.asInstanceOf[js.Any])
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onEscKeyDown(value: js.Function): this.type = set("onEscKeyDown", value.asInstanceOf[js.Any])
    
    inline def theme(value: OverlayTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Overlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
