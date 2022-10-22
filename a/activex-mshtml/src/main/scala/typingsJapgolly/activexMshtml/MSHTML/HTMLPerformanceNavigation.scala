package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPerformanceNavigation extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLPerformanceNavigation_typekey")
  var MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation
  
  val redirectCount: Double
  
  def toJSON(): Any
  
  val `type`: Double
}
object HTMLPerformanceNavigation {
  
  inline def apply(
    MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: CallbackTo[Any],
    `type`: Double
  ): HTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.updateDynamic("MSHTML.HTMLPerformanceNavigation_typekey")(MSHTMLDotHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformanceNavigation]
  }
  
  extension [Self <: HTMLPerformanceNavigation](x: Self) {
    
    inline def setMSHTMLDotHTMLPerformanceNavigation_typekey(value: HTMLPerformanceNavigation): Self = StObject.set(x, "MSHTML.HTMLPerformanceNavigation_typekey", value.asInstanceOf[js.Any])
    
    inline def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
