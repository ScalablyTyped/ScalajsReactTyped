package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPreserveAspectRatio extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPreserveAspectRatio_typekey")
  var MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio
  
  var align: Double
  
  var meetOrSlice: Double
}
object SVGPreserveAspectRatio {
  
  inline def apply(
    MSHTMLDotSVGPreserveAspectRatio_typekey: SVGPreserveAspectRatio,
    align: Double,
    meetOrSlice: Double
  ): SVGPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPreserveAspectRatio_typekey")(MSHTMLDotSVGPreserveAspectRatio_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPreserveAspectRatio]
  }
  
  extension [Self <: SVGPreserveAspectRatio](x: Self) {
    
    inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGPreserveAspectRatio_typekey(value: SVGPreserveAspectRatio): Self = StObject.set(x, "MSHTML.SVGPreserveAspectRatio_typekey", value.asInstanceOf[js.Any])
    
    inline def setMeetOrSlice(value: Double): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
  }
}
