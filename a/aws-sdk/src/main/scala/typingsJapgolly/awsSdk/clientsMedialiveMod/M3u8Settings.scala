package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait M3u8Settings extends StObject {
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.
    */
  var AudioPids: js.UndefOr[string] = js.undefined
  
  /**
    * This parameter is unused and deprecated.
    */
  var EcmPid: js.UndefOr[string] = js.undefined
  
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M3u8NielsenId3Behavior] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined
  
  /**
    * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[integerMin0Max500] = js.undefined
  
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.
    */
  var PcrPid: js.UndefOr[string] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream. A value of \"0\" writes out the PMT once per segment file.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var PmtPid: js.UndefOr[string] = js.undefined
  
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * If set to passthrough, passes any SCTE-35 signals from the input source to this output.
    */
  var Scte35Behavior: js.UndefOr[M3u8Scte35Behavior] = js.undefined
  
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var Scte35Pid: js.UndefOr[string] = js.undefined
  
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M3u8TimedMetadataBehavior] = js.undefined
  
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[string] = js.undefined
  
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.
    */
  var VideoPid: js.UndefOr[string] = js.undefined
}
object M3u8Settings {
  
  inline def apply(): M3u8Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M3u8Settings]
  }
  
  extension [Self <: M3u8Settings](x: Self) {
    
    inline def setAudioFramesPerPes(value: integerMin0): Self = StObject.set(x, "AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    inline def setAudioFramesPerPesUndefined: Self = StObject.set(x, "AudioFramesPerPes", js.undefined)
    
    inline def setAudioPids(value: string): Self = StObject.set(x, "AudioPids", value.asInstanceOf[js.Any])
    
    inline def setAudioPidsUndefined: Self = StObject.set(x, "AudioPids", js.undefined)
    
    inline def setEcmPid(value: string): Self = StObject.set(x, "EcmPid", value.asInstanceOf[js.Any])
    
    inline def setEcmPidUndefined: Self = StObject.set(x, "EcmPid", js.undefined)
    
    inline def setNielsenId3Behavior(value: M3u8NielsenId3Behavior): Self = StObject.set(x, "NielsenId3Behavior", value.asInstanceOf[js.Any])
    
    inline def setNielsenId3BehaviorUndefined: Self = StObject.set(x, "NielsenId3Behavior", js.undefined)
    
    inline def setPatInterval(value: integerMin0Max1000): Self = StObject.set(x, "PatInterval", value.asInstanceOf[js.Any])
    
    inline def setPatIntervalUndefined: Self = StObject.set(x, "PatInterval", js.undefined)
    
    inline def setPcrControl(value: M3u8PcrControl): Self = StObject.set(x, "PcrControl", value.asInstanceOf[js.Any])
    
    inline def setPcrControlUndefined: Self = StObject.set(x, "PcrControl", js.undefined)
    
    inline def setPcrPeriod(value: integerMin0Max500): Self = StObject.set(x, "PcrPeriod", value.asInstanceOf[js.Any])
    
    inline def setPcrPeriodUndefined: Self = StObject.set(x, "PcrPeriod", js.undefined)
    
    inline def setPcrPid(value: string): Self = StObject.set(x, "PcrPid", value.asInstanceOf[js.Any])
    
    inline def setPcrPidUndefined: Self = StObject.set(x, "PcrPid", js.undefined)
    
    inline def setPmtInterval(value: integerMin0Max1000): Self = StObject.set(x, "PmtInterval", value.asInstanceOf[js.Any])
    
    inline def setPmtIntervalUndefined: Self = StObject.set(x, "PmtInterval", js.undefined)
    
    inline def setPmtPid(value: string): Self = StObject.set(x, "PmtPid", value.asInstanceOf[js.Any])
    
    inline def setPmtPidUndefined: Self = StObject.set(x, "PmtPid", js.undefined)
    
    inline def setProgramNum(value: integerMin0Max65535): Self = StObject.set(x, "ProgramNum", value.asInstanceOf[js.Any])
    
    inline def setProgramNumUndefined: Self = StObject.set(x, "ProgramNum", js.undefined)
    
    inline def setScte35Behavior(value: M3u8Scte35Behavior): Self = StObject.set(x, "Scte35Behavior", value.asInstanceOf[js.Any])
    
    inline def setScte35BehaviorUndefined: Self = StObject.set(x, "Scte35Behavior", js.undefined)
    
    inline def setScte35Pid(value: string): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    inline def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    inline def setTimedMetadataBehavior(value: M3u8TimedMetadataBehavior): Self = StObject.set(x, "TimedMetadataBehavior", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataBehaviorUndefined: Self = StObject.set(x, "TimedMetadataBehavior", js.undefined)
    
    inline def setTimedMetadataPid(value: string): Self = StObject.set(x, "TimedMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataPidUndefined: Self = StObject.set(x, "TimedMetadataPid", js.undefined)
    
    inline def setTransportStreamId(value: integerMin0Max65535): Self = StObject.set(x, "TransportStreamId", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamIdUndefined: Self = StObject.set(x, "TransportStreamId", js.undefined)
    
    inline def setVideoPid(value: string): Self = StObject.set(x, "VideoPid", value.asInstanceOf[js.Any])
    
    inline def setVideoPidUndefined: Self = StObject.set(x, "VideoPid", js.undefined)
  }
}
