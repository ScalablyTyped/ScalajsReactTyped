package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionSettings extends StObject {
  
  /**
    * The chat conversation retention settings.
    */
  var ConversationRetentionSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.ConversationRetentionSettings] = js.undefined
  
  /**
    * The chat room retention settings.
    */
  var RoomRetentionSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.RoomRetentionSettings] = js.undefined
}
object RetentionSettings {
  
  inline def apply(): RetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionSettings]
  }
  
  extension [Self <: RetentionSettings](x: Self) {
    
    inline def setConversationRetentionSettings(value: ConversationRetentionSettings): Self = StObject.set(x, "ConversationRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setConversationRetentionSettingsUndefined: Self = StObject.set(x, "ConversationRetentionSettings", js.undefined)
    
    inline def setRoomRetentionSettings(value: RoomRetentionSettings): Self = StObject.set(x, "RoomRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setRoomRetentionSettingsUndefined: Self = StObject.set(x, "RoomRetentionSettings", js.undefined)
  }
}
