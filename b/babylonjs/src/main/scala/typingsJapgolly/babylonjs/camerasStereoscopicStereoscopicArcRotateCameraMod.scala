package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicStereoscopicArcRotateCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/stereoscopicArcRotateCamera", "StereoscopicArcRotateCamera")
  @js.native
  open class StereoscopicArcRotateCamera protected () extends ArcRotateCamera {
    /**
      * Creates a new StereoscopicArcRotateCamera
      * @param name defines camera name
      * @param alpha defines alpha angle (in radians)
      * @param beta defines beta angle (in radians)
      * @param radius defines radius
      * @param target defines camera target
      * @param interaxialDistance defines distance between each color axis
      * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
      * @param scene defines the hosting scene
      */
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double,
      isStereoscopicSideBySide: Boolean,
      scene: Scene
    ) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
