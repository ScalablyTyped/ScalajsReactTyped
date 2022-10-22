package typingsJapgolly.reapop

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import typingsJapgolly.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationDismissIconMod {
  
  @JSImport("reapop/dist/components/NotificationDismissIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    def dismissNotification(event: ReactEventFrom[org.scalajs.dom.Element]): Unit
    
    var notification: Notification
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply(
      dismissNotification: ReactEventFrom[org.scalajs.dom.Element] => Callback,
      notification: Notification
    ): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => dismissNotification(t0).runNow()), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDismissNotification(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
