package typingsJapgolly.dxf

import japgolly.scalajs.react.Callback
import typingsJapgolly.dxf.commonMod.Point2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  trait Box extends StObject {
    
    def expandByPoint(point: UtilVertex): Unit
    
    var max: Point2D
    
    var min: Point2D
    
    var valid: Boolean
  }
  object Box {
    
    inline def apply(expandByPoint: UtilVertex => Callback, max: Point2D, min: Point2D, valid: Boolean): Box = {
      val __obj = js.Dynamic.literal(expandByPoint = js.Any.fromFunction1((t0: UtilVertex) => expandByPoint(t0).runNow()), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    extension [Self <: Box](x: Self) {
      
      inline def setExpandByPoint(value: UtilVertex => Callback): Self = StObject.set(x, "expandByPoint", js.Any.fromFunction1((t0: UtilVertex) => value(t0).runNow()))
      
      inline def setMax(value: Point2D): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Point2D): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedContent extends StObject {
    
    var box2: Box
  }
  object ParsedContent {
    
    inline def apply(box2: Box): ParsedContent = {
      val __obj = js.Dynamic.literal(box2 = box2.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedContent]
    }
    
    extension [Self <: ParsedContent](x: Self) {
      
      inline def setBox2(value: Box): Self = StObject.set(x, "box2", value.asInstanceOf[js.Any])
    }
  }
  
  type UtilVertex = js.Tuple2[Double, Double]
}
