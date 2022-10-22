package typingsJapgolly.playcanvas.mod

import typingsJapgolly.playcanvas.anon.AutoResolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A render target is a rectangular rendering surface.
  */
@JSImport("playcanvas", "RenderTarget")
@js.native
open class RenderTarget protected () extends StObject {
  /**
    * Creates a new RenderTarget instance. A color buffer or a depth buffer must be set.
    *
    * @param {object} options - Object for passing optional arguments.
    * @param {boolean} [options.autoResolve] - If samples > 1, enables or disables automatic MSAA
    * resolve after rendering to this RT (see {@link RenderTarget#resolve}). Defaults to true.
    * @param {Texture} [options.colorBuffer] - The texture that this render target will treat as a
    * rendering surface.
    * @param {boolean} [options.depth] - If set to true, depth buffer will be created. Defaults to
    * true. Ignored if depthBuffer is defined.
    * @param {Texture} [options.depthBuffer] - The texture that this render target will treat as a
    * depth/stencil surface (WebGL2 only). If set, the 'depth' and 'stencil' properties are
    * ignored. Texture must have {@link PIXELFORMAT_DEPTH} or {@link PIXELFORMAT_DEPTHSTENCIL}
    * format.
    * @param {number} [options.face] - If the colorBuffer parameter is a cubemap, use this option
    * to specify the face of the cubemap to render to. Can be:
    *
    * - {@link CUBEFACE_POSX}
    * - {@link CUBEFACE_NEGX}
    * - {@link CUBEFACE_POSY}
    * - {@link CUBEFACE_NEGY}
    * - {@link CUBEFACE_POSZ}
    * - {@link CUBEFACE_NEGZ}
    *
    * Defaults to {@link CUBEFACE_POSX}.
    * @param {boolean} [options.flipY] - When set to true the image will be flipped in Y. Default
    * is false.
    * @param {string} [options.name] - The name of the render target.
    * @param {number} [options.samples] - Number of hardware anti-aliasing samples (WebGL2 only).
    * Default is 1.
    * @param {boolean} [options.stencil] - If set to true, depth buffer will include stencil.
    * Defaults to false. Ignored if depthBuffer is defined or depth is false.
    * @example
    * // Create a 512x512x24-bit render target with a depth buffer
    * var colorBuffer = new pc.Texture(graphicsDevice, {
    *     width: 512,
    *     height: 512,
    *     format: pc.PIXELFORMAT_R8_G8_B8
    * });
    * var renderTarget = new pc.RenderTarget({
    *     colorBuffer: colorBuffer,
    *     depth: true
    * });
    *
    * // Set the render target on a camera component
    * camera.renderTarget = renderTarget;
    *
    * // Destroy render target at a later stage. Note that the color buffer needs
    * // to be destroyed separately.
    * renderTarget.colorBuffer.destroy();
    * renderTarget.destroy();
    * camera.renderTarget = null;
    */
  def this(options: AutoResolve, args: Any*) = this()
  
  var _colorBuffer: Any = js.native
  
  var _depth: Boolean = js.native
  
  var _depthBuffer: Texture = js.native
  
  var _device: Any = js.native
  
  var _face: Double = js.native
  
  var _samples: Double = js.native
  
  var _stencil: Boolean = js.native
  
  var autoResolve: Boolean = js.native
  
  /**
    * Color buffer set up on the render target.
    *
    * @type {Texture}
    */
  def colorBuffer: Texture = js.native
  
  /**
    * Copies color and/or depth contents of source render target to this one. Formats, sizes and
    * anti-aliasing samples must match. Depth buffer can only be copied on WebGL 2.0.
    *
    * @param {RenderTarget} source - Source render target to copy from.
    * @param {boolean} [color] - If true will copy the color buffer. Defaults to false.
    * @param {boolean} [depth] - If true will copy the depth buffer. Defaults to false.
    * @returns {boolean} True if the copy was successful, false otherwise.
    */
  def copy(source: RenderTarget): Boolean = js.native
  def copy(source: RenderTarget, color: Boolean): Boolean = js.native
  def copy(source: RenderTarget, color: Boolean, depth: Boolean): Boolean = js.native
  def copy(source: RenderTarget, color: Unit, depth: Boolean): Boolean = js.native
  
  /**
    * True if the render target contains the depth attachment.
    *
    * @type {boolean}
    */
  def depth: Boolean = js.native
  
  /**
    * Depth buffer set up on the render target. Only available, if depthBuffer was set in
    * constructor. Not available if depth property was used instead.
    *
    * @type {Texture}
    */
  def depthBuffer: Texture = js.native
  
  /**
    * Frees resources associated with this render target.
    */
  def destroy(): Unit = js.native
  
  /**
    * Free device resources associated with this render target.
    *
    * @ignore
    */
  def destroyFrameBuffers(): Unit = js.native
  
  /**
    * Free textures associated with this render target.
    *
    * @ignore
    */
  def destroyTextureBuffers(): Unit = js.native
  
  /**
    * If the render target is bound to a cubemap, this property specifies which face of the
    * cubemap is rendered to. Can be:
    *
    * - {@link CUBEFACE_POSX}
    * - {@link CUBEFACE_NEGX}
    * - {@link CUBEFACE_POSY}
    * - {@link CUBEFACE_NEGY}
    * - {@link CUBEFACE_POSZ}
    * - {@link CUBEFACE_NEGZ}
    *
    * @type {number}
    */
  def face: Double = js.native
  
  var flipY: Boolean = js.native
  
  /**
    * Height of the render target in pixels.
    *
    * @type {number}
    */
  def height: Double = js.native
  
  var id: Double = js.native
  
  var impl: Any = js.native
  
  /**
    * Initialises the resources associated with this render target.
    *
    * @ignore
    */
  def init(): Unit = js.native
  
  def initialized: Any = js.native
  
  /**
    * Called when the device context was lost. It releases all context related resources.
    *
    * @ignore
    */
  def loseContext(): Unit = js.native
  
  var name: Any = js.native
  
  /**
    * If samples > 1, resolves the anti-aliased render target (WebGL2 only). When you're rendering
    * to an anti-aliased render target, pixels aren't written directly to the readable texture.
    * Instead, they're first written to a MSAA buffer, where each sample for each pixel is stored
    * independently. In order to read the results, you first need to 'resolve' the buffer - to
    * average all samples and create a simple texture with one color per pixel. This function
    * performs this averaging and updates the colorBuffer and the depthBuffer. If autoResolve is
    * set to true, the resolve will happen after every rendering to this render target, otherwise
    * you can do it manually, during the app update or inside a {@link Command}.
    *
    * @param {boolean} [color] - Resolve color buffer. Defaults to true.
    * @param {boolean} [depth] - Resolve depth buffer. Defaults to true if the render target has a
    * depth buffer.
    */
  def resolve(): Unit = js.native
  def resolve(color: Boolean): Unit = js.native
  def resolve(color: Boolean, depth: Boolean): Unit = js.native
  def resolve(color: Unit, depth: Boolean): Unit = js.native
  
  /**
    * Number of antialiasing samples the render target uses.
    *
    * @type {number}
    */
  def samples: Double = js.native
  
  /**
    * True if the render target contains the stencil attachment.
    *
    * @type {boolean}
    */
  def stencil: Boolean = js.native
  
  /**
    * Width of the render target in pixels.
    *
    * @type {number}
    */
  def width: Double = js.native
}
