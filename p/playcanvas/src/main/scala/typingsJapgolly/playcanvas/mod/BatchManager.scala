package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.BatchManager
  * @classdesc Glues many mesh instances into a single one for better performance.
  * @param {pc.GraphicsDevice} device - The graphics device used by the batch manager.
  * @param {pc.Entity} root - The entity under which batched models are added.
  * @param {pc.Scene} scene - The scene that the batch manager affects.
  */
@JSImport("playcanvas", "BatchManager")
@js.native
class BatchManager protected ()
  extends typingsJapgolly.playcanvas.pc.BatchManager {
  def this(
    device: typingsJapgolly.playcanvas.pc.GraphicsDevice,
    root: typingsJapgolly.playcanvas.pc.Entity,
    scene: typingsJapgolly.playcanvas.pc.Scene
  ) = this()
}

