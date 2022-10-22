package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoParentalStatus objects.
  *
  * Example usage:
  *
  *  var videoParentalStatusBuilder = videoAdGroup.videoTargeting().newParentalStatusBuilder();
  *  var videoParentalStatusOperation = videoParentalStatusBuilder
  *    .withParentType('PARENT_PARENT')     // required
  *    .build();                            // create the parental status
  */
trait VideoParentalStatusBuilder
  extends StObject
     with Builder[VideoParentalStatusOperation] {
  
  /** Builds the excluded video parental status. */
  def exclude(): ExcludedVideoParentalStatusOperation
  
  /** Sets the parental status type. */
  def withParentType(parentalStatus: String): this.type
}
object VideoParentalStatusBuilder {
  
  inline def apply(
    build: CallbackTo[VideoParentalStatusOperation],
    exclude: CallbackTo[ExcludedVideoParentalStatusOperation],
    withParentType: String => VideoParentalStatusBuilder
  ): VideoParentalStatusBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withParentType = js.Any.fromFunction1(withParentType))
    __obj.asInstanceOf[VideoParentalStatusBuilder]
  }
  
  extension [Self <: VideoParentalStatusBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoParentalStatusOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithParentType(value: String => VideoParentalStatusBuilder): Self = StObject.set(x, "withParentType", js.Any.fromFunction1(value))
  }
}
