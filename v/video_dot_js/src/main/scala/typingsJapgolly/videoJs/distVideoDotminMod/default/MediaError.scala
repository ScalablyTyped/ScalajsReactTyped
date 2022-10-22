package typingsJapgolly.videoJs.distVideoDotminMod.default

import typingsJapgolly.videoJs.videoJsInts.`0`
import typingsJapgolly.videoJs.videoJsInts.`1`
import typingsJapgolly.videoJs.videoJsInts.`2`
import typingsJapgolly.videoJs.videoJsInts.`3`
import typingsJapgolly.videoJs.videoJsInts.`4`
import typingsJapgolly.videoJs.videoJsInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaError {
  
  @JSImport("video.js/dist/video.min", "default.MediaError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * W3C error code for media error aborted.
    * @default 1
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.MEDIA_ERR_ABORTED")
  @js.native
  def MEDIA_ERR_ABORTED: `1` = js.native
  inline def MEDIA_ERR_ABORTED_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_ABORTED")(x.asInstanceOf[js.Any])
  
  /**
    * W3C error code for any custom error.
    * @default 0
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.MEDIA_ERR_CUSTOM")
  @js.native
  def MEDIA_ERR_CUSTOM: `0` = js.native
  inline def MEDIA_ERR_CUSTOM_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_CUSTOM")(x.asInstanceOf[js.Any])
  
  /**
    * W3C error code for any decoding error.
    * @default 3
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.MEDIA_ERR_DECODE")
  @js.native
  def MEDIA_ERR_DECODE: `3` = js.native
  inline def MEDIA_ERR_DECODE_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_DECODE")(x.asInstanceOf[js.Any])
  
  /**
    * W3C error code for any time that a source is encrypted.
    * @default 5
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.MEDIA_ERR_ENCRYPTED")
  @js.native
  def MEDIA_ERR_ENCRYPTED: `5` = js.native
  inline def MEDIA_ERR_ENCRYPTED_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_ENCRYPTED")(x.asInstanceOf[js.Any])
  
  /**
    * W3C error code for any network error.
    * @default 2
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.MEDIA_ERR_NETWORK")
  @js.native
  def MEDIA_ERR_NETWORK: `2` = js.native
  inline def MEDIA_ERR_NETWORK_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_NETWORK")(x.asInstanceOf[js.Any])
  
  /**
    * W3C error code for any time that a source is not supported.
    * @default 4
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.MEDIA_ERR_SRC_NOT_SUPPORTED")
  @js.native
  def MEDIA_ERR_SRC_NOT_SUPPORTED: `4` = js.native
  inline def MEDIA_ERR_SRC_NOT_SUPPORTED_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_SRC_NOT_SUPPORTED")(x.asInstanceOf[js.Any])
  
  /**
    * The default `MediaError` messages based on the {@link MediaError.errorTypes}.
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.defaultMessages")
  @js.native
  def defaultMessages: js.Array[String] = js.native
  inline def defaultMessages_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
  
  /**
    * Errors indexed by the W3C standard. The order **CANNOT CHANGE**! See the
    * specification listed under {@link MediaError} for more information.
    *
    * 0 - MEDIA_ERR_CUSTOM
    * 1 - MEDIA_ERR_CUSTOM
    * 2 - MEDIA_ERR_ABORTED
    * 3 - MEDIA_ERR_NETWORK
    * 4 - MEDIA_ERR_SRC_NOT_SUPPORTED
    * 5 - MEDIA_ERR_ENCRYPTED
    */
  @JSImport("video.js/dist/video.min", "default.MediaError.errorTypes")
  @js.native
  val errorTypes: js.Array[String] = js.native
}
