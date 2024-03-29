package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsSmoothGroupSettings extends StObject {
  
  /**
    * The ID to include in each message in the sparse track. Ignored if sparseTrackType is NONE.
    */
  var AcquisitionPointId: js.UndefOr[string] = js.undefined
  
  /**
    * If set to passthrough for an audio-only MS Smooth output, the fragment absolute time will be set to the current timecode. This option does not write timecodes to the audio elementary stream.
    */
  var AudioOnlyTimecodeControl: js.UndefOr[SmoothGroupAudioOnlyTimecodeControl] = js.undefined
  
  /**
    * If set to verifyAuthenticity, verify the https certificate chain to a trusted Certificate Authority (CA).  This will cause https outputs to self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[SmoothGroupCertificateMode] = js.undefined
  
  /**
    * Number of seconds to wait before retrying connection to the IIS server if the connection is lost. Content will be cached during this time and the cache will be be delivered to the IIS server once the connection is re-established.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Smooth Streaming publish point on an IIS server. Elemental Live acts as a "Push" encoder to IIS.
    */
  var Destination: OutputLocationRef
  
  /**
    * MS Smooth event ID to be sent to the IIS server.
  Should only be specified if eventIdMode is set to useConfigured.
    */
  var EventId: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether or not to send an event ID to the IIS server. If no event ID is sent and the same Live Event is used without changing the publishing point, clients might see cached video from the previous run.
  Options:
  - "useConfigured" - use the value provided in eventId
  - "useTimestamp" - generate and send an event ID based on the current timestamp
  - "noEventId" - do not send an event ID to the IIS server.
    */
  var EventIdMode: js.UndefOr[SmoothGroupEventIdMode] = js.undefined
  
  /**
    * When set to sendEos, send EOS signal to IIS server when stopping the event
    */
  var EventStopBehavior: js.UndefOr[SmoothGroupEventStopBehavior] = js.undefined
  
  /**
    * Size in seconds of file cache for streaming outputs.
    */
  var FilecacheDuration: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Length of mp4 fragments to generate (in seconds). Fragment length must be compatible with GOP size and framerate.
    */
  var FragmentLength: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * Parameter that control output group behavior on input loss.
    */
  var InputLossAction: js.UndefOr[InputLossActionForMsSmoothOut] = js.undefined
  
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * Number of seconds before initiating a restart due to output failure, due to exhausting the numRetries on one segment, or exceeding filecacheDuration.
    */
  var RestartDelay: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * useInputSegmentation has been deprecated. The configured segment size is always used.
    */
  var SegmentationMode: js.UndefOr[SmoothGroupSegmentationMode] = js.undefined
  
  /**
    * Number of milliseconds to delay the output from the second pipeline.
    */
  var SendDelayMs: js.UndefOr[integerMin0Max10000] = js.undefined
  
  /**
    * Identifies the type of data to place in the sparse track:
  - SCTE35: Insert SCTE-35 messages from the source content. With each message, insert an IDR frame to start a new segment.
  - SCTE35_WITHOUT_SEGMENTATION: Insert SCTE-35 messages from the source content. With each message, insert an IDR frame but don't start a new segment.
  - NONE: Don't generate a sparse track for any outputs in this output group.
    */
  var SparseTrackType: js.UndefOr[SmoothGroupSparseTrackType] = js.undefined
  
  /**
    * When set to send, send stream manifest so publishing point doesn't start until all streams start.
    */
  var StreamManifestBehavior: js.UndefOr[SmoothGroupStreamManifestBehavior] = js.undefined
  
  /**
    * Timestamp offset for the event.  Only used if timestampOffsetMode is set to useConfiguredOffset.
    */
  var TimestampOffset: js.UndefOr[string] = js.undefined
  
  /**
    * Type of timestamp date offset to use.
  - useEventStartDate: Use the date the event was started as the offset
  - useConfiguredOffset: Use an explicitly configured date as the offset
    */
  var TimestampOffsetMode: js.UndefOr[SmoothGroupTimestampOffsetMode] = js.undefined
}
object MsSmoothGroupSettings {
  
  inline def apply(Destination: OutputLocationRef): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
  
  extension [Self <: MsSmoothGroupSettings](x: Self) {
    
    inline def setAcquisitionPointId(value: string): Self = StObject.set(x, "AcquisitionPointId", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionPointIdUndefined: Self = StObject.set(x, "AcquisitionPointId", js.undefined)
    
    inline def setAudioOnlyTimecodeControl(value: SmoothGroupAudioOnlyTimecodeControl): Self = StObject.set(x, "AudioOnlyTimecodeControl", value.asInstanceOf[js.Any])
    
    inline def setAudioOnlyTimecodeControlUndefined: Self = StObject.set(x, "AudioOnlyTimecodeControl", js.undefined)
    
    inline def setCertificateMode(value: SmoothGroupCertificateMode): Self = StObject.set(x, "CertificateMode", value.asInstanceOf[js.Any])
    
    inline def setCertificateModeUndefined: Self = StObject.set(x, "CertificateMode", js.undefined)
    
    inline def setConnectionRetryInterval(value: integerMin0): Self = StObject.set(x, "ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    inline def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "ConnectionRetryInterval", js.undefined)
    
    inline def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: string): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdMode(value: SmoothGroupEventIdMode): Self = StObject.set(x, "EventIdMode", value.asInstanceOf[js.Any])
    
    inline def setEventIdModeUndefined: Self = StObject.set(x, "EventIdMode", js.undefined)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setEventStopBehavior(value: SmoothGroupEventStopBehavior): Self = StObject.set(x, "EventStopBehavior", value.asInstanceOf[js.Any])
    
    inline def setEventStopBehaviorUndefined: Self = StObject.set(x, "EventStopBehavior", js.undefined)
    
    inline def setFilecacheDuration(value: integerMin0): Self = StObject.set(x, "FilecacheDuration", value.asInstanceOf[js.Any])
    
    inline def setFilecacheDurationUndefined: Self = StObject.set(x, "FilecacheDuration", js.undefined)
    
    inline def setFragmentLength(value: integerMin1): Self = StObject.set(x, "FragmentLength", value.asInstanceOf[js.Any])
    
    inline def setFragmentLengthUndefined: Self = StObject.set(x, "FragmentLength", js.undefined)
    
    inline def setInputLossAction(value: InputLossActionForMsSmoothOut): Self = StObject.set(x, "InputLossAction", value.asInstanceOf[js.Any])
    
    inline def setInputLossActionUndefined: Self = StObject.set(x, "InputLossAction", js.undefined)
    
    inline def setNumRetries(value: integerMin0): Self = StObject.set(x, "NumRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "NumRetries", js.undefined)
    
    inline def setRestartDelay(value: integerMin0): Self = StObject.set(x, "RestartDelay", value.asInstanceOf[js.Any])
    
    inline def setRestartDelayUndefined: Self = StObject.set(x, "RestartDelay", js.undefined)
    
    inline def setSegmentationMode(value: SmoothGroupSegmentationMode): Self = StObject.set(x, "SegmentationMode", value.asInstanceOf[js.Any])
    
    inline def setSegmentationModeUndefined: Self = StObject.set(x, "SegmentationMode", js.undefined)
    
    inline def setSendDelayMs(value: integerMin0Max10000): Self = StObject.set(x, "SendDelayMs", value.asInstanceOf[js.Any])
    
    inline def setSendDelayMsUndefined: Self = StObject.set(x, "SendDelayMs", js.undefined)
    
    inline def setSparseTrackType(value: SmoothGroupSparseTrackType): Self = StObject.set(x, "SparseTrackType", value.asInstanceOf[js.Any])
    
    inline def setSparseTrackTypeUndefined: Self = StObject.set(x, "SparseTrackType", js.undefined)
    
    inline def setStreamManifestBehavior(value: SmoothGroupStreamManifestBehavior): Self = StObject.set(x, "StreamManifestBehavior", value.asInstanceOf[js.Any])
    
    inline def setStreamManifestBehaviorUndefined: Self = StObject.set(x, "StreamManifestBehavior", js.undefined)
    
    inline def setTimestampOffset(value: string): Self = StObject.set(x, "TimestampOffset", value.asInstanceOf[js.Any])
    
    inline def setTimestampOffsetMode(value: SmoothGroupTimestampOffsetMode): Self = StObject.set(x, "TimestampOffsetMode", value.asInstanceOf[js.Any])
    
    inline def setTimestampOffsetModeUndefined: Self = StObject.set(x, "TimestampOffsetMode", js.undefined)
    
    inline def setTimestampOffsetUndefined: Self = StObject.set(x, "TimestampOffset", js.undefined)
  }
}
