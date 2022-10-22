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
  * Fetches experiments. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *  var experimentSelector = AdsApp.experiments()
  *      .withCondition("BaseCampaignId = 123456789")
  *      .orderBy("Name ASC");
  *
  *  var experimentIterator = experimentSelector.get();
  *  while (experimentIterator.hasNext()) {
  *    var experiment = experimentIterator.next();
  *  }
  */
trait ExperimentSelector
  extends StObject
     with Selector[ExperimentIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object ExperimentSelector {
  
  inline def apply(
    get: CallbackTo[ExperimentIterator],
    orderBy: String => ExperimentSelector,
    withCondition: String => ExperimentSelector,
    withIds: js.Array[Double] => ExperimentSelector,
    withLimit: Double => ExperimentSelector
  ): ExperimentSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExperimentSelector]
  }
}
