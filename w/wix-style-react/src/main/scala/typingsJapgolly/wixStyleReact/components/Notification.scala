package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesNotificationMod.NotificationProps
import typingsJapgolly.wixStyleReact.distTypesNotificationMod.NotificationTheme
import typingsJapgolly.wixStyleReact.distTypesNotificationMod.NotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notification {
  
  @JSImport("wix-style-react", "Notification")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Notification] {
    
    inline def autoHideTimeout(value: Double): this.type = set("autoHideTimeout", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* source */ String => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* source */ String) => value(t0).runNow()))
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def theme(value: NotificationTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: NotificationType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Notification.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
