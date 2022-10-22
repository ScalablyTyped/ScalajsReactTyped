package typingsJapgolly.reapop

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reapop.distComponentsNotificationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextsComponentsContextMod {
  
  @JSImport("reapop/dist/contexts/componentsContext", "ComponentsContext")
  @js.native
  val ComponentsContext: Context[ComponentContextType] = js.native
  
  trait ComponentContextType extends StObject {
    
    var Notification: js.UndefOr[js.Function1[/* props */ Props, Element]] = js.undefined
    
    var NotificationIcon: js.UndefOr[
        js.Function1[
          /* props */ typingsJapgolly.reapop.distComponentsNotificationIconMod.Props, 
          Element | Null
        ]
      ] = js.undefined
    
    var Transition: js.UndefOr[
        js.Function1[
          (/* props */ typingsJapgolly.reapop.distComponentsSlideTransitionMod.Props) | (/* props */ typingsJapgolly.reapop.distComponentsGrowTransitionMod.Props) | (/* props */ typingsJapgolly.reapop.distComponentsFadeTransitionMod.Props), 
          Element
        ]
      ] = js.undefined
  }
  object ComponentContextType {
    
    inline def apply(): ComponentContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentContextType]
    }
    
    extension [Self <: ComponentContextType](x: Self) {
      
      inline def setNotification(value: /* props */ Props => Element): Self = StObject.set(x, "Notification", js.Any.fromFunction1(value))
      
      inline def setNotificationIcon(
        value: /* props */ typingsJapgolly.reapop.distComponentsNotificationIconMod.Props => Element | Null
      ): Self = StObject.set(x, "NotificationIcon", js.Any.fromFunction1(value))
      
      inline def setNotificationIconUndefined: Self = StObject.set(x, "NotificationIcon", js.undefined)
      
      inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
      
      inline def setTransition(
        value: (/* props */ typingsJapgolly.reapop.distComponentsSlideTransitionMod.Props) | (/* props */ typingsJapgolly.reapop.distComponentsGrowTransitionMod.Props) | (/* props */ typingsJapgolly.reapop.distComponentsFadeTransitionMod.Props) => Element
      ): Self = StObject.set(x, "Transition", js.Any.fromFunction1(value))
      
      inline def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
    }
  }
}
