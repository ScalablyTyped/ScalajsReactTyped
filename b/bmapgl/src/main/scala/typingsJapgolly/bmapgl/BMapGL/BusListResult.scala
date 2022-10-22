package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusListResult extends StObject {
  
  var city: String
  
  def getBusListItem(i: Double): BusListItem
  
  def getNumBusList(): Double
  
  var keyword: String
  
  var moreResultsUrl: String
}
object BusListResult {
  
  inline def apply(
    city: String,
    getBusListItem: Double => BusListItem,
    getNumBusList: CallbackTo[Double],
    keyword: String,
    moreResultsUrl: String
  ): BusListResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getBusListItem = js.Any.fromFunction1(getBusListItem), getNumBusList = getNumBusList.toJsFn, keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusListResult]
  }
  
  extension [Self <: BusListResult](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setGetBusListItem(value: Double => BusListItem): Self = StObject.set(x, "getBusListItem", js.Any.fromFunction1(value))
    
    inline def setGetNumBusList(value: CallbackTo[Double]): Self = StObject.set(x, "getNumBusList", value.toJsFn)
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
  }
}
