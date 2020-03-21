package typingsJapgolly.pixiJs.PIXI

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.pixiJs.AnonAlphaMode
import typingsJapgolly.pixiJs.PIXI.resources.Resource
import typingsJapgolly.pixiJs.PIXI.utils.EventEmitter
import typingsJapgolly.std.Float32Array
import typingsJapgolly.std.SVGElement
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Texture stores the information that represents an image.
  * All textures have a base texture, which contains information about the source.
  * Therefore you can have many textures all using a single BaseTexture
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  * @param {PIXI.resources.Resource|string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement} [resource=null]
  *        The current resource to use, for things that aren't Resource objects, will be converted
  *        into a Resource.
  * @param {Object} [options] - Collection of options
  * @param {PIXI.MIPMAP_MODES} [options.mipmap=PIXI.settings.MIPMAP_TEXTURES] - If mipmapping is enabled for texture
  * @param {number} [options.anisotropicLevel=PIXI.settings.ANISOTROPIC_LEVEL] - Anisotropic filtering level of texture
  * @param {PIXI.WRAP_MODES} [options.wrapMode=PIXI.settings.WRAP_MODE] - Wrap mode for textures
  * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.settings.SCALE_MODE] - Default scale mode, linear, nearest
  * @param {PIXI.FORMATS} [options.format=PIXI.FORMATS.RGBA] - GL format type
  * @param {PIXI.TYPES} [options.type=PIXI.TYPES.UNSIGNED_BYTE] - GL data type
  * @param {PIXI.TARGETS} [options.target=PIXI.TARGETS.TEXTURE_2D] - GL texture target
  * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.UNPACK] - Pre multiply the image alpha
  * @param {number} [options.width=0] - Width of the texture
  * @param {number} [options.height=0] - Height of the texture
  * @param {number} [options.resolution] - Resolution of the base texture
  * @param {object} [options.resourceOptions] - Optional resource options,
  *        see {@link PIXI.resources.autoDetectResource autoDetectResource}
  */
@JSGlobal("PIXI.BaseTexture")
@js.native
class BaseTexture () extends EventEmitter {
  def this(resource: String) = this()
  def this(resource: Resource) = this()
  def this(resource: HTMLCanvasElement) = this()
  def this(resource: HTMLImageElement) = this()
  def this(resource: HTMLVideoElement) = this()
  def this(resource: String, options: AnonAlphaMode) = this()
  def this(resource: Resource, options: AnonAlphaMode) = this()
  def this(resource: HTMLCanvasElement, options: AnonAlphaMode) = this()
  def this(resource: HTMLImageElement, options: AnonAlphaMode) = this()
  def this(resource: HTMLVideoElement, options: AnonAlphaMode) = this()
  /**
    * Number of the texture batch, used by multi-texture renderers
    *
    * @member {number} PIXI.BaseTexture#_batchEnabled
    */
  var _batchEnabled: Double = js.native
  /**
    * Location inside texture batch, used by multi-texture renderers
    *
    * @member {number} PIXI.BaseTexture#_batchLocation
    */
  var _batchLocation: Double = js.native
  /**
    * How to treat premultiplied alpha, see {@link PIXI.ALPHA_MODES}.
    *
    * @member {PIXI.ALPHA_MODES} PIXI.BaseTexture#alphaMode
    * @default PIXI.ALPHA_MODES.UNPACK
    */
  var alphaMode: ALPHA_MODES = js.native
  /**
    * Anisotropic filtering level of texture
    *
    * @member {number} PIXI.BaseTexture#anisotropicLevel
    * @default PIXI.settings.ANISOTROPIC_LEVEL
    */
  var anisotropicLevel: Double = js.native
  /**
    * Currently default cache ID.
    *
    * @member {string} PIXI.BaseTexture#cacheId
    */
  var cacheId: String = js.native
  /**
    * Flag if BaseTexture has been destroyed.
    *
    * @member {boolean} PIXI.BaseTexture#destroyed
    * @readonly
    */
  val destroyed: Boolean = js.native
  /**
    * Used by TextureSystem to only update texture to the GPU when needed.
    * Please call `update()` to increment it.
    *
    * @readonly
    * @member {number} PIXI.BaseTexture#dirtyId
    */
  val dirtyId: Double = js.native
  /**
    * Used by TextureSystem to only update texture style when needed.
    *
    * @protected
    * @member {number} PIXI.BaseTexture#dirtyStyleId
    */
  var dirtyStyleId: Double = js.native
  /**
    * The pixel format of the texture
    *
    * @member {PIXI.FORMATS} PIXI.BaseTexture#format
    * @default PIXI.FORMATS.RGBA
    */
  var format: FORMATS = js.native
  /**
    * The height of the base texture set when the image has loaded
    *
    * @readonly
    * @member {number} PIXI.BaseTexture#height
    */
  val height: Double = js.native
  /**
    * Whether or not the texture is a power of two, try to use power of two textures as much
    * as you can
    *
    * @readonly
    * @member {boolean} PIXI.BaseTexture#isPowerOfTwo
    * @default false
    */
  val isPowerOfTwo: Boolean = js.native
  /**
    * Mipmap mode of the texture, affects downscaled images
    *
    * @member {PIXI.MIPMAP_MODES} PIXI.BaseTexture#mipmap
    * @default PIXI.settings.MIPMAP_TEXTURES
    */
  var mipmap: MIPMAP_MODES = js.native
  /**
    * Pixel height of the source of this texture
    *
    * @readonly
    * @member {number}
    */
  val realHeight: Double = js.native
  /**
    * Pixel width of the source of this texture
    *
    * @readonly
    * @member {number}
    */
  val realWidth: Double = js.native
  /**
    * The resolution / device pixel ratio of the texture
    *
    * @member {number} PIXI.BaseTexture#resolution
    * @default PIXI.settings.RESOLUTION
    */
  var resolution: Double = js.native
  /**
    * The resource used by this BaseTexture, there can only
    * be one resource per BaseTexture, but textures can share
    * resources.
    *
    * @member {PIXI.resources.Resource} PIXI.BaseTexture#resource
    * @readonly
    */
  val resource: Resource = js.native
  /**
    * The scale mode to apply when scaling this texture
    *
    * @member {PIXI.SCALE_MODES} PIXI.BaseTexture#scaleMode
    * @default PIXI.settings.SCALE_MODE
    */
  var scaleMode: SCALE_MODES = js.native
  /**
    * The target type
    *
    * @member {PIXI.TARGETS} PIXI.BaseTexture#target
    * @default PIXI.TARGETS.TEXTURE_2D
    */
  var target: TARGETS = js.native
  /**
    * The collection of alternative cache ids, since some BaseTextures
    * can have more than one ID, short name and longer full URL
    *
    * @member {Array<string>} PIXI.BaseTexture#textureCacheIds
    * @readonly
    */
  val textureCacheIds: js.Array[String] = js.native
  /**
    * Used by automatic texture Garbage Collection, stores last GC tick when it was bound
    *
    * @member {number} PIXI.BaseTexture#touched
    * @protected
    */
  var touched: Double = js.native
  /**
    * The type of resource data
    *
    * @member {PIXI.TYPES} PIXI.BaseTexture#type
    * @default PIXI.TYPES.UNSIGNED_BYTE
    */
  var `type`: TYPES = js.native
  /**
    * Global unique identifier for this BaseTexture
    *
    * @member {string} PIXI.BaseTexture#uid
    * @protected
    */
  var uid: String = js.native
  /**
    * Generally speaking means when resource is loaded.
    * @readonly
    * @member {boolean} PIXI.BaseTexture#valid
    */
  val valid: Boolean = js.native
  /**
    * The width of the base texture set when the image has loaded
    *
    * @readonly
    * @member {number} PIXI.BaseTexture#width
    */
  val width: Double = js.native
  /**
    * How the texture wraps
    * @member {number} PIXI.BaseTexture#wrapMode
    */
  var wrapMode: Double = js.native
  /**
    * Destroys this base texture.
    * The method stops if resource doesn't want this texture to be destroyed.
    * Removes texture from all caches.
    */
  def destroy(): Unit = js.native
  /**
    * Frees the texture from WebGL memory without destroying this texture object.
    * This means you can still use the texture later which will upload it to GPU
    * memory again.
    *
    * @fires PIXI.BaseTexture#dispose
    */
  def dispose(): Unit = js.native
  /**
    * Sets real size of baseTexture, preserves current resolution.
    *
    * @param {number} realWidth Full rendered width
    * @param {number} realHeight Full rendered height
    * @param {number} [resolution] Optionally set resolution
    * @returns {PIXI.BaseTexture} this
    */
  def setRealSize(realWidth: Double, realHeight: Double): BaseTexture = js.native
  def setRealSize(realWidth: Double, realHeight: Double, resolution: Double): BaseTexture = js.native
  /**
    * Changes resolution
    *
    * @param {number} [resolution] res
    * @returns {PIXI.BaseTexture} this
    */
  def setResolution(): BaseTexture = js.native
  def setResolution(resolution: Double): BaseTexture = js.native
  /**
    * Sets the resource if it wasn't set. Throws error if resource already present
    *
    * @param {PIXI.resources.Resource} resource - that is managing this BaseTexture
    * @returns {PIXI.BaseTexture} this
    */
  def setResource(resource: Resource): BaseTexture = js.native
  /**
    * Changes w/h/resolution. Texture becomes valid if width and height are greater than zero.
    *
    * @param {number} width Visual width
    * @param {number} height Visual height
    * @param {number} [resolution] Optionally set resolution
    * @returns {PIXI.BaseTexture} this
    */
  def setSize(width: Double, height: Double): BaseTexture = js.native
  def setSize(width: Double, height: Double, resolution: Double): BaseTexture = js.native
  /**
    * Changes style options of BaseTexture
    *
    * @param {PIXI.SCALE_MODES} [scaleMode] - Pixi scalemode
    * @param {PIXI.MIPMAP_MODES} [mipmap] - enable mipmaps
    * @returns {PIXI.BaseTexture} this
    */
  def setStyle(): BaseTexture = js.native
  def setStyle(scaleMode: SCALE_MODES): BaseTexture = js.native
  def setStyle(scaleMode: SCALE_MODES, mipmap: MIPMAP_MODES): BaseTexture = js.native
  /**
    * Invalidates the object. Texture becomes valid if width and height are greater than zero.
    */
  def update(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.BaseTexture")
@js.native
object BaseTexture extends js.Object {
  /**
    * Global number of the texture batch, used by multi-texture renderers
    *
    * @static
    * @member {number}
    */
  var _globalBatch: Double = js.native
  /**
    * Adds a BaseTexture to the global BaseTextureCache. This cache is shared across the whole PIXI object.
    *
    * @static
    * @param {PIXI.BaseTexture} baseTexture - The BaseTexture to add to the cache.
    * @param {string} id - The id that the BaseTexture will be stored against.
    */
  def addToCache(baseTexture: BaseTexture, id: String): Unit = js.native
  /**
    * Helper function that creates a base texture based on the source you provide.
    * The source can be - image url, image element, canvas element. If the
    * source is an image url or an image element and not in the base texture
    * cache, it will be created and loaded.
    *
    * @static
    * @param {string|HTMLImageElement|HTMLCanvasElement|SVGElement|HTMLVideoElement} source - The
    *        source to create base texture from.
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {boolean} [strict] Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @returns {PIXI.BaseTexture} The new base texture.
    */
  def from(source: String): BaseTexture = js.native
  def from(source: String, options: js.Any): BaseTexture = js.native
  def from(source: String, options: js.Any, strict: Boolean): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLCanvasElement): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLCanvasElement, options: js.Any): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLCanvasElement, options: js.Any, strict: Boolean): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLImageElement): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLImageElement, options: js.Any): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLImageElement, options: js.Any, strict: Boolean): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLVideoElement): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLVideoElement, options: js.Any): BaseTexture = js.native
  def from(source: typingsJapgolly.std.HTMLVideoElement, options: js.Any, strict: Boolean): BaseTexture = js.native
  def from(source: SVGElement): BaseTexture = js.native
  def from(source: SVGElement, options: js.Any): BaseTexture = js.native
  def from(source: SVGElement, options: js.Any, strict: Boolean): BaseTexture = js.native
  /**
    * Create a new BaseTexture with a BufferResource from a Float32Array.
    * RGBA values are floats from 0 to 1.
    * @static
    * @param {Float32Array|Uint8Array} buffer The optional array to use, if no data
    *        is provided, a new Float32Array is created.
    * @param {number} width - Width of the resource
    * @param {number} height - Height of the resource
    * @param {object} [options] See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.BaseTexture} The resulting new BaseTexture
    */
  def fromBuffer(buffer: Float32Array, width: Double, height: Double): BaseTexture = js.native
  def fromBuffer(buffer: Float32Array, width: Double, height: Double, options: js.Any): BaseTexture = js.native
  def fromBuffer(buffer: Uint8Array, width: Double, height: Double): BaseTexture = js.native
  def fromBuffer(buffer: Uint8Array, width: Double, height: Double, options: js.Any): BaseTexture = js.native
  /**
    * Remove a BaseTexture from the global BaseTextureCache.
    *
    * @static
    * @param {string|PIXI.BaseTexture} baseTexture - id of a BaseTexture to be removed, or a BaseTexture instance itself.
    * @return {PIXI.BaseTexture|null} The BaseTexture that was removed.
    */
  def removeFromCache(baseTexture: String): BaseTexture | Null = js.native
  def removeFromCache(baseTexture: BaseTexture): BaseTexture | Null = js.native
}

