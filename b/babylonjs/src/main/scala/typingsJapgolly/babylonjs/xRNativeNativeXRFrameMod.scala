package typingsJapgolly.babylonjs

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRNativeNativeXRFrameMod {
  
  @JSImport("babylonjs/XR/native/nativeXRFrame", "NativeXRFrame")
  @js.native
  open class NativeXRFrame protected ()
    extends StObject
       with XRFrame {
    def this(_nativeImpl: INativeXRFrame) = this()
    
    /* private */ var _nativeImpl: Any = js.native
    
    /* private */ val _xrPose: Any = js.native
    
    /* private */ val _xrPoseVectorData: Any = js.native
    
    /* private */ val _xrTransform: Any = js.native
    
    /* CompleteClass */
    var createAnchor: (js.UndefOr[
        js.Function2[/* pose */ XRRigidTransform, EventTarget, js.UndefOr[js.Promise[XRAnchor]]]
      ]) & (js.UndefOr[js.Function2[/* pose */ XRRigidTransform, EventTarget, js.Promise[XRAnchor]]]) = js.native
    
    @JSName("detectedPlanes")
    def detectedPlanes_MNativeXRFrame: js.UndefOr[XRPlaneSet] = js.native
    
    @JSName("featurePointCloud")
    def featurePointCloud_MNativeXRFrame: js.UndefOr[js.Array[Double]] = js.native
    
    val getHitTestResults: Any = js.native
    /* CompleteClass */
    override def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
    
    def getHitTestResultsForTransientInput(): scala.Nothing = js.native
    /* CompleteClass */
    override def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
    
    @JSName("getImageTrackingResults")
    def getImageTrackingResults_MNativeXRFrame(): js.Array[XRImageTrackingResult] = js.native
    
    // Hand tracking
    /* CompleteClass */
    var getJointPose: (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, js.UndefOr[XRJointPose]]]) & (js.UndefOr[js.Function2[/* joint */ XRJointSpace, EventTarget, XRJointPose]]) = js.native
    
    def getLightEstimate(): scala.Nothing = js.native
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
    def getPose(space: EventTarget, baseSpace: XRReferenceSpace): js.UndefOr[XRPose] = js.native
    
    val getViewerPose: Any = js.native
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
    @JSName("session")
    def session_MNativeXRFrame: XRSession = js.native
    
    @JSName("trackedAnchors")
    def trackedAnchors_MNativeXRFrame: js.UndefOr[XRAnchorSet] = js.native
    
    @JSName("worldInformation")
    def worldInformation_MNativeXRFrame: js.UndefOr[XRWorldInformation] = js.native
  }
  
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
}
