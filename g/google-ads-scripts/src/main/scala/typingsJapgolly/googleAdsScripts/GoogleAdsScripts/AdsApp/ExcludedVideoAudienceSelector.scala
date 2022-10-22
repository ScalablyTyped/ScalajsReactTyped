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
  * Fetches excluded video audiences. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *
  *      var excludedVideoAudienceSelector = AdsApp.videoTargeting()
  *          .excludedVideoAudiences()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoAudienceIterator = excludedVideoAudienceSelector.get();
  *      while (excludedVideoAudienceIterator.hasNext()) {
  *        var excludedVideoAudience = excludedVideoAudienceIterator.next();
  *      }
  */
trait ExcludedVideoAudienceSelector
  extends StObject
     with Selector[ExcludedVideoAudienceIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoAudienceSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoAudienceIterator],
    orderBy: String => ExcludedVideoAudienceSelector,
    withCondition: String => ExcludedVideoAudienceSelector,
    withLimit: Double => ExcludedVideoAudienceSelector
  ): ExcludedVideoAudienceSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoAudienceSelector]
  }
}
