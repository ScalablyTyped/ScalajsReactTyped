package typingsJapgolly.poissonDiskSampling

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.poissonDiskSampling.anon.Bias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("poisson-disk-sampling", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PoissonDiskSampling {
    def this(options: Bias) = this()
    def this(options: Bias, rng: js.Function1[/* repeated */ Double, Double]) = this()
    
    /* CompleteClass */
    override def addPoint(point: js.Array[Double]): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def addRandomPoint(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def fill(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPoints(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPointsWithDistance(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    var implementation: typingsJapgolly.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typingsJapgolly.poissonDiskSampling.srcImplementationsVariableDensityMod.^ = js.native
    
    /* CompleteClass */
    override def next(): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var shape: js.Array[Double] = js.native
  }
  
  trait PoissonDiskSampling extends StObject {
    
    def addPoint(point: js.Array[Double]): js.Array[Double] | Null
    
    def addRandomPoint(): js.Array[Double]
    
    def fill(): js.Array[js.Array[Double]]
    
    def getAllPoints(): js.Array[js.Array[Double]]
    
    def getAllPointsWithDistance(): js.Array[js.Array[Double]]
    
    var implementation: typingsJapgolly.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typingsJapgolly.poissonDiskSampling.srcImplementationsVariableDensityMod.^
    
    def next(): js.Array[Double] | Null
    
    def reset(): Unit
    
    var shape: js.Array[Double]
  }
  object PoissonDiskSampling {
    
    inline def apply(
      addPoint: js.Array[Double] => js.Array[Double] | Null,
      addRandomPoint: CallbackTo[js.Array[Double]],
      fill: CallbackTo[js.Array[js.Array[Double]]],
      getAllPoints: CallbackTo[js.Array[js.Array[Double]]],
      getAllPointsWithDistance: CallbackTo[js.Array[js.Array[Double]]],
      implementation: typingsJapgolly.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typingsJapgolly.poissonDiskSampling.srcImplementationsVariableDensityMod.^,
      next: CallbackTo[js.Array[Double] | Null],
      reset: Callback,
      shape: js.Array[Double]
    ): PoissonDiskSampling = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction1(addPoint), addRandomPoint = addRandomPoint.toJsFn, fill = fill.toJsFn, getAllPoints = getAllPoints.toJsFn, getAllPointsWithDistance = getAllPointsWithDistance.toJsFn, implementation = implementation.asInstanceOf[js.Any], next = next.toJsFn, reset = reset.toJsFn, shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoissonDiskSampling]
    }
    
    extension [Self <: PoissonDiskSampling](x: Self) {
      
      inline def setAddPoint(value: js.Array[Double] => js.Array[Double] | Null): Self = StObject.set(x, "addPoint", js.Any.fromFunction1(value))
      
      inline def setAddRandomPoint(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "addRandomPoint", value.toJsFn)
      
      inline def setFill(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "fill", value.toJsFn)
      
      inline def setGetAllPoints(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getAllPoints", value.toJsFn)
      
      inline def setGetAllPointsWithDistance(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getAllPointsWithDistance", value.toJsFn)
      
      inline def setImplementation(
        value: typingsJapgolly.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typingsJapgolly.poissonDiskSampling.srcImplementationsVariableDensityMod.^
      ): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setNext(value: CallbackTo[js.Array[Double] | Null]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
}
