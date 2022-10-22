package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches excluded video parental statuses. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoParentalStatusSelector = AdsApp.videoTargeting()
  *          .excludedVideoParentalStatuses()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoParentalStatusIterator = excludedVideoParentalStatusSelector.get();
  *      while (excludedVideoParentalStatusIterator.hasNext()) {
  *        var excludedVideoParentalStatus = excludedVideoParentalStatusIterator.next();
  *      }
  */
trait ExcludedVideoParentalStatusSelector
  extends StObject
     with Selector[ExcludedVideoParentalStatusIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoParentalStatusSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoParentalStatusIterator],
    orderBy: String => ExcludedVideoParentalStatusSelector,
    withCondition: String => ExcludedVideoParentalStatusSelector,
    withLimit: Double => ExcludedVideoParentalStatusSelector
  ): ExcludedVideoParentalStatusSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoParentalStatusSelector]
  }
}
