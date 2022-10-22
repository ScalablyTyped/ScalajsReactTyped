package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivingRouteResult extends StObject {
  
  var city: String
  
  def getEnd(): LocalResultPoi
  
  def getNumPlans(): Double
  
  def getPlan(i: Double): RoutePlan
  
  def getStart(): LocalResultPoi
  
  var moreResultsUrl: String
  
  var policy: DrivingPolicy
  
  var taxiFare: TaxiFare
}
object DrivingRouteResult {
  
  inline def apply(
    city: String,
    getEnd: CallbackTo[LocalResultPoi],
    getNumPlans: CallbackTo[Double],
    getPlan: Double => RoutePlan,
    getStart: CallbackTo[LocalResultPoi],
    moreResultsUrl: String,
    policy: DrivingPolicy,
    taxiFare: TaxiFare
  ): DrivingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = getEnd.toJsFn, getNumPlans = getNumPlans.toJsFn, getPlan = js.Any.fromFunction1(getPlan), getStart = getStart.toJsFn, moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], taxiFare = taxiFare.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingRouteResult]
  }
  
  extension [Self <: DrivingRouteResult](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setGetEnd(value: CallbackTo[LocalResultPoi]): Self = StObject.set(x, "getEnd", value.toJsFn)
    
    inline def setGetNumPlans(value: CallbackTo[Double]): Self = StObject.set(x, "getNumPlans", value.toJsFn)
    
    inline def setGetPlan(value: Double => RoutePlan): Self = StObject.set(x, "getPlan", js.Any.fromFunction1(value))
    
    inline def setGetStart(value: CallbackTo[LocalResultPoi]): Self = StObject.set(x, "getStart", value.toJsFn)
    
    inline def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setTaxiFare(value: TaxiFare): Self = StObject.set(x, "taxiFare", value.asInstanceOf[js.Any])
  }
}
