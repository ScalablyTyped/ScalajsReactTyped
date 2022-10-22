package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** URLs for different sizes of a media object. */
trait MediaUrls extends StObject {
  
  /** Returns the URL for the full size of the media object. */
  def getFullUrl(): String
  
  /** Returns the URL for the preview size of the media object. */
  def getPreviewUrl(): String
  
  /** Returns the URL for the shrunken size of the media object. */
  def getShrunkenUrl(): String
  
  /** Returns the URL for the video thumbnail size of the media object. */
  def getVideoThumbnailUrl(): String
}
object MediaUrls {
  
  inline def apply(
    getFullUrl: CallbackTo[String],
    getPreviewUrl: CallbackTo[String],
    getShrunkenUrl: CallbackTo[String],
    getVideoThumbnailUrl: CallbackTo[String]
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullUrl = getFullUrl.toJsFn, getPreviewUrl = getPreviewUrl.toJsFn, getShrunkenUrl = getShrunkenUrl.toJsFn, getVideoThumbnailUrl = getVideoThumbnailUrl.toJsFn)
    __obj.asInstanceOf[MediaUrls]
  }
  
  extension [Self <: MediaUrls](x: Self) {
    
    inline def setGetFullUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFullUrl", value.toJsFn)
    
    inline def setGetPreviewUrl(value: CallbackTo[String]): Self = StObject.set(x, "getPreviewUrl", value.toJsFn)
    
    inline def setGetShrunkenUrl(value: CallbackTo[String]): Self = StObject.set(x, "getShrunkenUrl", value.toJsFn)
    
    inline def setGetVideoThumbnailUrl(value: CallbackTo[String]): Self = StObject.set(x, "getVideoThumbnailUrl", value.toJsFn)
  }
}
