package typingsJapgolly.themeUiComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.themeUiComponents.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuIcon {
  
  @JSImport("@theme-ui/components", "MenuIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Size): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
