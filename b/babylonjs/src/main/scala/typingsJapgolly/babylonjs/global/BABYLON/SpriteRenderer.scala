package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpriteRenderer")
@js.native
open class SpriteRenderer protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SpriteRenderer {
  /**
    * Creates a new sprite Renderer
    * @param engine defines the engine the renderer works with
    * @param capacity defines the maximum allowed number of sprites
    * @param epsilon defines the epsilon value to align texture (0.01 by default)
    * @param scene defines the hosting scene
    */
  def this(engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine, capacity: Double) = this()
  def this(engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine, capacity: Double, epsilon: Double) = this()
  def this(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    capacity: Double,
    epsilon: Double,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    capacity: Double,
    epsilon: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ) = this()
}
