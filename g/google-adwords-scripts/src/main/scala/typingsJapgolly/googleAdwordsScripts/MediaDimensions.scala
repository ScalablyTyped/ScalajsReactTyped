package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDimensions extends StObject {
  
  def getFullMediaDimensions(): Dimensions
  
  def getPreviewMediaDimensions(): Dimensions
  
  def getShrunkenMediaDimensions(): Dimensions
  
  def getVideoThumbnailDimensions(): Dimensions
}
object MediaDimensions {
  
  inline def apply(
    getFullMediaDimensions: CallbackTo[Dimensions],
    getPreviewMediaDimensions: CallbackTo[Dimensions],
    getShrunkenMediaDimensions: CallbackTo[Dimensions],
    getVideoThumbnailDimensions: CallbackTo[Dimensions]
  ): MediaDimensions = {
    val __obj = js.Dynamic.literal(getFullMediaDimensions = getFullMediaDimensions.toJsFn, getPreviewMediaDimensions = getPreviewMediaDimensions.toJsFn, getShrunkenMediaDimensions = getShrunkenMediaDimensions.toJsFn, getVideoThumbnailDimensions = getVideoThumbnailDimensions.toJsFn)
    __obj.asInstanceOf[MediaDimensions]
  }
  
  extension [Self <: MediaDimensions](x: Self) {
    
    inline def setGetFullMediaDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getFullMediaDimensions", value.toJsFn)
    
    inline def setGetPreviewMediaDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getPreviewMediaDimensions", value.toJsFn)
    
    inline def setGetShrunkenMediaDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getShrunkenMediaDimensions", value.toJsFn)
    
    inline def setGetVideoThumbnailDimensions(value: CallbackTo[Dimensions]): Self = StObject.set(x, "getVideoThumbnailDimensions", value.toJsFn)
  }
}
