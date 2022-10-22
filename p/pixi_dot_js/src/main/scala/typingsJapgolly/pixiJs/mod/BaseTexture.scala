package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiCore.mod.IAutoDetectOptions
import typingsJapgolly.pixiCore.mod.IBaseTextureOptions
import typingsJapgolly.pixiCore.mod.ImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BaseTexture")
@js.native
/**
  * @param {PIXI.Resource|string|HTMLImageElement|HTMLCanvasElement|HTMLVideoElement} [resource=null] -
  *        The current resource to use, for things that aren't Resource objects, will be converted
  *        into a Resource.
  * @param options - Collection of options
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
  * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - Resolution of the base texture
  * @param {object} [options.resourceOptions] - Optional resource options,
  *        see {@link PIXI.autoDetectResource autoDetectResource}
  */
open class BaseTexture[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO] ()
  extends typingsJapgolly.pixiCore.mod.BaseTexture[R, RO] {
  def this(resource: Any | R) = this()
  def this(resource: String) = this()
  def this(resource: ImageSource) = this()
  def this(resource: Any | R, options: IBaseTextureOptions[RO]) = this()
  def this(resource: String, options: IBaseTextureOptions[RO]) = this()
  def this(resource: Unit, options: IBaseTextureOptions[RO]) = this()
  def this(resource: ImageSource, options: IBaseTextureOptions[RO]) = this()
}
/* static members */
object BaseTexture {
  
  @JSImport("pixi.js", "BaseTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /** Global number of the texture batch, used by multi-texture renderers. */
  @JSImport("pixi.js", "BaseTexture._globalBatch")
  @js.native
  def _globalBatch: Double = js.native
  inline def _globalBatch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_globalBatch")(x.asInstanceOf[js.Any])
  
  /**
    * Adds a BaseTexture to the global BaseTextureCache. This cache is shared across the whole PIXI object.
    * @param {PIXI.BaseTexture} baseTexture - The BaseTexture to add to the cache.
    * @param {string} id - The id that the BaseTexture will be stored against.
    */
  inline def addToCache(
    baseTexture: typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.Resource, IAutoDetectOptions],
    id: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToCache")(baseTexture.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: String): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: String, options: Unit, strict: Boolean): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: String, options: IBaseTextureOptions[RO]): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: String, options: IBaseTextureOptions[RO], strict: Boolean): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: js.Array[String]): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: js.Array[String], options: Unit, strict: Boolean): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: js.Array[String], options: IBaseTextureOptions[RO]): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: js.Array[String], options: IBaseTextureOptions[RO], strict: Boolean): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  /**
    * Helper function that creates a base texture based on the source you provide.
    * The source can be - image url, image element, canvas element. If the
    * source is an image url or an image element and not in the base texture
    * cache, it will be created and loaded.
    * @static
    * @param {string|string[]|HTMLImageElement|HTMLCanvasElement|SVGElement|HTMLVideoElement} source - The
    *        source to create base texture from.
    * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {string} [options.pixiIdPrefix=pixiid] - If a source has no id, this is the prefix of the generated id
    * @param {boolean} [strict] - Enforce strict-mode, see {@link PIXI.settings.STRICT_TEXTURE_CACHE}.
    * @returns {PIXI.BaseTexture} The new base texture.
    */
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: ImageSource): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: ImageSource, options: Unit, strict: Boolean): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: ImageSource, options: IBaseTextureOptions[RO]): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  inline def from[R /* <: typingsJapgolly.pixiCore.mod.Resource */, RO](source: ImageSource, options: IBaseTextureOptions[RO], strict: Boolean): typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[R, IAutoDetectOptions]]
  
  /**
    * Create a new BaseTexture with a BufferResource from a Float32Array.
    * RGBA values are floats from 0 to 1.
    * @param {Float32Array|Uint8Array} buffer - The optional array to use, if no data
    *        is provided, a new Float32Array is created.
    * @param width - Width of the resource
    * @param height - Height of the resource
    * @param options - See {@link PIXI.BaseTexture}'s constructor for options.
    *        Default properties are different from the constructor's defaults.
    * @param {PIXI.FORMATS} [options.format=PIXI.FORMATS.RGBA] - GL format type
    * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.NPM] - Image alpha, not premultiplied by default
    * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.SCALE_MODES.NEAREST] - Scale mode, pixelating by default
    * @returns - The resulting new BaseTexture
    */
  inline def fromBuffer(buffer: js.typedarray.Float32Array, width: Double, height: Double): typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions]]
  inline def fromBuffer(
    buffer: js.typedarray.Float32Array,
    width: Double,
    height: Double,
    options: IBaseTextureOptions[Any]
  ): typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions]]
  inline def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double): typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions]]
  inline def fromBuffer(buffer: js.typedarray.Uint8Array, width: Double, height: Double, options: IBaseTextureOptions[Any]): typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.BufferResource, IAutoDetectOptions]]
  
  /**
    * Remove a BaseTexture from the global BaseTextureCache.
    * @param {string|PIXI.BaseTexture} baseTexture - id of a BaseTexture to be removed, or a BaseTexture instance itself.
    * @returns {PIXI.BaseTexture|null} The BaseTexture that was removed.
    */
  inline def removeFromCache(baseTexture: String): (typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.Resource, IAutoDetectOptions]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(baseTexture.asInstanceOf[js.Any]).asInstanceOf[(typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.Resource, IAutoDetectOptions]) | Null]
  inline def removeFromCache(
    baseTexture: typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.Resource, IAutoDetectOptions]
  ): (typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.Resource, IAutoDetectOptions]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromCache")(baseTexture.asInstanceOf[js.Any]).asInstanceOf[(typingsJapgolly.pixiCore.mod.BaseTexture[typingsJapgolly.pixiCore.mod.Resource, IAutoDetectOptions]) | Null]
}
