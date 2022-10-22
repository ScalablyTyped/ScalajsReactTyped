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
  * Fetches platforms. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var platformSelector = AdsApp.targeting()
  *          .platforms()
  *          .withCondition("Impressions > 100")
  *          .forDateRange("LAST_MONTH")
  *          .orderBy("Clicks DESC");
  *
  *      var platformIterator = platformSelector.get();
  *      while (platformIterator.hasNext()) {
  *        var platform = platformIterator.next();
  *      }
  */
@js.native
trait PlatformSelector
  extends StObject
     with Selector[PlatformIterator]
     with SelectorForDateRange
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit {
  
  /** Restricts this selector to only select desktop targets. */
  def desktop(): this.type = js.native
  
  /** Restricts this selector to only select mobile targets. */
  def mobile(): this.type = js.native
  
  /** Restricts this selector to only select tablet targets. */
  def tablet(): this.type = js.native
}
