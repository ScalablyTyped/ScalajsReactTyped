package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoKeyword objects.
  *
  * Example usage:
  *
  *  var videoKeywordBuilder = videoAdGroup.videoTargeting().newKeywordBuilder();
  *  var videoKeywordOperation = videoKeywordBuilder
  *    .withText('keyword')     // required
  *    .withCpv(0.11)           // optional
  *    .build();                // create the keyword
  */
trait VideoKeywordBuilder
  extends StObject
     with Builder[VideoKeywordOperation] {
  
  /** Builds the excluded video keyword. */
  def exclude(): ExcludedVideoKeywordOperation
  
  /** Sets the max CPV bid of the new video keyword to the specified value. */
  def withCpv(cpv: Double): this.type
  
  /** Sets the text of the video keyword. */
  def withText(text: String): this.type
}
object VideoKeywordBuilder {
  
  inline def apply(
    build: CallbackTo[VideoKeywordOperation],
    exclude: CallbackTo[ExcludedVideoKeywordOperation],
    withCpv: Double => VideoKeywordBuilder,
    withText: String => VideoKeywordBuilder
  ): VideoKeywordBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpv = js.Any.fromFunction1(withCpv), withText = js.Any.fromFunction1(withText))
    __obj.asInstanceOf[VideoKeywordBuilder]
  }
  
  extension [Self <: VideoKeywordBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoKeywordOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithCpv(value: Double => VideoKeywordBuilder): Self = StObject.set(x, "withCpv", js.Any.fromFunction1(value))
    
    inline def setWithText(value: String => VideoKeywordBuilder): Self = StObject.set(x, "withText", js.Any.fromFunction1(value))
  }
}
