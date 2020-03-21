package typingsJapgolly.playcanvas.pc

import typingsJapgolly.playcanvas.AnonAtlas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Sprite
  * @augments pc.EventHandler
  * @classdesc A pc.Sprite is contains references to one or more frames of a {@link pc.TextureAtlas}.
  * It can be used by the {@link pc.SpriteComponent} or the {@link pc.ElementComponent} to render a
  * single frame or a sprite animation.
  * @param {pc.GraphicsDevice} device - The graphics device of the application.
  * @param {object} [options] - Options for creating the pc.Sprite.
  * @param {number} [options.pixelsPerUnit] - The number of pixels that map to one PlayCanvas unit.
  * Defaults to 1.
  * @param {number} [options.renderMode] - The rendering mode of the sprite. Can be:
  *
  * * {@link pc.SPRITE_RENDERMODE_SIMPLE}
  * * {@link pc.SPRITE_RENDERMODE_SLICED}
  * * {@link pc.SPRITE_RENDERMODE_TILED}
  *
  * Defaults to pc.SPRITE_RENDERMODE_SIMPLE.
  * @param {pc.TextureAtlas} [options.atlas] - The texture atlas. Defaults to null.
  * @param {string[]} [options.frameKeys] - The keys of the frames in the sprite atlas that this sprite is
  * using. Defaults to null.
  * @property {number} pixelsPerUnit The number of pixels that map to one PlayCanvas unit.
  * @property {pc.TextureAtlas} atlas The texture atlas.
  * @property {number} renderMode The rendering mode of the sprite. Can be:
  *
  * * {@link pc.SPRITE_RENDERMODE_SIMPLE}
  * * {@link pc.SPRITE_RENDERMODE_SLICED}
  * * {@link pc.SPRITE_RENDERMODE_TILED}
  *
  * @property {string[]} frameKeys The keys of the frames in the sprite atlas that this sprite is using.
  * @property {pc.Mesh[]} meshes An array that contains a mesh for each frame.
  */
@JSGlobal("pc.Sprite")
@js.native
class Sprite protected () extends EventHandler {
  def this(device: GraphicsDevice) = this()
  def this(device: GraphicsDevice, options: AnonAtlas) = this()
  /**
    * The texture atlas.
    */
  var atlas: TextureAtlas = js.native
  /**
    * The keys of the frames in the sprite atlas that this sprite is using.
    */
  var frameKeys: js.Array[String] = js.native
  /**
    * An array that contains a mesh for each frame.
    */
  var meshes: js.Array[Mesh] = js.native
  /**
    * The number of pixels that map to one PlayCanvas unit.
    */
  var pixelsPerUnit: Double = js.native
  /**
    * The rendering mode of the sprite. Can be:
    * * {@link pc.SPRITE_RENDERMODE_SIMPLE}
    * * {@link pc.SPRITE_RENDERMODE_SLICED}
    * * {@link pc.SPRITE_RENDERMODE_TILED}
    */
  var renderMode: Double = js.native
  /**
    * @function
    * @name pc.Sprite#destroy
    * @description Free up the meshes created by the sprite.
    */
  def destroy(): Unit = js.native
}

