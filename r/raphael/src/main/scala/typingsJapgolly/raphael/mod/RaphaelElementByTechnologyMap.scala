package typingsJapgolly.raphael.mod

import org.scalajs.dom.Element
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelElementByTechnologyMap[TSvg /* <: SVGElement */, TVml /* <: Element */] extends StObject {
  
  var SVG: TSvg
  
  var VML: TVml
}
object RaphaelElementByTechnologyMap {
  
  inline def apply[TSvg /* <: SVGElement */, TVml /* <: Element */](SVG: TSvg, VML: TVml): RaphaelElementByTechnologyMap[TSvg, TVml] = {
    val __obj = js.Dynamic.literal(SVG = SVG.asInstanceOf[js.Any], VML = VML.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementByTechnologyMap[TSvg, TVml]]
  }
  
  extension [Self <: RaphaelElementByTechnologyMap[?, ?], TSvg /* <: SVGElement */, TVml /* <: Element */](x: Self & (RaphaelElementByTechnologyMap[TSvg, TVml])) {
    
    inline def setSVG(value: TSvg): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    inline def setVML(value: TVml): Self = StObject.set(x, "VML", value.asInstanceOf[js.Any])
  }
}
