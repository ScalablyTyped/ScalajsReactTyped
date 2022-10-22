package typingsJapgolly.reactNativeAudio

import typingsJapgolly.reactNativeAudio.anon.AudioFileURL
import typingsJapgolly.reactNativeAudio.anon.CurrentTime
import typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.High
import typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.Low
import typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.Medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AudioRecorder {
    
    @JSImport("react-native-audio", "AudioRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkAuthorizationStatus(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAuthorizationStatus")().asInstanceOf[js.Promise[Boolean]]
    
    inline def onFinished(res: AudioFileURL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onFinished")(res.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onProgress(res: CurrentTime): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onProgress")(res.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def pauseRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseRecording")().asInstanceOf[js.Promise[String]]
    
    inline def prepareRecordingAtPath(path: String, options: RecordingOptions): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareRecordingAtPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    
    inline def requestAuthorization(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAuthorization")().asInstanceOf[js.Promise[Boolean]]
    
    inline def resumeRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeRecording")().asInstanceOf[js.Promise[String]]
    
    inline def startRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("startRecording")().asInstanceOf[js.Promise[String]]
    
    inline def stopRecording(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopRecording")().asInstanceOf[js.Promise[String]]
  }
  
  object AudioSource {
    
    @JSImport("react-native-audio", "AudioSource")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-audio", "AudioSource.CAMCORDER")
    @js.native
    def CAMCORDER: Double = js.native
    inline def CAMCORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAMCORDER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    inline def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.MIC")
    @js.native
    def MIC: Double = js.native
    inline def MIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIC")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.REMOTE_SUBMIX")
    @js.native
    def REMOTE_SUBMIX: Double = js.native
    inline def REMOTE_SUBMIX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOTE_SUBMIX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.UNPROCESSED")
    @js.native
    def UNPROCESSED: Double = js.native
    inline def UNPROCESSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNPROCESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_CALL")
    @js.native
    def VOICE_CALL: Double = js.native
    inline def VOICE_CALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_COMMUNICATION")
    @js.native
    def VOICE_COMMUNICATION: Double = js.native
    inline def VOICE_COMMUNICATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_COMMUNICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_DOWNLINK")
    @js.native
    def VOICE_DOWNLINK: Double = js.native
    inline def VOICE_DOWNLINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_DOWNLINK")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_RECOGNITION")
    @js.native
    def VOICE_RECOGNITION: Double = js.native
    inline def VOICE_RECOGNITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_RECOGNITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioSource.VOICE_UPLINK")
    @js.native
    def VOICE_UPLINK: Double = js.native
    inline def VOICE_UPLINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VOICE_UPLINK")(x.asInstanceOf[js.Any])
  }
  
  object AudioUtils {
    
    @JSImport("react-native-audio", "AudioUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-audio", "AudioUtils.CachesDirectoryPath")
    @js.native
    def CachesDirectoryPath: String = js.native
    inline def CachesDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CachesDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.DocumentDirectoryPath")
    @js.native
    def DocumentDirectoryPath: String = js.native
    inline def DocumentDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DocumentDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.DownloadsDirectoryPath")
    @js.native
    def DownloadsDirectoryPath: String = js.native
    inline def DownloadsDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DownloadsDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.LibraryDirectoryPath")
    @js.native
    def LibraryDirectoryPath: String = js.native
    inline def LibraryDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LibraryDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.MainBundlePath")
    @js.native
    def MainBundlePath: String = js.native
    inline def MainBundlePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MainBundlePath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.MusicDirectoryPath")
    @js.native
    def MusicDirectoryPath: String = js.native
    inline def MusicDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MusicDirectoryPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-audio", "AudioUtils.PicturesDirectoryPath")
    @js.native
    def PicturesDirectoryPath: String = js.native
    inline def PicturesDirectoryPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PicturesDirectoryPath")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac_eld
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_nb
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_wb
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.he_aac
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.vorbis
  */
  trait AudioEncodingAndroidType extends StObject
  object AudioEncodingAndroidType {
    
    inline def aac_eld: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac_eld = "aac_eld".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac_eld]
    
    inline def amr_nb: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_nb = "amr_nb".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_nb]
    
    inline def amr_wb: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_wb = "amr_wb".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_wb]
    
    inline def he_aac: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.he_aac = "he_aac".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.he_aac]
    
    inline def vorbis: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.vorbis = "vorbis".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.vorbis]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.lpcm
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ima4
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC3
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC6
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ulaw
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alaw
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp1
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp2
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alac
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr
  */
  trait AudioEncodingIOSType extends StObject
  object AudioEncodingIOSType {
    
    inline def MAC3: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC3 = "MAC3".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC3]
    
    inline def MAC6: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC6 = "MAC6".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC6]
    
    inline def alac: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alac = "alac".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alac]
    
    inline def alaw: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alaw = "alaw".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alaw]
    
    inline def amr: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr = "amr".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr]
    
    inline def ima4: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ima4 = "ima4".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ima4]
    
    inline def lpcm: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.lpcm = "lpcm".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.lpcm]
    
    inline def mp1: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp1 = "mp1".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp1]
    
    inline def mp2: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp2 = "mp2".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp2]
    
    inline def ulaw: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ulaw = "ulaw".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ulaw]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac_eld
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_nb
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_wb
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.he_aac
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.vorbis
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.lpcm
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ima4
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC3
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC6
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ulaw
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alaw
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp1
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp2
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alac
    - typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr
  */
  trait AudioEncodingType extends StObject
  object AudioEncodingType {
    
    inline def MAC3: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC3 = "MAC3".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC3]
    
    inline def MAC6: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC6 = "MAC6".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.MAC6]
    
    inline def aac: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac = "aac".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac]
    
    inline def aac_eld: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac_eld = "aac_eld".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.aac_eld]
    
    inline def alac: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alac = "alac".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alac]
    
    inline def alaw: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alaw = "alaw".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.alaw]
    
    inline def amr: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr = "amr".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr]
    
    inline def amr_nb: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_nb = "amr_nb".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_nb]
    
    inline def amr_wb: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_wb = "amr_wb".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.amr_wb]
    
    inline def he_aac: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.he_aac = "he_aac".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.he_aac]
    
    inline def ima4: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ima4 = "ima4".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ima4]
    
    inline def lpcm: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.lpcm = "lpcm".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.lpcm]
    
    inline def mp1: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp1 = "mp1".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp1]
    
    inline def mp2: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp2 = "mp2".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.mp2]
    
    inline def ulaw: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ulaw = "ulaw".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.ulaw]
    
    inline def vorbis: typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.vorbis = "vorbis".asInstanceOf[typingsJapgolly.reactNativeAudio.reactNativeAudioStrings.vorbis]
  }
  
  trait RecordingOptions extends StObject {
    
    var AudioEncoding: js.UndefOr[AudioEncodingType] = js.undefined
    
    var AudioEncodingBitRate: js.UndefOr[Double] = js.undefined
    
    var AudioQuality: js.UndefOr[Low | Medium | High] = js.undefined
    
    var AudioSource: js.UndefOr[Double] = js.undefined
    
    var Channels: js.UndefOr[Double] = js.undefined
    
    var IncludeBase64: js.UndefOr[Boolean] = js.undefined
    
    var MeasurementMode: js.UndefOr[Boolean] = js.undefined
    
    var MeteringEnabled: js.UndefOr[Boolean] = js.undefined
    
    var OutputFormat: js.UndefOr[String] = js.undefined
    
    var SampleRate: js.UndefOr[Double] = js.undefined
  }
  object RecordingOptions {
    
    inline def apply(): RecordingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingOptions]
    }
    
    extension [Self <: RecordingOptions](x: Self) {
      
      inline def setAudioEncoding(value: AudioEncodingType): Self = StObject.set(x, "AudioEncoding", value.asInstanceOf[js.Any])
      
      inline def setAudioEncodingBitRate(value: Double): Self = StObject.set(x, "AudioEncodingBitRate", value.asInstanceOf[js.Any])
      
      inline def setAudioEncodingBitRateUndefined: Self = StObject.set(x, "AudioEncodingBitRate", js.undefined)
      
      inline def setAudioEncodingUndefined: Self = StObject.set(x, "AudioEncoding", js.undefined)
      
      inline def setAudioQuality(value: Low | Medium | High): Self = StObject.set(x, "AudioQuality", value.asInstanceOf[js.Any])
      
      inline def setAudioQualityUndefined: Self = StObject.set(x, "AudioQuality", js.undefined)
      
      inline def setAudioSource(value: Double): Self = StObject.set(x, "AudioSource", value.asInstanceOf[js.Any])
      
      inline def setAudioSourceUndefined: Self = StObject.set(x, "AudioSource", js.undefined)
      
      inline def setChannels(value: Double): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
      
      inline def setIncludeBase64(value: Boolean): Self = StObject.set(x, "IncludeBase64", value.asInstanceOf[js.Any])
      
      inline def setIncludeBase64Undefined: Self = StObject.set(x, "IncludeBase64", js.undefined)
      
      inline def setMeasurementMode(value: Boolean): Self = StObject.set(x, "MeasurementMode", value.asInstanceOf[js.Any])
      
      inline def setMeasurementModeUndefined: Self = StObject.set(x, "MeasurementMode", js.undefined)
      
      inline def setMeteringEnabled(value: Boolean): Self = StObject.set(x, "MeteringEnabled", value.asInstanceOf[js.Any])
      
      inline def setMeteringEnabledUndefined: Self = StObject.set(x, "MeteringEnabled", js.undefined)
      
      inline def setOutputFormat(value: String): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    }
  }
}
