package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGNumber extends StObject {
  
  /* private */ @JSName("MSHTML.SVGNumber_typekey")
  var MSHTMLDotSVGNumber_typekey: SVGNumber
  
  var value: Double
}
object SVGNumber {
  
  inline def apply(MSHTMLDotSVGNumber_typekey: SVGNumber, value: Double): SVGNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGNumber_typekey")(MSHTMLDotSVGNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGNumber]
  }
  
  extension [Self <: SVGNumber](x: Self) {
    
    inline def setMSHTMLDotSVGNumber_typekey(value: SVGNumber): Self = StObject.set(x, "MSHTML.SVGNumber_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
