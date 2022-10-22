package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoYouTubeChannel objects.
  *
  * Example usage:
  *
  *      var videoYouTubeChannelBuilder = videoAdGroup.videoTargeting().newYouTubeChannelBuilder();
  *      var videoYouTubeChannelOperation = videoYouTubeChannelBuilder
  *        .withChannelId('UCqVDpXKLmKeBU_yyt_QkItQ')    // required
  *        .build();                                     // create the YouTube channel
  */
trait VideoYouTubeChannelBuilder
  extends StObject
     with Builder[VideoYouTubeChannelOperation] {
  
  /** Builds the excluded video YouTube channel. */
  def exclude(): ExcludedVideoYouTubeChannelOperation
  
  /** Sets the YouTube channel ID. */
  def withChannelId(channelId: String): this.type
}
object VideoYouTubeChannelBuilder {
  
  inline def apply(
    build: CallbackTo[VideoYouTubeChannelOperation],
    exclude: CallbackTo[ExcludedVideoYouTubeChannelOperation],
    withChannelId: String => VideoYouTubeChannelBuilder
  ): VideoYouTubeChannelBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withChannelId = js.Any.fromFunction1(withChannelId))
    __obj.asInstanceOf[VideoYouTubeChannelBuilder]
  }
  
  extension [Self <: VideoYouTubeChannelBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoYouTubeChannelOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithChannelId(value: String => VideoYouTubeChannelBuilder): Self = StObject.set(x, "withChannelId", js.Any.fromFunction1(value))
  }
}
