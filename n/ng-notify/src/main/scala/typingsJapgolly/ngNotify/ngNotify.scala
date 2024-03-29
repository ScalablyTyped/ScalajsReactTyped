package typingsJapgolly.ngNotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngNotify {
  
  /**
    * Simply and lightweight notification service for AngularJS
    */
  @js.native
  trait INotifyService extends StObject {
    
    /**
      * Allows to create a whole new set of styles for each notification type.
      * @param themeName The name used when setting the theme in the config object.
      * @param className The class used to target this theme in the stylesheet.
      */
    def addTheme(themeName: String, className: String): Unit = js.native
    
    /**
      * Allows to create a new type of notification to use in their app.
      * @param typeName The name used to trigger this notification type in the set method.
      * @param className The class used to target this type in the stylesheet.
      */
    def addType(typeName: String, className: String): Unit = js.native
    
    /**
      * Sets default settings for all notifications to take into account when displaying.
      * @param userOptions Notification configuration object
      */
    def config(userOptions: IUserOptions): Unit = js.native
    
    /**
      * Manually dismisses any sticky notifications that may still be set.
      */
    def dismiss(): Unit = js.native
    
    /**
      * Displays a notification message.
      * @param message A message text to display.
      */
    def set(message: String): Unit = js.native
    /**
      * Displays a notification message and sets the type for this one notification.
      * @param message A message text to display.
      * @param type The type of the notification.
      */
    def set(message: String, `type`: String): Unit = js.native
    /**
      * displays a notification message and sets the formatting/behavioral options for this one notification.
      * @param message A message text to display.
      * @param userOptions Notification configuration object.
      */
    def set(message: String, userOptions: IUserOptions): Unit = js.native
  }
  
  /**
    * Contains the options used to configure notification.
    */
  trait IUserOptions extends StObject {
    
    var button: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IUserOptions {
    
    inline def apply(): IUserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IUserOptions]
    }
    
    extension [Self <: IUserOptions](x: Self) {
      
      inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
