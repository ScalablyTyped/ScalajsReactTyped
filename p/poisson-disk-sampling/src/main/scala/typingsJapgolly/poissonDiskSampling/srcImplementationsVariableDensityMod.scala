package typingsJapgolly.poissonDiskSampling

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.poissonDiskSampling.anon.DistanceFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcImplementationsVariableDensityMod {
  
  @JSImport("poisson-disk-sampling/src/implementations/variable-density", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VariableDensityPDS {
    def this(options: DistanceFunction) = this()
    def this(options: DistanceFunction, rng: js.Function1[/* repeated */ Double, Double]) = this()
    
    /* CompleteClass */
    override def addPoint(point: js.Array[Double]): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def addRandomPoint(): js.Array[Double] = js.native
    
    /* protected */ /* CompleteClass */
    override def directAddPoint(point: js.Array[Double]): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def fill(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPoints(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPointsWithDistance(): js.Array[js.Array[Double]] = js.native
    
    /* protected */ /* CompleteClass */
    override def inNeighbourhood(point: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    override def next(): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  trait VariableDensityPDS extends StObject {
    
    def addPoint(point: js.Array[Double]): js.Array[Double] | Null
    
    def addRandomPoint(): js.Array[Double]
    
    /* protected */ def directAddPoint(point: js.Array[Double]): js.Array[Double]
    
    def fill(): js.Array[js.Array[Double]]
    
    def getAllPoints(): js.Array[js.Array[Double]]
    
    def getAllPointsWithDistance(): js.Array[js.Array[Double]]
    
    /* protected */ def inNeighbourhood(point: js.Array[Double]): Boolean
    
    def next(): js.Array[Double] | Null
    
    def reset(): Unit
  }
  object VariableDensityPDS {
    
    inline def apply(
      addPoint: js.Array[Double] => js.Array[Double] | Null,
      addRandomPoint: CallbackTo[js.Array[Double]],
      directAddPoint: js.Array[Double] => js.Array[Double],
      fill: CallbackTo[js.Array[js.Array[Double]]],
      getAllPoints: CallbackTo[js.Array[js.Array[Double]]],
      getAllPointsWithDistance: CallbackTo[js.Array[js.Array[Double]]],
      inNeighbourhood: js.Array[Double] => Boolean,
      next: CallbackTo[js.Array[Double] | Null],
      reset: Callback
    ): VariableDensityPDS = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction1(addPoint), addRandomPoint = addRandomPoint.toJsFn, directAddPoint = js.Any.fromFunction1(directAddPoint), fill = fill.toJsFn, getAllPoints = getAllPoints.toJsFn, getAllPointsWithDistance = getAllPointsWithDistance.toJsFn, inNeighbourhood = js.Any.fromFunction1(inNeighbourhood), next = next.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[VariableDensityPDS]
    }
    
    extension [Self <: VariableDensityPDS](x: Self) {
      
      inline def setAddPoint(value: js.Array[Double] => js.Array[Double] | Null): Self = StObject.set(x, "addPoint", js.Any.fromFunction1(value))
      
      inline def setAddRandomPoint(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "addRandomPoint", value.toJsFn)
      
      inline def setDirectAddPoint(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "directAddPoint", js.Any.fromFunction1(value))
      
      inline def setFill(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "fill", value.toJsFn)
      
      inline def setGetAllPoints(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getAllPoints", value.toJsFn)
      
      inline def setGetAllPointsWithDistance(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getAllPointsWithDistance", value.toJsFn)
      
      inline def setInNeighbourhood(value: js.Array[Double] => Boolean): Self = StObject.set(x, "inNeighbourhood", js.Any.fromFunction1(value))
      
      inline def setNext(value: CallbackTo[js.Array[Double] | Null]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
}
