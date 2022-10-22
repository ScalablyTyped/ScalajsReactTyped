package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoPlacement objects.
  *
  * Example usage:
  *
  *      var videoPlacementBuilder = videoAdGroup.videoTargeting().newPlacementBuilder();
  *      var videoPlacementOperation = videoPlacementBuilder
  *        .withUrl('"http://www.site.com"')    // required
  *        .build();                            // create the placement
  */
trait VideoPlacementBuilder
  extends StObject
     with Builder[VideoPlacementOperation] {
  
  /** Builds the excluded video placement. */
  def exclude(): ExcludedVideoPlacementOperation
  
  /** Sets the URL of the placement. */
  def withUrl(url: String): this.type
}
object VideoPlacementBuilder {
  
  inline def apply(
    build: CallbackTo[VideoPlacementOperation],
    exclude: CallbackTo[ExcludedVideoPlacementOperation],
    withUrl: String => VideoPlacementBuilder
  ): VideoPlacementBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withUrl = js.Any.fromFunction1(withUrl))
    __obj.asInstanceOf[VideoPlacementBuilder]
  }
  
  extension [Self <: VideoPlacementBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoPlacementOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithUrl(value: String => VideoPlacementBuilder): Self = StObject.set(x, "withUrl", js.Any.fromFunction1(value))
  }
}
