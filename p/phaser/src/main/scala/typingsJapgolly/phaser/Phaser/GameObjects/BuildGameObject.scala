package typingsJapgolly.phaser.Phaser.GameObjects

import typingsJapgolly.phaser.Phaser.Scene
import typingsJapgolly.phaser.Phaser.Types.GameObjects.GameObjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.GameObjects.BuildGameObject")
@js.native
object BuildGameObject extends js.Object {
  /**
    * Builds a Game Object using the provided configuration object.
    * @param scene A reference to the Scene.
    * @param gameObject The initial GameObject.
    * @param config The config to build the GameObject with.
    */
  def apply(scene: Scene, gameObject: GameObject, config: GameObjectConfig): GameObject = js.native
}

