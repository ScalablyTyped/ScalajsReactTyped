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
  * Fetches targeted proximities. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var targetedProximitySelector = AdsApp.targeting()
  *          .targetedProximities()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var targetedProximityIterator = targetedProximitySelector.get();
  *      while (targetedProximityIterator.hasNext()) {
  *        var targetedProximity = targetedProximityIterator.next();
  *      }
  */
@js.native
trait TargetedProximitySelector
  extends StObject
     with Selector[TargetedProximityIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
