package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.EventTarget
import typingsJapgolly.babylonjs.XRAnchorSet
import typingsJapgolly.babylonjs.XRFrame
import typingsJapgolly.babylonjs.XRImageTrackingResult
import typingsJapgolly.babylonjs.XRPlaneSet
import typingsJapgolly.babylonjs.XRPose
import typingsJapgolly.babylonjs.XRReferenceSpace
import typingsJapgolly.babylonjs.XRSession
import typingsJapgolly.babylonjs.XRWorldInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeXRFrame
  extends StObject
     with XRFrame {
  
  /* private */ var _nativeImpl: Any = js.native
  
  /* private */ val _xrPose: Any = js.native
  
  /* private */ val _xrPoseVectorData: Any = js.native
  
  /* private */ val _xrTransform: Any = js.native
  
  @JSName("detectedPlanes")
  def detectedPlanes_MNativeXRFrame: js.UndefOr[XRPlaneSet] = js.native
  
  @JSName("featurePointCloud")
  def featurePointCloud_MNativeXRFrame: js.UndefOr[js.Array[Double]] = js.native
  
  val getHitTestResults: Any = js.native
  
  def getHitTestResultsForTransientInput(): scala.Nothing = js.native
  
  @JSName("getImageTrackingResults")
  def getImageTrackingResults_MNativeXRFrame(): js.Array[XRImageTrackingResult] = js.native
  
  def getLightEstimate(): scala.Nothing = js.native
  
  def getPose(space: EventTarget, baseSpace: XRReferenceSpace): js.UndefOr[XRPose] = js.native
  
  val getViewerPose: Any = js.native
  
  @JSName("session")
  def session_MNativeXRFrame: XRSession = js.native
  
  @JSName("trackedAnchors")
  def trackedAnchors_MNativeXRFrame: js.UndefOr[XRAnchorSet] = js.native
  
  @JSName("worldInformation")
  def worldInformation_MNativeXRFrame: js.UndefOr[XRWorldInformation] = js.native
}
