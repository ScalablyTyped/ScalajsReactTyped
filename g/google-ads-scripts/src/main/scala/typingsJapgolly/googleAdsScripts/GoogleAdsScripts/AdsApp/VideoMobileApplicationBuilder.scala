package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoMobileApplication objects.
  *
  * Example usage:
  *
  *      var videoMobileApplicationBuilder = videoAdGroup.videoTargeting().newMobileApplicationBuilder();
  *      var videoMobileApplicationOperation = videoMobileApplicationBuilder
  *        .withAppId('1-936971630')     // required
  *        .build();                     // create the mobile application
  */
trait VideoMobileApplicationBuilder
  extends StObject
     with Builder[VideoMobileApplicationOperation] {
  
  /** Builds the excluded video mobile application. */
  def exclude(): ExcludedVideoMobileApplicationOperation
  
  /** Sets the ID of the mobile application. */
  def withAppId(appId: String): this.type
}
object VideoMobileApplicationBuilder {
  
  inline def apply(
    build: CallbackTo[VideoMobileApplicationOperation],
    exclude: CallbackTo[ExcludedVideoMobileApplicationOperation],
    withAppId: String => VideoMobileApplicationBuilder
  ): VideoMobileApplicationBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withAppId = js.Any.fromFunction1(withAppId))
    __obj.asInstanceOf[VideoMobileApplicationBuilder]
  }
  
  extension [Self <: VideoMobileApplicationBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoMobileApplicationOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithAppId(value: String => VideoMobileApplicationBuilder): Self = StObject.set(x, "withAppId", js.Any.fromFunction1(value))
  }
}
