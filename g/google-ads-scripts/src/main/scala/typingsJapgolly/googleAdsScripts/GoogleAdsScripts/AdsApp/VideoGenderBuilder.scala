package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoGender objects.
  *
  * Example usage:
  *
  *      var videoGenderBuilder = videoAdGroup.videoTargeting().newGenderBuilder();
  *      var videoGenderOperation = videoGenderBuilder
  *        .withGenderType('GENDER_FEMALE')     // required
  *        .build();                            // create the gender
  */
trait VideoGenderBuilder
  extends StObject
     with Builder[VideoGenderOperation] {
  
  /** Builds the excluded video gender. */
  def exclude(): ExcludedVideoGenderOperation
  
  /** Sets the gender type. */
  def withGenderType(genderType: String): this.type
}
object VideoGenderBuilder {
  
  inline def apply(
    build: CallbackTo[VideoGenderOperation],
    exclude: CallbackTo[ExcludedVideoGenderOperation],
    withGenderType: String => VideoGenderBuilder
  ): VideoGenderBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withGenderType = js.Any.fromFunction1(withGenderType))
    __obj.asInstanceOf[VideoGenderBuilder]
  }
  
  extension [Self <: VideoGenderBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoGenderOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithGenderType(value: String => VideoGenderBuilder): Self = StObject.set(x, "withGenderType", js.Any.fromFunction1(value))
  }
}
