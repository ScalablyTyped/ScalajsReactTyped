package typingsJapgolly.winrtUwp.Windows.Media

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
trait SystemMediaTransportControlsDisplayUpdater extends StObject {
  
  /** Gets or sets the media id of the app. */
  var appMediaId: String
  
  /** Clears out all of the media metadata. */
  def clearAll(): Unit
  
  /**
    * Initialize the media properties using the specified file.
    * @param type The type of media.
    * @param source The file to initialize the media properties.
    * @return When this method completes, it returns a boolean value that indicates true if the operation succeeded; otherwise, false.
    */
  def copyFromFileAsync(`type`: MediaPlaybackType, source: StorageFile): IPromiseWithIAsyncOperation[Boolean]
  
  /** Gets the image properties associated with the currently playing media. */
  var imageProperties: ImageDisplayProperties
  
  /** Gets the music properties associated with the currently playing media. */
  var musicProperties: MusicDisplayProperties
  
  /** Gets or sets thumbnail image associated with the currently playing media. */
  var thumbnail: RandomAccessStreamReference
  
  /** Gets or sets the type of media. */
  var `type`: MediaPlaybackType
  
  /** Updates the metadata for the currently playing media. */
  def update(): Unit
  
  /** Gets the video properties associated with the currently playing media. */
  var videoProperties: VideoDisplayProperties
}
object SystemMediaTransportControlsDisplayUpdater {
  
  inline def apply(
    appMediaId: String,
    clearAll: Callback,
    copyFromFileAsync: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean],
    imageProperties: ImageDisplayProperties,
    musicProperties: MusicDisplayProperties,
    thumbnail: RandomAccessStreamReference,
    `type`: MediaPlaybackType,
    update: Callback,
    videoProperties: VideoDisplayProperties
  ): SystemMediaTransportControlsDisplayUpdater = {
    val __obj = js.Dynamic.literal(appMediaId = appMediaId.asInstanceOf[js.Any], clearAll = clearAll.toJsFn, copyFromFileAsync = js.Any.fromFunction2(copyFromFileAsync), imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], update = update.toJsFn, videoProperties = videoProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsDisplayUpdater]
  }
  
  extension [Self <: SystemMediaTransportControlsDisplayUpdater](x: Self) {
    
    inline def setAppMediaId(value: String): Self = StObject.set(x, "appMediaId", value.asInstanceOf[js.Any])
    
    inline def setClearAll(value: Callback): Self = StObject.set(x, "clearAll", value.toJsFn)
    
    inline def setCopyFromFileAsync(value: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "copyFromFileAsync", js.Any.fromFunction2(value))
    
    inline def setImageProperties(value: ImageDisplayProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
    
    inline def setMusicProperties(value: MusicDisplayProperties): Self = StObject.set(x, "musicProperties", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: RandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaPlaybackType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    
    inline def setVideoProperties(value: VideoDisplayProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
  }
}
