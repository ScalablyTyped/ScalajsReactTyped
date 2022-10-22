package typingsJapgolly.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.azureSb.anon.Body
import typingsJapgolly.azureSb.anon.PushChannel
import typingsJapgolly.azureSb.azureSbStrings.adm
import typingsJapgolly.azureSb.azureSbStrings.apns
import typingsJapgolly.azureSb.azureSbStrings.gcm
import typingsJapgolly.azureSb.azureSbStrings.mpns
import typingsJapgolly.azureSb.azureSbStrings.wns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationHubInstallation extends StObject {
  
  val expirationTime: js.UndefOr[String] = js.undefined
  
  val expiredPushChannel: js.UndefOr[String] = js.undefined
  
  var installationId: String
  
  val lastActiveOn: js.UndefOr[String] = js.undefined
  
  val lastUpdate: js.UndefOr[String] = js.undefined
  
  var platform: apns | wns | mpns | adm | gcm
  
  var pushChannel: String
  
  var secondaryTile: js.UndefOr[StringDictionary[PushChannel]] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var templates: js.UndefOr[StringDictionary[Body]] = js.undefined
  
  var userId: js.UndefOr[String] = js.undefined
}
object NotificationHubInstallation {
  
  inline def apply(installationId: String, platform: apns | wns | mpns | adm | gcm, pushChannel: String): NotificationHubInstallation = {
    val __obj = js.Dynamic.literal(installationId = installationId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pushChannel = pushChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubInstallation]
  }
  
  extension [Self <: NotificationHubInstallation](x: Self) {
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setExpiredPushChannel(value: String): Self = StObject.set(x, "expiredPushChannel", value.asInstanceOf[js.Any])
    
    inline def setExpiredPushChannelUndefined: Self = StObject.set(x, "expiredPushChannel", js.undefined)
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setLastActiveOn(value: String): Self = StObject.set(x, "lastActiveOn", value.asInstanceOf[js.Any])
    
    inline def setLastActiveOnUndefined: Self = StObject.set(x, "lastActiveOn", js.undefined)
    
    inline def setLastUpdate(value: String): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateUndefined: Self = StObject.set(x, "lastUpdate", js.undefined)
    
    inline def setPlatform(value: apns | wns | mpns | adm | gcm): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPushChannel(value: String): Self = StObject.set(x, "pushChannel", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTile(value: StringDictionary[PushChannel]): Self = StObject.set(x, "secondaryTile", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTileUndefined: Self = StObject.set(x, "secondaryTile", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplates(value: StringDictionary[Body]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
