package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics common to various entity types. Typical usage:
  *
  *      var stats = campaign.getStatsFor("LAST_MONTH");
  *      var impressions = stats.getImpressions();
  *      var clicks = stats.getClicks();
  *      // etc.
  *
  * Note that Analytics-related stats (`Stats.getAveragePageviews()`, `Stats.getAverageTimeOnSite()` and `Stats.getBounceRate()`)
  * are only available for Campaigns, Ad groups, Keywords, and Ads. The method calls will return null for other entity types.
  */
trait Stats extends StObject {
  
  /** Returns the average cost per click. */
  def getAverageCpc(): Double
  
  /** Returns the average cost per thousand impressions. */
  def getAverageCpm(): Double
  
  /** Returns the average cost per view. */
  def getAverageCpv(): Double
  
  /**
    * Returns the average number of pages viewed per visit. Only available for Campaigns, Ad groups, Keywords, and Ads.
    * Returns `null` for other entity types. Returns `null` if the account is not linked to Analytics.
    */
  def getAveragePageviews(): Double
  
  /**
    * ~~Returns the average position. Returns `null` if this is a Display entity that doesn't have an average position.~~
    *
    * @deprecated **Deprecated**. Starting the week of September 30, 2019 this method will return `null`.
    */
  def getAveragePosition(): Null
  
  /**
    * Returns the average time a visitor spent on site, in seconds. Only available for Campaigns, Ad groups, Keywords, and Ads.
    * Returns `null` for other entity types. Returns `null` if the account is not linked to Analytics.
    */
  def getAverageTimeOnSite(): Double
  
  /**
    * Returns the bounce rate of the entity, in `0..1` range. When a visitor to your site sees only one page or triggers only one event,
    * Analytics considers this visit a "bounce." Only available for Campaigns, Ad groups, Keywords, and Ads.
    * Returns `null` for other entity types. Returns `null` if the account is not linked to Analytics.
    */
  def getBounceRate(): Double
  
  /** Returns the number of clicks. */
  def getClicks(): Double
  
  /** Returns the rate of conversions. */
  def getConversionRate(): Double
  
  /** Returns the number of conversions. */
  def getConversions(): Double
  
  /** Returns the cost in the default currency of the account. */
  def getCost(): Double
  
  /** Returns the click through rate of the entity, in `0..1` range. */
  def getCtr(): Double
  
  /** Returns the number of impressions. */
  def getImpressions(): Double
  
  /** Returns the view rate of the entity, in `0..1` range. */
  def getViewRate(): Double
  
  /** Returns the number of video views. */
  def getViews(): Double
}
object Stats {
  
  inline def apply(
    getAverageCpc: CallbackTo[Double],
    getAverageCpm: CallbackTo[Double],
    getAverageCpv: CallbackTo[Double],
    getAveragePageviews: CallbackTo[Double],
    getAveragePosition: CallbackTo[Null],
    getAverageTimeOnSite: CallbackTo[Double],
    getBounceRate: CallbackTo[Double],
    getClicks: CallbackTo[Double],
    getConversionRate: CallbackTo[Double],
    getConversions: CallbackTo[Double],
    getCost: CallbackTo[Double],
    getCtr: CallbackTo[Double],
    getImpressions: CallbackTo[Double],
    getViewRate: CallbackTo[Double],
    getViews: CallbackTo[Double]
  ): Stats = {
    val __obj = js.Dynamic.literal(getAverageCpc = getAverageCpc.toJsFn, getAverageCpm = getAverageCpm.toJsFn, getAverageCpv = getAverageCpv.toJsFn, getAveragePageviews = getAveragePageviews.toJsFn, getAveragePosition = getAveragePosition.toJsFn, getAverageTimeOnSite = getAverageTimeOnSite.toJsFn, getBounceRate = getBounceRate.toJsFn, getClicks = getClicks.toJsFn, getConversionRate = getConversionRate.toJsFn, getConversions = getConversions.toJsFn, getCost = getCost.toJsFn, getCtr = getCtr.toJsFn, getImpressions = getImpressions.toJsFn, getViewRate = getViewRate.toJsFn, getViews = getViews.toJsFn)
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setGetAverageCpc(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageCpc", value.toJsFn)
    
    inline def setGetAverageCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageCpm", value.toJsFn)
    
    inline def setGetAverageCpv(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageCpv", value.toJsFn)
    
    inline def setGetAveragePageviews(value: CallbackTo[Double]): Self = StObject.set(x, "getAveragePageviews", value.toJsFn)
    
    inline def setGetAveragePosition(value: CallbackTo[Null]): Self = StObject.set(x, "getAveragePosition", value.toJsFn)
    
    inline def setGetAverageTimeOnSite(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageTimeOnSite", value.toJsFn)
    
    inline def setGetBounceRate(value: CallbackTo[Double]): Self = StObject.set(x, "getBounceRate", value.toJsFn)
    
    inline def setGetClicks(value: CallbackTo[Double]): Self = StObject.set(x, "getClicks", value.toJsFn)
    
    inline def setGetConversionRate(value: CallbackTo[Double]): Self = StObject.set(x, "getConversionRate", value.toJsFn)
    
    inline def setGetConversions(value: CallbackTo[Double]): Self = StObject.set(x, "getConversions", value.toJsFn)
    
    inline def setGetCost(value: CallbackTo[Double]): Self = StObject.set(x, "getCost", value.toJsFn)
    
    inline def setGetCtr(value: CallbackTo[Double]): Self = StObject.set(x, "getCtr", value.toJsFn)
    
    inline def setGetImpressions(value: CallbackTo[Double]): Self = StObject.set(x, "getImpressions", value.toJsFn)
    
    inline def setGetViewRate(value: CallbackTo[Double]): Self = StObject.set(x, "getViewRate", value.toJsFn)
    
    inline def setGetViews(value: CallbackTo[Double]): Self = StObject.set(x, "getViews", value.toJsFn)
  }
}
