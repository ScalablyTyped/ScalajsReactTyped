package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.double
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chrome.notifications.ButtonOptions
import typingsJapgolly.chromeApps.chrome.notifications.ItemOptions
import typingsJapgolly.chromeApps.chromeAppsInts.`-1`
import typingsJapgolly.chromeApps.chromeAppsInts.`-2`
import typingsJapgolly.chromeApps.chromeAppsInts.`0`
import typingsJapgolly.chromeApps.chromeAppsInts.`1`
import typingsJapgolly.chromeApps.chromeAppsInts.`2`
import typingsJapgolly.chromeApps.chromeAppsStrings.IMAGE
import typingsJapgolly.chromeApps.chromeAppsStrings.LIST
import typingsJapgolly.chromeApps.chromeAppsStrings.PROGRESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chrome-apps.chrome.notifications.NotificationOptions> */
trait PartialNotificationOption extends StObject {
  
  var appIconMaskUrl: js.UndefOr[String] = js.undefined
  
  var buttons: js.UndefOr[js.Array[ButtonOptions]] = js.undefined
  
  var contextMessage: js.UndefOr[String] = js.undefined
  
  var eventTime: js.UndefOr[double] = js.undefined
  
  var iconUrl: js.UndefOr[String] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var isClickable: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[ItemOptions]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[`-2` | `-1` | `0` | `1` | `2`] = js.undefined
  
  var progress: js.UndefOr[integer] = js.undefined
  
  var requireInteraction: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[
    ToStringLiteral[
      BASIC, 
      /* keyof chrome-apps.anon.BASIC */ typingsJapgolly.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  BASIC :'basic',   IMAGE :'image',   LIST :'list',   PROGRESS :'progress'} extends keyof {  BASIC :'basic',   IMAGE :'image',   LIST :'list',   PROGRESS :'progress'} ? std.Exclude<keyof {  BASIC :'basic',   IMAGE :'image',   LIST :'list',   PROGRESS :'progress'}, 'basic' | 'image' | 'list' | 'progress'> : never */ js.Any
    ]
  ] = js.undefined
}
object PartialNotificationOption {
  
  inline def apply(): PartialNotificationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNotificationOption]
  }
  
  extension [Self <: PartialNotificationOption](x: Self) {
    
    inline def setAppIconMaskUrl(value: String): Self = StObject.set(x, "appIconMaskUrl", value.asInstanceOf[js.Any])
    
    inline def setAppIconMaskUrlUndefined: Self = StObject.set(x, "appIconMaskUrl", js.undefined)
    
    inline def setButtons(value: js.Array[ButtonOptions]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: ButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setContextMessage(value: String): Self = StObject.set(x, "contextMessage", value.asInstanceOf[js.Any])
    
    inline def setContextMessageUndefined: Self = StObject.set(x, "contextMessage", js.undefined)
    
    inline def setEventTime(value: double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setIsClickable(value: Boolean): Self = StObject.set(x, "isClickable", value.asInstanceOf[js.Any])
    
    inline def setIsClickableUndefined: Self = StObject.set(x, "isClickable", js.undefined)
    
    inline def setItems(value: js.Array[ItemOptions]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ItemOptions*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPriority(value: `-2` | `-1` | `0` | `1` | `2`): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProgress(value: integer): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    inline def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(
      value: ToStringLiteral[
          BASIC, 
          /* keyof chrome-apps.anon.BASIC */ typingsJapgolly.chromeApps.chromeAppsStrings.BASIC | IMAGE | LIST | PROGRESS, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  BASIC :'basic',   IMAGE :'image',   LIST :'list',   PROGRESS :'progress'} extends keyof {  BASIC :'basic',   IMAGE :'image',   LIST :'list',   PROGRESS :'progress'} ? std.Exclude<keyof {  BASIC :'basic',   IMAGE :'image',   LIST :'list',   PROGRESS :'progress'}, 'basic' | 'image' | 'list' | 'progress'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
