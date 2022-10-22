package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsSettings extends StObject {
  
  var AudioOnlyHlsSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.AudioOnlyHlsSettings] = js.undefined
  
  var Fmp4HlsSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Fmp4HlsSettings] = js.undefined
  
  var FrameCaptureHlsSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.FrameCaptureHlsSettings] = js.undefined
  
  var StandardHlsSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.StandardHlsSettings] = js.undefined
}
object HlsSettings {
  
  inline def apply(): HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsSettings]
  }
  
  extension [Self <: HlsSettings](x: Self) {
    
    inline def setAudioOnlyHlsSettings(value: AudioOnlyHlsSettings): Self = StObject.set(x, "AudioOnlyHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyHlsSettingsUndefined: Self = StObject.set(x, "AudioOnlyHlsSettings", js.undefined)
    
    inline def setFmp4HlsSettings(value: Fmp4HlsSettings): Self = StObject.set(x, "Fmp4HlsSettings", value.asInstanceOf[js.Any])
    
    inline def setFmp4HlsSettingsUndefined: Self = StObject.set(x, "Fmp4HlsSettings", js.undefined)
    
    inline def setFrameCaptureHlsSettings(value: FrameCaptureHlsSettings): Self = StObject.set(x, "FrameCaptureHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureHlsSettingsUndefined: Self = StObject.set(x, "FrameCaptureHlsSettings", js.undefined)
    
    inline def setStandardHlsSettings(value: StandardHlsSettings): Self = StObject.set(x, "StandardHlsSettings", value.asInstanceOf[js.Any])
    
    inline def setStandardHlsSettingsUndefined: Self = StObject.set(x, "StandardHlsSettings", js.undefined)
  }
}
