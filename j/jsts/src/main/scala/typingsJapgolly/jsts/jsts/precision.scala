package typingsJapgolly.jsts.jsts

import japgolly.scalajs.react.Callback
import typingsJapgolly.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precision {
  
  trait GeometryPrecisionReducer extends StObject {
    
    def reduce(geom: Geometry): Geometry
    
    /**
      * Sets whether the PrecisionModel of the new reduced Geometry will be changed
      * to be the PrecisionModel supplied to specify the precision reduction.
      * The default is to NOT change the precision model
      *
      * @param changePrecisionModel if true the precision model of the created Geometry
      * will be the the precisionModel supplied in the constructor.
      */
    def setChangePrecisionModel(changePrecisionModel: Boolean): Unit
    
    /**
      * Sets whether the precision reduction will be done in pointwise fashion only.
      * Pointwise precision reduction reduces the precision of the individual coordinates only,
      * but does not attempt to recreate valid topology.
      * This is only relevant for geometries containing polygonal components.
      *
      * @param isPointwise if reduction should be done pointwise only
      */
    def setPointwise(isPointwise: Boolean): Unit
    
    /**
      * Sets whether the reduction will result in collapsed components being removed completely,
      * or simply being collapsed to an (invalid) Geometry of the same type.
      * The default is to remove collapsed components.
      *
      * @param removeCollapsed if true collapsed components will be removed
      */
    def setRemoveCollapsedComponents(removeCollapsed: Boolean): Unit
  }
  object GeometryPrecisionReducer {
    
    inline def apply(
      reduce: Geometry => Geometry,
      setChangePrecisionModel: Boolean => Callback,
      setPointwise: Boolean => Callback,
      setRemoveCollapsedComponents: Boolean => Callback
    ): GeometryPrecisionReducer = {
      val __obj = js.Dynamic.literal(reduce = js.Any.fromFunction1(reduce), setChangePrecisionModel = js.Any.fromFunction1((t0: Boolean) => setChangePrecisionModel(t0).runNow()), setPointwise = js.Any.fromFunction1((t0: Boolean) => setPointwise(t0).runNow()), setRemoveCollapsedComponents = js.Any.fromFunction1((t0: Boolean) => setRemoveCollapsedComponents(t0).runNow()))
      __obj.asInstanceOf[GeometryPrecisionReducer]
    }
    
    extension [Self <: GeometryPrecisionReducer](x: Self) {
      
      inline def setReduce(value: Geometry => Geometry): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setSetChangePrecisionModel(value: Boolean => Callback): Self = StObject.set(x, "setChangePrecisionModel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetPointwise(value: Boolean => Callback): Self = StObject.set(x, "setPointwise", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetRemoveCollapsedComponents(value: Boolean => Callback): Self = StObject.set(x, "setRemoveCollapsedComponents", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
}
