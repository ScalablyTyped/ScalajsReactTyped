package typingsJapgolly.chrome.chrome.cast.media

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chrome.chrome.cast.Error
import typingsJapgolly.chrome.chrome.cast.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  var activeTrackIds: js.Array[Double]
  
  /**
    * @param listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit
  
  var currentItemId: Double
  
  /** @deprecated. Use getEstimatedTime instead */
  var currentTime: Double
  
  var customData: js.Object
  
  /**
    * @param editTracksInfoRequest
    * @param successCallback
    * @param errorCallback
    */
  def editTracksInfo(
    editTracksInfoRequest: EditTracksInfoRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @return
    * @suppress {deprecated} Uses currentTime member to compute estimated time.
    */
  def getEstimatedTime(): Double
  
  /**
    * @param getStatusRequest
    * @param successCallback
    * @param errorCallback
    */
  def getStatus(
    getStatusRequest: GetStatusRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  var idleReason: IdleReason | Null
  
  var items: js.Array[QueueItem]
  
  var liveSeekableRange: js.UndefOr[LiveSeekableRange] = js.undefined
  
  var loadingItemId: Double
  
  var media: MediaInfo
  
  var mediaSessionId: Double
  
  /**
    * @param pauseRequest
    * @param successCallback
    * @param errorCallback
    */
  def pause(
    pauseRequest: PauseRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param playRequest
    * @param successCallback
    * @param errorCallback
    */
  def play(
    playRequest: PlayRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  var playbackRate: Double
  
  var playerState: PlayerState
  
  var preloadedItemId: Double
  
  /**
    * @param item
    * @param successCallback
    * @param errorCallback
    */
  def queueAppendItem(
    item: QueueItem,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param queueInsertItemsRequest
    * @param successCallback
    * @param errorCallback
    */
  def queueInsertItems(
    queueInsertItemsRequest: QueueInsertItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param itemId
    * @param successCallback
    * @param errorCallback
    */
  def queueJumpToItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  
  /**
    * @param itemId
    * @param newIndex
    * @param successCallback
    * @param errorCallback
    */
  def queueMoveItemToNewIndex(
    itemId: Double,
    newIndex: Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param successCallback
    * @param errorCallback
    */
  def queueNext(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  
  /**
    * @param successCallback
    * @param errorCallback
    */
  def queuePrev(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  
  /**
    * @param itemId
    * @param successCallback
    * @param errorCallback
    */
  def queueRemoveItem(itemId: Double, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit
  
  /**
    * @param queueReorderItemsRequest
    * @param successCallback
    * @param errorCallback
    */
  def queueReorderItems(
    queueReorderItemsRequest: QueueReorderItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param repeatMode
    * @param successCallback
    * @param errorCallback
    */
  def queueSetRepeatMode(
    repeatMode: RepeatMode,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param queueUpdateItemsRequest
    * @param successCallback
    * @param errorCallback
    */
  def queueUpdateItems(
    queueUpdateItemsRequest: QueueUpdateItemsRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param listener
    */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit
  
  var repeatMode: RepeatMode
  
  /**
    * @param seekRequest
    * @param successCallback
    * @param errorCallback
    */
  def seek(
    seekRequest: SeekRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  var sessionId: String
  
  /**
    * @param volumeRequest
    * @param successCallback
    * @param errorCallback
    */
  def setVolume(
    volumeRequest: VolumeRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  /**
    * @param stopRequest
    * @param successCallback
    * @param errorCallback
    */
  def stop(
    stopRequest: StopRequest,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit
  
  var supportedMediaCommands: js.Array[MediaCommand]
  
  /**
    * @param command
    * @return whether or not the receiver supports the given chrome.cast.media.MediaCommand
    */
  def supportsCommand(command: MediaCommand): Boolean
  
  var volume: Volume
}
object Media {
  
  inline def apply(
    activeTrackIds: js.Array[Double],
    addUpdateListener: js.Function1[/* isAlive */ Boolean, Unit] => Callback,
    currentItemId: Double,
    currentTime: Double,
    customData: js.Object,
    editTracksInfo: (EditTracksInfoRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    getEstimatedTime: CallbackTo[Double],
    getStatus: (GetStatusRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    items: js.Array[QueueItem],
    loadingItemId: Double,
    media: MediaInfo,
    mediaSessionId: Double,
    pause: (PauseRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    play: (PlayRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    playbackRate: Double,
    playerState: PlayerState,
    preloadedItemId: Double,
    queueAppendItem: (QueueItem, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueInsertItems: (QueueInsertItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueJumpToItem: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueMoveItemToNewIndex: (Double, Double, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueNext: (js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queuePrev: (js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueRemoveItem: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueReorderItems: (QueueReorderItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueSetRepeatMode: (RepeatMode, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    queueUpdateItems: (QueueUpdateItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    removeUpdateListener: js.Function1[/* isAlive */ Boolean, Unit] => Callback,
    repeatMode: RepeatMode,
    seek: (SeekRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    sessionId: String,
    setVolume: (VolumeRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    stop: (StopRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback,
    supportedMediaCommands: js.Array[MediaCommand],
    supportsCommand: MediaCommand => Boolean,
    volume: Volume
  ): Media = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], addUpdateListener = js.Any.fromFunction1((t0: js.Function1[/* isAlive */ Boolean, Unit]) => addUpdateListener(t0).runNow()), currentItemId = currentItemId.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], editTracksInfo = js.Any.fromFunction3((t0: EditTracksInfoRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (editTracksInfo(t0, t1, t2)).runNow()), getEstimatedTime = getEstimatedTime.toJsFn, getStatus = js.Any.fromFunction3((t0: GetStatusRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (getStatus(t0, t1, t2)).runNow()), items = items.asInstanceOf[js.Any], loadingItemId = loadingItemId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mediaSessionId = mediaSessionId.asInstanceOf[js.Any], pause = js.Any.fromFunction3((t0: PauseRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (pause(t0, t1, t2)).runNow()), play = js.Any.fromFunction3((t0: PlayRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (play(t0, t1, t2)).runNow()), playbackRate = playbackRate.asInstanceOf[js.Any], playerState = playerState.asInstanceOf[js.Any], preloadedItemId = preloadedItemId.asInstanceOf[js.Any], queueAppendItem = js.Any.fromFunction3((t0: QueueItem, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueAppendItem(t0, t1, t2)).runNow()), queueInsertItems = js.Any.fromFunction3((t0: QueueInsertItemsRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueInsertItems(t0, t1, t2)).runNow()), queueJumpToItem = js.Any.fromFunction3((t0: Double, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueJumpToItem(t0, t1, t2)).runNow()), queueMoveItemToNewIndex = js.Any.fromFunction4((t0: Double, t1: Double, t2: js.Function, t3: js.Function1[/* error */ Error, Unit]) => (queueMoveItemToNewIndex(t0, t1, t2, t3)).runNow()), queueNext = js.Any.fromFunction2((t0: js.Function, t1: js.Function1[/* error */ Error, Unit]) => (queueNext(t0, t1)).runNow()), queuePrev = js.Any.fromFunction2((t0: js.Function, t1: js.Function1[/* error */ Error, Unit]) => (queuePrev(t0, t1)).runNow()), queueRemoveItem = js.Any.fromFunction3((t0: Double, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueRemoveItem(t0, t1, t2)).runNow()), queueReorderItems = js.Any.fromFunction3((t0: QueueReorderItemsRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueReorderItems(t0, t1, t2)).runNow()), queueSetRepeatMode = js.Any.fromFunction3((t0: RepeatMode, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueSetRepeatMode(t0, t1, t2)).runNow()), queueUpdateItems = js.Any.fromFunction3((t0: QueueUpdateItemsRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (queueUpdateItems(t0, t1, t2)).runNow()), removeUpdateListener = js.Any.fromFunction1((t0: js.Function1[/* isAlive */ Boolean, Unit]) => removeUpdateListener(t0).runNow()), repeatMode = repeatMode.asInstanceOf[js.Any], seek = js.Any.fromFunction3((t0: SeekRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (seek(t0, t1, t2)).runNow()), sessionId = sessionId.asInstanceOf[js.Any], setVolume = js.Any.fromFunction3((t0: VolumeRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (setVolume(t0, t1, t2)).runNow()), stop = js.Any.fromFunction3((t0: StopRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (stop(t0, t1, t2)).runNow()), supportedMediaCommands = supportedMediaCommands.asInstanceOf[js.Any], supportsCommand = js.Any.fromFunction1(supportsCommand), volume = volume.asInstanceOf[js.Any], idleReason = null)
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setActiveTrackIds(value: js.Array[Double]): Self = StObject.set(x, "activeTrackIds", value.asInstanceOf[js.Any])
    
    inline def setActiveTrackIdsVarargs(value: Double*): Self = StObject.set(x, "activeTrackIds", js.Array(value*))
    
    inline def setAddUpdateListener(value: js.Function1[/* isAlive */ Boolean, Unit] => Callback): Self = StObject.set(x, "addUpdateListener", js.Any.fromFunction1((t0: js.Function1[/* isAlive */ Boolean, Unit]) => value(t0).runNow()))
    
    inline def setCurrentItemId(value: Double): Self = StObject.set(x, "currentItemId", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setEditTracksInfo(value: (EditTracksInfoRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "editTracksInfo", js.Any.fromFunction3((t0: EditTracksInfoRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetEstimatedTime(value: CallbackTo[Double]): Self = StObject.set(x, "getEstimatedTime", value.toJsFn)
    
    inline def setGetStatus(value: (GetStatusRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "getStatus", js.Any.fromFunction3((t0: GetStatusRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setIdleReason(value: IdleReason): Self = StObject.set(x, "idleReason", value.asInstanceOf[js.Any])
    
    inline def setIdleReasonNull: Self = StObject.set(x, "idleReason", null)
    
    inline def setItems(value: js.Array[QueueItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: QueueItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLiveSeekableRange(value: LiveSeekableRange): Self = StObject.set(x, "liveSeekableRange", value.asInstanceOf[js.Any])
    
    inline def setLiveSeekableRangeUndefined: Self = StObject.set(x, "liveSeekableRange", js.undefined)
    
    inline def setLoadingItemId(value: Double): Self = StObject.set(x, "loadingItemId", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: MediaInfo): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaSessionId(value: Double): Self = StObject.set(x, "mediaSessionId", value.asInstanceOf[js.Any])
    
    inline def setPause(value: (PauseRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "pause", js.Any.fromFunction3((t0: PauseRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setPlay(value: (PlayRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "play", js.Any.fromFunction3((t0: PlayRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlayerState(value: PlayerState): Self = StObject.set(x, "playerState", value.asInstanceOf[js.Any])
    
    inline def setPreloadedItemId(value: Double): Self = StObject.set(x, "preloadedItemId", value.asInstanceOf[js.Any])
    
    inline def setQueueAppendItem(value: (QueueItem, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueAppendItem", js.Any.fromFunction3((t0: QueueItem, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setQueueInsertItems(value: (QueueInsertItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueInsertItems", js.Any.fromFunction3((t0: QueueInsertItemsRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setQueueJumpToItem(value: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueJumpToItem", js.Any.fromFunction3((t0: Double, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setQueueMoveItemToNewIndex(value: (Double, Double, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueMoveItemToNewIndex", js.Any.fromFunction4((t0: Double, t1: Double, t2: js.Function, t3: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setQueueNext(value: (js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueNext", js.Any.fromFunction2((t0: js.Function, t1: js.Function1[/* error */ Error, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setQueuePrev(value: (js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queuePrev", js.Any.fromFunction2((t0: js.Function, t1: js.Function1[/* error */ Error, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setQueueRemoveItem(value: (Double, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueRemoveItem", js.Any.fromFunction3((t0: Double, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setQueueReorderItems(value: (QueueReorderItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueReorderItems", js.Any.fromFunction3((t0: QueueReorderItemsRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setQueueSetRepeatMode(value: (RepeatMode, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueSetRepeatMode", js.Any.fromFunction3((t0: RepeatMode, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setQueueUpdateItems(value: (QueueUpdateItemsRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "queueUpdateItems", js.Any.fromFunction3((t0: QueueUpdateItemsRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveUpdateListener(value: js.Function1[/* isAlive */ Boolean, Unit] => Callback): Self = StObject.set(x, "removeUpdateListener", js.Any.fromFunction1((t0: js.Function1[/* isAlive */ Boolean, Unit]) => value(t0).runNow()))
    
    inline def setRepeatMode(value: RepeatMode): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
    
    inline def setSeek(value: (SeekRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction3((t0: SeekRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSetVolume(value: (VolumeRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "setVolume", js.Any.fromFunction3((t0: VolumeRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setStop(value: (StopRequest, js.Function, js.Function1[/* error */ Error, Unit]) => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction3((t0: StopRequest, t1: js.Function, t2: js.Function1[/* error */ Error, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSupportedMediaCommands(value: js.Array[MediaCommand]): Self = StObject.set(x, "supportedMediaCommands", value.asInstanceOf[js.Any])
    
    inline def setSupportedMediaCommandsVarargs(value: MediaCommand*): Self = StObject.set(x, "supportedMediaCommands", js.Array(value*))
    
    inline def setSupportsCommand(value: MediaCommand => Boolean): Self = StObject.set(x, "supportsCommand", js.Any.fromFunction1(value))
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
