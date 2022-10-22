package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceRetentionSettings extends StObject {
  
  /**
    * The length of time in days to retain the messages in a channel.
    */
  var ChannelRetentionSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.ChannelRetentionSettings] = js.undefined
}
object AppInstanceRetentionSettings {
  
  inline def apply(): AppInstanceRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceRetentionSettings]
  }
  
  extension [Self <: AppInstanceRetentionSettings](x: Self) {
    
    inline def setChannelRetentionSettings(value: ChannelRetentionSettings): Self = StObject.set(x, "ChannelRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setChannelRetentionSettingsUndefined: Self = StObject.set(x, "ChannelRetentionSettings", js.undefined)
  }
}
