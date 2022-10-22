package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioSelectorSettings extends StObject {
  
  var AudioHlsRenditionSelection: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.AudioHlsRenditionSelection] = js.undefined
  
  var AudioLanguageSelection: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.AudioLanguageSelection] = js.undefined
  
  var AudioPidSelection: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.AudioPidSelection] = js.undefined
  
  var AudioTrackSelection: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.AudioTrackSelection] = js.undefined
}
object AudioSelectorSettings {
  
  inline def apply(): AudioSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioSelectorSettings]
  }
  
  extension [Self <: AudioSelectorSettings](x: Self) {
    
    inline def setAudioHlsRenditionSelection(value: AudioHlsRenditionSelection): Self = StObject.set(x, "AudioHlsRenditionSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioHlsRenditionSelectionUndefined: Self = StObject.set(x, "AudioHlsRenditionSelection", js.undefined)
    
    inline def setAudioLanguageSelection(value: AudioLanguageSelection): Self = StObject.set(x, "AudioLanguageSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioLanguageSelectionUndefined: Self = StObject.set(x, "AudioLanguageSelection", js.undefined)
    
    inline def setAudioPidSelection(value: AudioPidSelection): Self = StObject.set(x, "AudioPidSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioPidSelectionUndefined: Self = StObject.set(x, "AudioPidSelection", js.undefined)
    
    inline def setAudioTrackSelection(value: AudioTrackSelection): Self = StObject.set(x, "AudioTrackSelection", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackSelectionUndefined: Self = StObject.set(x, "AudioTrackSelection", js.undefined)
  }
}
