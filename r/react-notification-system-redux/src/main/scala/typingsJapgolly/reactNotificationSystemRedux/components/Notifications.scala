package typingsJapgolly.reactNotificationSystemRedux.components

import typingsJapgolly.reactNotificationSystemRedux.global.Notifications.^
import typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notifications {
  
  @JSGlobal("Notifications")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Notifications.type): SharedBuilder_NotificationsProps1166785408[^] = new SharedBuilder_NotificationsProps1166785408[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationsProps): SharedBuilder_NotificationsProps1166785408[^] = new SharedBuilder_NotificationsProps1166785408[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
