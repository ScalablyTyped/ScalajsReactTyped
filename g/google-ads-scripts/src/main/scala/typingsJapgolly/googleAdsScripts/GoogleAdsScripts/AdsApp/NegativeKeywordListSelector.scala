package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches negative keyword lists. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var negativeKeywordListSelector = AdsApp.negativeKeywordLists()
  *          .withCondition("Name CONTAINS 'test'")
  *          .withLimit(1)
  *          .withIds([10,20])
  *          .orderBy("SharedSetId DESC");
  *
  *      var negativeKeywordListIterator = negativeKeywordListSelector.get();
  *
  *      while (negativeKeywordListIterator.hasNext()) {
  *        var negativeKeywordList = negativeKeywordListIterator.next();
  *      }
  */
trait NegativeKeywordListSelector
  extends StObject
     with Selector[NegativeKeywordListIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object NegativeKeywordListSelector {
  
  inline def apply(
    get: CallbackTo[NegativeKeywordListIterator],
    orderBy: String => NegativeKeywordListSelector,
    withCondition: String => NegativeKeywordListSelector,
    withIds: js.Array[Double] => NegativeKeywordListSelector,
    withLimit: Double => NegativeKeywordListSelector
  ): NegativeKeywordListSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[NegativeKeywordListSelector]
  }
}
