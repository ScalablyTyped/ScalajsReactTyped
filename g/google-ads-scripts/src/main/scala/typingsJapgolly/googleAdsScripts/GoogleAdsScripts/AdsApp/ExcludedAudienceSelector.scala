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
  * Fetches excludedAudiences. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *  var excludedAudienceSelector = AdsApp.display()
  *      .excludedAudiences()
  *      .withCondition("Impressions > 100")
  *      .forDateRange("LAST_MONTH")
  *      .orderBy("Clicks DESC");
  *
  *  var excludedAudienceIterator = excludedAudienceSelector.get();
  *  while (excludedAudienceIterator.hasNext()) {
  *    var excludedAudience = excludedAudienceIterator.next();
  *  }
  */
@js.native
trait ExcludedAudienceSelector
  extends StObject
     with Selector[AudienceIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
