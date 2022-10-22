package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaUrls extends StObject {
  
  def getFullMediaUrl(): String
  
  def getPreviewMediaUrl(): String
  
  def getShrunkenMediaUrl(): String
  
  def getVideoThumbnailMediaUrl(): String
}
object MediaUrls {
  
  inline def apply(
    getFullMediaUrl: CallbackTo[String],
    getPreviewMediaUrl: CallbackTo[String],
    getShrunkenMediaUrl: CallbackTo[String],
    getVideoThumbnailMediaUrl: CallbackTo[String]
  ): MediaUrls = {
    val __obj = js.Dynamic.literal(getFullMediaUrl = getFullMediaUrl.toJsFn, getPreviewMediaUrl = getPreviewMediaUrl.toJsFn, getShrunkenMediaUrl = getShrunkenMediaUrl.toJsFn, getVideoThumbnailMediaUrl = getVideoThumbnailMediaUrl.toJsFn)
    __obj.asInstanceOf[MediaUrls]
  }
  
  extension [Self <: MediaUrls](x: Self) {
    
    inline def setGetFullMediaUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFullMediaUrl", value.toJsFn)
    
    inline def setGetPreviewMediaUrl(value: CallbackTo[String]): Self = StObject.set(x, "getPreviewMediaUrl", value.toJsFn)
    
    inline def setGetShrunkenMediaUrl(value: CallbackTo[String]): Self = StObject.set(x, "getShrunkenMediaUrl", value.toJsFn)
    
    inline def setGetVideoThumbnailMediaUrl(value: CallbackTo[String]): Self = StObject.set(x, "getVideoThumbnailMediaUrl", value.toJsFn)
  }
}
