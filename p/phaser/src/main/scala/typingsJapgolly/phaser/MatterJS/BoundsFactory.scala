package typingsJapgolly.phaser.MatterJS

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundsFactory extends StObject {
  
  /**
    * Returns true if the bounds contains the given point.
    * @method contains
    * @param {IBound} bounds
    * @param {vector} point
    * @return {boolean} True if the bounds contain the point, otherwise false
    */
  def contains(bounds: IBound, point: Vector): Boolean
  
  /**
    * Creates a new axis-aligned bounding box (AABB) for the given vertices.
    * @method create
    * @param {vertices} vertices
    * @return {IBound} A new bounds object
    */
  def create(vertices: Vertices): IBound
  
  /**
    * Returns true if the two bounds intersect.
    * @method overlaps
    * @param {IBound} boundsA
    * @param {IBound} boundsB
    * @return {boolean} True if the bounds overlap, otherwise false
    */
  def overlaps(boundsA: IBound, boundsB: IBound): Boolean
  
  /**
    * Shifts the bounds to the given position.
    * @method shift
    * @param {IBound} bounds
    * @param {vector} position
    */
  def shift(bounds: IBound, position: Vector): Unit
  
  /**
    * Translates the bounds by the given vector.
    * @method translate
    * @param {IBound} bounds
    * @param {vector} vector
    */
  def translate(bounds: IBound, vector: Vector): Unit
  
  /**
    * Updates bounds using the given vertices and extends the bounds given a velocity.
    * @method update
    * @param {IBound} bounds
    * @param {vertices} vertices
    * @param {vector} velocity
    */
  def update(bounds: IBound, vertices: Vertices, velocity: Vector): Unit
}
object BoundsFactory {
  
  inline def apply(
    contains: (IBound, Vector) => Boolean,
    create: Vertices => IBound,
    overlaps: (IBound, IBound) => Boolean,
    shift: (IBound, Vector) => Callback,
    translate: (IBound, Vector) => Callback,
    update: (IBound, Vertices, Vector) => Callback
  ): BoundsFactory = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), create = js.Any.fromFunction1(create), overlaps = js.Any.fromFunction2(overlaps), shift = js.Any.fromFunction2((t0: IBound, t1: Vector) => (shift(t0, t1)).runNow()), translate = js.Any.fromFunction2((t0: IBound, t1: Vector) => (translate(t0, t1)).runNow()), update = js.Any.fromFunction3((t0: IBound, t1: Vertices, t2: Vector) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[BoundsFactory]
  }
  
  extension [Self <: BoundsFactory](x: Self) {
    
    inline def setContains(value: (IBound, Vector) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setCreate(value: Vertices => IBound): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setOverlaps(value: (IBound, IBound) => Boolean): Self = StObject.set(x, "overlaps", js.Any.fromFunction2(value))
    
    inline def setShift(value: (IBound, Vector) => Callback): Self = StObject.set(x, "shift", js.Any.fromFunction2((t0: IBound, t1: Vector) => (value(t0, t1)).runNow()))
    
    inline def setTranslate(value: (IBound, Vector) => Callback): Self = StObject.set(x, "translate", js.Any.fromFunction2((t0: IBound, t1: Vector) => (value(t0, t1)).runNow()))
    
    inline def setUpdate(value: (IBound, Vertices, Vector) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: IBound, t1: Vertices, t2: Vector) => (value(t0, t1, t2)).runNow()))
  }
}
