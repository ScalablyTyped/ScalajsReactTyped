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
  * Fetches excluded video keywords. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoKeywordSelector = AdsApp.videoTargeting()
  *          .excludedVideoKeywords()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoKeywordIterator = excludedVideoKeywordSelector.get();
  *      while (excludedVideoKeywordIterator.hasNext()) {
  *        var excludedVideoKeyword = excludedVideoKeywordIterator.next();
  *      }
  */
trait ExcludedVideoKeywordSelector
  extends StObject
     with Selector[ExcludedVideoKeywordIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoKeywordSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoKeywordIterator],
    orderBy: String => ExcludedVideoKeywordSelector,
    withCondition: String => ExcludedVideoKeywordSelector,
    withLimit: Double => ExcludedVideoKeywordSelector
  ): ExcludedVideoKeywordSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoKeywordSelector]
  }
}
