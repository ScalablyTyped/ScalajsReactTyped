package typingsJapgolly.videoJs.mod.default

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.videoJs.videoJsNumbers.`0`
import typingsJapgolly.videoJs.videoJsNumbers.`1`
import typingsJapgolly.videoJs.videoJsNumbers.`2`
import typingsJapgolly.videoJs.videoJsNumbers.`3`
import typingsJapgolly.videoJs.videoJsNumbers.`4`
import typingsJapgolly.videoJs.videoJsNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "MediaError")
@js.native
class MediaErrorCls protected ()
  extends typingsJapgolly.videoJs.mod.videojs.MediaError {
  def this(value: String) = this()
  def this(value: StringDictionary[js.Any]) = this()
  /**
    * Create an instance of this class.
    *
    * @param value
    *        This can be of multiple types:
    *        - number: should be a standard error code
    *        - string: an error message (the code will be 0)
    *        - Object: arbitrary properties
    *        - `MediaError` (native): used to populate a video.js `MediaError` object
    *        - `MediaError` (video.js): will return itself if it's already a
    *          video.js `MediaError` object.
    */
  def this(value: Double) = this()
  def this(value: typingsJapgolly.videoJs.mod.videojs.MediaError) = this()
  /**
    * W3C error code for media error aborted.
    * @default 1
    */
  /* CompleteClass */
  override var MEDIA_ERR_ABORTED: `1` = js.native
  /**
    * W3C error code for any custom error.
    * @default 0
    */
  /* CompleteClass */
  override var MEDIA_ERR_CUSTOM: `0` = js.native
  /**
    * W3C error code for any decoding error.
    * @default 3
    */
  /* CompleteClass */
  override var MEDIA_ERR_DECODE: `3` = js.native
  /**
    * W3C error code for any time that a source is encrypted.
    * @default 5
    */
  /* CompleteClass */
  override var MEDIA_ERR_ENCRYPTED: `5` = js.native
  /**
    * W3C error code for any network error.
    * @default 2
    */
  /* CompleteClass */
  override var MEDIA_ERR_NETWORK: `2` = js.native
  /**
    * W3C error code for any time that a source is not supported.
    * @default 4
    */
  /* CompleteClass */
  override var MEDIA_ERR_SRC_NOT_SUPPORTED: `4` = js.native
  /**
    * The error code that refers two one of the defined `MediaError` types
    *
    */
  /* CompleteClass */
  override var code: Double = js.native
  /**
    * An optional message that to show with the error. Message is not part of the HTML5
    * video spec but allows for more informative custom errors.
    *
    */
  /* CompleteClass */
  override var message: String = js.native
  /**
    * An optional status code that can be set by plugins to allow even more detail about
    * the error. For example a plugin might provide a specific HTTP status code and an
    * error message for that code. Then when the plugin gets that error this class will
    * know how to display an error message for it. This allows a custom message to show
    * up on the `Player` error overlay.
    *
    */
  /* CompleteClass */
  override var status: js.Array[_] = js.native
}

