package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Starting point for creating a video ad in a video ad group.
  *
  * Typical usage:
  *
  *      var videoAdOperation = videoAdGroup.newVideoAd().inStreamAdBuilder()
  *         .withVideo(videoMedia)
  *         .withAdName("Ad name")
  *         .withDisplayUrl("example.com")
  *         .withFinalUrl("http://www.example.com")
  *         .build();
  *      var videoAd = videoAdOperation.getResult();
  */
trait VideoAdBuilderSpace extends StObject {
  
  /** Returns a new bumper ad builder associated with the ad group. */
  def bumperAdBuilder(): BumperAdBuilder
  
  /** Returns a new In-stream video ad builder associated with the ad group. */
  def inStreamAdBuilder(): InStreamAdBuilder
  
  /** Returns a new non-skippable ad builder associated with the ad group. */
  def nonSkippableAdBuilder(): NonSkippableAdBuilder
  
  /** Returns a new video discovery ad builder associated with the ad group. */
  def videoDiscoveryAdBuilder(): VideoDiscoveryAdBuilder
}
object VideoAdBuilderSpace {
  
  inline def apply(
    bumperAdBuilder: CallbackTo[BumperAdBuilder],
    inStreamAdBuilder: CallbackTo[InStreamAdBuilder],
    nonSkippableAdBuilder: CallbackTo[NonSkippableAdBuilder],
    videoDiscoveryAdBuilder: CallbackTo[VideoDiscoveryAdBuilder]
  ): VideoAdBuilderSpace = {
    val __obj = js.Dynamic.literal(bumperAdBuilder = bumperAdBuilder.toJsFn, inStreamAdBuilder = inStreamAdBuilder.toJsFn, nonSkippableAdBuilder = nonSkippableAdBuilder.toJsFn, videoDiscoveryAdBuilder = videoDiscoveryAdBuilder.toJsFn)
    __obj.asInstanceOf[VideoAdBuilderSpace]
  }
  
  extension [Self <: VideoAdBuilderSpace](x: Self) {
    
    inline def setBumperAdBuilder(value: CallbackTo[BumperAdBuilder]): Self = StObject.set(x, "bumperAdBuilder", value.toJsFn)
    
    inline def setInStreamAdBuilder(value: CallbackTo[InStreamAdBuilder]): Self = StObject.set(x, "inStreamAdBuilder", value.toJsFn)
    
    inline def setNonSkippableAdBuilder(value: CallbackTo[NonSkippableAdBuilder]): Self = StObject.set(x, "nonSkippableAdBuilder", value.toJsFn)
    
    inline def setVideoDiscoveryAdBuilder(value: CallbackTo[VideoDiscoveryAdBuilder]): Self = StObject.set(x, "videoDiscoveryAdBuilder", value.toJsFn)
  }
}
