package typingsJapgolly.webxr.global

import org.scalajs.dom.EventTarget
import typingsJapgolly.webxr.XRHandedness
import typingsJapgolly.webxr.XRTargetRayMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an XR input source, which is any input mechanism which allows the user to perform
  * targeted actions in the same virtual space as the viewer. Example XR input sources include,
  * but are not limited to, handheld controllers, optically tracked hands, and gaze-based input
  * methods that operate on the viewer's pose. Input mechanisms which are not explicitly associated
  * with the XR device, such as traditional gamepads, mice, or keyboards SHOULD NOT be considered
  * XR input sources.
  * ref: https://immersive-web.github.io/webxr/#xrinputsource-interface
  */
/* note: abstract class */ @JSGlobal("XRInputSource")
@js.native
open class XRInputSource ()
  extends StObject
     with typingsJapgolly.webxr.XRInputSource {
  
  /* CompleteClass */
  override val handedness: XRHandedness = js.native
  
  /* CompleteClass */
  override val profiles: js.Array[String] = js.native
  
  /* CompleteClass */
  override val targetRayMode: XRTargetRayMode = js.native
  
  /* CompleteClass */
  override val targetRaySpace: EventTarget = js.native
}
