package typingsJapgolly.jsts.jsts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplify {
  
  trait TopologyPreservingSimplifier extends StObject {
    
    def getResultGeometry(): Geometry
    
    /**
      * Sets the distance tolerance for the simplification.
      * All vertices in the simplified geometry will be within this distance of the original geometry.
      * The tolerance value must be non-negative. A tolerance value of zero is effectively a no-op.
      *
      * @param {double} distanceTolerance the approximation tolerance to use
      */
    def setDistanceTolerance(distanceTolerance: Double): Unit
  }
  object TopologyPreservingSimplifier {
    
    inline def apply(getResultGeometry: CallbackTo[Geometry], setDistanceTolerance: Double => Callback): TopologyPreservingSimplifier = {
      val __obj = js.Dynamic.literal(getResultGeometry = getResultGeometry.toJsFn, setDistanceTolerance = js.Any.fromFunction1((t0: Double) => setDistanceTolerance(t0).runNow()))
      __obj.asInstanceOf[TopologyPreservingSimplifier]
    }
    
    extension [Self <: TopologyPreservingSimplifier](x: Self) {
      
      inline def setGetResultGeometry(value: CallbackTo[Geometry]): Self = StObject.set(x, "getResultGeometry", value.toJsFn)
      
      inline def setSetDistanceTolerance(value: Double => Callback): Self = StObject.set(x, "setDistanceTolerance", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
