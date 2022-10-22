package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialNotificationOption
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNotificationNotificationMod {
  
  @JSImport("carbon-components/components/notification/notification", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Notification {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialNotificationOption) = this()
    
    /* CompleteClass */
    override def _changeState(state: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def remove(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/notification/notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/notification/notification", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("carbon-components/components/notification/notification", "default.options")
    @js.native
    def options: NotificationOptions = js.native
    inline def options_=(x: NotificationOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Notification extends StObject {
    
    def _changeState(state: String, callback: js.Function0[Unit]): Unit
    
    def remove(): Unit
  }
  object Notification {
    
    inline def apply(_changeState: (String, js.Function0[Unit]) => Callback, remove: Callback): Notification = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (_changeState(t0, t1)).runNow()), remove = remove.toJsFn)
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def set_changeState(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "_changeState", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait NotificationOptions extends StObject {
    
    var eventAfterDeleteNotification: String
    
    var eventBeforeDeleteNotification: String
    
    var selectorButton: String
    
    var selectorInit: String
  }
  object NotificationOptions {
    
    inline def apply(
      eventAfterDeleteNotification: String,
      eventBeforeDeleteNotification: String,
      selectorButton: String,
      selectorInit: String
    ): NotificationOptions = {
      val __obj = js.Dynamic.literal(eventAfterDeleteNotification = eventAfterDeleteNotification.asInstanceOf[js.Any], eventBeforeDeleteNotification = eventBeforeDeleteNotification.asInstanceOf[js.Any], selectorButton = selectorButton.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationOptions]
    }
    
    extension [Self <: NotificationOptions](x: Self) {
      
      inline def setEventAfterDeleteNotification(value: String): Self = StObject.set(x, "eventAfterDeleteNotification", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeDeleteNotification(value: String): Self = StObject.set(x, "eventBeforeDeleteNotification", value.asInstanceOf[js.Any])
      
      inline def setSelectorButton(value: String): Self = StObject.set(x, "selectorButton", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
