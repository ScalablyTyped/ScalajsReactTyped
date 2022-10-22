package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H265ColorSpaceSettings extends StObject {
  
  var ColorSpacePassthroughSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.ColorSpacePassthroughSettings] = js.undefined
  
  var DolbyVision81Settings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.DolbyVision81Settings] = js.undefined
  
  var Hdr10Settings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Hdr10Settings] = js.undefined
  
  var Rec601Settings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Rec601Settings] = js.undefined
  
  var Rec709Settings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Rec709Settings] = js.undefined
}
object H265ColorSpaceSettings {
  
  inline def apply(): H265ColorSpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265ColorSpaceSettings]
  }
  
  extension [Self <: H265ColorSpaceSettings](x: Self) {
    
    inline def setColorSpacePassthroughSettings(value: ColorSpacePassthroughSettings): Self = StObject.set(x, "ColorSpacePassthroughSettings", value.asInstanceOf[js.Any])
    
    inline def setColorSpacePassthroughSettingsUndefined: Self = StObject.set(x, "ColorSpacePassthroughSettings", js.undefined)
    
    inline def setDolbyVision81Settings(value: DolbyVision81Settings): Self = StObject.set(x, "DolbyVision81Settings", value.asInstanceOf[js.Any])
    
    inline def setDolbyVision81SettingsUndefined: Self = StObject.set(x, "DolbyVision81Settings", js.undefined)
    
    inline def setHdr10Settings(value: Hdr10Settings): Self = StObject.set(x, "Hdr10Settings", value.asInstanceOf[js.Any])
    
    inline def setHdr10SettingsUndefined: Self = StObject.set(x, "Hdr10Settings", js.undefined)
    
    inline def setRec601Settings(value: Rec601Settings): Self = StObject.set(x, "Rec601Settings", value.asInstanceOf[js.Any])
    
    inline def setRec601SettingsUndefined: Self = StObject.set(x, "Rec601Settings", js.undefined)
    
    inline def setRec709Settings(value: Rec709Settings): Self = StObject.set(x, "Rec709Settings", value.asInstanceOf[js.Any])
    
    inline def setRec709SettingsUndefined: Self = StObject.set(x, "Rec709Settings", js.undefined)
  }
}
