package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.anon.Atlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Sprite contains references to one or more frames of a {@link TextureAtlas}. It can be used by
  * the {@link SpriteComponent} or the {@link ElementComponent} to render a single frame or a sprite
  * animation.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.Sprite")
@js.native
open class Sprite protected ()
  extends typingsJapgolly.playcanvas.mod.Sprite {
  /**
    * Create a new Sprite instance.
    *
    * @param {GraphicsDevice} device - The graphics device of the application.
    * @param {object} [options] - Options for creating the Sprite.
    * @param {number} [options.pixelsPerUnit] - The number of pixels that map to one PlayCanvas
    * unit. Defaults to 1.
    * @param {number} [options.renderMode] - The rendering mode of the sprite. Can be:
    *
    * - {@link SPRITE_RENDERMODE_SIMPLE}
    * - {@link SPRITE_RENDERMODE_SLICED}
    * - {@link SPRITE_RENDERMODE_TILED}
    *
    * Defaults to {@link SPRITE_RENDERMODE_SIMPLE}.
    * @param {TextureAtlas} [options.atlas] - The texture atlas. Defaults to null.
    * @param {string[]} [options.frameKeys] - The keys of the frames in the sprite atlas that this
    * sprite is using. Defaults to null.
    */
  def this(device: typingsJapgolly.playcanvas.mod.GraphicsDevice) = this()
  def this(device: typingsJapgolly.playcanvas.mod.GraphicsDevice, options: Atlas) = this()
}
