package typingsJapgolly.babylonjs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.EventTarget
import typingsJapgolly.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a snapshot of the state of all of the tracked objects for an XRSession. Applications
  * can acquire an XRFrame by calling requestAnimationFrame() on an XRSession with an
  * XRFrameRequestCallback. When the callback is called it will be passed an XRFrame.
  * Events which need to communicate tracking state, such as the select event, will also provide an
  * XRFrame.
  *
  * ref: https://immersive-web.github.io/webxr/#xrframe-interface
  */
trait XRFrame extends StObject {
  
  var createAnchor: (js.UndefOr[
    js.Function2[/* pose */ XRRigidTransform, EventTarget, js.UndefOr[js.Promise[XRAnchor]]]
  ]) & (js.UndefOr[js.Function2[/* pose */ XRRigidTransform, EventTarget, js.Promise[XRAnchor]]])
  
  var detectedPlanes: js.UndefOr[XRPlaneSet] = js.undefined
  
  var featurePointCloud: js.UndefOr[js.Array[Double]] = js.undefined
  
  var fillJointRadii: js.UndefOr[
    js.Function2[
      /* jointSpaces */ js.Array[XRJointSpace], 
      /* radii */ js.typedarray.Float32Array, 
      Boolean
    ]
  ] = js.undefined
  
  var fillPoses: js.UndefOr[
    js.Function3[
      /* spaces */ js.Array[EventTarget], 
      EventTarget, 
      /* transforms */ js.typedarray.Float32Array, 
      Boolean
    ]
  ] = js.undefined
  
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult]
  
  def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult]
  
  // Image tracking
  var getImageTrackingResults: js.UndefOr[js.Function0[js.Array[XRImageTrackingResult]]] = js.undefined
  
  // Hand tracking
  var getJointPose: (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, js.UndefOr[XRJointPose]]]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, XRJointPose]])
  
  def getLightEstimate(xrLightProbe: XRLightProbe): XRLightEstimate
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose]
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose]
  
  // BABYLON CHANGE - switched to optional
  val predictedDisplayTime: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  val session: XRSession
  
  // Anchors
  var trackedAnchors: js.UndefOr[XRAnchorSet] = js.undefined
  
  // World geometries. DEPRECATED
  var worldInformation: js.UndefOr[XRWorldInformation] = js.undefined
}
object XRFrame {
  
  inline def apply(
    createAnchor: (js.UndefOr[
      js.Function2[/* pose */ XRRigidTransform, EventTarget, js.UndefOr[js.Promise[XRAnchor]]]
    ]) & (js.UndefOr[js.Function2[/* pose */ XRRigidTransform, EventTarget, js.Promise[XRAnchor]]]),
    getHitTestResults: XRHitTestSource => js.Array[XRHitTestResult],
    getHitTestResultsForTransientInput: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult],
    getJointPose: (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, js.UndefOr[XRJointPose]]]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, XRJointPose]]),
    getLightEstimate: XRLightProbe => XRLightEstimate,
    getPose: (EventTarget, EventTarget) => js.UndefOr[XRPose],
    getViewerPose: XRReferenceSpace => js.UndefOr[XRViewerPose],
    session: XRSession
  ): XRFrame = {
    val __obj = js.Dynamic.literal(createAnchor = createAnchor.asInstanceOf[js.Any], getHitTestResults = js.Any.fromFunction1(getHitTestResults), getHitTestResultsForTransientInput = js.Any.fromFunction1(getHitTestResultsForTransientInput), getJointPose = getJointPose.asInstanceOf[js.Any], getLightEstimate = js.Any.fromFunction1(getLightEstimate), getPose = js.Any.fromFunction2(getPose), getViewerPose = js.Any.fromFunction1(getViewerPose), session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrame]
  }
  
  extension [Self <: XRFrame](x: Self) {
    
    inline def setCreateAnchor(
      value: (js.UndefOr[
          js.Function2[/* pose */ XRRigidTransform, EventTarget, js.UndefOr[js.Promise[XRAnchor]]]
        ]) & (js.UndefOr[js.Function2[/* pose */ XRRigidTransform, EventTarget, js.Promise[XRAnchor]]])
    ): Self = StObject.set(x, "createAnchor", value.asInstanceOf[js.Any])
    
    inline def setDetectedPlanes(value: XRPlaneSet): Self = StObject.set(x, "detectedPlanes", value.asInstanceOf[js.Any])
    
    inline def setDetectedPlanesUndefined: Self = StObject.set(x, "detectedPlanes", js.undefined)
    
    inline def setFeaturePointCloud(value: js.Array[Double]): Self = StObject.set(x, "featurePointCloud", value.asInstanceOf[js.Any])
    
    inline def setFeaturePointCloudUndefined: Self = StObject.set(x, "featurePointCloud", js.undefined)
    
    inline def setFeaturePointCloudVarargs(value: Double*): Self = StObject.set(x, "featurePointCloud", js.Array(value*))
    
    inline def setFillJointRadii(
      value: (/* jointSpaces */ js.Array[XRJointSpace], /* radii */ js.typedarray.Float32Array) => Boolean
    ): Self = StObject.set(x, "fillJointRadii", js.Any.fromFunction2(value))
    
    inline def setFillJointRadiiUndefined: Self = StObject.set(x, "fillJointRadii", js.undefined)
    
    inline def setFillPoses(
      value: (/* spaces */ js.Array[EventTarget], EventTarget, /* transforms */ js.typedarray.Float32Array) => Boolean
    ): Self = StObject.set(x, "fillPoses", js.Any.fromFunction3(value))
    
    inline def setFillPosesUndefined: Self = StObject.set(x, "fillPoses", js.undefined)
    
    inline def setGetHitTestResults(value: XRHitTestSource => js.Array[XRHitTestResult]): Self = StObject.set(x, "getHitTestResults", js.Any.fromFunction1(value))
    
    inline def setGetHitTestResultsForTransientInput(value: XRTransientInputHitTestSource => js.Array[XRTransientInputHitTestResult]): Self = StObject.set(x, "getHitTestResultsForTransientInput", js.Any.fromFunction1(value))
    
    inline def setGetImageTrackingResults(value: CallbackTo[js.Array[XRImageTrackingResult]]): Self = StObject.set(x, "getImageTrackingResults", value.toJsFn)
    
    inline def setGetImageTrackingResultsUndefined: Self = StObject.set(x, "getImageTrackingResults", js.undefined)
    
    inline def setGetJointPose(
      value: (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, js.UndefOr[XRJointPose]]]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, XRJointPose]])
    ): Self = StObject.set(x, "getJointPose", value.asInstanceOf[js.Any])
    
    inline def setGetLightEstimate(value: XRLightProbe => XRLightEstimate): Self = StObject.set(x, "getLightEstimate", js.Any.fromFunction1(value))
    
    inline def setGetPose(value: (EventTarget, EventTarget) => js.UndefOr[XRPose]): Self = StObject.set(x, "getPose", js.Any.fromFunction2(value))
    
    inline def setGetViewerPose(value: XRReferenceSpace => js.UndefOr[XRViewerPose]): Self = StObject.set(x, "getViewerPose", js.Any.fromFunction1(value))
    
    inline def setPredictedDisplayTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "predictedDisplayTime", value.asInstanceOf[js.Any])
    
    inline def setPredictedDisplayTimeUndefined: Self = StObject.set(x, "predictedDisplayTime", js.undefined)
    
    inline def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setTrackedAnchors(value: XRAnchorSet): Self = StObject.set(x, "trackedAnchors", value.asInstanceOf[js.Any])
    
    inline def setTrackedAnchorsUndefined: Self = StObject.set(x, "trackedAnchors", js.undefined)
    
    inline def setWorldInformation(value: XRWorldInformation): Self = StObject.set(x, "worldInformation", value.asInstanceOf[js.Any])
    
    inline def setWorldInformationUndefined: Self = StObject.set(x, "worldInformation", js.undefined)
  }
}
