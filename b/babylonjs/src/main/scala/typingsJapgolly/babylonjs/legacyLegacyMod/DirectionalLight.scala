package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DirectionalLight")
@js.native
open class DirectionalLight protected ()
  extends typingsJapgolly.babylonjs.indexMod.DirectionalLight {
  /**
    * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
    * The directional light is emitted from everywhere in the given direction.
    * It can cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The friendly name of the light
    * @param direction The direction of the light
    * @param scene The scene the light belongs to
    */
  def this(
    name: String,
    direction: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
}
