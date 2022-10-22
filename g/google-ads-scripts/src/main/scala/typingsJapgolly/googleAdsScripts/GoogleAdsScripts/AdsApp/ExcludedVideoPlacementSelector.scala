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
  * Fetches excluded video placements. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoPlacementSelector = AdsApp.videoTargeting()
  *          .excludedVideoPlacements()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoPlacementIterator = excludedVideoPlacementSelector.get();
  *      while (excludedVideoPlacementIterator.hasNext()) {
  *        var excludedVideoPlacement = excludedVideoPlacementIterator.next();
  *      }
  */
trait ExcludedVideoPlacementSelector
  extends StObject
     with Selector[ExcludedVideoPlacementIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoPlacementSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoPlacementIterator],
    orderBy: String => ExcludedVideoPlacementSelector,
    withCondition: String => ExcludedVideoPlacementSelector,
    withLimit: Double => ExcludedVideoPlacementSelector
  ): ExcludedVideoPlacementSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoPlacementSelector]
  }
}
