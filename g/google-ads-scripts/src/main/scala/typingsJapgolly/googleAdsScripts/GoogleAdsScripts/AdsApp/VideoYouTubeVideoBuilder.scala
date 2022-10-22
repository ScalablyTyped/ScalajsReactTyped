package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoYouTubeVideo objects.
  *
  * Example usage:
  *
  *      var videoYouTubeVideoBuilder = videoAdGroup.videoTargeting().newYouTubeVideoBuilder();
  *      var videoYouTubeVideoOperation = videoYouTubeVideoBuilder
  *        .withVideoId('_YUugB4IUl4')      // required
  *        .build();                        // create the YouTube video
  */
trait VideoYouTubeVideoBuilder
  extends StObject
     with Builder[VideoYouTubeVideoOperation] {
  
  /** Builds the excluded video YouTube video. */
  def exclude(): ExcludedVideoYouTubeVideoOperation
  
  /** Sets the YouTube video ID. */
  def withVideoId(videoId: String): this.type
}
object VideoYouTubeVideoBuilder {
  
  inline def apply(
    build: CallbackTo[VideoYouTubeVideoOperation],
    exclude: CallbackTo[ExcludedVideoYouTubeVideoOperation],
    withVideoId: String => VideoYouTubeVideoBuilder
  ): VideoYouTubeVideoBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withVideoId = js.Any.fromFunction1(withVideoId))
    __obj.asInstanceOf[VideoYouTubeVideoBuilder]
  }
  
  extension [Self <: VideoYouTubeVideoBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoYouTubeVideoOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithVideoId(value: String => VideoYouTubeVideoBuilder): Self = StObject.set(x, "withVideoId", js.Any.fromFunction1(value))
  }
}
