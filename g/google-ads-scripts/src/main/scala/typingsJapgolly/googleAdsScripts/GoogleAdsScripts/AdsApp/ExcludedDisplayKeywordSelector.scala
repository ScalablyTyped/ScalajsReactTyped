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
  * Fetches excluded display keywords. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedDisplayKeywordSelector = AdsApp.display()
  *          .keywords()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var excludedDisplayKeywordIterator = excludedDisplayKeywordSelector.get();
  *      while (excludedDisplayKeywordIterator.hasNext()) {
  *        var excludedDisplayKeyword = excludedDisplayKeywordIterator.next();
  *      }
  */
trait ExcludedDisplayKeywordSelector
  extends StObject
     with Selector[ExcludedDisplayKeywordIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedDisplayKeywordSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedDisplayKeywordIterator],
    orderBy: String => ExcludedDisplayKeywordSelector,
    withCondition: String => ExcludedDisplayKeywordSelector,
    withLimit: Double => ExcludedDisplayKeywordSelector
  ): ExcludedDisplayKeywordSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedDisplayKeywordSelector]
  }
}
