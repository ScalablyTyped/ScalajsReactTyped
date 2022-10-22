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
  * Fetches negative keywords (except from shared libraries).
  *
  * Typical usage:
  *
  *      var adGroup = AdsApp.adGroups().get().next();
  *      var negativeKeywordSelector = adGroup.negativeKeywords();
  *
  *      var negativeKeywordIterator = negativeKeywordSelector.get();
  *      while (negativeKeywordIterator.hasNext()) {
  *        var negativeKeyword = negativeKeywordIterator.next();
  *      }
  */
trait NegativeKeywordSelector
  extends StObject
     with Selector[NegativeKeywordIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object NegativeKeywordSelector {
  
  inline def apply(
    get: CallbackTo[NegativeKeywordIterator],
    orderBy: String => NegativeKeywordSelector,
    withCondition: String => NegativeKeywordSelector,
    withLimit: Double => NegativeKeywordSelector
  ): NegativeKeywordSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[NegativeKeywordSelector]
  }
}
