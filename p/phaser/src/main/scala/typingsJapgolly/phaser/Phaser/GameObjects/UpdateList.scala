package typingsJapgolly.phaser.Phaser.GameObjects

import typingsJapgolly.phaser.Phaser.Scene
import typingsJapgolly.phaser.Phaser.Scenes.Systems
import typingsJapgolly.phaser.Phaser.Structs.ProcessQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Update List plugin.
  * 
  * Update Lists belong to a Scene and maintain the list Game Objects to be updated every frame.
  * 
  * Some or all of these Game Objects may also be part of the Scene's [Display List]{@link Phaser.GameObjects.DisplayList}, for Rendering.
  */
@JSGlobal("Phaser.GameObjects.UpdateList")
@js.native
class UpdateList protected () extends ProcessQueue[GameObject] {
  /**
    * 
    * @param scene The Scene that the Update List belongs to.
    */
  def this(scene: Scene) = this()
  /**
    * The Scene that the Update List belongs to.
    */
  var scene: Scene = js.native
  /**
    * The Scene's Systems.
    */
  var systems: Systems = js.native
  /**
    * The update step.
    * 
    * Pre-updates every active Game Object in the list.
    * @param time The current timestamp.
    * @param delta The delta time elapsed since the last frame.
    */
  def sceneUpdate(time: Double, delta: Double): Unit = js.native
}

