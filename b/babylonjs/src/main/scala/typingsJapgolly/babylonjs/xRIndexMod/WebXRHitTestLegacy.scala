package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.XRHitResult
import typingsJapgolly.babylonjs.XRInputSourceEvent
import typingsJapgolly.babylonjs.XRRay
import typingsJapgolly.babylonjs.XRReferenceSpace
import typingsJapgolly.babylonjs.XRSession
import typingsJapgolly.babylonjs.xRFeaturesWebXRHitTestLegacyMod.IWebXRLegacyHitTestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRHitTestLegacy")
@js.native
open class WebXRHitTestLegacy protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesIndexMod.WebXRHitTestLegacy {
  /**
    * Creates a new instance of the (legacy version) hit test feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRLegacyHitTestOptions
  ) = this()
}
/* static members */
object WebXRHitTestLegacy {
  
  @JSImport("babylonjs/XR/index", "WebXRHitTestLegacy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/index", "WebXRHitTestLegacy.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRHitTestLegacy.Version")
  @js.native
  val Version: Double = js.native
  
  /**
    * execute a hit test with an XR Ray
    *
    * @param xrSession a native xrSession that will execute this hit test
    * @param xrRay the ray (position and direction) to use for ray-casting
    * @param referenceSpace native XR reference space to use for the hit-test
    * @param filter filter function that will filter the results
    * @returns a promise that resolves with an array of native XR hit result in xr coordinates system
    */
  inline def XRHitTestWithRay(xrSession: XRSession, xrRay: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("XRHitTestWithRay")(xrSession.asInstanceOf[js.Any], xrRay.asInstanceOf[js.Any], referenceSpace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[XRHitResult]]]
  inline def XRHitTestWithRay(
    xrSession: XRSession,
    xrRay: XRRay,
    referenceSpace: XRReferenceSpace,
    filter: js.Function1[/* result */ XRHitResult, Boolean]
  ): js.Promise[js.Array[XRHitResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("XRHitTestWithRay")(xrSession.asInstanceOf[js.Any], xrRay.asInstanceOf[js.Any], referenceSpace.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[XRHitResult]]]
  
  /**
    * Execute a hit test on the current running session using a select event returned from a transient input (such as touch)
    * @param event the (select) event to use to select with
    * @param referenceSpace the reference space to use for this hit test
    * @returns a promise that resolves with an array of native XR hit result in xr coordinates system
    */
  inline def XRHitTestWithSelectEvent(event: XRInputSourceEvent, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("XRHitTestWithSelectEvent")(event.asInstanceOf[js.Any], referenceSpace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[XRHitResult]]]
}
