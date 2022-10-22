package typingsJapgolly.naverWhale.whale

import typingsJapgolly.chrome.anon.AppIconMaskUrl
import typingsJapgolly.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Notifications
// https://developer.chrome.com/extensions/notifications
////////////////////
/**
  * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
  * Permissions:  "notifications"
  * @since Chrome 28.
  */
object notifications {
  
  trait ButtonOptions extends StObject {
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object ButtonOptions {
    
    inline def apply(title: String): ButtonOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonOptions]
    }
    
    extension [Self <: ButtonOptions](x: Self) {
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemOptions extends StObject {
    
    /** Additional details about this item. */
    var message: String
    
    /** Title of one item of a list notification. */
    var title: String
  }
  object ItemOptions {
    
    inline def apply(message: String, title: String): ItemOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemOptions]
    }
    
    extension [Self <: ItemOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type NotificationButtonClickedEvent = Event[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]]
  
  type NotificationClickedEvent = Event[js.Function1[/* notificationId */ String, Unit]]
  
  type NotificationClosedEvent = Event[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]]
  
  type NotificationOptions[T /* <: Boolean */] = AppIconMaskUrl & (/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? {  iconUrl :string,   message :string,   type :chrome.chrome.notifications.TemplateType,   title :string} : {  iconUrl :string | undefined,   message :string | undefined,   type :chrome.chrome.notifications.TemplateType | undefined,   title :string | undefined} */ js.Any)
  
  type NotificationPermissionLevelChangedEvent = Event[js.Function1[/* level */ String, Unit]]
  
  type NotificationShowSettingsEvent = Event[js.Function0[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.naverWhale.naverWhaleStrings.basic
    - typingsJapgolly.naverWhale.naverWhaleStrings.image
    - typingsJapgolly.naverWhale.naverWhaleStrings.list
    - typingsJapgolly.naverWhale.naverWhaleStrings.progress
  */
  trait TemplateType extends StObject
  object TemplateType {
    
    inline def basic: typingsJapgolly.naverWhale.naverWhaleStrings.basic = "basic".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.basic]
    
    inline def image: typingsJapgolly.naverWhale.naverWhaleStrings.image = "image".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.image]
    
    inline def list: typingsJapgolly.naverWhale.naverWhaleStrings.list = "list".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.list]
    
    inline def progress: typingsJapgolly.naverWhale.naverWhaleStrings.progress = "progress".asInstanceOf[typingsJapgolly.naverWhale.naverWhaleStrings.progress]
  }
}
