package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsStats extends StObject {
  
  def getAverageCpc(): Double
  
  def getAverageCpm(): Double
  
  def getAverageCpv(): Double
  
  def getAveragePageviews(): Double
  
  def getAveragePosition(): Double
  
  def getAverageTimeOnSite(): Double
  
  def getBounceRage(): Double
  
  def getClicks(): Double
  
  def getConversionRate(): Double
  
  def getConversions(): Double
  
  def getCost(): Double
  
  def getCtr(): Double
  
  def getImpressions(): Double
  
  def getViewRate(): Double
  
  def getViews(): Double
}
object AdWordsStats {
  
  inline def apply(
    getAverageCpc: CallbackTo[Double],
    getAverageCpm: CallbackTo[Double],
    getAverageCpv: CallbackTo[Double],
    getAveragePageviews: CallbackTo[Double],
    getAveragePosition: CallbackTo[Double],
    getAverageTimeOnSite: CallbackTo[Double],
    getBounceRage: CallbackTo[Double],
    getClicks: CallbackTo[Double],
    getConversionRate: CallbackTo[Double],
    getConversions: CallbackTo[Double],
    getCost: CallbackTo[Double],
    getCtr: CallbackTo[Double],
    getImpressions: CallbackTo[Double],
    getViewRate: CallbackTo[Double],
    getViews: CallbackTo[Double]
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal(getAverageCpc = getAverageCpc.toJsFn, getAverageCpm = getAverageCpm.toJsFn, getAverageCpv = getAverageCpv.toJsFn, getAveragePageviews = getAveragePageviews.toJsFn, getAveragePosition = getAveragePosition.toJsFn, getAverageTimeOnSite = getAverageTimeOnSite.toJsFn, getBounceRage = getBounceRage.toJsFn, getClicks = getClicks.toJsFn, getConversionRate = getConversionRate.toJsFn, getConversions = getConversions.toJsFn, getCost = getCost.toJsFn, getCtr = getCtr.toJsFn, getImpressions = getImpressions.toJsFn, getViewRate = getViewRate.toJsFn, getViews = getViews.toJsFn)
    __obj.asInstanceOf[AdWordsStats]
  }
  
  extension [Self <: AdWordsStats](x: Self) {
    
    inline def setGetAverageCpc(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageCpc", value.toJsFn)
    
    inline def setGetAverageCpm(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageCpm", value.toJsFn)
    
    inline def setGetAverageCpv(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageCpv", value.toJsFn)
    
    inline def setGetAveragePageviews(value: CallbackTo[Double]): Self = StObject.set(x, "getAveragePageviews", value.toJsFn)
    
    inline def setGetAveragePosition(value: CallbackTo[Double]): Self = StObject.set(x, "getAveragePosition", value.toJsFn)
    
    inline def setGetAverageTimeOnSite(value: CallbackTo[Double]): Self = StObject.set(x, "getAverageTimeOnSite", value.toJsFn)
    
    inline def setGetBounceRage(value: CallbackTo[Double]): Self = StObject.set(x, "getBounceRage", value.toJsFn)
    
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
