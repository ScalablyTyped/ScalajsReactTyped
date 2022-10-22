package typingsJapgolly.raphael.mod

import org.scalajs.dom.Element
import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGEllipseElement
import org.scalajs.dom.SVGImageElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGTextElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelElementImplementationMap extends StObject {
  
  /** The elements that implement the {@link RaphaelPaper.circle} shape. */
  var circle: RaphaelElementByTechnologyMap[SVGCircleElement, Element]
  
  /** The elements that implement the {@link RaphaelPaper.ellipse} shape. */
  var ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, Element]
  
  /** The elements that implement the {@link RaphaelPaper.image} shape. */
  var image: RaphaelElementByTechnologyMap[SVGImageElement, Element]
  
  /** The elements that implement the {@link RaphaelPaper.path} shape. */
  var path: RaphaelElementByTechnologyMap[SVGPathElement, Element]
  
  /** The elements that implement the {@link RaphaelPaper.rect} shape. */
  var rect: RaphaelElementByTechnologyMap[SVGRectElement, Element]
  
  /** The elements that implement the {@link RaphaelPaper.text} shape. */
  var text: RaphaelElementByTechnologyMap[SVGTextElement, Element]
}
object RaphaelElementImplementationMap {
  
  inline def apply(
    circle: RaphaelElementByTechnologyMap[SVGCircleElement, Element],
    ellipse: RaphaelElementByTechnologyMap[SVGEllipseElement, Element],
    image: RaphaelElementByTechnologyMap[SVGImageElement, Element],
    path: RaphaelElementByTechnologyMap[SVGPathElement, Element],
    rect: RaphaelElementByTechnologyMap[SVGRectElement, Element],
    text: RaphaelElementByTechnologyMap[SVGTextElement, Element]
  ): RaphaelElementImplementationMap = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelElementImplementationMap]
  }
  
  extension [Self <: RaphaelElementImplementationMap](x: Self) {
    
    inline def setCircle(value: RaphaelElementByTechnologyMap[SVGCircleElement, Element]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setEllipse(value: RaphaelElementByTechnologyMap[SVGEllipseElement, Element]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    inline def setImage(value: RaphaelElementByTechnologyMap[SVGImageElement, Element]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setPath(value: RaphaelElementByTechnologyMap[SVGPathElement, Element]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRect(value: RaphaelElementByTechnologyMap[SVGRectElement, Element]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setText(value: RaphaelElementByTechnologyMap[SVGTextElement, Element]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
