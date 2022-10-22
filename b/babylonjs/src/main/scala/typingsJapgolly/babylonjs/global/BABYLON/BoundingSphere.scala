package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingSphere")
@js.native
open class BoundingSphere protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    max: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    max: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    worldMatrix: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
}
/* static members */
object BoundingSphere {
  
  @JSGlobal("BABYLON.BoundingSphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a sphere from a center and a radius
    * @param center The center
    * @param radius radius
    * @param matrix Optional worldMatrix
    * @returns The sphere
    */
  inline def CreateFromCenterAndRadius(center: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3], radius: Double): typingsJapgolly.babylonjs.BABYLON.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.BoundingSphere]
  inline def CreateFromCenterAndRadius(
    center: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    radius: Double,
    matrix: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ): typingsJapgolly.babylonjs.BABYLON.BoundingSphere = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromCenterAndRadius")(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.BoundingSphere]
  
  /**
    * Checks if two sphere intersect
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the spheres intersect
    */
  inline def Intersects(
    sphere0: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.BoundingSphere],
    sphere1: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.BoundingSphere]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Intersects")(sphere0.asInstanceOf[js.Any], sphere1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSGlobal("BABYLON.BoundingSphere._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
