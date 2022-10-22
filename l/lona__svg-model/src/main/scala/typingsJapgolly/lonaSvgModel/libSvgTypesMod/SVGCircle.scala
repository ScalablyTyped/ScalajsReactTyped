package typingsJapgolly.lonaSvgModel.libSvgTypesMod

import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.circle
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGCircle
  extends StObject
     with SVGPathConvertibleNode {
  
  var attributes: SVGCircleAttributes
  
  var name: circle
  
  var `type`: element
}
object SVGCircle {
  
  inline def apply(attributes: SVGCircleAttributes): SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGCircle]
  }
  
  extension [Self <: SVGCircle](x: Self) {
    
    inline def setAttributes(value: SVGCircleAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: circle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
