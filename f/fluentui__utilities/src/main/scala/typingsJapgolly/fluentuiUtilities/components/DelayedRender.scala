package typingsJapgolly.fluentuiUtilities.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiUtilities.libDelayedRenderMod.IDelayedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DelayedRender {
  
  @JSImport("@fluentui/utilities", "DelayedRender")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fluentuiUtilities.mod.DelayedRender] {
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DelayedRender.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDelayedRenderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
