package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ModelHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Model} resources.
  * @param {pc.GraphicsDevice} device - The graphics device that will be rendering.
  * @param {pc.StandardMaterial} defaultMaterial - The shared default material that is used in any place that a material is not specified.
  */
@JSImport("playcanvas", "ModelHandler")
@js.native
class ModelHandler protected ()
  extends typingsJapgolly.playcanvas.pc.ModelHandler {
  def this(
    device: typingsJapgolly.playcanvas.pc.GraphicsDevice,
    defaultMaterial: typingsJapgolly.playcanvas.pc.StandardMaterial
  ) = this()
}

