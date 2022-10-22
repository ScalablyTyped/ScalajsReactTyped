package typingsJapgolly.babylonjs.global

import typingsJapgolly.babylonjs.XREye
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a single view into an XR scene for a given frame.
  *
  * ref: https://immersive-web.github.io/webxr/#xrview-interface
  */
/* note: abstract class */ @JSGlobal("XRView")
@js.native
open class XRView ()
  extends StObject
     with typingsJapgolly.babylonjs.XRView {
  
  /* CompleteClass */
  override val eye: XREye = js.native
  
  /* CompleteClass */
  override val projectionMatrix: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  override def requestViewportScale(scale: Double): Unit = js.native
  
  /* CompleteClass */
  override val transform: typingsJapgolly.babylonjs.XRRigidTransform = js.native
}
