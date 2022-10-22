package typingsJapgolly.reactToastNotifications.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToastNotifications.anon.Toast
import typingsJapgolly.reactToastNotifications.mod.Placement
import typingsJapgolly.reactToastNotifications.mod.ToastProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastProvider {
  
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoDismiss(value: Boolean | Double): this.type = set("autoDismiss", value.asInstanceOf[js.Any])
    
    inline def autoDismissTimeout(value: Double): this.type = set("autoDismissTimeout", value.asInstanceOf[js.Any])
    
    inline def components(value: Toast): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def newestOnTop(value: Boolean): this.type = set("newestOnTop", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def portalTargetSelector(value: String): this.type = set("portalTargetSelector", value.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ToastProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
