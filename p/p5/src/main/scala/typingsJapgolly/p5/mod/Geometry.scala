package typingsJapgolly.p5.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  /**
    *   Averages the vertex normals. Used in curved
    *   surfaces
    *   @chainable
    */
  def averageNormals(): Geometry
  
  /**
    *   Averages pole normals. Used in spherical
    *   primitives
    *   @chainable
    */
  def averagePoleNormals(): Geometry
  
  /**
    *   computes faces for geometry objects based on the
    *   vertices.
    *   @chainable
    */
  def computeFaces(): Geometry
  
  /**
    *   computes smooth normals per vertex as an average
    *   of each face.
    *   @chainable
    */
  def computeNormals(): Geometry
  
  /**
    *   Modifies all vertices to be centered within the
    *   range -100 to 100.
    *   @chainable
    */
  def normalize(): Geometry
}
object Geometry {
  
  inline def apply(
    averageNormals: CallbackTo[Geometry],
    averagePoleNormals: CallbackTo[Geometry],
    computeFaces: CallbackTo[Geometry],
    computeNormals: CallbackTo[Geometry],
    normalize: CallbackTo[Geometry]
  ): Geometry = {
    val __obj = js.Dynamic.literal(averageNormals = averageNormals.toJsFn, averagePoleNormals = averagePoleNormals.toJsFn, computeFaces = computeFaces.toJsFn, computeNormals = computeNormals.toJsFn, normalize = normalize.toJsFn)
    __obj.asInstanceOf[Geometry]
  }
  
  extension [Self <: Geometry](x: Self) {
    
    inline def setAverageNormals(value: CallbackTo[Geometry]): Self = StObject.set(x, "averageNormals", value.toJsFn)
    
    inline def setAveragePoleNormals(value: CallbackTo[Geometry]): Self = StObject.set(x, "averagePoleNormals", value.toJsFn)
    
    inline def setComputeFaces(value: CallbackTo[Geometry]): Self = StObject.set(x, "computeFaces", value.toJsFn)
    
    inline def setComputeNormals(value: CallbackTo[Geometry]): Self = StObject.set(x, "computeNormals", value.toJsFn)
    
    inline def setNormalize(value: CallbackTo[Geometry]): Self = StObject.set(x, "normalize", value.toJsFn)
  }
}
