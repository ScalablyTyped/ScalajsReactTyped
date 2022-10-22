package typingsJapgolly.lonaSvgModel.libSvgTypesMod

import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.element
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGPath
  extends StObject
     with SVGPathConvertibleNode {
  
  var attributes: SVGPathAttributes
  
  var name: path
  
  var `type`: element
}
object SVGPath {
  
  inline def apply(attributes: SVGPathAttributes): SVGPath = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "path")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[SVGPath]
  }
  
  extension [Self <: SVGPath](x: Self) {
    
    inline def setAttributes(value: SVGPathAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: path): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
