package typingsJapgolly.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A three dimensional vector.
  * Lens Studio v1.0.0+
  */
@JSGlobal("vec3")
@js.native
open class vec3 protected ()
  extends StObject
     with typingsJapgolly.snapchatLensStudio.vec3 {
  def this(x: Double, y: Double, z: Double) = this()
  
  /** Returns the vector plus vec. */
  /* CompleteClass */
  override def add(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the angle in radians between the vector and vec. */
  /* CompleteClass */
  override def angleTo(vec: typingsJapgolly.snapchatLensStudio.vec3): Double = js.native
  
  /** Alternate name for the z component. */
  /* CompleteClass */
  var b: Double = js.native
  
  /** Returns a copy of the vector with its length clamped to length. */
  /* CompleteClass */
  override def clampLength(length: Double): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the cross product of the vector and vec */
  /* CompleteClass */
  override def cross(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the distance between the vector and the vector vec. */
  /* CompleteClass */
  override def distance(vec: typingsJapgolly.snapchatLensStudio.vec3): Double = js.native
  
  /** Returns the division of the vector by the vector vec. */
  /* CompleteClass */
  override def div(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the dot product of the vector and vec. */
  /* CompleteClass */
  override def dot(vec: typingsJapgolly.snapchatLensStudio.vec3): Double = js.native
  
  /** Returns whether this is equal to vec. */
  /* CompleteClass */
  override def equal(vec: typingsJapgolly.snapchatLensStudio.vec3): Boolean = js.native
  
  /** Alternate name for the y component. */
  /* CompleteClass */
  var g: Double = js.native
  
  /** Returns the length of the vector. */
  /* CompleteClass */
  var length: Double = js.native
  
  /** Returns the squared length of the vector. */
  /* CompleteClass */
  var lengthSquared: Double = js.native
  
  /** Returns a copy of the vector moved towards the point point by the amount magnitude. */
  /* CompleteClass */
  override def moveTowards(point: typingsJapgolly.snapchatLensStudio.vec3, magnitude: Double): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  /* CompleteClass */
  override def mult(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns a copy of the vector with its length scaled to 1. */
  /* CompleteClass */
  override def normalize(): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns a copy of the vector projected onto the vector vec. */
  /* CompleteClass */
  override def project(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Projects the vector onto the plane represented by the normal normal. */
  /* CompleteClass */
  override def projectOnPlane(normal: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Alternate name for the x component. */
  /* CompleteClass */
  var r: Double = js.native
  
  /** Returns a copy of the vector reflected across the plane defined by the normal vec. */
  /* CompleteClass */
  override def reflect(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns a copy of the vector rotated towards the point point by amount. */
  /* CompleteClass */
  override def rotateTowards(point: typingsJapgolly.snapchatLensStudio.vec3, amount: Double): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  /* CompleteClass */
  override def scale(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Returns the vector minus vec. */
  /* CompleteClass */
  override def sub(vec: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** Multiplies the components by the number scale. */
  /* CompleteClass */
  override def uniformScale(scale: Double): typingsJapgolly.snapchatLensStudio.vec3 = js.native
  
  /** x component of the vec3. */
  /* CompleteClass */
  var x: Double = js.native
  
  /** y component of the vec3. */
  /* CompleteClass */
  var y: Double = js.native
  
  /** z component of the vec3. */
  /* CompleteClass */
  var z: Double = js.native
}
object vec3 {
  
  @JSGlobal("vec3")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns the vector (0, 0, -1). */
  /* static member */
  inline def back(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, -1, 0). */
  /* static member */
  inline def down(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, 0, 1). */
  /* static member */
  inline def forward(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns the vector (-1, 0, 0). */
  /* static member */
  inline def left(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("left")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Linearly interpolates between the two vectors vecA and vecB by the factor t. */
  /* static member */
  inline def lerp(
    vecA: typingsJapgolly.snapchatLensStudio.vec3,
    vecB: typingsJapgolly.snapchatLensStudio.vec3,
    t: Double
  ): typingsJapgolly.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns a new vector containing the largest value of each component in the two vectors. */
  /* static member */
  inline def max(vecA: typingsJapgolly.snapchatLensStudio.vec3, vecB: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns a new vector containing the smallest value of each component in the two vectors. */
  /* static member */
  inline def min(vecA: typingsJapgolly.snapchatLensStudio.vec3, vecB: typingsJapgolly.snapchatLensStudio.vec3): typingsJapgolly.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns the vector (1, 1, 1). */
  /* static member */
  inline def one(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Makes the vectors vecA and vecB normalized and orthogonal to each other. */
  /* static member */
  inline def orthonormalize(vecA: typingsJapgolly.snapchatLensStudio.vec3, vecB: typingsJapgolly.snapchatLensStudio.vec3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("orthonormalize")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Returns the vector (1, 0, 0). */
  /* static member */
  inline def right(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("right")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Spherically interpolates between the two vectors vecA and vecB by the factor t. */
  /* static member */
  inline def slerp(
    vecA: typingsJapgolly.snapchatLensStudio.vec3,
    vecB: typingsJapgolly.snapchatLensStudio.vec3,
    t: Double
  ): typingsJapgolly.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, 1, 0). */
  /* static member */
  inline def up(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, 0, 0). */
  /* static member */
  inline def zero(): typingsJapgolly.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typingsJapgolly.snapchatLensStudio.vec3]
}
