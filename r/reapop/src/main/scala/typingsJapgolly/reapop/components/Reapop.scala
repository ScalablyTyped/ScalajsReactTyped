package typingsJapgolly.reapop.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reapop.distComponentsNotificationsSystemMod.Props
import typingsJapgolly.reapop.distContextsComponentsContextMod.ComponentContextType
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import typingsJapgolly.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reapop {
  
  inline def apply(dismissNotification: /* id */ String => Callback, notifications: js.Array[Notification]): Builder = {
    val __props = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1((t0: /* id */ String) => dismissNotification(t0).runNow()), notifications = notifications.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("reapop", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def components(value: ComponentContextType): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def smallScreenBreakpoint(value: Double): this.type = set("smallScreenBreakpoint", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
