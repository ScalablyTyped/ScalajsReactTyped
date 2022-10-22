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
  * Fetches excluded YouTube videos. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var excludedYouTubeVideoSelector = AdsApp.display()
  *          .excludedYouTubeVideos()
  *          .withCondition("AdGroupStatus = 'ENABLED'")
  *          .orderBy("AdGroupName DESC");
  *
  *      var excludedYouTubeVideoIterator = excludedYouTubeVideoSelector.get();
  *      while (excludedYouTubeVideoIterator.hasNext()) {
  *        var excludedYouTubeVideo = excludedYouTubeVideoIterator.next();
  *      }
  */
@js.native
trait ExcludedYouTubeVideoSelector
  extends StObject
     with Selector[ExcludedYouTubeVideoIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
