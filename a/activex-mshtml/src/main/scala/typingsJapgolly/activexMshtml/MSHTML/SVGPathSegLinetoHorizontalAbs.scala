package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPathSegLinetoHorizontalAbs extends StObject {
  
  /* private */ @JSName("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")
  var MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs
  
  var pathSegType: Double
  
  val pathSegTypeAsLetter: String
  
  var x: Double
}
object SVGPathSegLinetoHorizontalAbs {
  
  inline def apply(
    MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey: SVGPathSegLinetoHorizontalAbs,
    pathSegType: Double,
    pathSegTypeAsLetter: String,
    x: Double
  ): SVGPathSegLinetoHorizontalAbs = {
    val __obj = js.Dynamic.literal(pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPathSegLinetoHorizontalAbs_typekey")(MSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegLinetoHorizontalAbs]
  }
  
  extension [Self <: SVGPathSegLinetoHorizontalAbs](x: Self) {
    
    inline def setMSHTMLDotSVGPathSegLinetoHorizontalAbs_typekey(value: SVGPathSegLinetoHorizontalAbs): Self = StObject.set(x, "MSHTML.SVGPathSegLinetoHorizontalAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setPathSegType(value: Double): Self = StObject.set(x, "pathSegType", value.asInstanceOf[js.Any])
    
    inline def setPathSegTypeAsLetter(value: String): Self = StObject.set(x, "pathSegTypeAsLetter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
