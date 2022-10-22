package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRNearInteractionMod.IWebXRNearInteractionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRNearInteraction")
@js.native
open class WebXRNearInteraction protected ()
  extends typingsJapgolly.babylonjs.xRIndexMod.WebXRNearInteraction {
  /**
    * constructs a new background remover module
    * @param _xrSessionManager the session manager for this module
    * @param _options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRNearInteractionOptions
  ) = this()
}
/* static members */
object WebXRNearInteraction {
  
  @JSImport("babylonjs/index", "WebXRNearInteraction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRNearInteraction.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * Picks a mesh with a sphere
    * @param mesh the mesh to pick
    * @param sphere picking sphere in world coordinates
    * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
    * @returns the picking info
    */
  inline def PickMeshWithSphere(
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    sphere: typingsJapgolly.babylonjs.cullingBoundingSphereMod.BoundingSphere
  ): typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo]
  inline def PickMeshWithSphere(
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    sphere: typingsJapgolly.babylonjs.cullingBoundingSphereMod.BoundingSphere,
    skipBoundingInfo: Boolean
  ): typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("PickMeshWithSphere")(mesh.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], skipBoundingInfo.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo]
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRNearInteraction.Version")
  @js.native
  val Version: Double = js.native
  
  @JSImport("babylonjs/index", "WebXRNearInteraction._IdCounter")
  @js.native
  def _IdCounter: Any = js.native
  inline def _IdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IdCounter")(x.asInstanceOf[js.Any])
}
