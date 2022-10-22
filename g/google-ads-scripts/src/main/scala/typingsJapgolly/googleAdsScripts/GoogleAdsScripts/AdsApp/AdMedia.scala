package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Root object for fetching and creating media objects. */
trait AdMedia extends StObject {
  
  /** Returns a selector for all media in the account. */
  def media(): MediaSelector
  
  /** Returns a builder to upload an image. */
  def newImageBuilder(): ImageBuilder
  
  /** Returns a builder to upload a media bundle. */
  def newMediaBundleBuilder(): MediaBundleBuilder
  
  /** Returns a builder to upload a video. */
  def newVideoBuilder(): VideoBuilder
}
object AdMedia {
  
  inline def apply(
    media: CallbackTo[MediaSelector],
    newImageBuilder: CallbackTo[ImageBuilder],
    newMediaBundleBuilder: CallbackTo[MediaBundleBuilder],
    newVideoBuilder: CallbackTo[VideoBuilder]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = media.toJsFn, newImageBuilder = newImageBuilder.toJsFn, newMediaBundleBuilder = newMediaBundleBuilder.toJsFn, newVideoBuilder = newVideoBuilder.toJsFn)
    __obj.asInstanceOf[AdMedia]
  }
  
  extension [Self <: AdMedia](x: Self) {
    
    inline def setMedia(value: CallbackTo[MediaSelector]): Self = StObject.set(x, "media", value.toJsFn)
    
    inline def setNewImageBuilder(value: CallbackTo[ImageBuilder]): Self = StObject.set(x, "newImageBuilder", value.toJsFn)
    
    inline def setNewMediaBundleBuilder(value: CallbackTo[MediaBundleBuilder]): Self = StObject.set(x, "newMediaBundleBuilder", value.toJsFn)
    
    inline def setNewVideoBuilder(value: CallbackTo[VideoBuilder]): Self = StObject.set(x, "newVideoBuilder", value.toJsFn)
  }
}
