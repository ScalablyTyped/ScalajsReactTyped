package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiJs.AnonPluginName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSImport("pixi.js", "MeshMaterial")
@js.native
class MeshMaterial protected ()
  extends typingsJapgolly.pixiJs.PIXI.MeshMaterial {
  def this(uSampler: typingsJapgolly.pixiJs.PIXI.Texture) = this()
  def this(uSampler: typingsJapgolly.pixiJs.PIXI.Texture, options: AnonPluginName) = this()
}

