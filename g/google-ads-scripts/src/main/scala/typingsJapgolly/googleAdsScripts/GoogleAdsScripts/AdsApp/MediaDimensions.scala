package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dimensions for different sizes of a media object. */
trait MediaDimensions extends StObject {
  
  /** Returns dimensions for the full size of the media object. */
  def getFullDimensions(): Dimensions
  
  /** Returns dimensions for the preview size of the media object. */
  def getPreviewDimensions(): Dimensions
  
  /** Returns dimensions for the shrunken size of the media object. */
  def getShrunkenDimensions(): Dimensions
  
  /** Returns dimensions for the video thumbnail size of the media object. */
  def getVideoThumbnailDimensions(): Dimensions
}
object MediaDimensions {
  
  inline def apply(
    getFullDimensions: CallbackTo[Dimensions],
    getPreviewDimensions: CallbackTo[Dimensions],
    getShrunkenDimensions: CallbackTo[Dimensions],
    getVideoThumbnailDimensions: CallbackTo[Dimensions]
  ): MediaDimensions = {
    val __obj = js.Dynamic.literal(getFullDimensions = getFullDimensions.toJsFn, getPreviewDimensions = getPreviewDimensions.toJsFn, getShrunkenDimensions = getShrunkenDimensions.toJsFn, getVideoThumbnailDimensions = getVideoThumbnailDimensions.toJsFn)
    __obj.asInstanceOf[MediaDimensions]
  }
  
  extension [Self <: MediaDimensions](x: Self) {
    
    inline def setGetFullDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getFullDimensions", value.toJsFn)
    
    inline def setGetPreviewDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getPreviewDimensions", value.toJsFn)
    
    inline def setGetShrunkenDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getShrunkenDimensions", value.toJsFn)
    
    inline def setGetVideoThumbnailDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getVideoThumbnailDimensions", value.toJsFn)
  }
}
