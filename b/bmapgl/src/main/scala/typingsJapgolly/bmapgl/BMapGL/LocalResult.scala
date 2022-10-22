package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalResult extends StObject {
  
  var bounds: Bounds
  
  var center: LocalResultPoi
  
  var city: String
  
  def getCityList(): js.Array[Any]
  
  def getCurrentNumPois(): Double
  
  def getNumPages(): Double
  
  def getNumPois(): Double
  
  def getPageIndex(): Double
  
  def getPoi(i: Double): LocalResultPoi
  
  var keyword: String
  
  var moreResultsUrl: String
  
  var province: String
  
  var radius: Double
  
  var suggestions: js.Array[String]
}
object LocalResult {
  
  inline def apply(
    bounds: Bounds,
    center: LocalResultPoi,
    city: String,
    getCityList: CallbackTo[js.Array[Any]],
    getCurrentNumPois: CallbackTo[Double],
    getNumPages: CallbackTo[Double],
    getNumPois: CallbackTo[Double],
    getPageIndex: CallbackTo[Double],
    getPoi: Double => LocalResultPoi,
    keyword: String,
    moreResultsUrl: String,
    province: String,
    radius: Double,
    suggestions: js.Array[String]
  ): LocalResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], getCityList = getCityList.toJsFn, getCurrentNumPois = getCurrentNumPois.toJsFn, getNumPages = getNumPages.toJsFn, getNumPois = getNumPois.toJsFn, getPageIndex = getPageIndex.toJsFn, getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalResult]
  }
  
  extension [Self <: LocalResult](x: Self) {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: LocalResultPoi): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setGetCityList(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getCityList", value.toJsFn)
    
    inline def setGetCurrentNumPois(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentNumPois", value.toJsFn)
    
    inline def setGetNumPages(value: CallbackTo[Double]): Self = StObject.set(x, "getNumPages", value.toJsFn)
    
    inline def setGetNumPois(value: CallbackTo[Double]): Self = StObject.set(x, "getNumPois", value.toJsFn)
    
    inline def setGetPageIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getPageIndex", value.toJsFn)
    
    inline def setGetPoi(value: Double => LocalResultPoi): Self = StObject.set(x, "getPoi", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
