package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteResult extends StObject {
  
  def getNumPois(): Double
  
  def getPoi(i: Double): AutocompleteResultPoi
  
  var keyword: String
}
object AutocompleteResult {
  
  inline def apply(getNumPois: CallbackTo[Double], getPoi: Double => AutocompleteResultPoi, keyword: String): AutocompleteResult = {
    val __obj = js.Dynamic.literal(getNumPois = getNumPois.toJsFn, getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResult]
  }
  
  extension [Self <: AutocompleteResult](x: Self) {
    
    inline def setGetNumPois(value: CallbackTo[Double]): Self = StObject.set(x, "getNumPois", value.toJsFn)
    
    inline def setGetPoi(value: Double => AutocompleteResultPoi): Self = StObject.set(x, "getPoi", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
