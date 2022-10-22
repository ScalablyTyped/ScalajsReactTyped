package typingsJapgolly.ol

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojTriangulationMod {
  
  @JSImport("ol/reproj/Triangulation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Triangulation {
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetExtent: Extent,
      maxSourceExtent: Extent,
      errorThreshold: Double,
      opt_destinationResolution: Double
    ) = this()
    
    /**
      * Calculates extent of the 'source' coordinates from all the triangles.
      */
    /* CompleteClass */
    override def calculateSourceExtent(): Extent = js.native
    
    /* CompleteClass */
    override def getTriangles(): js.Array[Triangle] = js.native
  }
  
  trait Triangle extends StObject {
    
    var source: js.Array[Coordinate]
    
    var target: js.Array[Coordinate]
  }
  object Triangle {
    
    inline def apply(source: js.Array[Coordinate], target: js.Array[Coordinate]): Triangle = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Triangle]
    }
    
    extension [Self <: Triangle](x: Self) {
      
      inline def setSource(value: js.Array[Coordinate]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: Coordinate*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTarget(value: js.Array[Coordinate]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetVarargs(value: Coordinate*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  trait Triangulation extends StObject {
    
    /**
      * Calculates extent of the 'source' coordinates from all the triangles.
      */
    def calculateSourceExtent(): Extent
    
    def getTriangles(): js.Array[Triangle]
  }
  object Triangulation {
    
    inline def apply(calculateSourceExtent: CallbackTo[Extent], getTriangles: CallbackTo[js.Array[Triangle]]): Triangulation = {
      val __obj = js.Dynamic.literal(calculateSourceExtent = calculateSourceExtent.toJsFn, getTriangles = getTriangles.toJsFn)
      __obj.asInstanceOf[Triangulation]
    }
    
    extension [Self <: Triangulation](x: Self) {
      
      inline def setCalculateSourceExtent(value: CallbackTo[Extent]): Self = StObject.set(x, "calculateSourceExtent", value.toJsFn)
      
      inline def setGetTriangles(value: CallbackTo[js.Array[Triangle]]): Self = StObject.set(x, "getTriangles", value.toJsFn)
    }
  }
}
