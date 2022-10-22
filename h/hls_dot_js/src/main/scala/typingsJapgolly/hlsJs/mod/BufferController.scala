package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLMediaElement
import typingsJapgolly.hlsJs.mod.Events.BUFFER_APPENDING
import typingsJapgolly.hlsJs.mod.Events.BUFFER_CODECS
import typingsJapgolly.hlsJs.mod.Events.BUFFER_EOS
import typingsJapgolly.hlsJs.mod.Events.BUFFER_FLUSHING
import typingsJapgolly.hlsJs.mod.Events.FRAG_PARSED
import typingsJapgolly.hlsJs.mod.Events.LEVEL_UPDATED
import typingsJapgolly.hlsJs.mod.Events.MANIFEST_PARSED
import typingsJapgolly.hlsJs.mod.Events.MEDIA_ATTACHING
import typingsJapgolly.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferController
  extends StObject
     with ComponentAPI {
  
  /* private */ var _bufferCodecEventsTotal: Any
  
  /* private */ var _initSourceBuffer: Any
  
  /* private */ var _objectUrl: Any
  
  /* private */ var _onMediaSourceClose: Any
  
  /* private */ var _onMediaSourceEnded: Any
  
  /* private */ var _onMediaSourceOpen: Any
  
  /* private */ var _onSBUpdateEnd: Any
  
  /* private */ var _onSBUpdateError: Any
  
  /* private */ var _onSBUpdateStart: Any
  
  /* private */ var addBufferListener: Any
  
  /* protected */ def appendChangeType(`type`: Any, mimeType: Any): Unit
  
  var appendError: Double
  
  /* private */ var appendExecutor: Any
  
  /* private */ var blockBuffers: Any
  
  var bufferCodecEventsExpected: Double
  
  /* protected */ def checkPendingTracks(): Unit
  
  /* protected */ def createSourceBuffers(tracks: TrackSet): Unit
  
  /* private */ var details: Any
  
  def flushBackBuffer(): Unit
  
  /* private */ var getSourceBufferTypes: Any
  
  def hasSourceTypes(): Boolean
  
  /* private */ var hls: Any
  
  /* private */ var listeners: Any
  
  var media: HTMLMediaElement | Null
  
  var mediaSource: MediaSource | Null
  
  /* protected */ def onBufferAppending(event: BUFFER_APPENDING, eventData: BufferAppendingData): Unit
  
  /* protected */ def onBufferCodecs(event: BUFFER_CODECS, data: BufferCodecsData): Unit
  
  /* protected */ def onBufferEos(event: BUFFER_EOS, data: BufferEOSData): Unit
  
  /* protected */ def onBufferFlushing(event: BUFFER_FLUSHING, data: BufferFlushingData): Unit
  
  /* protected */ def onBufferReset(): Unit
  
  /* private */ var onFragChanged: Any
  
  /* protected */ def onFragParsed(event: FRAG_PARSED, data: FragParsedData): Unit
  
  /* protected */ def onLevelUpdated(event: LEVEL_UPDATED, hasDetails: LevelUpdatedData): Unit
  
  /* protected */ def onManifestParsed(event: MANIFEST_PARSED, data: ManifestParsedData): Unit
  
  /* protected */ def onMediaAttaching(event: MEDIA_ATTACHING, data: MediaAttachingData): Unit
  
  /* protected */ def onMediaDetaching(): Unit
  
  /* private */ var operationQueue: Any
  
  var pendingTracks: TrackSet
  
  /* protected */ def registerListeners(): Unit
  
  /* private */ var removeBufferListeners: Any
  
  /* private */ var removeExecutor: Any
  
  var sourceBuffer: SourceBuffers
  
  var tracks: TrackSet
  
  /* protected */ def unregisterListeners(): Unit
  
  /**
    * Update Media Source duration to current level duration or override to Infinity if configuration parameter
    * 'liveDurationInfinity` is set to `true`
    * More details: https://github.com/video-dev/hls.js/issues/355
    */
  /* private */ var updateMediaElementDuration: Any
  
  def updateSeekableRange(levelDetails: Any): Unit
}
object BufferController {
  
  inline def apply(
    _bufferCodecEventsTotal: Any,
    _initSourceBuffer: Any,
    _objectUrl: Any,
    _onMediaSourceClose: Any,
    _onMediaSourceEnded: Any,
    _onMediaSourceOpen: Any,
    _onSBUpdateEnd: Any,
    _onSBUpdateError: Any,
    _onSBUpdateStart: Any,
    addBufferListener: Any,
    appendChangeType: (Any, Any) => Callback,
    appendError: Double,
    appendExecutor: Any,
    blockBuffers: Any,
    bufferCodecEventsExpected: Double,
    checkPendingTracks: Callback,
    createSourceBuffers: TrackSet => Callback,
    destroy: Callback,
    details: Any,
    flushBackBuffer: Callback,
    getSourceBufferTypes: Any,
    hasSourceTypes: CallbackTo[Boolean],
    hls: Any,
    listeners: Any,
    onBufferAppending: (BUFFER_APPENDING, BufferAppendingData) => Callback,
    onBufferCodecs: (BUFFER_CODECS, BufferCodecsData) => Callback,
    onBufferEos: (BUFFER_EOS, BufferEOSData) => Callback,
    onBufferFlushing: (BUFFER_FLUSHING, BufferFlushingData) => Callback,
    onBufferReset: Callback,
    onFragChanged: Any,
    onFragParsed: (FRAG_PARSED, FragParsedData) => Callback,
    onLevelUpdated: (LEVEL_UPDATED, LevelUpdatedData) => Callback,
    onManifestParsed: (MANIFEST_PARSED, ManifestParsedData) => Callback,
    onMediaAttaching: (MEDIA_ATTACHING, MediaAttachingData) => Callback,
    onMediaDetaching: Callback,
    operationQueue: Any,
    pendingTracks: TrackSet,
    registerListeners: Callback,
    removeBufferListeners: Any,
    removeExecutor: Any,
    sourceBuffer: SourceBuffers,
    tracks: TrackSet,
    unregisterListeners: Callback,
    updateMediaElementDuration: Any,
    updateSeekableRange: Any => Callback
  ): BufferController = {
    val __obj = js.Dynamic.literal(_bufferCodecEventsTotal = _bufferCodecEventsTotal.asInstanceOf[js.Any], _initSourceBuffer = _initSourceBuffer.asInstanceOf[js.Any], _objectUrl = _objectUrl.asInstanceOf[js.Any], _onMediaSourceClose = _onMediaSourceClose.asInstanceOf[js.Any], _onMediaSourceEnded = _onMediaSourceEnded.asInstanceOf[js.Any], _onMediaSourceOpen = _onMediaSourceOpen.asInstanceOf[js.Any], _onSBUpdateEnd = _onSBUpdateEnd.asInstanceOf[js.Any], _onSBUpdateError = _onSBUpdateError.asInstanceOf[js.Any], _onSBUpdateStart = _onSBUpdateStart.asInstanceOf[js.Any], addBufferListener = addBufferListener.asInstanceOf[js.Any], appendChangeType = js.Any.fromFunction2((t0: Any, t1: Any) => (appendChangeType(t0, t1)).runNow()), appendError = appendError.asInstanceOf[js.Any], appendExecutor = appendExecutor.asInstanceOf[js.Any], blockBuffers = blockBuffers.asInstanceOf[js.Any], bufferCodecEventsExpected = bufferCodecEventsExpected.asInstanceOf[js.Any], checkPendingTracks = checkPendingTracks.toJsFn, createSourceBuffers = js.Any.fromFunction1((t0: TrackSet) => createSourceBuffers(t0).runNow()), destroy = destroy.toJsFn, details = details.asInstanceOf[js.Any], flushBackBuffer = flushBackBuffer.toJsFn, getSourceBufferTypes = getSourceBufferTypes.asInstanceOf[js.Any], hasSourceTypes = hasSourceTypes.toJsFn, hls = hls.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], onBufferAppending = js.Any.fromFunction2((t0: BUFFER_APPENDING, t1: BufferAppendingData) => (onBufferAppending(t0, t1)).runNow()), onBufferCodecs = js.Any.fromFunction2((t0: BUFFER_CODECS, t1: BufferCodecsData) => (onBufferCodecs(t0, t1)).runNow()), onBufferEos = js.Any.fromFunction2((t0: BUFFER_EOS, t1: BufferEOSData) => (onBufferEos(t0, t1)).runNow()), onBufferFlushing = js.Any.fromFunction2((t0: BUFFER_FLUSHING, t1: BufferFlushingData) => (onBufferFlushing(t0, t1)).runNow()), onBufferReset = onBufferReset.toJsFn, onFragChanged = onFragChanged.asInstanceOf[js.Any], onFragParsed = js.Any.fromFunction2((t0: FRAG_PARSED, t1: FragParsedData) => (onFragParsed(t0, t1)).runNow()), onLevelUpdated = js.Any.fromFunction2((t0: LEVEL_UPDATED, t1: LevelUpdatedData) => (onLevelUpdated(t0, t1)).runNow()), onManifestParsed = js.Any.fromFunction2((t0: MANIFEST_PARSED, t1: ManifestParsedData) => (onManifestParsed(t0, t1)).runNow()), onMediaAttaching = js.Any.fromFunction2((t0: MEDIA_ATTACHING, t1: MediaAttachingData) => (onMediaAttaching(t0, t1)).runNow()), onMediaDetaching = onMediaDetaching.toJsFn, operationQueue = operationQueue.asInstanceOf[js.Any], pendingTracks = pendingTracks.asInstanceOf[js.Any], registerListeners = registerListeners.toJsFn, removeBufferListeners = removeBufferListeners.asInstanceOf[js.Any], removeExecutor = removeExecutor.asInstanceOf[js.Any], sourceBuffer = sourceBuffer.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], unregisterListeners = unregisterListeners.toJsFn, updateMediaElementDuration = updateMediaElementDuration.asInstanceOf[js.Any], updateSeekableRange = js.Any.fromFunction1((t0: Any) => updateSeekableRange(t0).runNow()), media = null, mediaSource = null)
    __obj.asInstanceOf[BufferController]
  }
  
  extension [Self <: BufferController](x: Self) {
    
    inline def setAddBufferListener(value: Any): Self = StObject.set(x, "addBufferListener", value.asInstanceOf[js.Any])
    
    inline def setAppendChangeType(value: (Any, Any) => Callback): Self = StObject.set(x, "appendChangeType", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setAppendError(value: Double): Self = StObject.set(x, "appendError", value.asInstanceOf[js.Any])
    
    inline def setAppendExecutor(value: Any): Self = StObject.set(x, "appendExecutor", value.asInstanceOf[js.Any])
    
    inline def setBlockBuffers(value: Any): Self = StObject.set(x, "blockBuffers", value.asInstanceOf[js.Any])
    
    inline def setBufferCodecEventsExpected(value: Double): Self = StObject.set(x, "bufferCodecEventsExpected", value.asInstanceOf[js.Any])
    
    inline def setCheckPendingTracks(value: Callback): Self = StObject.set(x, "checkPendingTracks", value.toJsFn)
    
    inline def setCreateSourceBuffers(value: TrackSet => Callback): Self = StObject.set(x, "createSourceBuffers", js.Any.fromFunction1((t0: TrackSet) => value(t0).runNow()))
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFlushBackBuffer(value: Callback): Self = StObject.set(x, "flushBackBuffer", value.toJsFn)
    
    inline def setGetSourceBufferTypes(value: Any): Self = StObject.set(x, "getSourceBufferTypes", value.asInstanceOf[js.Any])
    
    inline def setHasSourceTypes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSourceTypes", value.toJsFn)
    
    inline def setHls(value: Any): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: HTMLMediaElement): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaSource(value: MediaSource): Self = StObject.set(x, "mediaSource", value.asInstanceOf[js.Any])
    
    inline def setMediaSourceNull: Self = StObject.set(x, "mediaSource", null)
    
    inline def setOnBufferAppending(value: (BUFFER_APPENDING, BufferAppendingData) => Callback): Self = StObject.set(x, "onBufferAppending", js.Any.fromFunction2((t0: BUFFER_APPENDING, t1: BufferAppendingData) => (value(t0, t1)).runNow()))
    
    inline def setOnBufferCodecs(value: (BUFFER_CODECS, BufferCodecsData) => Callback): Self = StObject.set(x, "onBufferCodecs", js.Any.fromFunction2((t0: BUFFER_CODECS, t1: BufferCodecsData) => (value(t0, t1)).runNow()))
    
    inline def setOnBufferEos(value: (BUFFER_EOS, BufferEOSData) => Callback): Self = StObject.set(x, "onBufferEos", js.Any.fromFunction2((t0: BUFFER_EOS, t1: BufferEOSData) => (value(t0, t1)).runNow()))
    
    inline def setOnBufferFlushing(value: (BUFFER_FLUSHING, BufferFlushingData) => Callback): Self = StObject.set(x, "onBufferFlushing", js.Any.fromFunction2((t0: BUFFER_FLUSHING, t1: BufferFlushingData) => (value(t0, t1)).runNow()))
    
    inline def setOnBufferReset(value: Callback): Self = StObject.set(x, "onBufferReset", value.toJsFn)
    
    inline def setOnFragChanged(value: Any): Self = StObject.set(x, "onFragChanged", value.asInstanceOf[js.Any])
    
    inline def setOnFragParsed(value: (FRAG_PARSED, FragParsedData) => Callback): Self = StObject.set(x, "onFragParsed", js.Any.fromFunction2((t0: FRAG_PARSED, t1: FragParsedData) => (value(t0, t1)).runNow()))
    
    inline def setOnLevelUpdated(value: (LEVEL_UPDATED, LevelUpdatedData) => Callback): Self = StObject.set(x, "onLevelUpdated", js.Any.fromFunction2((t0: LEVEL_UPDATED, t1: LevelUpdatedData) => (value(t0, t1)).runNow()))
    
    inline def setOnManifestParsed(value: (MANIFEST_PARSED, ManifestParsedData) => Callback): Self = StObject.set(x, "onManifestParsed", js.Any.fromFunction2((t0: MANIFEST_PARSED, t1: ManifestParsedData) => (value(t0, t1)).runNow()))
    
    inline def setOnMediaAttaching(value: (MEDIA_ATTACHING, MediaAttachingData) => Callback): Self = StObject.set(x, "onMediaAttaching", js.Any.fromFunction2((t0: MEDIA_ATTACHING, t1: MediaAttachingData) => (value(t0, t1)).runNow()))
    
    inline def setOnMediaDetaching(value: Callback): Self = StObject.set(x, "onMediaDetaching", value.toJsFn)
    
    inline def setOperationQueue(value: Any): Self = StObject.set(x, "operationQueue", value.asInstanceOf[js.Any])
    
    inline def setPendingTracks(value: TrackSet): Self = StObject.set(x, "pendingTracks", value.asInstanceOf[js.Any])
    
    inline def setRegisterListeners(value: Callback): Self = StObject.set(x, "registerListeners", value.toJsFn)
    
    inline def setRemoveBufferListeners(value: Any): Self = StObject.set(x, "removeBufferListeners", value.asInstanceOf[js.Any])
    
    inline def setRemoveExecutor(value: Any): Self = StObject.set(x, "removeExecutor", value.asInstanceOf[js.Any])
    
    inline def setSourceBuffer(value: SourceBuffers): Self = StObject.set(x, "sourceBuffer", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: TrackSet): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setUnregisterListeners(value: Callback): Self = StObject.set(x, "unregisterListeners", value.toJsFn)
    
    inline def setUpdateMediaElementDuration(value: Any): Self = StObject.set(x, "updateMediaElementDuration", value.asInstanceOf[js.Any])
    
    inline def setUpdateSeekableRange(value: Any => Callback): Self = StObject.set(x, "updateSeekableRange", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def set_bufferCodecEventsTotal(value: Any): Self = StObject.set(x, "_bufferCodecEventsTotal", value.asInstanceOf[js.Any])
    
    inline def set_initSourceBuffer(value: Any): Self = StObject.set(x, "_initSourceBuffer", value.asInstanceOf[js.Any])
    
    inline def set_objectUrl(value: Any): Self = StObject.set(x, "_objectUrl", value.asInstanceOf[js.Any])
    
    inline def set_onMediaSourceClose(value: Any): Self = StObject.set(x, "_onMediaSourceClose", value.asInstanceOf[js.Any])
    
    inline def set_onMediaSourceEnded(value: Any): Self = StObject.set(x, "_onMediaSourceEnded", value.asInstanceOf[js.Any])
    
    inline def set_onMediaSourceOpen(value: Any): Self = StObject.set(x, "_onMediaSourceOpen", value.asInstanceOf[js.Any])
    
    inline def set_onSBUpdateEnd(value: Any): Self = StObject.set(x, "_onSBUpdateEnd", value.asInstanceOf[js.Any])
    
    inline def set_onSBUpdateError(value: Any): Self = StObject.set(x, "_onSBUpdateError", value.asInstanceOf[js.Any])
    
    inline def set_onSBUpdateStart(value: Any): Self = StObject.set(x, "_onSBUpdateStart", value.asInstanceOf[js.Any])
  }
}
