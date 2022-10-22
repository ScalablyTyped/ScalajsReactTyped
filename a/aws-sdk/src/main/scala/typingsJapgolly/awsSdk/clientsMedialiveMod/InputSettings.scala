package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSettings extends StObject {
  
  /**
    * Used to select the audio stream to decode for inputs that have multiple available.
    */
  var AudioSelectors: js.UndefOr[listOfAudioSelector] = js.undefined
  
  /**
    * Used to select the caption input to use for inputs that have multiple available.
    */
  var CaptionSelectors: js.UndefOr[listOfCaptionSelector] = js.undefined
  
  /**
    * Enable or disable the deblock filter when filtering.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
  
  /**
    * Enable or disable the denoise filter when filtering.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
  
  /**
    * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
    */
  var FilterStrength: js.UndefOr[integerMin1Max5] = js.undefined
  
  /**
    * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default.
  1) auto - filtering will be applied depending on input type/quality
  2) disabled - no filtering will be applied to the input
  3) forced - filtering will be applied regardless of input type
    */
  var InputFilter: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.InputFilter] = js.undefined
  
  /**
    * Input settings.
    */
  var NetworkInputSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.NetworkInputSettings] = js.undefined
  
  /**
    * PID from which to read SCTE-35 messages. If left undefined, EML will select the first SCTE-35 PID found in the input.
    */
  var Scte35Pid: js.UndefOr[integerMin32Max8191] = js.undefined
  
  /**
    * Specifies whether to extract applicable ancillary data from a SMPTE-2038 source in this input. Applicable data types are captions, timecode, AFD, and SCTE-104 messages.
  - PREFER: Extract from SMPTE-2038 if present in this input, otherwise extract from another source (if any).
  - IGNORE: Never extract any ancillary data from SMPTE-2038.
    */
  var Smpte2038DataPreference: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Smpte2038DataPreference] = js.undefined
  
  /**
    * Loop input if it is a file. This allows a file input to be streamed indefinitely.
    */
  var SourceEndBehavior: js.UndefOr[InputSourceEndBehavior] = js.undefined
  
  /**
    * Informs which video elementary stream to decode for input types that have multiple available.
    */
  var VideoSelector: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.VideoSelector] = js.undefined
}
object InputSettings {
  
  inline def apply(): InputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSettings]
  }
  
  extension [Self <: InputSettings](x: Self) {
    
    inline def setAudioSelectors(value: listOfAudioSelector): Self = StObject.set(x, "AudioSelectors", value.asInstanceOf[js.Any])
    
    inline def setAudioSelectorsUndefined: Self = StObject.set(x, "AudioSelectors", js.undefined)
    
    inline def setAudioSelectorsVarargs(value: AudioSelector*): Self = StObject.set(x, "AudioSelectors", js.Array(value*))
    
    inline def setCaptionSelectors(value: listOfCaptionSelector): Self = StObject.set(x, "CaptionSelectors", value.asInstanceOf[js.Any])
    
    inline def setCaptionSelectorsUndefined: Self = StObject.set(x, "CaptionSelectors", js.undefined)
    
    inline def setCaptionSelectorsVarargs(value: CaptionSelector*): Self = StObject.set(x, "CaptionSelectors", js.Array(value*))
    
    inline def setDeblockFilter(value: InputDeblockFilter): Self = StObject.set(x, "DeblockFilter", value.asInstanceOf[js.Any])
    
    inline def setDeblockFilterUndefined: Self = StObject.set(x, "DeblockFilter", js.undefined)
    
    inline def setDenoiseFilter(value: InputDenoiseFilter): Self = StObject.set(x, "DenoiseFilter", value.asInstanceOf[js.Any])
    
    inline def setDenoiseFilterUndefined: Self = StObject.set(x, "DenoiseFilter", js.undefined)
    
    inline def setFilterStrength(value: integerMin1Max5): Self = StObject.set(x, "FilterStrength", value.asInstanceOf[js.Any])
    
    inline def setFilterStrengthUndefined: Self = StObject.set(x, "FilterStrength", js.undefined)
    
    inline def setInputFilter(value: InputFilter): Self = StObject.set(x, "InputFilter", value.asInstanceOf[js.Any])
    
    inline def setInputFilterUndefined: Self = StObject.set(x, "InputFilter", js.undefined)
    
    inline def setNetworkInputSettings(value: NetworkInputSettings): Self = StObject.set(x, "NetworkInputSettings", value.asInstanceOf[js.Any])
    
    inline def setNetworkInputSettingsUndefined: Self = StObject.set(x, "NetworkInputSettings", js.undefined)
    
    inline def setScte35Pid(value: integerMin32Max8191): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    inline def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    inline def setSmpte2038DataPreference(value: Smpte2038DataPreference): Self = StObject.set(x, "Smpte2038DataPreference", value.asInstanceOf[js.Any])
    
    inline def setSmpte2038DataPreferenceUndefined: Self = StObject.set(x, "Smpte2038DataPreference", js.undefined)
    
    inline def setSourceEndBehavior(value: InputSourceEndBehavior): Self = StObject.set(x, "SourceEndBehavior", value.asInstanceOf[js.Any])
    
    inline def setSourceEndBehaviorUndefined: Self = StObject.set(x, "SourceEndBehavior", js.undefined)
    
    inline def setVideoSelector(value: VideoSelector): Self = StObject.set(x, "VideoSelector", value.asInstanceOf[js.Any])
    
    inline def setVideoSelectorUndefined: Self = StObject.set(x, "VideoSelector", js.undefined)
  }
}
