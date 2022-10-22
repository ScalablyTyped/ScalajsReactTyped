package typingsJapgolly.reactToastNotifications.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToastNotifications.mod.Placement
import typingsJapgolly.reactToastNotifications.mod.ToastContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultToastContainer {
  
  inline def apply(hasToasts: Boolean, placement: Placement): Builder = {
    val __props = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastContainerProps]))
  }
  
  @JSImport("react-toast-notifications", "DefaultToastContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
