package typingsJapgolly.rcNotification.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcNotification.esNotificationsMod.NotificationsProps
import typingsJapgolly.rcNotification.esNotificationsMod.NotificationsRef
import typingsJapgolly.rcNotification.esNotificationsMod.Placement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notifications {
  
  @JSImport("rc-notification/es/Notifications", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[NotificationsRef] {
    
    inline def className(value: /* placement */ Placement => String): this.type = set("className", js.Any.fromFunction1(value))
    
    inline def container(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
    
    inline def motion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): this.type = set("motion", value.asInstanceOf[js.Any])
    
    inline def motionFunction1(value: /* placement */ Placement => CSSMotionProps): this.type = set("motion", js.Any.fromFunction1(value))
    
    inline def onAllRemoved(value: Callback): this.type = set("onAllRemoved", value.toJsFn)
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: /* placement */ Placement => CSSProperties): this.type = set("style", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Notifications.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NotificationsProps & RefAttributes[NotificationsRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
