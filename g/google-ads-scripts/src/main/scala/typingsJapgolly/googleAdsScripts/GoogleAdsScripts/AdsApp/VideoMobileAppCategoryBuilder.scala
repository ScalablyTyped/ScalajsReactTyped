package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoMobileAppCategory objects.
  *
  * Example usage:
  *
  *      var videoMobileAppCategoryBuilder = videoAdGroup.videoTargeting().newMobileAppCategoryBuilder();
  *      var videoMobileAppCategoryOperation = videoMobileAppCategoryBuilder
  *        .withMobileAppCategoryId(60003)    // required
  *        .build();  // create the mobile application categories
  */
trait VideoMobileAppCategoryBuilder
  extends StObject
     with Builder[VideoMobileAppCategoryOperation] {
  
  /** Builds the excluded video mobile application category. */
  def exclude(): ExcludedVideoMobileAppCategoryOperation
  
  /** Sets the ID of the mobile application category. */
  def withMobileAppCategoryId(categoryId: Double): this.type
}
object VideoMobileAppCategoryBuilder {
  
  inline def apply(
    build: CallbackTo[VideoMobileAppCategoryOperation],
    exclude: CallbackTo[ExcludedVideoMobileAppCategoryOperation],
    withMobileAppCategoryId: Double => VideoMobileAppCategoryBuilder
  ): VideoMobileAppCategoryBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withMobileAppCategoryId = js.Any.fromFunction1(withMobileAppCategoryId))
    __obj.asInstanceOf[VideoMobileAppCategoryBuilder]
  }
  
  extension [Self <: VideoMobileAppCategoryBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoMobileAppCategoryOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithMobileAppCategoryId(value: Double => VideoMobileAppCategoryBuilder): Self = StObject.set(x, "withMobileAppCategoryId", js.Any.fromFunction1(value))
  }
}
