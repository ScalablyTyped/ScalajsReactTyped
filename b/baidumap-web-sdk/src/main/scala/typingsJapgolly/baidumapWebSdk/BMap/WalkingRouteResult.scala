package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalkingRouteResult extends StObject {
  
  var city: String
  
  def getEnd(): LocalResultPoi
  
  def getNumPlans(): Double
  
  def getPlan(i: Double): RoutePlan
  
  def getStart(): LocalResultPoi
}
object WalkingRouteResult {
  
  inline def apply(
    city: String,
    getEnd: CallbackTo[LocalResultPoi],
    getNumPlans: CallbackTo[Double],
    getPlan: Double => RoutePlan,
    getStart: CallbackTo[LocalResultPoi]
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = getEnd.toJsFn, getNumPlans = getNumPlans.toJsFn, getPlan = js.Any.fromFunction1(getPlan), getStart = getStart.toJsFn)
    __obj.asInstanceOf[WalkingRouteResult]
  }
  
  extension [Self <: WalkingRouteResult](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setGetEnd(value: CallbackTo[LocalResultPoi]): Self = StObject.set(x, "getEnd", value.toJsFn)
    
    inline def setGetNumPlans(value: CallbackTo[Double]): Self = StObject.set(x, "getNumPlans", value.toJsFn)
    
    inline def setGetPlan(value: Double => RoutePlan): Self = StObject.set(x, "getPlan", js.Any.fromFunction1(value))
    
    inline def setGetStart(value: CallbackTo[LocalResultPoi]): Self = StObject.set(x, "getStart", value.toJsFn)
  }
}
