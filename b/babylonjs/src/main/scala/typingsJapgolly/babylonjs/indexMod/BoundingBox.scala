package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BoundingBox")
@js.native
open class BoundingBox protected ()
  extends typingsJapgolly.babylonjs.cullingIndexMod.BoundingBox {
  /**
    * Creates a new bounding box
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    max: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    max: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    worldMatrix: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix]
  ) = this()
}
/* static members */
object BoundingBox {
  
  @JSImport("babylonjs/index", "BoundingBox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tests if two bounding boxes are intersections
    * @param box0 defines the first box to test
    * @param box1 defines the second box to test
    * @returns true if there is an intersection
    */
  inline def Intersects(
    box0: DeepImmutable[typingsJapgolly.babylonjs.cullingBoundingBoxMod.BoundingBox],
    box1: DeepImmutable[typingsJapgolly.babylonjs.cullingBoundingBoxMod.BoundingBox]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(box0.asInstanceOf[js.Any], box1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Tests if a bounding box defines by a min/max vectors intersects a sphere
    * @param minPoint defines the minimum vector of the bounding box
    * @param maxPoint defines the maximum vector of the bounding box
    * @param sphereCenter defines the sphere center
    * @param sphereRadius defines the sphere radius
    * @returns true if there is an intersection
    */
  inline def IntersectsSphere(
    minPoint: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    maxPoint: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    sphereCenter: DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3],
    sphereRadius: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IntersectsSphere")(minPoint.asInstanceOf[js.Any], maxPoint.asInstanceOf[js.Any], sphereCenter.asInstanceOf[js.Any], sphereRadius.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Tests if a bounding box defined with 8 vectors is entirely inside frustum planes
    * @param boundingVectors defines an array of 8 vectors representing a bounding box
    * @param frustumPlanes defines the frustum planes to test
    * @returns true if there is an inclusion
    */
  inline def IsCompletelyInFrustum(
    boundingVectors: js.Array[DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]],
    frustumPlanes: js.Array[DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotplaneMod.Plane]]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCompletelyInFrustum")(boundingVectors.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Tests if a bounding box defined with 8 vectors intersects frustum planes
    * @param boundingVectors defines an array of 8 vectors representing a bounding box
    * @param frustumPlanes defines the frustum planes to test
    * @returns true if there is an intersection
    */
  inline def IsInFrustum(
    boundingVectors: js.Array[DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3]],
    frustumPlanes: js.Array[DeepImmutable[typingsJapgolly.babylonjs.mathsMathDotplaneMod.Plane]]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInFrustum")(boundingVectors.asInstanceOf[js.Any], frustumPlanes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("babylonjs/index", "BoundingBox._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
