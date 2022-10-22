package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "StereoscopicScreenUniversalCamera")
@js.native
open class StereoscopicScreenUniversalCamera protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.StereoscopicScreenUniversalCamera {
  /**
    * Creates a new StereoscopicScreenUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param scene defines the hosting scene
    * @param distanceToProjectionPlane defines distance between each color axis. The rig cameras will receive this as their negative z position!
    * @param distanceBetweenEyes defines is stereoscopic is done side by side or over under
    */
  def this(name: String, position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    distanceToProjectionPlane: Double
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    distanceToProjectionPlane: Double
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    distanceToProjectionPlane: Double,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    distanceToProjectionPlane: Unit,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    distanceToProjectionPlane: Double,
    distanceBetweenEyes: Double
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    distanceToProjectionPlane: Unit,
    distanceBetweenEyes: Double
  ) = this()
}
