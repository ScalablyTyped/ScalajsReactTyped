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
  * Fetches topics. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var topicSelector = AdsApp.display()
  *         .topics()
  *         .withCondition("Impressions > 100")
  *         .forDateRange("LAST_MONTH")
  *         .orderBy("Clicks DESC");
  *
  *     var topicIterator = topicSelector.get();
  *     while (topicIterator.hasNext()) {
  *       var topic = topicIterator.next();
  *     }
  */
@js.native
trait TopicSelector
  extends StObject
     with Selector[TopicIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
