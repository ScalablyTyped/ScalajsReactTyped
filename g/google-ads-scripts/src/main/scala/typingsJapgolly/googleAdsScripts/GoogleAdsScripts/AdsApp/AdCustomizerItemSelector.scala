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
  * Fetches ad customizer items. Supports filtering and sorting.
  * Typical usage:
  *
  *       var adCustomizerItemSelector = adCustomizerSource
  *         .items()
  *         .withCondition("Impressions > 100")
  *         .forDateRange("LAST_MONTH")
  *         .orderBy("Clicks DESC");
  *
  *       var adCustomizerItemIterator = adCustomizerItemSelector.get();
  *       while (adCustomizerItemIterator.hasNext()) {
  *         var adCustomizerItem = adCustomizerItemIterator.next();
  *       }
  */
@js.native
trait AdCustomizerItemSelector
  extends StObject
     with Selector[AdCustomizerItemIterator]
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
     with SelectorOrderBy
     with SelectorForDateRange
