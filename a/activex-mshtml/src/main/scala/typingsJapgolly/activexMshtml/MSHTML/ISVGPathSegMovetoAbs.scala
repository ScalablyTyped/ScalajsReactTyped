package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISVGPathSegMovetoAbs extends StObject {
  
  /* private */ @JSName("MSHTML.ISVGPathSegMovetoAbs_typekey")
  var MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs
  
  var x: Double
  
  var y: Double
}
object ISVGPathSegMovetoAbs {
  
  inline def apply(MSHTMLDotISVGPathSegMovetoAbs_typekey: ISVGPathSegMovetoAbs, x: Double, y: Double): ISVGPathSegMovetoAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegMovetoAbs_typekey")(MSHTMLDotISVGPathSegMovetoAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegMovetoAbs]
  }
  
  extension [Self <: ISVGPathSegMovetoAbs](x: Self) {
    
    inline def setMSHTMLDotISVGPathSegMovetoAbs_typekey(value: ISVGPathSegMovetoAbs): Self = StObject.set(x, "MSHTML.ISVGPathSegMovetoAbs_typekey", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
