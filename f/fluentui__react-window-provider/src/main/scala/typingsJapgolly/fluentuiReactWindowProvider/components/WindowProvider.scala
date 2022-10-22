package typingsJapgolly.fluentuiReactWindowProvider.components

import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactWindowProvider.libWindowProviderMod.WindowProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowProvider {
  
  @JSImport("@fluentui/react-window-provider", "WindowProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def window(value: Window): this.type = set("window", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: WindowProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WindowProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
