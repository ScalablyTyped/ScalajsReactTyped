package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.camerasTouchCameraMod.TouchCamera
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasUniversalCameraMod {
  
  @JSImport("babylonjs/Cameras/universalCamera", "UniversalCamera")
  @js.native
  open class UniversalCamera protected () extends TouchCamera {
    /**
      * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
      * which still works and will still be found in many Playgrounds.
      * @see https://doc.babylonjs.com/features/cameras#universal-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    
    /**
      * Defines the gamepad rotation sensibility.
      * This is the threshold from when rotation starts to be accounted for to prevent jittering.
      */
    def gamepadAngularSensibility: Double = js.native
    def gamepadAngularSensibility_=(value: Double): Unit = js.native
    
    /**
      * Defines the gamepad move sensibility.
      * This is the threshold from when moving starts to be accounted for to prevent jittering.
      */
    def gamepadMoveSensibility: Double = js.native
    def gamepadMoveSensibility_=(value: Double): Unit = js.native
  }
}
