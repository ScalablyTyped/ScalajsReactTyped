package typingsJapgolly.babylonjs.global

import org.scalajs.dom.EventTarget
import typingsJapgolly.babylonjs.XRLightEstimate
import typingsJapgolly.babylonjs.XRLightProbe
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
/* note: abstract class */ @JSGlobal("XRFrame")
@js.native
open class XRFrame ()
  extends StObject
     with typingsJapgolly.babylonjs.XRFrame {
  
  /* CompleteClass */
  var createAnchor: (js.UndefOr[
    js.Function2[
      /* pose */ typingsJapgolly.babylonjs.XRRigidTransform, 
      EventTarget, 
      js.UndefOr[js.Promise[typingsJapgolly.babylonjs.XRAnchor]]
    ]
  ]) & (js.UndefOr[
    js.Function2[
      /* pose */ typingsJapgolly.babylonjs.XRRigidTransform, 
      EventTarget, 
      js.Promise[typingsJapgolly.babylonjs.XRAnchor]
    ]
  ]) = js.native
  
  /* CompleteClass */
  override def getHitTestResults(hitTestSource: typingsJapgolly.babylonjs.XRHitTestSource): js.Array[typingsJapgolly.babylonjs.XRHitTestResult] = js.native
  
  /* CompleteClass */
  override def getHitTestResultsForTransientInput(hitTestSource: typingsJapgolly.babylonjs.XRTransientInputHitTestSource): js.Array[typingsJapgolly.babylonjs.XRTransientInputHitTestResult] = js.native
  
  // Hand tracking
  /* CompleteClass */
  var getJointPose: (js.UndefOr[
    js.Function2[
      /* joint */ typingsJapgolly.babylonjs.XRJointSpace, 
      EventTarget, 
      js.UndefOr[typingsJapgolly.babylonjs.XRJointPose]
    ]
  ]) & (js.UndefOr[
    js.Function2[
      /* joint */ typingsJapgolly.babylonjs.XRJointSpace, 
      EventTarget, 
      typingsJapgolly.babylonjs.XRJointPose
    ]
  ]) = js.native
  
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
  override def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[typingsJapgolly.babylonjs.XRPose] = js.native
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  /* CompleteClass */
  override def getViewerPose(referenceSpace: typingsJapgolly.babylonjs.XRReferenceSpace): js.UndefOr[typingsJapgolly.babylonjs.XRViewerPose] = js.native
  
  /* CompleteClass */
  override val session: typingsJapgolly.babylonjs.XRSession = js.native
}
