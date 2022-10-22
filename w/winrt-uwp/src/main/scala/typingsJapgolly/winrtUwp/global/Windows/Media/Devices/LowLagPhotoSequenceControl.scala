package typingsJapgolly.winrtUwp.global.Windows.Media.Devices

import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for managing the low shutter lag photo sequence mode on the capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.LowLagPhotoSequenceControl")
@js.native
open class LowLagPhotoSequenceControl ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Devices.LowLagPhotoSequenceControl {
  
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  /* CompleteClass */
  var desiredThumbnailSize: Double = js.native
  
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  /* CompleteClass */
  override def getCurrentFrameRate(): MediaRatio = js.native
  
  /**
    * Gets the highest frame rate supported when video and photos sequences are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  /* CompleteClass */
  override def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
  
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails in photo sequence mode. */
  /* CompleteClass */
  var hardwareAcceleratedThumbnailSupported: Double = js.native
  
  /** Gets the maximum number of past photos that can be stored. */
  /* CompleteClass */
  var maxPastPhotos: Double = js.native
  
  /** Gets the maximum number of photos that can be taken per second. */
  /* CompleteClass */
  var maxPhotosPerSecond: Double = js.native
  
  /** Gets or sets a value that specifies the number of past photos to store. */
  /* CompleteClass */
  var pastPhotoLimit: Double = js.native
  
  /** Gets or sets the number of photos that are taken per second. */
  /* CompleteClass */
  var photosPerSecondLimit: Double = js.native
  
  /** Gets a value that specifies if the capture device supports low shutter lag photo sequence mode. */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets a value that enables and disables thumbnail support in photo sequence mode. */
  /* CompleteClass */
  var thumbnailEnabled: Boolean = js.native
  
  /** Gets or sets the media format for the thumbnails. */
  /* CompleteClass */
  var thumbnailFormat: MediaThumbnailFormat = js.native
}
