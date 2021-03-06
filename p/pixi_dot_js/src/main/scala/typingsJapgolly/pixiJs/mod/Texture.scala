package typingsJapgolly.pixiJs.mod

import typingsJapgolly.std.Float32Array
import typingsJapgolly.std.HTMLCanvasElement
import typingsJapgolly.std.HTMLImageElement
import typingsJapgolly.std.HTMLVideoElement
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A texture stores the information that represents an image or part of an image.
  *
  * It cannot be added to the display list directly; instead use it as the texture for a Sprite.
  * If no frame is provided for a texture, then the whole image is used.
  *
  * You can directly create a texture from an image and then reuse it multiple times like this :
  *
  * ```js
  * let texture = PIXI.Texture.from('assets/image.png');
  * let sprite1 = new PIXI.Sprite(texture);
  * let sprite2 = new PIXI.Sprite(texture);
  * ```
  *
  * If you didnt pass the texture frame to constructor, it enables `noFrame` mode:
  * it subscribes on baseTexture events, it automatically resizes at the same time as baseTexture.
  *
  * Textures made from SVGs, loaded or not, cannot be used before the file finishes processing.
  * You can check for this by checking the sprite's _textureID property.
  * ```js
  * var texture = PIXI.Texture.from('assets/image.svg');
  * var sprite1 = new PIXI.Sprite(texture);
  * //sprite1._textureID should not be undefined if the texture has finished processing the SVG file
  * ```
  * You can use a ticker or rAF to ensure your sprites load the finished textures after processing. See issue #3068.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@JSImport("pixi.js", "Texture")
@js.native
class Texture protected ()
  extends typingsJapgolly.pixiJs.PIXI.Texture {
  def this(baseTexture: typingsJapgolly.pixiJs.PIXI.BaseTexture) = this()
  def this(baseTexture: typingsJapgolly.pixiJs.PIXI.BaseTexture, frame: typingsJapgolly.pixiJs.PIXI.Rectangle) = this()
  def this(
    baseTexture: typingsJapgolly.pixiJs.PIXI.BaseTexture,
    frame: typingsJapgolly.pixiJs.PIXI.Rectangle,
    orig: typingsJapgolly.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsJapgolly.pixiJs.PIXI.BaseTexture,
    frame: typingsJapgolly.pixiJs.PIXI.Rectangle,
    orig: typingsJapgolly.pixiJs.PIXI.Rectangle,
    trim: typingsJapgolly.pixiJs.PIXI.Rectangle
  ) = this()
  def this(
    baseTexture: typingsJapgolly.pixiJs.PIXI.BaseTexture,
    frame: typingsJapgolly.pixiJs.PIXI.Rectangle,
    orig: typingsJapgolly.pixiJs.PIXI.Rectangle,
    trim: typingsJapgolly.pixiJs.PIXI.Rectangle,
    rotate: Double
  ) = this()
  def this(
    baseTexture: typingsJapgolly.pixiJs.PIXI.BaseTexture,
    frame: typingsJapgolly.pixiJs.PIXI.Rectangle,
    orig: typingsJapgolly.pixiJs.PIXI.Rectangle,
    trim: typingsJapgolly.pixiJs.PIXI.Rectangle,
    rotate: Double,
    anchor: typingsJapgolly.pixiJs.PIXI.Point
  ) = this()
}

/* static members */
@JSImport("pixi.js", "Texture")
@js.native
object Texture extends js.Object {
  /**
    * An empty texture, used often to not have to create multiple empty textures.
    * Can not be destroyed.
    *
    * @static
    * @constant
    * @member {PIXI.Texture}
    */
  var EMPTY: typingsJapgolly.pixiJs.PIXI.Texture = js.native
  /**
    * A white texture of 16x16 size, used for graphics and other things
    * Can not be destroyed.
    *
    * @static
    * @constant
    * @member {PIXI.Texture}
    */
  var WHITE: typingsJapgolly.pixiJs.PIXI.Texture = js.native
  /**
    * Adds a Texture to the global TextureCache. This cache is shared across the whole PIXI object.
    *
    * @static
    * @param {PIXI.Texture} texture - The Texture to add to the cache.
    * @param {string} id - The id that the Texture will be stored against.
    */
  def addToCache(texture: typingsJapgolly.pixiJs.PIXI.Texture, id: String): Unit = js.native
  /**
    * Helper function that creates a new Texture based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|PIXI.BaseTexture} source
    *        Source to create texture from
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {boolean} [strict] Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @return {PIXI.Texture} The newly created texture
    */
  def from(source: String): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: String, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: String, options: js.Any, strict: Boolean): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: typingsJapgolly.pixiJs.PIXI.BaseTexture): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: typingsJapgolly.pixiJs.PIXI.BaseTexture, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: typingsJapgolly.pixiJs.PIXI.BaseTexture, options: js.Any, strict: Boolean): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLCanvasElement): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLCanvasElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLCanvasElement, options: js.Any, strict: Boolean): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLImageElement): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLImageElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLImageElement, options: js.Any, strict: Boolean): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLVideoElement): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLVideoElement, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def from(source: HTMLVideoElement, options: js.Any, strict: Boolean): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  /**
    * Create a new Texture with a BufferResource from a Float32Array.
    * RGBA values are floats from 0 to 1.
    * @static
    * @param {Float32Array|Uint8Array} buffer The optional array to use, if no data
    *        is provided, a new Float32Array is created.
    * @param {number} width - Width of the resource
    * @param {number} height - Height of the resource
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.Texture} The resulting new BaseTexture
    */
  def fromBuffer(buffer: Float32Array, width: Double, height: Double): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def fromBuffer(buffer: Float32Array, width: Double, height: Double, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def fromBuffer(buffer: Uint8Array, width: Double, height: Double): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def fromBuffer(buffer: Uint8Array, width: Double, height: Double, options: js.Any): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLCanvasElement, imageUrl: String, name: String): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  /**
    * Create a texture from a source and add to the cache.
    *
    * @static
    * @param {HTMLImageElement|HTMLCanvasElement} source - The input source.
    * @param {String} imageUrl - File name of texture, for cache and resolving resolution.
    * @param {String} [name] - Human readable name for the texture cache. If no name is
    *        specified, only `imageUrl` will be used as the cache ID.
    * @return {PIXI.Texture} Output texture
    */
  def fromLoader(source: HTMLImageElement, imageUrl: String): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  def fromLoader(source: HTMLImageElement, imageUrl: String, name: String): typingsJapgolly.pixiJs.PIXI.Texture = js.native
  /**
    * Remove a Texture from the global TextureCache.
    *
    * @static
    * @param {string|PIXI.Texture} texture - id of a Texture to be removed, or a Texture instance itself
    * @return {PIXI.Texture|null} The Texture that was removed
    */
  def removeFromCache(texture: String): typingsJapgolly.pixiJs.PIXI.Texture | Null = js.native
  def removeFromCache(texture: typingsJapgolly.pixiJs.PIXI.Texture): typingsJapgolly.pixiJs.PIXI.Texture | Null = js.native
}

