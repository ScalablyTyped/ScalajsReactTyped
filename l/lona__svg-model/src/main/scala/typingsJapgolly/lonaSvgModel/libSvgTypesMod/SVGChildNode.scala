package typingsJapgolly.lonaSvgModel.libSvgTypesMod

import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.desc
import typingsJapgolly.lonaSvgModel.lonaSvgModelStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGDefs
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGMask
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGGroup
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGDrawableNode
  - typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGUnknown
*/
trait SVGChildNode
  extends StObject
     with SVGNode
object SVGChildNode {
  
  inline def SVGCircle(attributes: SVGCircleAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGCircle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "circle")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGCircle]
  }
  
  inline def SVGDefs(children: js.Array[SVGChildNode]): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGDefs = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = "defs")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGDefs]
  }
  
  inline def SVGGroup(attributes: SVGBaseAttributes, children: js.Array[SVGChildNode]): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGGroup = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = "g")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGGroup]
  }
  
  inline def SVGMask(attributes: SVGBaseAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGMask = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "mask")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGMask]
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
  
  inline def SVGUnknown(name: title | desc): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGUnknown = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGUnknown]
  }
  
  inline def SVGUse(attributes: SVGUseAttributes): typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGUse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = "use")
    __obj.updateDynamic("type")("element")
    __obj.asInstanceOf[typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGUse]
  }
}
