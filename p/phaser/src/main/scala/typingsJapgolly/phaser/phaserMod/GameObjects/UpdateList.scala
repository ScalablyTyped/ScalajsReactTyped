package typingsJapgolly.phaser.phaserMod.GameObjects

import typingsJapgolly.phaser.Phaser.Scene
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
@JSImport("phaser", "GameObjects.UpdateList")
@js.native
class UpdateList protected ()
  extends typingsJapgolly.phaser.Phaser.GameObjects.UpdateList {
  /**
    * 
    * @param scene The Scene that the Update List belongs to.
    */
  def this(scene: Scene) = this()
}

