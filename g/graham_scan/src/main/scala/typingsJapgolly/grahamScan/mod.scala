package typingsJapgolly.grahamScan

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grahamScan.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graham_scan", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ConvexHullGrahamScan {
    
    /* CompleteClass */
    override def addPoint(x: Double, y: Double): Unit = js.native
    
    /* CompleteClass */
    override def getHull(): js.Array[X] = js.native
  }
  
  trait ConvexHullGrahamScan extends StObject {
    
    def addPoint(x: Double, y: Double): Unit
    
    def getHull(): js.Array[X]
  }
  object ConvexHullGrahamScan {
    
    inline def apply(addPoint: (Double, Double) => Callback, getHull: CallbackTo[js.Array[X]]): ConvexHullGrahamScan = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction2((t0: Double, t1: Double) => (addPoint(t0, t1)).runNow()), getHull = getHull.toJsFn)
      __obj.asInstanceOf[ConvexHullGrahamScan]
    }
    
    extension [Self <: ConvexHullGrahamScan](x: Self) {
      
      inline def setAddPoint(value: (Double, Double) => Callback): Self = StObject.set(x, "addPoint", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setGetHull(value: CallbackTo[js.Array[X]]): Self = StObject.set(x, "getHull", value.toJsFn)
    }
  }
}
