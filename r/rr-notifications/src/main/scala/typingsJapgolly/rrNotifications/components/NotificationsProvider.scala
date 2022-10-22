package typingsJapgolly.rrNotifications.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.rrNotifications.anon.AnimationDuration
import typingsJapgolly.rrNotifications.anon.Payload
import typingsJapgolly.rrNotifications.rrNotificationsStrings.left
import typingsJapgolly.rrNotifications.rrNotificationsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NotificationsProvider {
  
  inline def apply(renderNotification: Payload => Element): Builder = {
    val __props = js.Dynamic.literal(renderNotification = js.Any.fromFunction1(renderNotification))
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimationDuration]))
  }
  
  @JSImport("rr-notifications", "NotificationsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def animationEasing(value: String): this.type = set("animationEasing", value.asInstanceOf[js.Any])
    
    inline def dismissAfter(value: Double): this.type = set("dismissAfter", value.asInstanceOf[js.Any])
    
    inline def position(value: js.Tuple4[String, String, String, String]): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def slideFromSide(value: right | left): this.type = set("slideFromSide", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimationDuration): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
