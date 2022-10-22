package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoAge objects.
  *
  * Example usage:
  *
  *      var videoAgeBuilder = videoAdGroup.videoTargeting().newAgeBuilder();
  *      var videoAgeOperation = videoAgeBuilder
  *        .withAgeRange('AGE_RANGE_25_34')     // required
  *        .build();                            // create the age
  */
trait VideoAgeBuilder
  extends StObject
     with Builder[VideoAgeOperation] {
  
  /** Builds the excluded video age. */
  def exclude(): ExcludedVideoAgeOperation
  
  /** Sets the age range. */
  def withAgeRange(ageRange: String): this.type
}
object VideoAgeBuilder {
  
  inline def apply(
    build: CallbackTo[VideoAgeOperation],
    exclude: CallbackTo[ExcludedVideoAgeOperation],
    withAgeRange: String => VideoAgeBuilder
  ): VideoAgeBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withAgeRange = js.Any.fromFunction1(withAgeRange))
    __obj.asInstanceOf[VideoAgeBuilder]
  }
  
  extension [Self <: VideoAgeBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoAgeOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithAgeRange(value: String => VideoAgeBuilder): Self = StObject.set(x, "withAgeRange", js.Any.fromFunction1(value))
  }
}
