package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.camerasFreeCameraMod.FreeCamera
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicStereoscopicFreeCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicFreeCamera", "StereoscopicFreeCamera")
  @js.native
  open class StereoscopicFreeCamera protected () extends FreeCamera {
    /**
      * Creates a new StereoscopicFreeCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean,
      scene: Scene
    ) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
