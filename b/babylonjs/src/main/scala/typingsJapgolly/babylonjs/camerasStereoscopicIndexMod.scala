package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicIndexMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphArcRotateCamera")
  @js.native
  open class AnaglyphArcRotateCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicAnaglyphArcRotateCameraMod.AnaglyphArcRotateCamera {
    /**
      * Creates a new AnaglyphArcRotateCamera
      * @param name defines camera name
      * @param alpha defines alpha angle (in radians)
      * @param beta defines beta angle (in radians)
      * @param radius defines radius
      * @param target defines camera target
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double,
      scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphFreeCamera")
  @js.native
  open class AnaglyphFreeCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicAnaglyphFreeCameraMod.AnaglyphFreeCamera {
    /**
      * Creates a new AnaglyphFreeCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double) = this()
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphGamepadCamera")
  @js.native
  open class AnaglyphGamepadCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicAnaglyphGamepadCameraMod.AnaglyphGamepadCamera {
    /**
      * Creates a new AnaglyphGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double) = this()
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "AnaglyphUniversalCamera")
  @js.native
  open class AnaglyphUniversalCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicAnaglyphUniversalCameraMod.AnaglyphUniversalCamera {
    /**
      * Creates a new AnaglyphUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double) = this()
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicArcRotateCamera")
  @js.native
  open class StereoscopicArcRotateCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicStereoscopicArcRotateCameraMod.StereoscopicArcRotateCamera {
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
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicFreeCamera")
  @js.native
  open class StereoscopicFreeCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicStereoscopicFreeCameraMod.StereoscopicFreeCamera {
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
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicGamepadCamera")
  @js.native
  open class StereoscopicGamepadCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicStereoscopicGamepadCameraMod.StereoscopicGamepadCamera {
    /**
      * Creates a new StereoscopicGamepadCamera
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
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicScreenUniversalCamera")
  @js.native
  open class StereoscopicScreenUniversalCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicStereoscopicScreenUniversalCameraMod.StereoscopicScreenUniversalCamera {
    /**
      * Creates a new StereoscopicScreenUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param scene defines the hosting scene
      * @param distanceToProjectionPlane defines distance between each color axis. The rig cameras will receive this as their negative z position!
      * @param distanceBetweenEyes defines is stereoscopic is done side by side or over under
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, distanceToProjectionPlane: Double) = this()
    def this(name: String, position: Vector3, scene: Scene, distanceToProjectionPlane: Double) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      distanceToProjectionPlane: Double,
      distanceBetweenEyes: Double
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      distanceToProjectionPlane: Unit,
      distanceBetweenEyes: Double
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      distanceToProjectionPlane: Double,
      distanceBetweenEyes: Double
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      distanceToProjectionPlane: Unit,
      distanceBetweenEyes: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/Stereoscopic/index", "StereoscopicUniversalCamera")
  @js.native
  open class StereoscopicUniversalCamera protected ()
    extends typingsJapgolly.babylonjs.camerasStereoscopicStereoscopicUniversalCameraMod.StereoscopicUniversalCamera {
    /**
      * Creates a new StereoscopicUniversalCamera
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
  }
}
