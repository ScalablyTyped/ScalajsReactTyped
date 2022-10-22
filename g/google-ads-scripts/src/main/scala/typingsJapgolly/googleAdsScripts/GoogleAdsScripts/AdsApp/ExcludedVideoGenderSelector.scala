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
  * Fetches excluded video genders. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoGenderSelector = AdsApp.videoTargeting()
  *          .excludedVideoGenders()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoGenderIterator = excludedVideoGenderSelector.get();
  *      while (excludedVideoGenderIterator.hasNext()) {
  *        var excludedVideoGender = excludedVideoGenderIterator.next();
  *      }
  */
trait ExcludedVideoGenderSelector
  extends StObject
     with Selector[ExcludedVideoGenderIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoGenderSelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoGenderIterator],
    orderBy: String => ExcludedVideoGenderSelector,
    withCondition: String => ExcludedVideoGenderSelector,
    withLimit: Double => ExcludedVideoGenderSelector
  ): ExcludedVideoGenderSelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoGenderSelector]
  }
}
