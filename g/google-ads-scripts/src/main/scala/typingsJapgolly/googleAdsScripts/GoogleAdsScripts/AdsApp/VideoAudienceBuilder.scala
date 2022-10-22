package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoAudience objects. For details about video audiences, please see About targeting for video campaigns.
  *
  * Example usage:
  *
  *      var videoAudienceBuilder = videoAdGroup.videoTargeting().newAudienceBuilder();
  *      var videoAudienceOperation = videoAudienceBuilder
  *        .withAudienceType('USER_INTEREST')   // required
  *        .withAudienceId(80432)               // required
  *        .build();                            // create the audience
  */
trait VideoAudienceBuilder
  extends StObject
     with Builder[VideoAudienceOperation] {
  
  /** Builds the excluded video audience. */
  def exclude(): ExcludedVideoAudienceOperation
  
  /** Sets the ID of the excluded audience. */
  def withAudienceId(audienceId: Double): this.type
  
  /** Sets the type of the audience. */
  def withAudienceType(audienceType: String): this.type
}
object VideoAudienceBuilder {
  
  inline def apply(
    build: CallbackTo[VideoAudienceOperation],
    exclude: CallbackTo[ExcludedVideoAudienceOperation],
    withAudienceId: Double => VideoAudienceBuilder,
    withAudienceType: String => VideoAudienceBuilder
  ): VideoAudienceBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withAudienceId = js.Any.fromFunction1(withAudienceId), withAudienceType = js.Any.fromFunction1(withAudienceType))
    __obj.asInstanceOf[VideoAudienceBuilder]
  }
  
  extension [Self <: VideoAudienceBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoAudienceOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithAudienceId(value: Double => VideoAudienceBuilder): Self = StObject.set(x, "withAudienceId", js.Any.fromFunction1(value))
    
    inline def setWithAudienceType(value: String => VideoAudienceBuilder): Self = StObject.set(x, "withAudienceType", js.Any.fromFunction1(value))
  }
}
