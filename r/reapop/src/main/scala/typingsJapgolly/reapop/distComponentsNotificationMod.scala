package typingsJapgolly.reapop

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reapop.distComponentsNotificationsSystemMod.DismissNotification
import typingsJapgolly.reapop.distContextsComponentsContextMod.ComponentContextType
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import typingsJapgolly.reapop.distThemesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsNotificationMod {
  
  @JSImport("reapop/dist/components/Notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var components: ComponentContextType
    
    var dismissNotification: DismissNotification
    
    var notification: Notification
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply(
      components: ComponentContextType,
      dismissNotification: /* id */ String => Callback,
      notification: Notification
    ): Props = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], dismissNotification = js.Any.fromFunction1((t0: /* id */ String) => dismissNotification(t0).runNow()), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setComponents(value: ComponentContextType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setDismissNotification(value: /* id */ String => Callback): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
      
      inline def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
