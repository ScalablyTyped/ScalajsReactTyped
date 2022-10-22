package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic SVGRect which can be animated. */
trait SVGAnimatedRect extends StObject {
  
  /* standard dom */
  val animVal: DOMRectReadOnly
  
  /* standard dom */
  val baseVal: org.scalajs.dom.DOMRect
}
object SVGAnimatedRect {
  
  inline def apply(animVal: DOMRectReadOnly, baseVal: org.scalajs.dom.DOMRect): SVGAnimatedRect = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedRect]
  }
  
  extension [Self <: SVGAnimatedRect](x: Self) {
    
    inline def setAnimVal(value: DOMRectReadOnly): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: org.scalajs.dom.DOMRect): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
