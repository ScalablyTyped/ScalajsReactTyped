package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLTimeRanges extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLTimeRanges_typekey")
  var MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges
  
  def end(index: Double): Double
  
  val length: Double
  
  def start(index: Double): Double
}
object IHTMLTimeRanges {
  
  inline def apply(
    MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges,
    end: Double => Double,
    length: Double,
    start: Double => Double
  ): IHTMLTimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.updateDynamic("MSHTML.IHTMLTimeRanges_typekey")(MSHTMLDotIHTMLTimeRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLTimeRanges]
  }
  
  extension [Self <: IHTMLTimeRanges](x: Self) {
    
    inline def setEnd(value: Double => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLTimeRanges_typekey(value: IHTMLTimeRanges): Self = StObject.set(x, "MSHTML.IHTMLTimeRanges_typekey", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
