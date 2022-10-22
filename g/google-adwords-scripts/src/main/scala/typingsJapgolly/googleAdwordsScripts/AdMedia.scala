package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Media
trait AdMedia extends StObject {
  
  def media(): AdWordsSelector[Media]
  
  def newImageBuilder(): ImageBuilder[Media]
  
  def newMediaBundleBuilder(): MediaBundleBuilder[Media]
  
  def newVideoBuilder(): VideoBuilder[Media]
}
object AdMedia {
  
  inline def apply(
    media: CallbackTo[AdWordsSelector[Media]],
    newImageBuilder: CallbackTo[ImageBuilder[Media]],
    newMediaBundleBuilder: CallbackTo[MediaBundleBuilder[Media]],
    newVideoBuilder: CallbackTo[VideoBuilder[Media]]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = media.toJsFn, newImageBuilder = newImageBuilder.toJsFn, newMediaBundleBuilder = newMediaBundleBuilder.toJsFn, newVideoBuilder = newVideoBuilder.toJsFn)
    __obj.asInstanceOf[AdMedia]
  }
  
  extension [Self <: AdMedia](x: Self) {
    
    inline def setMedia(value: CallbackTo[AdWordsSelector[Media]]): Self = StObject.set(x, "media", value.toJsFn)
    
    inline def setNewImageBuilder(value: CallbackTo[ImageBuilder[Media]]): Self = StObject.set(x, "newImageBuilder", value.toJsFn)
    
    inline def setNewMediaBundleBuilder(value: CallbackTo[MediaBundleBuilder[Media]]): Self = StObject.set(x, "newMediaBundleBuilder", value.toJsFn)
    
    inline def setNewVideoBuilder(value: CallbackTo[VideoBuilder[Media]]): Self = StObject.set(x, "newVideoBuilder", value.toJsFn)
  }
}
