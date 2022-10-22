package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorForDateRange
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches ad groups. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var adGroupSelector = AdsApp
  *          .adGroups()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var adGroupIterator = adGroupSelector.get();
  *      while (adGroupIterator.hasNext()) {
  *        var adGroup = adGroupIterator.next();
  *      }
  */
@js.native
trait AdGroupSelector
  extends StObject
     with Selector[AdGroupIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
