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
  * Fetches excluded video mobile application categories. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedVideoMobileAppCategorySelector = AdsApp.videoTargeting()
  *          .excludedVideoMobileAppCategories()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedVideoMobileAppCategoryIterator = excludedVideoMobileAppCategorySelector.get();
  *      while (excludedVideoMobileAppCategoryIterator.hasNext()) {
  *        var excludedVideoMobileAppCategory = excludedVideoMobileAppCategoryIterator.next();
  *      }
  */
trait ExcludedVideoMobileAppCategorySelector
  extends StObject
     with Selector[ExcludedVideoMobileAppCategoryIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithLimit
object ExcludedVideoMobileAppCategorySelector {
  
  inline def apply(
    get: CallbackTo[ExcludedVideoMobileAppCategoryIterator],
    orderBy: String => ExcludedVideoMobileAppCategorySelector,
    withCondition: String => ExcludedVideoMobileAppCategorySelector,
    withLimit: Double => ExcludedVideoMobileAppCategorySelector
  ): ExcludedVideoMobileAppCategorySelector = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[ExcludedVideoMobileAppCategorySelector]
  }
}
