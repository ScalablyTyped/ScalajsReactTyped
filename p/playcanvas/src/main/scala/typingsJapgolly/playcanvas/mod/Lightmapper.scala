package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Lightmapper
  * @classdesc The lightmapper is used to bake scene lights into textures.
  * @param {pc.GraphicsDevice} device - The grahpics device used by the lightmapper.
  * @param {pc.Entity} root - The root entity of the scene.
  * @param {pc.Scene} scene - The scene to lightmap.
  * @param {pc.ForwardRenderer} renderer - The renderer.
  * @param {pc.AssetRegistry} assets - Registry of assets to lightmap.
  */
@JSImport("playcanvas", "Lightmapper")
@js.native
class Lightmapper protected ()
  extends typingsJapgolly.playcanvas.pc.Lightmapper {
  def this(
    device: typingsJapgolly.playcanvas.pc.GraphicsDevice,
    root: typingsJapgolly.playcanvas.pc.Entity,
    scene: typingsJapgolly.playcanvas.pc.Scene,
    renderer: typingsJapgolly.playcanvas.pc.ForwardRenderer,
    assets: typingsJapgolly.playcanvas.pc.AssetRegistry
  ) = this()
}

