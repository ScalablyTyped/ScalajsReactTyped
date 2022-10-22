package typingsJapgolly.babylonjs.global.BABYLON

import org.scalajs.dom.EventTarget
import typingsJapgolly.babylonjs.BABYLON.INativeXRFrame
import typingsJapgolly.babylonjs.XRAnchor
import typingsJapgolly.babylonjs.XRHitTestResult
import typingsJapgolly.babylonjs.XRHitTestSource
import typingsJapgolly.babylonjs.XRJointPose
import typingsJapgolly.babylonjs.XRJointSpace
import typingsJapgolly.babylonjs.XRLightEstimate
import typingsJapgolly.babylonjs.XRLightProbe
import typingsJapgolly.babylonjs.XRPose
import typingsJapgolly.babylonjs.XRReferenceSpace
import typingsJapgolly.babylonjs.XRRigidTransform
import typingsJapgolly.babylonjs.XRSession
import typingsJapgolly.babylonjs.XRTransientInputHitTestResult
import typingsJapgolly.babylonjs.XRTransientInputHitTestSource
import typingsJapgolly.babylonjs.XRViewerPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeXRFrame")
@js.native
open class NativeXRFrame protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NativeXRFrame {
  def this(_nativeImpl: INativeXRFrame) = this()
  
  /* CompleteClass */
  var createAnchor: (js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, EventTarget, js.UndefOr[js.Promise[XRAnchor]]]
  ]) & (js.UndefOr[js.Function2[/* pose */ XRRigidTransform, EventTarget, js.Promise[XRAnchor]]]) = js.native
  
  /* CompleteClass */
  override def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  
  /* CompleteClass */
  override def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
  
  // Hand tracking
  /* CompleteClass */
  var getJointPose: (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, js.UndefOr[XRJointPose]]]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, XRJointPose]]) = js.native
  
  /* CompleteClass */
  override def getLightEstimate(xrLightProbe: XRLightProbe): XRLightEstimate = js.native
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  /* CompleteClass */
  override def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  /* CompleteClass */
  override def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  
  /* CompleteClass */
  override val session: XRSession = js.native
}
