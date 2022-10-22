package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.camerasFreeCameraMod.FreeCamera
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicAnaglyphFreeCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphFreeCamera", "AnaglyphFreeCamera")
  @js.native
  open class AnaglyphFreeCamera protected () extends FreeCamera {
    /**
      * Creates a new AnaglyphFreeCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double) = this()
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
