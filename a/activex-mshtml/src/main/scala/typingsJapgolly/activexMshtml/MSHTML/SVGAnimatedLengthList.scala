package typingsJapgolly.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedLengthList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGAnimatedLengthList_typekey")
  var MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList
  
  var animVal: SVGLengthList
  
  var baseVal: SVGLengthList
}
object SVGAnimatedLengthList {
  
  inline def apply(
    MSHTMLDotSVGAnimatedLengthList_typekey: SVGAnimatedLengthList,
    animVal: SVGLengthList,
    baseVal: SVGLengthList
  ): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAnimatedLengthList_typekey")(MSHTMLDotSVGAnimatedLengthList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
  
  extension [Self <: SVGAnimatedLengthList](x: Self) {
    
    inline def setAnimVal(value: SVGLengthList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: SVGLengthList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGAnimatedLengthList_typekey(value: SVGAnimatedLengthList): Self = StObject.set(x, "MSHTML.SVGAnimatedLengthList_typekey", value.asInstanceOf[js.Any])
  }
}
