package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ArcFollowCamera")
@js.native
open class ArcFollowCamera protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.ArcFollowCamera {
  /**
    * Instantiates a new ArcFollowCamera
    * @see https://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera
    * @param alpha Define the rotation angle of the camera around the longitudinal axis
    * @param beta Define the rotation angle of the camera around the elevation axis
    * @param radius Define the radius of the camera from its target point
    * @param target Define the target of the camera
    * @param scene Define the scene the camera belongs to
    */
  def this(
    name: String,
    /** The longitudinal angle of the camera */
  alpha: Double,
    /** The latitudinal angle of the camera */
  beta: Double,
    /** The radius of the camera from its target */
  radius: Double,
    /** Define the camera target (the mesh it should follow) */
  target: Nullable[typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh],
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
}
