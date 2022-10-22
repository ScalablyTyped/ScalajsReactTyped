package typingsJapgolly.antvComponent

import typingsJapgolly.antvGBase.libTypesMod.BBox
import typingsJapgolly.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilAlignMod {
  
  @JSImport("@antv/component/lib/util/align", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlignPoint(x: Double, y: Double, offset: Double, width: Double, height: Double, position: String): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def getAlignPoint(
    x: Double,
    y: Double,
    offset: Double,
    width: Double,
    height: Double,
    position: String,
    limitBox: BBox
  ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], position.asInstanceOf[js.Any], limitBox.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def getOutSides(x: Double, y: Double, width: Double, height: Double, limitBox: BBox): OutSides = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutSides")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], limitBox.asInstanceOf[js.Any])).asInstanceOf[OutSides]
  
  inline def getPointByPosition(x: Double, y: Double, offset: Double, width: Double, height: Double, position: String): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("getPointByPosition")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  trait OutSides extends StObject {
    
    var bottom: Boolean
    
    var left: Boolean
    
    var right: Boolean
    
    var top: Boolean
  }
  object OutSides {
    
    inline def apply(bottom: Boolean, left: Boolean, right: Boolean, top: Boolean): OutSides = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutSides]
    }
    
    extension [Self <: OutSides](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
