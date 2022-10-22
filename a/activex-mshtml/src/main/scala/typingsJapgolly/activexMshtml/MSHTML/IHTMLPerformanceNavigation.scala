package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLPerformanceNavigation extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLPerformanceNavigation_typekey")
  var MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation
  
  val redirectCount: Double
  
  def toJSON(): Any
  
  val `type`: Double
}
object IHTMLPerformanceNavigation {
  
  inline def apply(
    MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: CallbackTo[Any],
    `type`: Double
  ): IHTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = toJSON.toJsFn)
    __obj.updateDynamic("MSHTML.IHTMLPerformanceNavigation_typekey")(MSHTMLDotIHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLPerformanceNavigation]
  }
  
  extension [Self <: IHTMLPerformanceNavigation](x: Self) {
    
    inline def setMSHTMLDotIHTMLPerformanceNavigation_typekey(value: IHTMLPerformanceNavigation): Self = StObject.set(x, "MSHTML.IHTMLPerformanceNavigation_typekey", value.asInstanceOf[js.Any])
    
    inline def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
