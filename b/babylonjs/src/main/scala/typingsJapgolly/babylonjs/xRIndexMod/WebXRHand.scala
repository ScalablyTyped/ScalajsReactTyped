package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.babylonjs.xRFeaturesWebXRHandTrackingMod.XRHandMeshRigMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRHand")
@js.native
open class WebXRHand protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesIndexMod.WebXRHand {
  /**
    * Construct a new hand object
    * @param xrController The controller to which the hand correlates.
    * @param _jointMeshes The meshes to be used to track the hand joints.
    * @param _handMesh An optional hand mesh.
    * @param rigMapping An optional rig mapping for the hand mesh.
    *                   If not provided (but a hand mesh is provided),
    *                   it will be assumed that the hand mesh's bones are named
    *                   directly after the WebXR bone names.
    * @param _leftHandedMeshes Are the hand meshes left-handed-system meshes
    * @param _jointsInvisible Are the tracked joint meshes visible
    * @param _jointScaleFactor Scale factor for all joint meshes
    */
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping]
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Boolean
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Boolean,
    _jointsInvisible: Boolean
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Unit,
    _jointsInvisible: Boolean
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Boolean,
    _jointsInvisible: Boolean,
    _jointScaleFactor: Double
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Boolean,
    _jointsInvisible: Unit,
    _jointScaleFactor: Double
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Unit,
    _jointsInvisible: Boolean,
    _jointScaleFactor: Double
  ) = this()
  def this(
    /** The controller to which the hand correlates. */
  xrController: typingsJapgolly.babylonjs.xRWebXRInputSourceMod.WebXRInputSource,
    _jointMeshes: js.Array[AbstractMesh],
    _handMesh: Nullable[AbstractMesh],
    /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  rigMapping: Nullable[XRHandMeshRigMapping],
    _leftHandedMeshes: Unit,
    _jointsInvisible: Unit,
    _jointScaleFactor: Double
  ) = this()
}
