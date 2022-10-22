package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingInfo")
@js.native
open class BoundingInfo protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(
    minimum: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    maximum: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    minimum: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    maximum: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Vector3],
    worldMatrix: DeepImmutable[typingsJapgolly.babylonjs.BABYLON.Matrix]
  ) = this()
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this checks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isCompletelyInFrustum(frustumPlanes: js.Array[typingsJapgolly.babylonjs.BABYLON.Plane]): Boolean = js.native
  
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  /* CompleteClass */
  override def isInFrustum(frustumPlanes: js.Array[typingsJapgolly.babylonjs.BABYLON.Plane]): Boolean = js.native
}
/* static members */
object BoundingInfo {
  
  @JSGlobal("BABYLON.BoundingInfo._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
