package typingsJapgolly.jsts.jsts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densify {
  
  trait Densifier extends StObject {
    
    /**
      * Gets the densified geometry.
      */
    def getResultGeometry(): Geometry
    
    /**
      * Sets the distance tolerance for the densification.
      * All line segments in the densified geometry will be no longer than
      * the distance tolerance. simplified geometry will be within this distance
      * of the original geometry. The distance tolerance must be positive.
      *
      * @param {double} distanceTolerance the densification tolerance to use
      */
    def setDistanceTolerance(distanceTolerance: Double): Unit
  }
  object Densifier {
    
    inline def apply(getResultGeometry: CallbackTo[Geometry], setDistanceTolerance: Double => Callback): Densifier = {
      val __obj = js.Dynamic.literal(getResultGeometry = getResultGeometry.toJsFn, setDistanceTolerance = js.Any.fromFunction1((t0: Double) => setDistanceTolerance(t0).runNow()))
      __obj.asInstanceOf[Densifier]
    }
    
    extension [Self <: Densifier](x: Self) {
      
      inline def setGetResultGeometry(value: CallbackTo[Geometry]): Self = StObject.set(x, "getResultGeometry", value.toJsFn)
      
      inline def setSetDistanceTolerance(value: Double => Callback): Self = StObject.set(x, "setDistanceTolerance", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
