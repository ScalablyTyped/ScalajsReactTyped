package typingsJapgolly.webxr.global

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
/* note: abstract class */ @JSGlobal("XRFrame")
@js.native
open class XRFrame ()
  extends StObject
     with typingsJapgolly.webxr.XRFrame {
  
  /* CompleteClass */
  override def getHitTestResults(hitTestSource: typingsJapgolly.webxr.XRHitTestSource): js.Array[typingsJapgolly.webxr.XRHitTestResult] = js.native
  
  /* CompleteClass */
  override def getHitTestResultsForTransientInput(hitTestSource: typingsJapgolly.webxr.XRTransientInputHitTestSource): js.Array[typingsJapgolly.webxr.XRTransientInputHitTestResult] = js.native
  
  /**
    * Provides the pose of space relative to baseSpace as an XRPose, at the time represented by
    * the XRFrame.
    *
    * @param space
    * @param baseSpace
    */
  /* CompleteClass */
  override def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[typingsJapgolly.webxr.XRPose] = js.native
  
  /**
    * Provides the pose of the viewer relative to referenceSpace as an XRViewerPose, at the
    * XRFrame's time.
    *
    * @param referenceSpace
    */
  /* CompleteClass */
  override def getViewerPose(referenceSpace: typingsJapgolly.webxr.XRReferenceSpace): js.UndefOr[typingsJapgolly.webxr.XRViewerPose] = js.native
  
  /* CompleteClass */
  override val predictedDisplayTime: DOMHighResTimeStamp = js.native
  
  /* CompleteClass */
  override val session: typingsJapgolly.webxr.XRSession = js.native
}
