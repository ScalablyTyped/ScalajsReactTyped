package typingsJapgolly.antvComponent.libTypesMod

import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import typingsJapgolly.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionFilterAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 染色色值
    */
  var color: String
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: Point
  
  /**
    * 图形上的 Shapes
    */
  var shapes: js.Array[IShape]
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: Point
}
object RegionFilterAnnotationCfg {
  
  inline def apply(color: String, container: IGroup, end: Point, shapes: js.Array[IShape], start: Point): RegionFilterAnnotationCfg = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionFilterAnnotationCfg]
  }
  
  extension [Self <: RegionFilterAnnotationCfg](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: js.Array[IShape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: IShape*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
