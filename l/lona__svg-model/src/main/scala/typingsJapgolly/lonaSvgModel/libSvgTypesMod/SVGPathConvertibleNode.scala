package typingsJapgolly.lonaSvgModel.libSvgTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPath
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPolyline
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPolygon
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGCircle
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGRect
*/
trait SVGPathConvertibleNode
  extends StObject
     with SVGDrawableNode
object SVGPathConvertibleNode {
  
  inline def SVGCircle(attributes: SVGCircleAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGCircle]
  }
  
  inline def SVGPath(attributes: SVGPathAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPath = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "path")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPath]
  }
  
  inline def SVGPolygon(attributes: SVGPolygonAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPolygon = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polygon")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPolygon]
  }
  
  inline def SVGPolyline(attributes: SVGPolylineAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPolyline = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "polyline")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPolyline]
  }
  
  inline def SVGRect(attributes: SVGRectAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGRect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "rect")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGRect]
  }
}
