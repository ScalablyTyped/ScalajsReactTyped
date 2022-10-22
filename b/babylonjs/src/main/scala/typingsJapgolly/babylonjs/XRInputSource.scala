package typingsJapgolly.babylonjs

import org.scalajs.dom.EventTarget
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
trait XRInputSource extends StObject {
  
  val gamepad: js.UndefOr[Gamepad] = js.undefined
  
  val gripSpace: js.UndefOr[EventTarget] = js.undefined
  
  val hand: js.UndefOr[XRHand] = js.undefined
  
  val handedness: XRHandedness
  
  val profiles: js.Array[String]
  
  val targetRayMode: XRTargetRayMode
  
  val targetRaySpace: EventTarget
}
object XRInputSource {
  
  inline def apply(
    handedness: XRHandedness,
    profiles: js.Array[String],
    targetRayMode: XRTargetRayMode,
    targetRaySpace: EventTarget
  ): XRInputSource = {
    val __obj = js.Dynamic.literal(handedness = handedness.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], targetRayMode = targetRayMode.asInstanceOf[js.Any], targetRaySpace = targetRaySpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSource]
  }
  
  extension [Self <: XRInputSource](x: Self) {
    
    inline def setGamepad(value: Gamepad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
    
    inline def setGamepadUndefined: Self = StObject.set(x, "gamepad", js.undefined)
    
    inline def setGripSpace(value: EventTarget): Self = StObject.set(x, "gripSpace", value.asInstanceOf[js.Any])
    
    inline def setGripSpaceUndefined: Self = StObject.set(x, "gripSpace", js.undefined)
    
    inline def setHand(value: XRHand): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
    
    inline def setHandUndefined: Self = StObject.set(x, "hand", js.undefined)
    
    inline def setHandedness(value: XRHandedness): Self = StObject.set(x, "handedness", value.asInstanceOf[js.Any])
    
    inline def setProfiles(value: js.Array[String]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesVarargs(value: String*): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setTargetRayMode(value: XRTargetRayMode): Self = StObject.set(x, "targetRayMode", value.asInstanceOf[js.Any])
    
    inline def setTargetRaySpace(value: EventTarget): Self = StObject.set(x, "targetRaySpace", value.asInstanceOf[js.Any])
  }
}
