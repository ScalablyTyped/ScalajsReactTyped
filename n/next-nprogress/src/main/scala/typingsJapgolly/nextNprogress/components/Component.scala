package typingsJapgolly.nextNprogress.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextNprogress.anon.PartialNProgressOptions
import typingsJapgolly.nextNprogress.componentMod.NProgressProps
import typingsJapgolly.nextNprogress.componentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @JSImport("next-nprogress/component", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def options(value: PartialNProgressOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def showAfterMs(value: Double): this.type = set("showAfterMs", value.asInstanceOf[js.Any])
    
    inline def spinner(value: Boolean): this.type = set("spinner", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Component.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
