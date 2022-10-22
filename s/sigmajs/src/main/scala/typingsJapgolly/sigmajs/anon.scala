package typingsJapgolly.sigmajs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sigmajs.SigmaJs.Edge
import typingsJapgolly.sigmajs.SigmaJs.SVGEdgeLabels
import typingsJapgolly.sigmajs.SigmaJs.SVGObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictrenderType
    extends StObject
       with /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
    
    var labels: SVGEdgeLabels
  }
  object DictrenderType {
    
    inline def apply(labels: SVGEdgeLabels): DictrenderType = {
      val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictrenderType]
    }
    
    extension [Self <: DictrenderType](x: Self) {
      
      inline def setLabels(value: SVGEdgeLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
