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
  * Fetches excluded video ages. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoAgeSelector = AdsApp.videoTargeting()
  *          .excludedVideoAges()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoAgeIterator = excludedVideoAgeSelector.get();
  *      while (excludedVideoAgeIterator.hasNext()) {
  *        var excludedVideoAge = excludedVideoAgeIterator.next();
  *      }
  */
trait ExcludedVideoAgeSelector
  extends StObject
     with Selector[ExcludedVideoAgeIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoAgeSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoAgeIterator],
    orderBy: String => ExcludedVideoAgeSelector,
    withCondition: String => ExcludedVideoAgeSelector,
    withLimit: Double => ExcludedVideoAgeSelector
  ): ExcludedVideoAgeSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoAgeSelector]
  }
}
