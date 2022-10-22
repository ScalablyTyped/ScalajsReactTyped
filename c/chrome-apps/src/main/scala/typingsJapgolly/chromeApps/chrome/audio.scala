package typingsJapgolly.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.app.*
// #region chrome.audio
///////////
// Audio //
///////////
/**
  * @since Chrome 59.
  * @requires Permissions: 'audio'
  * @description
  * The chrome.audio API is provided to allow users to get information
  * about and control the audio devices attached to the system.
  * This API is currently only available in kiosk mode for ChromeOS.
  */
object audio {
  
  trait AudioDeviceInfo extends StObject {
    
    /** Device name. */
    var deviceName: String
    
    /** Type of the device. */
    var deviceType: DeviceType
    
    /** The user-friendly name (e.g. 'USB Microphone'). */
    var displayName: String
    
    /** The unique identifier of the audio device. */
    var id: String
    
    /** True if this is the current active device. */
    var isActive: Boolean
    
    /** The sound level of the device, volume for output, gain for input. */
    var level: integer
    
    /** The stable/persisted device id string when available. */
    var stableDeviceId: js.UndefOr[String] = js.undefined
    
    /** Stream type associated with this device. */
    var streamType: StreamType
  }
  object AudioDeviceInfo {
    
    inline def apply(
      deviceName: String,
      deviceType: DeviceType,
      displayName: String,
      id: String,
      isActive: Boolean,
      level: integer,
      streamType: StreamType
    ): AudioDeviceInfo = {
      val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioDeviceInfo]
    }
    
    extension [Self <: AudioDeviceInfo](x: Self) {
      
      inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: integer): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setStableDeviceId(value: String): Self = StObject.set(x, "stableDeviceId", value.asInstanceOf[js.Any])
      
      inline def setStableDeviceIdUndefined: Self = StObject.set(x, "stableDeviceId", js.undefined)
      
      inline def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceIdLists extends StObject {
    
    /**
      * List of input devices specified by their ID.
      * To indicate input devices should be unaffected, leave this property unset.
      */
    var input: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * List of output devices specified by their ID.
      * To indicate output devices should be unaffected, leave this property unset.
      */
    var output: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DeviceIdLists {
    
    inline def apply(): DeviceIdLists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeviceIdLists]
    }
    
    extension [Self <: DeviceIdLists](x: Self) {
      
      inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setOutput(value: js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.HEADPHONE
    - typingsJapgolly.chromeApps.chromeAppsStrings.MIC
    - typingsJapgolly.chromeApps.chromeAppsStrings.USB
    - typingsJapgolly.chromeApps.chromeAppsStrings.BLUETOOTH
    - typingsJapgolly.chromeApps.chromeAppsStrings.HDMI
    - typingsJapgolly.chromeApps.chromeAppsStrings.INTERNAL_SPEAKER
    - typingsJapgolly.chromeApps.chromeAppsStrings.INTERNAL_MIC
    - typingsJapgolly.chromeApps.chromeAppsStrings.FRONT_MIC
    - typingsJapgolly.chromeApps.chromeAppsStrings.REAR_MIC
    - typingsJapgolly.chromeApps.chromeAppsStrings.KEYBOARD_MIC
    - typingsJapgolly.chromeApps.chromeAppsStrings.HOTWORD
    - typingsJapgolly.chromeApps.chromeAppsStrings.LINEOUT
    - typingsJapgolly.chromeApps.chromeAppsStrings.POST_MIX_LOOPBACK
    - typingsJapgolly.chromeApps.chromeAppsStrings.POST_DSP_LOOPBACK
    - typingsJapgolly.chromeApps.chromeAppsStrings.OTHER
  */
  trait DeviceType extends StObject
  object DeviceType {
    
    inline def BLUETOOTH: typingsJapgolly.chromeApps.chromeAppsStrings.BLUETOOTH = "BLUETOOTH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.BLUETOOTH]
    
    inline def FRONT_MIC: typingsJapgolly.chromeApps.chromeAppsStrings.FRONT_MIC = "FRONT_MIC".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.FRONT_MIC]
    
    inline def HDMI: typingsJapgolly.chromeApps.chromeAppsStrings.HDMI = "HDMI".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.HDMI]
    
    inline def HEADPHONE: typingsJapgolly.chromeApps.chromeAppsStrings.HEADPHONE = "HEADPHONE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.HEADPHONE]
    
    inline def HOTWORD: typingsJapgolly.chromeApps.chromeAppsStrings.HOTWORD = "HOTWORD".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.HOTWORD]
    
    inline def INTERNAL_MIC: typingsJapgolly.chromeApps.chromeAppsStrings.INTERNAL_MIC = "INTERNAL_MIC".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.INTERNAL_MIC]
    
    inline def INTERNAL_SPEAKER: typingsJapgolly.chromeApps.chromeAppsStrings.INTERNAL_SPEAKER = "INTERNAL_SPEAKER".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.INTERNAL_SPEAKER]
    
    inline def KEYBOARD_MIC: typingsJapgolly.chromeApps.chromeAppsStrings.KEYBOARD_MIC = "KEYBOARD_MIC".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.KEYBOARD_MIC]
    
    inline def LINEOUT: typingsJapgolly.chromeApps.chromeAppsStrings.LINEOUT = "LINEOUT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.LINEOUT]
    
    inline def MIC: typingsJapgolly.chromeApps.chromeAppsStrings.MIC = "MIC".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.MIC]
    
    inline def OTHER: typingsJapgolly.chromeApps.chromeAppsStrings.OTHER = "OTHER".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.OTHER]
    
    inline def POST_DSP_LOOPBACK: typingsJapgolly.chromeApps.chromeAppsStrings.POST_DSP_LOOPBACK = "POST_DSP_LOOPBACK".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.POST_DSP_LOOPBACK]
    
    inline def POST_MIX_LOOPBACK: typingsJapgolly.chromeApps.chromeAppsStrings.POST_MIX_LOOPBACK = "POST_MIX_LOOPBACK".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.POST_MIX_LOOPBACK]
    
    inline def REAR_MIC: typingsJapgolly.chromeApps.chromeAppsStrings.REAR_MIC = "REAR_MIC".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.REAR_MIC]
    
    inline def USB: typingsJapgolly.chromeApps.chromeAppsStrings.USB = "USB".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.USB]
  }
  
  /**
    * Device properties by which to filter the list of returned audio devices.
    * If the filter is not set or set to {}, returned device list will contain all available audio devices.
    */
  trait Filter extends StObject {
    
    /**
      * If set, only audio devices whose active state matches this value will satisfy the filter.
      */
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, only audio devices whose stream type is included in this list will satisfy the filter.
      */
    var streamTypes: js.UndefOr[js.Array[StreamType]] = js.undefined
  }
  object Filter {
    
    inline def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setStreamTypes(value: js.Array[StreamType]): Self = StObject.set(x, "streamTypes", value.asInstanceOf[js.Any])
      
      inline def setStreamTypesUndefined: Self = StObject.set(x, "streamTypes", js.undefined)
      
      inline def setStreamTypesVarargs(value: StreamType*): Self = StObject.set(x, "streamTypes", js.Array(value*))
    }
  }
  
  trait SetDeviceProperties extends StObject {
    
    /**
      * The audio device's desired sound level. Defaults to the device's current sound level.
      * If used with audio input device, represents audio device gain.
      * If used with audio output device, represents audio device volume.
      */
    var level: js.UndefOr[integer] = js.undefined
  }
  object SetDeviceProperties {
    
    inline def apply(): SetDeviceProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetDeviceProperties]
    }
    
    extension [Self <: SetDeviceProperties](x: Self) {
      
      inline def setLevel(value: integer): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.INPUT
    - typingsJapgolly.chromeApps.chromeAppsStrings.OUTPUT
  */
  trait StreamType extends StObject
  object StreamType {
    
    inline def INPUT: typingsJapgolly.chromeApps.chromeAppsStrings.INPUT = "INPUT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.INPUT]
    
    inline def OUTPUT: typingsJapgolly.chromeApps.chromeAppsStrings.OUTPUT = "OUTPUT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.OUTPUT]
  }
}
