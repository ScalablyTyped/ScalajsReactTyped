package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.panelHeaderMod.PanelHeader.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelHeader {
  
  @JSImport("@wordpress/components", "PanelHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PanelHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
