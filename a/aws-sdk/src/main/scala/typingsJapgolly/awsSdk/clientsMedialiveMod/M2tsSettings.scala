package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait M2tsSettings extends StObject {
  
  /**
    * When set to drop, output audio streams will be removed from the program if the selected input audio stream is removed from the input. This allows the output audio configuration to dynamically change based on input configuration. If this is set to encodeSilence, all output audio streams will output encoded silence when not connected to an active input stream.
    */
  var AbsentInputAudioBehavior: js.UndefOr[M2tsAbsentInputAudioBehavior] = js.undefined
  
  /**
    * When set to enabled, uses ARIB-compliant field muxing and removes video descriptor.
    */
  var Arib: js.UndefOr[M2tsArib] = js.undefined
  
  /**
    * Packet Identifier (PID) for ARIB Captions in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AribCaptionsPid: js.UndefOr[string] = js.undefined
  
  /**
    * If set to auto, pid number used for ARIB Captions will be auto-selected from unused pids.  If set to useConfigured, ARIB Captions will be on the configured pid number.
    */
  var AribCaptionsPidControl: js.UndefOr[M2tsAribCaptionsPidControl] = js.undefined
  
  /**
    * When set to dvb, uses DVB buffer model for Dolby Digital audio.  When set to atsc, the ATSC model is used.
    */
  var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined
  
  /**
    * The number of audio frames to insert for each PES packet.
    */
  var AudioFramesPerPes: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values. Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var AudioPids: js.UndefOr[string] = js.undefined
  
  /**
    * When set to atsc, uses stream type = 0x81 for AC3 and stream type = 0x87 for EAC3. When set to dvb, uses stream type = 0x06.
    */
  var AudioStreamType: js.UndefOr[M2tsAudioStreamType] = js.undefined
  
  /**
    * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate.
    */
  var Bitrate: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Controls the timing accuracy for output network traffic. Leave as MULTIPLEX to ensure accurate network packet timing. Or set to NONE, which might result in lower latency but will result in more variability in output network packet timing. This variability might cause interruptions, jitter, or bursty behavior in your playback or receiving devices.
    */
  var BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined
  
  /**
    * When set to enabled, generates captionServiceDescriptor in PMT.
    */
  var CcDescriptor: js.UndefOr[M2tsCcDescriptor] = js.undefined
  
  /**
    * Inserts DVB Network Information Table (NIT) at the specified table repetition interval.
    */
  var DvbNitSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.DvbNitSettings] = js.undefined
  
  /**
    * Inserts DVB Service Description Table (SDT) at the specified table repetition interval.
    */
  var DvbSdtSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.DvbSdtSettings] = js.undefined
  
  /**
    * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbSubPids: js.UndefOr[string] = js.undefined
  
  /**
    * Inserts DVB Time and Date Table (TDT) at the specified table repetition interval.
    */
  var DvbTdtSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.DvbTdtSettings] = js.undefined
  
  /**
    * Packet Identifier (PID) for input source DVB Teletext data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var DvbTeletextPid: js.UndefOr[string] = js.undefined
  
  /**
    * If set to passthrough, passes any EBIF data from the input source to this output.
    */
  var Ebif: js.UndefOr[M2tsEbifControl] = js.undefined
  
  /**
    * When videoAndFixedIntervals is selected, audio EBP markers will be added to partitions 3 and 4. The interval between these additional markers will be fixed, and will be slightly shorter than the video EBP marker interval. Only available when EBP Cablelabs segmentation markers are selected.  Partitions 1 and 2 will always follow the video interval.
    */
  var EbpAudioInterval: js.UndefOr[M2tsAudioInterval] = js.undefined
  
  /**
    * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker.  The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
    */
  var EbpLookaheadMs: js.UndefOr[integerMin0Max10000] = js.undefined
  
  /**
    * Controls placement of EBP on Audio PIDs. If set to videoAndAudioPids, EBP markers will be placed on the video PID and all audio PIDs.  If set to videoPid, EBP markers will be placed on only the video PID.
    */
  var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined
  
  /**
    * This field is unused and deprecated.
    */
  var EcmPid: js.UndefOr[string] = js.undefined
  
  /**
    * Include or exclude the ES Rate field in the PES header.
    */
  var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined
  
  /**
    * Packet Identifier (PID) for input source ETV Platform data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvPlatformPid: js.UndefOr[string] = js.undefined
  
  /**
    * Packet Identifier (PID) for input source ETV Signal data to this output. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var EtvSignalPid: js.UndefOr[string] = js.undefined
  
  /**
    * The length in seconds of each fragment. Only used with EBP markers.
    */
  var FragmentTime: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * If set to passthrough, passes any KLV data from the input source to this output.
    */
  var Klv: js.UndefOr[M2tsKlv] = js.undefined
  
  /**
    * Packet Identifier (PID) for input source KLV data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var KlvDataPids: js.UndefOr[string] = js.undefined
  
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[M2tsNielsenId3Behavior] = js.undefined
  
  /**
    * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
    */
  var NullPacketBitrate: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.  Valid values are 0, 10..1000.
    */
  var PatInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * When set to pcrEveryPesPacket, a Program Clock Reference value is inserted for every Packetized Elementary Stream (PES) header. This parameter is effective only when the PCR PID is the same as the video or audio elementary stream.
    */
  var PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined
  
  /**
    * Maximum time in milliseconds between Program Clock Reference (PCRs) inserted into the transport stream.
    */
  var PcrPeriod: js.UndefOr[integerMin0Max500] = js.undefined
  
  /**
    * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PcrPid: js.UndefOr[string] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream. Valid values are 0, 10..1000.
    */
  var PmtInterval: js.UndefOr[integerMin0Max1000] = js.undefined
  
  /**
    * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream. Can be entered as a decimal or hexadecimal value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var PmtPid: js.UndefOr[string] = js.undefined
  
  /**
    * The value of the program number field in the Program Map Table.
    */
  var ProgramNum: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * When vbr, does not insert null packets into transport stream to fill specified bitrate. The bitrate setting acts as the maximum bitrate when vbr is set.
    */
  var RateMode: js.UndefOr[M2tsRateMode] = js.undefined
  
  /**
    * Packet Identifier (PID) for input source SCTE-27 data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation. Can be entered as decimal or hexadecimal values.  Each PID specified must be in the range of 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte27Pids: js.UndefOr[string] = js.undefined
  
  /**
    * Optionally pass SCTE-35 signals from the input source to this output.
    */
  var Scte35Control: js.UndefOr[M2tsScte35Control] = js.undefined
  
  /**
    * Packet Identifier (PID) of the SCTE-35 stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var Scte35Pid: js.UndefOr[string] = js.undefined
  
  /**
    * Inserts segmentation markers at each segmentationTime period. raiSegstart sets the Random Access Indicator bit in the adaptation field. raiAdapt sets the RAI bit and adds the current timecode in the private data bytes. psiSegstart inserts PAT and PMT tables at the start of segments. ebp adds Encoder Boundary Point information to the adaptation field as per OpenCable specification OC-SP-EBP-I01-130118. ebpLegacy adds Encoder Boundary Point information to the adaptation field using a legacy proprietary format.
    */
  var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined
  
  /**
    * The segmentation style parameter controls how segmentation markers are inserted into the transport stream. With avails, it is possible that segments may be truncated, which can influence where future segmentation markers are inserted.
  When a segmentation style of "resetCadence" is selected and a segment is truncated due to an avail, we will reset the segmentation cadence. This means the subsequent segment will have a duration of $segmentationTime seconds.
  When a segmentation style of "maintainCadence" is selected and a segment is truncated due to an avail, we will not reset the segmentation cadence. This means the subsequent segment will likely be truncated as well. However, all segments after that will have a duration of $segmentationTime seconds. Note that EBP lookahead is a slight exception to this rule.
    */
  var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined
  
  /**
    * The length in seconds of each segment. Required unless markers is set to _none_.
    */
  var SegmentationTime: js.UndefOr[doubleMin1] = js.undefined
  
  /**
    * When set to passthrough, timed metadata will be passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[M2tsTimedMetadataBehavior] = js.undefined
  
  /**
    * Packet Identifier (PID) of the timed metadata stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var TimedMetadataPid: js.UndefOr[string] = js.undefined
  
  /**
    * The value of the transport stream ID field in the Program Map Table.
    */
  var TransportStreamId: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * Packet Identifier (PID) of the elementary video stream in the transport stream. Can be entered as a decimal or hexadecimal value.  Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
    */
  var VideoPid: js.UndefOr[string] = js.undefined
}
object M2tsSettings {
  
  inline def apply(): M2tsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[M2tsSettings]
  }
  
  extension [Self <: M2tsSettings](x: Self) {
    
    inline def setAbsentInputAudioBehavior(value: M2tsAbsentInputAudioBehavior): Self = StObject.set(x, "AbsentInputAudioBehavior", value.asInstanceOf[js.Any])
    
    inline def setAbsentInputAudioBehaviorUndefined: Self = StObject.set(x, "AbsentInputAudioBehavior", js.undefined)
    
    inline def setArib(value: M2tsArib): Self = StObject.set(x, "Arib", value.asInstanceOf[js.Any])
    
    inline def setAribCaptionsPid(value: string): Self = StObject.set(x, "AribCaptionsPid", value.asInstanceOf[js.Any])
    
    inline def setAribCaptionsPidControl(value: M2tsAribCaptionsPidControl): Self = StObject.set(x, "AribCaptionsPidControl", value.asInstanceOf[js.Any])
    
    inline def setAribCaptionsPidControlUndefined: Self = StObject.set(x, "AribCaptionsPidControl", js.undefined)
    
    inline def setAribCaptionsPidUndefined: Self = StObject.set(x, "AribCaptionsPid", js.undefined)
    
    inline def setAribUndefined: Self = StObject.set(x, "Arib", js.undefined)
    
    inline def setAudioBufferModel(value: M2tsAudioBufferModel): Self = StObject.set(x, "AudioBufferModel", value.asInstanceOf[js.Any])
    
    inline def setAudioBufferModelUndefined: Self = StObject.set(x, "AudioBufferModel", js.undefined)
    
    inline def setAudioFramesPerPes(value: integerMin0): Self = StObject.set(x, "AudioFramesPerPes", value.asInstanceOf[js.Any])
    
    inline def setAudioFramesPerPesUndefined: Self = StObject.set(x, "AudioFramesPerPes", js.undefined)
    
    inline def setAudioPids(value: string): Self = StObject.set(x, "AudioPids", value.asInstanceOf[js.Any])
    
    inline def setAudioPidsUndefined: Self = StObject.set(x, "AudioPids", js.undefined)
    
    inline def setAudioStreamType(value: M2tsAudioStreamType): Self = StObject.set(x, "AudioStreamType", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamTypeUndefined: Self = StObject.set(x, "AudioStreamType", js.undefined)
    
    inline def setBitrate(value: integerMin0): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBufferModel(value: M2tsBufferModel): Self = StObject.set(x, "BufferModel", value.asInstanceOf[js.Any])
    
    inline def setBufferModelUndefined: Self = StObject.set(x, "BufferModel", js.undefined)
    
    inline def setCcDescriptor(value: M2tsCcDescriptor): Self = StObject.set(x, "CcDescriptor", value.asInstanceOf[js.Any])
    
    inline def setCcDescriptorUndefined: Self = StObject.set(x, "CcDescriptor", js.undefined)
    
    inline def setDvbNitSettings(value: DvbNitSettings): Self = StObject.set(x, "DvbNitSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbNitSettingsUndefined: Self = StObject.set(x, "DvbNitSettings", js.undefined)
    
    inline def setDvbSdtSettings(value: DvbSdtSettings): Self = StObject.set(x, "DvbSdtSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbSdtSettingsUndefined: Self = StObject.set(x, "DvbSdtSettings", js.undefined)
    
    inline def setDvbSubPids(value: string): Self = StObject.set(x, "DvbSubPids", value.asInstanceOf[js.Any])
    
    inline def setDvbSubPidsUndefined: Self = StObject.set(x, "DvbSubPids", js.undefined)
    
    inline def setDvbTdtSettings(value: DvbTdtSettings): Self = StObject.set(x, "DvbTdtSettings", value.asInstanceOf[js.Any])
    
    inline def setDvbTdtSettingsUndefined: Self = StObject.set(x, "DvbTdtSettings", js.undefined)
    
    inline def setDvbTeletextPid(value: string): Self = StObject.set(x, "DvbTeletextPid", value.asInstanceOf[js.Any])
    
    inline def setDvbTeletextPidUndefined: Self = StObject.set(x, "DvbTeletextPid", js.undefined)
    
    inline def setEbif(value: M2tsEbifControl): Self = StObject.set(x, "Ebif", value.asInstanceOf[js.Any])
    
    inline def setEbifUndefined: Self = StObject.set(x, "Ebif", js.undefined)
    
    inline def setEbpAudioInterval(value: M2tsAudioInterval): Self = StObject.set(x, "EbpAudioInterval", value.asInstanceOf[js.Any])
    
    inline def setEbpAudioIntervalUndefined: Self = StObject.set(x, "EbpAudioInterval", js.undefined)
    
    inline def setEbpLookaheadMs(value: integerMin0Max10000): Self = StObject.set(x, "EbpLookaheadMs", value.asInstanceOf[js.Any])
    
    inline def setEbpLookaheadMsUndefined: Self = StObject.set(x, "EbpLookaheadMs", js.undefined)
    
    inline def setEbpPlacement(value: M2tsEbpPlacement): Self = StObject.set(x, "EbpPlacement", value.asInstanceOf[js.Any])
    
    inline def setEbpPlacementUndefined: Self = StObject.set(x, "EbpPlacement", js.undefined)
    
    inline def setEcmPid(value: string): Self = StObject.set(x, "EcmPid", value.asInstanceOf[js.Any])
    
    inline def setEcmPidUndefined: Self = StObject.set(x, "EcmPid", js.undefined)
    
    inline def setEsRateInPes(value: M2tsEsRateInPes): Self = StObject.set(x, "EsRateInPes", value.asInstanceOf[js.Any])
    
    inline def setEsRateInPesUndefined: Self = StObject.set(x, "EsRateInPes", js.undefined)
    
    inline def setEtvPlatformPid(value: string): Self = StObject.set(x, "EtvPlatformPid", value.asInstanceOf[js.Any])
    
    inline def setEtvPlatformPidUndefined: Self = StObject.set(x, "EtvPlatformPid", js.undefined)
    
    inline def setEtvSignalPid(value: string): Self = StObject.set(x, "EtvSignalPid", value.asInstanceOf[js.Any])
    
    inline def setEtvSignalPidUndefined: Self = StObject.set(x, "EtvSignalPid", js.undefined)
    
    inline def setFragmentTime(value: doubleMin0): Self = StObject.set(x, "FragmentTime", value.asInstanceOf[js.Any])
    
    inline def setFragmentTimeUndefined: Self = StObject.set(x, "FragmentTime", js.undefined)
    
    inline def setKlv(value: M2tsKlv): Self = StObject.set(x, "Klv", value.asInstanceOf[js.Any])
    
    inline def setKlvDataPids(value: string): Self = StObject.set(x, "KlvDataPids", value.asInstanceOf[js.Any])
    
    inline def setKlvDataPidsUndefined: Self = StObject.set(x, "KlvDataPids", js.undefined)
    
    inline def setKlvUndefined: Self = StObject.set(x, "Klv", js.undefined)
    
    inline def setNielsenId3Behavior(value: M2tsNielsenId3Behavior): Self = StObject.set(x, "NielsenId3Behavior", value.asInstanceOf[js.Any])
    
    inline def setNielsenId3BehaviorUndefined: Self = StObject.set(x, "NielsenId3Behavior", js.undefined)
    
    inline def setNullPacketBitrate(value: doubleMin0): Self = StObject.set(x, "NullPacketBitrate", value.asInstanceOf[js.Any])
    
    inline def setNullPacketBitrateUndefined: Self = StObject.set(x, "NullPacketBitrate", js.undefined)
    
    inline def setPatInterval(value: integerMin0Max1000): Self = StObject.set(x, "PatInterval", value.asInstanceOf[js.Any])
    
    inline def setPatIntervalUndefined: Self = StObject.set(x, "PatInterval", js.undefined)
    
    inline def setPcrControl(value: M2tsPcrControl): Self = StObject.set(x, "PcrControl", value.asInstanceOf[js.Any])
    
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
    
    inline def setRateMode(value: M2tsRateMode): Self = StObject.set(x, "RateMode", value.asInstanceOf[js.Any])
    
    inline def setRateModeUndefined: Self = StObject.set(x, "RateMode", js.undefined)
    
    inline def setScte27Pids(value: string): Self = StObject.set(x, "Scte27Pids", value.asInstanceOf[js.Any])
    
    inline def setScte27PidsUndefined: Self = StObject.set(x, "Scte27Pids", js.undefined)
    
    inline def setScte35Control(value: M2tsScte35Control): Self = StObject.set(x, "Scte35Control", value.asInstanceOf[js.Any])
    
    inline def setScte35ControlUndefined: Self = StObject.set(x, "Scte35Control", js.undefined)
    
    inline def setScte35Pid(value: string): Self = StObject.set(x, "Scte35Pid", value.asInstanceOf[js.Any])
    
    inline def setScte35PidUndefined: Self = StObject.set(x, "Scte35Pid", js.undefined)
    
    inline def setSegmentationMarkers(value: M2tsSegmentationMarkers): Self = StObject.set(x, "SegmentationMarkers", value.asInstanceOf[js.Any])
    
    inline def setSegmentationMarkersUndefined: Self = StObject.set(x, "SegmentationMarkers", js.undefined)
    
    inline def setSegmentationStyle(value: M2tsSegmentationStyle): Self = StObject.set(x, "SegmentationStyle", value.asInstanceOf[js.Any])
    
    inline def setSegmentationStyleUndefined: Self = StObject.set(x, "SegmentationStyle", js.undefined)
    
    inline def setSegmentationTime(value: doubleMin1): Self = StObject.set(x, "SegmentationTime", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTimeUndefined: Self = StObject.set(x, "SegmentationTime", js.undefined)
    
    inline def setTimedMetadataBehavior(value: M2tsTimedMetadataBehavior): Self = StObject.set(x, "TimedMetadataBehavior", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataBehaviorUndefined: Self = StObject.set(x, "TimedMetadataBehavior", js.undefined)
    
    inline def setTimedMetadataPid(value: string): Self = StObject.set(x, "TimedMetadataPid", value.asInstanceOf[js.Any])
    
    inline def setTimedMetadataPidUndefined: Self = StObject.set(x, "TimedMetadataPid", js.undefined)
    
    inline def setTransportStreamId(value: integerMin0Max65535): Self = StObject.set(x, "TransportStreamId", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamIdUndefined: Self = StObject.set(x, "TransportStreamId", js.undefined)
    
    inline def setVideoPid(value: string): Self = StObject.set(x, "VideoPid", value.asInstanceOf[js.Any])
    
    inline def setVideoPidUndefined: Self = StObject.set(x, "VideoPid", js.undefined)
  }
}
