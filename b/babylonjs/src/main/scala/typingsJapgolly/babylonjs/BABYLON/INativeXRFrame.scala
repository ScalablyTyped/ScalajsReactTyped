package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.EventTarget
import typingsJapgolly.babylonjs.XRAnchor
import typingsJapgolly.babylonjs.XRFrame
import typingsJapgolly.babylonjs.XRHitTestResult
import typingsJapgolly.babylonjs.XRHitTestSource
import typingsJapgolly.babylonjs.XRImageTrackingResult
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

/** @internal */
trait INativeXRFrame
  extends StObject
     with XRFrame {
  
  var _imageTrackingResults: js.UndefOr[js.Array[XRImageTrackingResult]] = js.undefined
  
  def getPoseData(
    space: EventTarget,
    baseSpace: XRReferenceSpace,
    vectorBuffer: js.typedarray.ArrayBuffer,
    matrixBuffer: js.typedarray.ArrayBuffer
  ): XRPose
}
object INativeXRFrame {
  
  inline def apply(
    createAnchor: (js.UndefOr[
      js.Function2[/* pose */ XRRigidTransform, EventTarget, js.UndefOr[js.Promise[XRAnchor]]]
    ]) & (js.UndefOr[js.Function2[/* pose */ XRRigidTransform, EventTarget, js.Promise[XRAnchor]]]),
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getJointPose: (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, js.UndefOr[XRJointPose]]]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, XRJointPose]]),
    getLightEstimate: XRLightProbe => XRLightEstimate,
    getPose: (EventTarget, EventTarget) => js.UndefOr[XRPose],
    getPoseData: (EventTarget, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose,
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession
  ): INativeXRFrame = {
    val __obj = js.Dynamic.literal(createAnchor = createAnchor.asInstanceOf[js.Any], getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getJointPose = getJointPose.asInstanceOf[js.Any], getLightEstimate = js.Any.fromFunction1(getLightEstimate), getPose = js.Any.fromFunction2(getPose), getPoseData = js.Any.fromFunction4(getPoseData), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[INativeXRFrame]
  }
  
  extension [Self <: INativeXRFrame](x: Self) {
    
    inline def setGetPoseData(
      value: (EventTarget, XRReferenceSpace, js.typedarray.ArrayBuffer, js.typedarray.ArrayBuffer) => XRPose
    ): Self = StObject.set(x, "getPoseData", js.Any.fromFunction4(value))
    
    inline def set_imageTrackingResults(value: js.Array[XRImageTrackingResult]): Self = StObject.set(x, "_imageTrackingResults", value.asInstanceOf[js.Any])
    
    inline def set_imageTrackingResultsUndefined: Self = StObject.set(x, "_imageTrackingResults", js.undefined)
    
    inline def set_imageTrackingResultsVarargs(value: XRImageTrackingResult*): Self = StObject.set(x, "_imageTrackingResults", js.Array(value*))
  }
}
