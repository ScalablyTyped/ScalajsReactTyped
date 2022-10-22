package typingsJapgolly.reactNotificationSystemRedux.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNotificationSystem.mod.Notification
import typingsJapgolly.reactNotificationSystem.mod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_NotificationsProps1166785408[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def allowHTML(value: Boolean): this.type = set("allowHTML", value.asInstanceOf[js.Any])
  
  inline def noAnimation(value: Boolean): this.type = set("noAnimation", value.asInstanceOf[js.Any])
  
  inline def notifications(value: js.Array[Notification]): this.type = set("notifications", value.asInstanceOf[js.Any])
  
  inline def notificationsVarargs(value: Notification*): this.type = set("notifications", js.Array(value*))
  
  inline def style(value: Style | Boolean): this.type = set("style", value.asInstanceOf[js.Any])
}
