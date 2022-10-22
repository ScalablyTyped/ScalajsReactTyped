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
  * Fetches excluded placement lists. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var sharedExcludedPlacementSelector = AdsApp.excludedPlacementLists()
  *          .withCondition("Name CONTAINS 'test'")
  *          .withLimit(1)
  *          .withIds([10,20])
  *          .orderBy("SharedSetId DESC");
  *
  *      var sharedExcludedPlacementIterator = sharedExcludedPlacementSelector.get();
  *
  *      while (sharedExcludedPlacementIterator.hasNext()) {
  *        var sharedExcludedPlacement = sharedExcludedPlacementIterator.next();
  *      }
  */
trait ExcludedPlacementListSelector
  extends StObject
     with Selector[ExcludedPlacementListIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object ExcludedPlacementListSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedPlacementListIterator],
    orderBy: String => ExcludedPlacementListSelector,
    withCondition: String => ExcludedPlacementListSelector,
    withIds: js.Array[Double] => ExcludedPlacementListSelector,
    withLimit: Double => ExcludedPlacementListSelector
  ): ExcludedPlacementListSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedPlacementListSelector]
  }
}
