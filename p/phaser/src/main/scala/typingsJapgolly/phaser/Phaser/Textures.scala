package typingsJapgolly.phaser.Phaser

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLTexture
import typingsJapgolly.phaser.EachTextureCallback
import typingsJapgolly.phaser.Phaser.Display.Color
import typingsJapgolly.phaser.Phaser.Events.EventEmitter
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import typingsJapgolly.phaser.Phaser.GameObjects.RenderTexture
import typingsJapgolly.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typingsJapgolly.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typingsJapgolly.phaser.Phaser.Types.Textures.PixelConfig
import typingsJapgolly.phaser.Phaser.Types.Textures.SpriteSheetConfig
import typingsJapgolly.phaser.Phaser.Types.Textures.SpriteSheetFromAtlasConfig
import typingsJapgolly.phaser.integer
import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Textures")
@js.native
object Textures extends js.Object {
  /**
    * A Canvas Texture is a special kind of Texture that is backed by an HTML Canvas Element as its source.
    * 
    * You can use the properties of this texture to draw to the canvas element directly, using all of the standard
    * canvas operations available in the browser. Any Game Object can be given this texture and will render with it.
    * 
    * Note: When running under WebGL the Canvas Texture needs to re-generate its base WebGLTexture and reupload it to
    * the GPU every time you modify it, otherwise the changes you make to this texture will not be visible. To do this
    * you should call `CanvasTexture.refresh()` once you are finished with your changes to the canvas. Try and keep
    * this to a minimum, especially on large canvas sizes, or you may inadvertently thrash the GPU by constantly uploading
    * texture data to it. This restriction does not apply if using the Canvas Renderer.
    * 
    * It starts with only one frame that covers the whole of the canvas. You can add further frames, that specify
    * sections of the canvas using the `add` method.
    * 
    * Should you need to resize the canvas use the `setSize` method so that it accurately updates all of the underlying
    * texture data as well. Forgetting to do this (i.e. by changing the canvas size directly from your code) could cause
    * graphical errors.
    */
  @js.native
  class CanvasTexture protected () extends Texture {
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param source The canvas element that is used as the base of this texture.
      * @param width The width of the canvas.
      * @param height The height of the canvas.
      */
    def this(manager: TextureManager, key: String, source: HTMLCanvasElement, width: integer, height: integer) = this()
    /**
      * An ArrayBuffer the same size as the context ImageData.
      */
    var buffer: scala.scalajs.js.typedarray.ArrayBuffer = js.native
    /**
      * The source Canvas Element.
      */
    val canvas: HTMLCanvasElement = js.native
    /**
      * The 2D Canvas Rendering Context.
      */
    val context: CanvasRenderingContext2D = js.native
    /**
      * A Uint8ClampedArray view into the `buffer`.
      * Use the `update` method to populate this when the canvas changes.
      * Note that this is unavailable in some browsers, such as Epic Browser, due to their security restrictions.
      */
    var data: scala.scalajs.js.typedarray.Uint8ClampedArray = js.native
    /**
      * The height of the Canvas.
      * This property is read-only, if you wish to change it use the `setSize` method.
      */
    val height: integer = js.native
    /**
      * The context image data.
      * Use the `update` method to populate this when the canvas changes.
      */
    var imageData: ImageData = js.native
    /**
      * An Uint32Array view into the `buffer`.
      */
    var pixels: scala.scalajs.js.typedarray.Uint32Array = js.native
    /**
      * The width of the Canvas.
      * This property is read-only, if you wish to change it use the `setSize` method.
      */
    val width: integer = js.native
    /**
      * Clears the given region of this Canvas Texture, resetting it back to transparent.
      * If no region is given, the whole Canvas Texture is cleared.
      * @param x The x coordinate of the top-left of the region to clear. Default 0.
      * @param y The y coordinate of the top-left of the region to clear. Default 0.
      * @param width The width of the region.
      * @param height The height of the region.
      */
    def clear(): CanvasTexture = js.native
    def clear(x: integer): CanvasTexture = js.native
    def clear(x: integer, y: integer): CanvasTexture = js.native
    def clear(x: integer, y: integer, width: integer): CanvasTexture = js.native
    def clear(x: integer, y: integer, width: integer, height: integer): CanvasTexture = js.native
    def draw(x: integer, y: integer, source: typingsJapgolly.std.HTMLCanvasElement): CanvasTexture = js.native
    /**
      * Draws the given Image or Canvas element to this CanvasTexture, then updates the internal
      * ImageData buffer and arrays.
      * @param x The x coordinate to draw the source at.
      * @param y The y coordinate to draw the source at.
      * @param source The element to draw to this canvas.
      */
    def draw(x: integer, y: integer, source: HTMLImageElement): CanvasTexture = js.native
    /**
      * Draws the given texture frame to this CanvasTexture, then updates the internal
      * ImageData buffer and arrays.
      * @param key The unique string-based key of the Texture.
      * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
      * @param x The x coordinate to draw the source at. Default 0.
      * @param y The y coordinate to draw the source at. Default 0.
      */
    def drawFrame(key: String): CanvasTexture = js.native
    def drawFrame(key: String, frame: String): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: integer): CanvasTexture = js.native
    def drawFrame(key: String, frame: String, x: integer, y: integer): CanvasTexture = js.native
    def drawFrame(key: String, frame: integer): CanvasTexture = js.native
    def drawFrame(key: String, frame: integer, x: integer): CanvasTexture = js.native
    def drawFrame(key: String, frame: integer, x: integer, y: integer): CanvasTexture = js.native
    /**
      * Gets the Canvas Element.
      */
    def getCanvas(): HTMLCanvasElement = js.native
    /**
      * Gets the 2D Canvas Rendering Context.
      */
    def getContext(): CanvasRenderingContext2D = js.native
    /**
      * Gets an ImageData region from this CanvasTexture from the position and size specified.
      * You can write this back using `CanvasTexture.putData`, or manipulate it.
      * @param x The x coordinate of the top-left of the area to get the ImageData from. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate of the top-left of the area to get the ImageData from. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param width The width of the rectangle from which the ImageData will be extracted. Positive values are to the right, and negative to the left.
      * @param height The height of the rectangle from which the ImageData will be extracted. Positive values are down, and negative are up.
      */
    def getData(x: integer, y: integer, width: integer, height: integer): ImageData = js.native
    /**
      * Returns the Image Data index for the given pixel in this CanvasTexture.
      * 
      * The index can be used to read directly from the `this.data` array.
      * 
      * The index points to the red value in the array. The subsequent 3 indexes
      * point to green, blue and alpha respectively.
      * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      */
    def getIndex(x: integer, y: integer): integer = js.native
    /**
      * Get the color of a specific pixel from this texture and store it in a Color object.
      * 
      * If you have drawn anything to this CanvasTexture since it was created you must call `CanvasTexture.update` to refresh the array buffer,
      * otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
      * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param out A Color object to store the pixel values in. If not provided a new Color object will be created.
      */
    def getPixel(x: integer, y: integer): Color = js.native
    def getPixel(x: integer, y: integer, out: Color): Color = js.native
    /**
      * Returns an array containing all of the pixels in the given region.
      * 
      * If the requested region extends outside the bounds of this CanvasTexture,
      * the region is truncated to fit.
      * 
      * If you have drawn anything to this CanvasTexture since it was created you must call `CanvasTexture.update` to refresh the array buffer,
      * otherwise this may return out of date color values, or worse - throw a run-time error as it tries to access an array element that doesn't exist.
      * @param x The x coordinate of the top-left of the region. Must lay within the dimensions of this CanvasTexture and be an integer. Default 0.
      * @param y The y coordinate of the top-left of the region. Must lay within the dimensions of this CanvasTexture and be an integer. Default 0.
      * @param width The width of the region to get. Must be an integer. Defaults to the canvas width if not given.
      * @param height The height of the region to get. Must be an integer. If not given will be set to the `width`.
      */
    def getPixels(): js.Array[PixelConfig] = js.native
    def getPixels(x: integer): js.Array[PixelConfig] = js.native
    def getPixels(x: integer, y: integer): js.Array[PixelConfig] = js.native
    def getPixels(x: integer, y: integer, width: integer): js.Array[PixelConfig] = js.native
    def getPixels(x: integer, y: integer, width: integer, height: integer): js.Array[PixelConfig] = js.native
    /**
      * Puts the ImageData into the context of this CanvasTexture at the given coordinates.
      * @param imageData The ImageData to put at the given location.
      * @param x The x coordinate to put the imageData. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate to put the imageData. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param dirtyX Horizontal position (x coordinate) of the top-left corner from which the image data will be extracted. Default 0.
      * @param dirtyY Vertical position (x coordinate) of the top-left corner from which the image data will be extracted. Default 0.
      * @param dirtyWidth Width of the rectangle to be painted. Defaults to the width of the image data.
      * @param dirtyHeight Height of the rectangle to be painted. Defaults to the height of the image data.
      */
    def putData(imageData: ImageData, x: integer, y: integer): this.type = js.native
    def putData(imageData: ImageData, x: integer, y: integer, dirtyX: integer): this.type = js.native
    def putData(imageData: ImageData, x: integer, y: integer, dirtyX: integer, dirtyY: integer): this.type = js.native
    def putData(
      imageData: ImageData,
      x: integer,
      y: integer,
      dirtyX: integer,
      dirtyY: integer,
      dirtyWidth: integer
    ): this.type = js.native
    def putData(
      imageData: ImageData,
      x: integer,
      y: integer,
      dirtyX: integer,
      dirtyY: integer,
      dirtyWidth: integer,
      dirtyHeight: integer
    ): this.type = js.native
    /**
      * This should be called manually if you are running under WebGL.
      * It will refresh the WebGLTexture from the Canvas source. Only call this if you know that the
      * canvas has changed, as there is a significant GPU texture allocation cost involved in doing so.
      */
    def refresh(): CanvasTexture = js.native
    /**
      * Sets a pixel in the CanvasTexture to the given color and alpha values.
      * 
      * This is an expensive operation to run in large quantities, so use sparingly.
      * @param x The x coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param y The y coordinate of the pixel to get. Must lay within the dimensions of this CanvasTexture and be an integer.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      * @param alpha The alpha value. A number between 0 and 255. Default 255.
      */
    def setPixel(x: integer, y: integer, red: integer, green: integer, blue: integer): this.type = js.native
    def setPixel(x: integer, y: integer, red: integer, green: integer, blue: integer, alpha: integer): this.type = js.native
    /**
      * Changes the size of this Canvas Texture.
      * @param width The new width of the Canvas.
      * @param height The new height of the Canvas. If not given it will use the width as the height.
      */
    def setSize(width: integer): CanvasTexture = js.native
    def setSize(width: integer, height: integer): CanvasTexture = js.native
    /**
      * This re-creates the `imageData` from the current context.
      * It then re-builds the ArrayBuffer, the `data` Uint8ClampedArray reference and the `pixels` Int32Array.
      * 
      * Warning: This is a very expensive operation, so use it sparingly.
      */
    def update(): CanvasTexture = js.native
  }
  
  @js.native
  sealed trait FilterMode extends js.Object
  
  /**
    * A Frame is a section of a Texture.
    */
  @js.native
  class Frame protected () extends js.Object {
    def this(
      texture: Texture,
      name: String,
      sourceIndex: integer,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
    /**
      * 
      * @param texture The Texture this Frame is a part of.
      * @param name The name of this Frame. The name is unique within the Texture.
      * @param sourceIndex The index of the TextureSource that this Frame is a part of.
      * @param x The x coordinate of the top-left of this Frame.
      * @param y The y coordinate of the top-left of this Frame.
      * @param width The width of this Frame.
      * @param height The height of this Frame.
      */
    def this(
      texture: Texture,
      name: integer,
      sourceIndex: integer,
      x: Double,
      y: Double,
      width: Double,
      height: Double
    ) = this()
    /**
      * Over-rides the Renderer setting.
      * -1 = use Renderer Setting
      * 0 = No rounding
      * 1 = Round
      */
    var autoRound: integer = js.native
    /**
      * The Canvas drawImage data object.
      */
    val canvasData: js.Object = js.native
    /**
      * The x center of this frame, floored.
      */
    var centerX: integer = js.native
    /**
      * The y center of this frame, floored.
      */
    var centerY: integer = js.native
    /**
      * Any Frame specific custom data can be stored here.
      */
    var customData: js.Object = js.native
    /**
      * Does this Frame have a custom pivot point?
      */
    var customPivot: Boolean = js.native
    /**
      * The height of the area in the source image to cut.
      */
    var cutHeight: integer = js.native
    /**
      * The width of the area in the source image to cut.
      */
    var cutWidth: integer = js.native
    /**
      * X position within the source image to cut from.
      */
    var cutX: integer = js.native
    /**
      * Y position within the source image to cut from.
      */
    var cutY: integer = js.native
    /**
      * A reference to the Texture Source WebGL Texture that this Frame is using.
      */
    var glTexture: WebGLTexture = js.native
    /**
      * Half the height, floored.
      * Precalculated for the renderer.
      */
    var halfHeight: integer = js.native
    /**
      * Half the width, floored.
      * Precalculated for the renderer.
      */
    var halfWidth: integer = js.native
    /**
      * The rendering height of this Frame, taking trim into account.
      */
    var height: integer = js.native
    /**
      * The name of this Frame.
      * The name is unique within the Texture.
      */
    var name: String = js.native
    /**
      * The horizontal pivot point of this Frame.
      */
    var pivotX: Double = js.native
    /**
      * The vertical pivot point of this Frame.
      */
    var pivotY: Double = js.native
    /**
      * The radius of the Frame (derived from sqrt(w * w + h * h) / 2)
      */
    val radius: Double = js.native
    /**
      * The height of the Frame in its un-trimmed, un-padded state, as prepared in the art package,
      * before being packed.
      */
    val realHeight: Double = js.native
    /**
      * The width of the Frame in its un-trimmed, un-padded state, as prepared in the art package,
      * before being packed.
      */
    val realWidth: Double = js.native
    /**
      * **CURRENTLY UNSUPPORTED**
      * 
      * Is this frame is rotated or not in the Texture?
      * Rotation allows you to use rotated frames in texture atlas packing.
      * It has nothing to do with Sprite rotation.
      */
    var rotated: Boolean = js.native
    /**
      * The TextureSource this Frame is part of.
      */
    var source: TextureSource = js.native
    /**
      * The index of the TextureSource in the Texture sources array.
      */
    var sourceIndex: integer = js.native
    /**
      * The Texture this Frame is a part of.
      */
    var texture: Texture = js.native
    /**
      * Is the Frame trimmed or not?
      */
    val trimmed: Boolean = js.native
    /**
      * WebGL UV u0 value.
      */
    var u0: Double = js.native
    /**
      * WebGL UV u1 value.
      */
    var u1: Double = js.native
    /**
      * WebGL UV v0 value.
      */
    var v0: Double = js.native
    /**
      * WebGL UV v1 value.
      */
    var v1: Double = js.native
    /**
      * The rendering width of this Frame, taking trim into account.
      */
    var width: integer = js.native
    /**
      * The X rendering offset of this Frame, taking trim into account.
      */
    var x: integer = js.native
    /**
      * The Y rendering offset of this Frame, taking trim into account.
      */
    var y: integer = js.native
    /**
      * Destroys this Frame by nulling its reference to the parent Texture and and data objects.
      */
    def destroy(): Unit = js.native
    /**
      * Takes a crop data object and, based on the rectangular region given, calculates the
      * required UV coordinates in order to crop this Frame for WebGL and Canvas rendering.
      * 
      * This is called directly by the Game Object Texture Components `setCrop` method.
      * Please use that method to crop a Game Object.
      * @param crop The crop data object. This is the `GameObject._crop` property.
      * @param x The x coordinate to start the crop from. Cannot be negative or exceed the Frame width.
      * @param y The y coordinate to start the crop from. Cannot be negative or exceed the Frame height.
      * @param width The width of the crop rectangle. Cannot exceed the Frame width.
      * @param height The height of the crop rectangle. Cannot exceed the Frame height.
      * @param flipX Does the parent Game Object have flipX set?
      * @param flipY Does the parent Game Object have flipY set?
      */
    def setCropUVs(
      crop: js.Object,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      flipX: Boolean,
      flipY: Boolean
    ): js.Object = js.native
    /**
      * Sets the width, height, x and y of this Frame.
      * 
      * This is called automatically by the constructor
      * and should rarely be changed on-the-fly.
      * @param width The width of the frame before being trimmed.
      * @param height The height of the frame before being trimmed.
      * @param x The x coordinate of the top-left of this Frame. Default 0.
      * @param y The y coordinate of the top-left of this Frame. Default 0.
      */
    def setSize(width: integer, height: integer): Frame = js.native
    def setSize(width: integer, height: integer, x: integer): Frame = js.native
    def setSize(width: integer, height: integer, x: integer, y: integer): Frame = js.native
    /**
      * If the frame was trimmed when added to the Texture Atlas, this records the trim and source data.
      * @param actualWidth The width of the frame before being trimmed.
      * @param actualHeight The height of the frame before being trimmed.
      * @param destX The destination X position of the trimmed frame for display.
      * @param destY The destination Y position of the trimmed frame for display.
      * @param destWidth The destination width of the trimmed frame for display.
      * @param destHeight The destination height of the trimmed frame for display.
      */
    def setTrim(
      actualWidth: Double,
      actualHeight: Double,
      destX: Double,
      destY: Double,
      destWidth: Double,
      destHeight: Double
    ): Frame = js.native
    /**
      * Takes a crop data object and recalculates the UVs based on the dimensions inside the crop object.
      * Called automatically by `setFrame`.
      * @param crop The crop data object. This is the `GameObject._crop` property.
      * @param flipX Does the parent Game Object have flipX set?
      * @param flipY Does the parent Game Object have flipY set?
      */
    def updateCropUVs(crop: js.Object, flipX: Boolean, flipY: Boolean): js.Object = js.native
    /**
      * Updates the internal WebGL UV cache and the drawImage cache.
      */
    def updateUVs(): Frame = js.native
    /**
      * Updates the internal WebGL UV cache.
      */
    def updateUVsInverted(): Frame = js.native
  }
  
  /**
    * A Texture consists of a source, usually an Image from the Cache, and a collection of Frames.
    * The Frames represent the different areas of the Texture. For example a texture atlas
    * may have many Frames, one for each element within the atlas. Where-as a single image would have
    * just one frame, that encompasses the whole image.
    * 
    * Every Texture, no matter where it comes from, always has at least 1 frame called the `__BASE` frame.
    * This frame represents the entirety of the source image.
    * 
    * Textures are managed by the global TextureManager. This is a singleton class that is
    * responsible for creating and delivering Textures and their corresponding Frames to Game Objects.
    * 
    * Sprites and other Game Objects get the texture data they need from the TextureManager.
    */
  @js.native
  class Texture protected () extends js.Object {
    def this(
      manager: TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement]
    ) = this()
    def this(manager: TextureManager, key: String, source: HTMLCanvasElement) = this()
    /**
      * 
      * @param manager A reference to the Texture Manager this Texture belongs to.
      * @param key The unique string-based key of this Texture.
      * @param source An array of sources that are used to create the texture. Usually Images, but can also be a Canvas.
      * @param width The width of the Texture. This is optional and automatically derived from the source images.
      * @param height The height of the Texture. This is optional and automatically derived from the source images.
      */
    def this(manager: TextureManager, key: String, source: org.scalajs.dom.raw.HTMLImageElement) = this()
    def this(
      manager: TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement],
      width: Double
    ) = this()
    def this(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Double) = this()
    def this(manager: TextureManager, key: String, source: org.scalajs.dom.raw.HTMLImageElement, width: Double) = this()
    def this(
      manager: TextureManager,
      key: String,
      source: js.Array[HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement],
      width: Double,
      height: Double
    ) = this()
    def this(manager: TextureManager, key: String, source: HTMLCanvasElement, width: Double, height: Double) = this()
    def this(
      manager: TextureManager,
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      width: Double,
      height: Double
    ) = this()
    /**
      * Any additional data that was set in the source JSON (if any),
      * or any extra data you'd like to store relating to this texture
      */
    var customData: js.Object = js.native
    /**
      * An array of TextureSource data instances.
      * Used to store additional data images, such as normal maps or specular maps.
      */
    var dataSource: js.Array[_] = js.native
    /**
      * The name of the first frame of the Texture.
      */
    var firstFrame: String = js.native
    /**
      * The total number of Frames in this Texture, including the `__BASE` frame.
      * 
      * A Texture will always contain at least 1 frame because every Texture contains a `__BASE` frame by default,
      * in addition to any extra frames that have been added to it, such as when parsing a Sprite Sheet or Texture Atlas.
      */
    var frameTotal: integer = js.native
    /**
      * A key-value object pair associating the unique Frame keys with the Frames objects.
      */
    var frames: js.Object = js.native
    /**
      * The unique string-based key of this Texture.
      */
    var key: String = js.native
    /**
      * A reference to the Texture Manager this Texture belongs to.
      */
    var manager: TextureManager = js.native
    /**
      * An array of TextureSource instances.
      * These are unique to this Texture and contain the actual Image (or Canvas) data.
      */
    var source: js.Array[TextureSource] = js.native
    def add(name: String, sourceIndex: integer, x: Double, y: Double, width: Double, height: Double): Frame = js.native
    /**
      * Adds a new Frame to this Texture.
      * 
      * A Frame is a rectangular region of a TextureSource with a unique index or string-based key.
      * 
      * The name given must be unique within this Texture. If it already exists, this method will return `null`.
      * @param name The name of this Frame. The name is unique within the Texture.
      * @param sourceIndex The index of the TextureSource that this Frame is a part of.
      * @param x The x coordinate of the top-left of this Frame.
      * @param y The y coordinate of the top-left of this Frame.
      * @param width The width of this Frame.
      * @param height The height of this Frame.
      */
    def add(name: integer, sourceIndex: integer, x: Double, y: Double, width: Double, height: Double): Frame = js.native
    /**
      * Destroys this Texture and releases references to its sources and frames.
      */
    def destroy(): Unit = js.native
    /**
      * Gets a Frame from this Texture based on either the key or the index of the Frame.
      * 
      * In a Texture Atlas Frames are typically referenced by a key.
      * In a Sprite Sheet Frames are referenced by an index.
      * Passing no value for the name returns the base texture.
      * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
      */
    def get(): Frame = js.native
    def get(name: String): Frame = js.native
    def get(name: integer): Frame = js.native
    /**
      * Given a Frame name, return the data source image it uses to render with.
      * You can use this to get the normal map for an image for example.
      * 
      * This will return the actual DOM Image.
      * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
      */
    def getDataSourceImage(): org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement = js.native
    def getDataSourceImage(name: String): org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement = js.native
    def getDataSourceImage(name: integer): org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement = js.native
    /**
      * Returns an array with all of the names of the Frames in this Texture.
      * 
      * Useful if you want to randomly assign a Frame to a Game Object, as you can
      * pick a random element from the returned array.
      * @param includeBase Include the `__BASE` Frame in the output array? Default false.
      */
    def getFrameNames(): js.Array[String] = js.native
    def getFrameNames(includeBase: Boolean): js.Array[String] = js.native
    /**
      * Returns an array of all the Frames in the given TextureSource.
      * @param sourceIndex The index of the TextureSource to get the Frames from.
      * @param includeBase Include the `__BASE` Frame in the output array? Default false.
      */
    def getFramesFromTextureSource(sourceIndex: integer): js.Array[Frame] = js.native
    def getFramesFromTextureSource(sourceIndex: integer, includeBase: Boolean): js.Array[Frame] = js.native
    /**
      * Given a Frame name, return the source image it uses to render with.
      * 
      * This will return the actual DOM Image or Canvas element.
      * @param name The string-based name, or integer based index, of the Frame to get from this Texture.
      */
    def getSourceImage(): org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
    def getSourceImage(name: String): org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
    def getSourceImage(name: integer): org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement | RenderTexture = js.native
    /**
      * Takes the given TextureSource and returns the index of it within this Texture.
      * If it's not in this Texture, it returns -1.
      * Unless this Texture has multiple TextureSources, such as with a multi-atlas, this
      * method will always return zero or -1.
      * @param source The TextureSource to check.
      */
    def getTextureSourceIndex(source: TextureSource): integer = js.native
    /**
      * Checks to see if a Frame matching the given key exists within this Texture.
      * @param name The key of the Frame to check for.
      */
    def has(name: String): Boolean = js.native
    /**
      * Removes the given Frame from this Texture. The Frame is destroyed immediately.
      * 
      * Any Game Objects using this Frame should stop using it _before_ you remove it,
      * as it does not happen automatically.
      * @param name The key of the Frame to remove.
      */
    def remove(name: String): Boolean = js.native
    def setDataSource(data: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]): Unit = js.native
    def setDataSource(data: typingsJapgolly.std.HTMLCanvasElement): Unit = js.native
    /**
      * Adds a data source image to this Texture.
      * 
      * An example of a data source image would be a normal map, where all of the Frames for this Texture
      * equally apply to the normal map.
      * @param data The source image.
      */
    def setDataSource(data: HTMLImageElement): Unit = js.native
    /**
      * Sets the Filter Mode for this Texture.
      * 
      * The mode can be either Linear, the default, or Nearest.
      * 
      * For pixel-art you should use Nearest.
      * 
      * The mode applies to the entire Texture, not just a specific Frame of it.
      * @param filterMode The Filter Mode.
      */
    def setFilter(filterMode: FilterMode): Unit = js.native
  }
  
  /**
    * Textures are managed by the global TextureManager. This is a singleton class that is
    * responsible for creating and delivering Textures and their corresponding Frames to Game Objects.
    * 
    * Sprites and other Game Objects get the texture data they need from the TextureManager.
    * 
    * Access it via `scene.textures`.
    */
  @js.native
  class TextureManager protected () extends EventEmitter {
    /**
      * 
      * @param game The Phaser.Game instance this Texture Manager belongs to.
      */
    def this(game: Game) = this()
    /**
      * The Game that this TextureManager belongs to.
      */
    var game: Game = js.native
    /**
      * An object that has all of textures that Texture Manager creates.
      * Textures are assigned to keys so we can access to any texture that this object has directly by key value without iteration.
      */
    var list: js.Object = js.native
    /**
      * The name of this manager.
      */
    var name: String = js.native
    /**
      * Adds a new Texture Atlas to this Texture Manager.
      * It can accept either JSON Array or JSON Hash formats, as exported by Texture Packer and similar software.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param data The Texture Atlas data.
      * @param dataSource An optional data Image element.
      */
    def addAtlas(key: String, source: org.scalajs.dom.raw.HTMLImageElement, data: js.Object): Texture = js.native
    def addAtlas(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlas(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlas(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: HTMLImageElement
    ): Texture = js.native
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Array[js.Object]): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Array[js.Object],
      dataSource: HTMLImageElement
    ): Texture = js.native
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Object): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Object,
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: js.Array[HTMLImageElement],
      data: js.Object,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlasJSONArray(key: String, source: js.Array[HTMLImageElement], data: js.Object, dataSource: HTMLImageElement): Texture = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Array[js.Object]): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: HTMLImageElement,
      data: js.Array[js.Object],
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: HTMLImageElement,
      data: js.Array[js.Object],
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Array[js.Object], dataSource: HTMLImageElement): Texture = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager.
      * The frame data of the atlas must be stored in an Array within the JSON.
      * This is known as a JSON Array in software such as Texture Packer.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element/s.
      * @param data The Texture Atlas data/s.
      * @param dataSource An optional data Image element.
      */
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Object): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlasJSONArray(
      key: String,
      source: HTMLImageElement,
      data: js.Object,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlasJSONArray(key: String, source: HTMLImageElement, data: js.Object, dataSource: HTMLImageElement): Texture = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager.
      * The frame data of the atlas must be stored in an Object within the JSON.
      * This is known as a JSON Hash in software such as Texture Packer.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param data The Texture Atlas data.
      * @param dataSource An optional data Image element.
      */
    def addAtlasJSONHash(key: String, source: org.scalajs.dom.raw.HTMLImageElement, data: js.Object): Texture = js.native
    def addAtlasJSONHash(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlasJSONHash(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlasJSONHash(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: HTMLImageElement
    ): Texture = js.native
    /**
      * Adds a Texture Atlas to this Texture Manager, where the atlas data is given
      * in the XML format.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param data The Texture Atlas XML data.
      * @param dataSource An optional data Image element.
      */
    def addAtlasXML(key: String, source: org.scalajs.dom.raw.HTMLImageElement, data: js.Object): Texture = js.native
    def addAtlasXML(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addAtlasXML(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addAtlasXML(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: HTMLImageElement
    ): Texture = js.native
    /**
      * Adds a new Texture to the Texture Manager created from the given Base64 encoded data.
      * @param key The unique string-based key of the Texture.
      * @param data The Base64 encoded data.
      */
    def addBase64(key: String, data: js.Any): this.type = js.native
    /**
      * Creates a new Canvas Texture object from an existing Canvas element
      * and adds it to this Texture Manager, unless `skipCache` is true.
      * @param key The unique string-based key of the Texture.
      * @param source The Canvas element to form the base of the new Texture.
      * @param skipCache Skip adding this Texture into the Cache? Default false.
      */
    def addCanvas(key: String, source: HTMLCanvasElement): CanvasTexture = js.native
    def addCanvas(key: String, source: HTMLCanvasElement, skipCache: Boolean): CanvasTexture = js.native
    /**
      * Takes a WebGL Texture and creates a Phaser Texture from it, which is added to the Texture Manager using the given key.
      * 
      * This allows you to then use the Texture as a normal texture for texture based Game Objects like Sprites.
      * 
      * This is a WebGL only feature.
      * @param key The unique string-based key of the Texture.
      * @param glTexture The source Render Texture.
      * @param width The new width of the Texture.
      * @param height The new height of the Texture.
      */
    def addGLTexture(key: String, glTexture: WebGLTexture, width: Double, height: Double): Texture = js.native
    /**
      * Adds a new Texture to the Texture Manager created from the given Image element.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param dataSource An optional data Image element.
      */
    def addImage(key: String, source: org.scalajs.dom.raw.HTMLImageElement): Texture = js.native
    def addImage(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addImage(key: String, source: org.scalajs.dom.raw.HTMLImageElement, dataSource: HTMLImageElement): Texture = js.native
    /**
      * Adds a Render Texture to the Texture Manager using the given key.
      * This allows you to then use the Render Texture as a normal texture for texture based Game Objects like Sprites.
      * @param key The unique string-based key of the Texture.
      * @param renderTexture The source Render Texture.
      */
    def addRenderTexture(key: String, renderTexture: RenderTexture): Texture = js.native
    /**
      * Adds a Sprite Sheet to this Texture Manager.
      * 
      * In Phaser terminology a Sprite Sheet is a texture containing different frames, but each frame is the exact
      * same size and cannot be trimmed or rotated.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param config The configuration object for this Sprite Sheet.
      */
    def addSpriteSheet(key: String, source: org.scalajs.dom.raw.HTMLImageElement, config: SpriteSheetConfig): Texture = js.native
    /**
      * Adds a Sprite Sheet to this Texture Manager, where the Sprite Sheet exists as a Frame within a Texture Atlas.
      * 
      * In Phaser terminology a Sprite Sheet is a texture containing different frames, but each frame is the exact
      * same size and cannot be trimmed or rotated.
      * @param key The unique string-based key of the Texture.
      * @param config The configuration object for this Sprite Sheet.
      */
    def addSpriteSheetFromAtlas(key: String, config: SpriteSheetFromAtlasConfig): Texture = js.native
    /**
      * Adds a Unity Texture Atlas to this Texture Manager.
      * The data must be in the form of a Unity YAML file.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param data The Texture Atlas data.
      * @param dataSource An optional data Image element.
      */
    def addUnityAtlas(key: String, source: org.scalajs.dom.raw.HTMLImageElement, data: js.Object): Texture = js.native
    def addUnityAtlas(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: js.Array[typingsJapgolly.std.HTMLCanvasElement | HTMLImageElement]
    ): Texture = js.native
    def addUnityAtlas(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: typingsJapgolly.std.HTMLCanvasElement
    ): Texture = js.native
    def addUnityAtlas(
      key: String,
      source: org.scalajs.dom.raw.HTMLImageElement,
      data: js.Object,
      dataSource: HTMLImageElement
    ): Texture = js.native
    /**
      * Checks the given texture key and throws a console.warn if the key is already in use, then returns false.
      * If you wish to avoid the console.warn then use `TextureManager.exists` instead.
      * @param key The texture key to check.
      */
    def checkKey(key: String): Boolean = js.native
    /**
      * Takes a Texture key and Frame name and returns a clone of that Frame if found.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame to be cloned.
      */
    def cloneFrame(key: String, frame: String): Frame = js.native
    def cloneFrame(key: String, frame: integer): Frame = js.native
    /**
      * Creates a new Texture using the given source and dimensions.
      * @param key The unique string-based key of the Texture.
      * @param source The source Image element.
      * @param width The width of the Texture.
      * @param height The height of the Texture.
      */
    def create(key: String, source: org.scalajs.dom.raw.HTMLImageElement, width: integer, height: integer): Texture = js.native
    /**
      * Creates a new Texture using a blank Canvas element of the size given.
      * 
      * Canvas elements are automatically pooled and calling this method will
      * extract a free canvas from the CanvasPool, or create one if none are available.
      * @param key The unique string-based key of the Texture.
      * @param width The width of the Canvas element. Default 256.
      * @param height The height of the Canvas element. Default 256.
      */
    def createCanvas(key: String): CanvasTexture = js.native
    def createCanvas(key: String, width: integer): CanvasTexture = js.native
    def createCanvas(key: String, width: integer, height: integer): CanvasTexture = js.native
    /**
      * Passes all Textures to the given callback.
      * @param callback The callback function to be sent the Textures.
      * @param scope The value to use as `this` when executing the callback.
      * @param args Additional arguments that will be passed to the callback, after the child.
      */
    def each(callback: EachTextureCallback, scope: js.Object, args: js.Any*): Unit = js.native
    /**
      * Checks the given key to see if a Texture using it exists within this Texture Manager.
      * @param key The unique string-based key of the Texture.
      */
    def exists(key: String): Boolean = js.native
    /**
      * Creates a new Texture using the given config values.
      * Generated textures consist of a Canvas element to which the texture data is drawn.
      * See the Phaser.Create function for the more direct way to create textures.
      * @param key The unique string-based key of the Texture.
      * @param config The configuration object needed to generate the texture.
      */
    def generate(key: String, config: js.Object): Texture = js.native
    /**
      * Returns a Texture from the Texture Manager that matches the given key.
      * 
      * If the key is `undefined` it will return the `__DEFAULT` Texture.
      * 
      * If the key is an instance of a Texture, it will return the key directly.
      * 
      * Finally. if the key is given, but not found and not a Texture instance, it will return the `__MISSING` Texture.
      * @param key The unique string-based key of the Texture, or a Texture instance.
      */
    def get(key: String): Texture = js.native
    def get(key: Texture): Texture = js.native
    /**
      * Gets an existing texture frame and converts it into a base64 encoded image and returns the base64 data.
      * 
      * You can also provide the image type and encoder options.
      * 
      * This will only work with bitmap based texture frames, such as those created from Texture Atlases.
      * It will not work with GL Texture objects, such as Shaders, or Render Textures. For those please
      * see the WebGL Snapshot function instead.
      * @param key The unique string-based key of the Texture.
      * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
      * @param type [description] Default 'image/png'.
      * @param encoderOptions [description] Default 0.92.
      */
    def getBase64(key: String): String = js.native
    def getBase64(key: String, frame: String): String = js.native
    def getBase64(key: String, frame: String, `type`: String): String = js.native
    def getBase64(key: String, frame: String, `type`: String, encoderOptions: Double): String = js.native
    def getBase64(key: String, frame: integer): String = js.native
    def getBase64(key: String, frame: integer, `type`: String): String = js.native
    def getBase64(key: String, frame: integer, `type`: String, encoderOptions: Double): String = js.native
    /**
      * Takes a Texture key and Frame name and returns a reference to that Frame, if found.
      * @param key The unique string-based key of the Texture.
      * @param frame The string-based name, or integer based index, of the Frame to get from the Texture.
      */
    def getFrame(key: String): Frame = js.native
    def getFrame(key: String, frame: String): Frame = js.native
    def getFrame(key: String, frame: integer): Frame = js.native
    /**
      * Given a Texture and an `x` and `y` coordinate this method will return a new
      * Color object that has been populated with the color and alpha values of the pixel
      * at that location in the Texture.
      * @param x The x coordinate of the pixel within the Texture.
      * @param y The y coordinate of the pixel within the Texture.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame.
      */
    def getPixel(x: integer, y: integer, key: String): Color = js.native
    def getPixel(x: integer, y: integer, key: String, frame: String): Color = js.native
    def getPixel(x: integer, y: integer, key: String, frame: integer): Color = js.native
    /**
      * Given a Texture and an `x` and `y` coordinate this method will return a value between 0 and 255
      * corresponding to the alpha value of the pixel at that location in the Texture. If the coordinate
      * is out of bounds it will return null.
      * @param x The x coordinate of the pixel within the Texture.
      * @param y The y coordinate of the pixel within the Texture.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame.
      */
    def getPixelAlpha(x: integer, y: integer, key: String): integer = js.native
    def getPixelAlpha(x: integer, y: integer, key: String, frame: String): integer = js.native
    def getPixelAlpha(x: integer, y: integer, key: String, frame: integer): integer = js.native
    /**
      * Returns an array with all of the keys of all Textures in this Texture Manager.
      * The output array will exclude the `__DEFAULT` and `__MISSING` keys.
      */
    def getTextureKeys(): js.Array[String] = js.native
    /**
      * Removes a Texture from the Texture Manager and destroys it. This will immediately
      * clear all references to it from the Texture Manager, and if it has one, destroy its
      * WebGLTexture. This will emit a `removetexture` event.
      * 
      * Note: If you have any Game Objects still using this texture they will start throwing
      * errors the next time they try to render. Make sure that removing the texture is the final
      * step when clearing down to avoid this.
      * @param key The key of the Texture to remove, or a reference to it.
      */
    def remove(key: String): TextureManager = js.native
    def remove(key: Texture): TextureManager = js.native
    /**
      * Removes a key from the Texture Manager but does not destroy the Texture that was using the key.
      * @param key The key to remove from the texture list.
      */
    def removeKey(key: String): TextureManager = js.native
    /**
      * Changes the key being used by a Texture to the new key provided.
      * 
      * The old key is removed, allowing it to be re-used.
      * 
      * Game Objects are linked to Textures by a reference to the Texture object, so
      * all existing references will be retained.
      * @param currentKey The current string-based key of the Texture you wish to rename.
      * @param newKey The new unique string-based key to use for the Texture.
      */
    def renameTexture(currentKey: String, newKey: String): Boolean = js.native
    /**
      * Sets the given Game Objects `texture` and `frame` properties so that it uses
      * the Texture and Frame specified in the `key` and `frame` arguments to this method.
      * @param gameObject The Game Object the texture would be set on.
      * @param key The unique string-based key of the Texture.
      * @param frame The string or index of the Frame.
      */
    def setTexture(gameObject: GameObject, key: String): GameObject = js.native
    def setTexture(gameObject: GameObject, key: String, frame: String): GameObject = js.native
    def setTexture(gameObject: GameObject, key: String, frame: integer): GameObject = js.native
  }
  
  /**
    * A Texture Source is the encapsulation of the actual source data for a Texture.
    * 
    * This is typically an Image Element, loaded from the file system or network, a Canvas Element or a Video Element.
    * 
    * A Texture can contain multiple Texture Sources, which only happens when a multi-atlas is loaded.
    */
  @js.native
  class TextureSource protected () extends js.Object {
    def this(texture: Texture, source: RenderTexture) = this()
    def this(texture: Texture, source: HTMLCanvasElement) = this()
    /**
      * 
      * @param texture The Texture this TextureSource belongs to.
      * @param source The source image data.
      * @param width Optional width of the source image. If not given it's derived from the source itself.
      * @param height Optional height of the source image. If not given it's derived from the source itself.
      * @param flipY Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload. Default false.
      */
    def this(texture: Texture, source: org.scalajs.dom.raw.HTMLImageElement) = this()
    def this(texture: Texture, source: HTMLVideoElement) = this()
    def this(texture: Texture, source: WebGLTexture) = this()
    def this(texture: Texture, source: RenderTexture, width: integer) = this()
    def this(texture: Texture, source: HTMLCanvasElement, width: integer) = this()
    def this(texture: Texture, source: org.scalajs.dom.raw.HTMLImageElement, width: integer) = this()
    def this(texture: Texture, source: HTMLVideoElement, width: integer) = this()
    def this(texture: Texture, source: WebGLTexture, width: integer) = this()
    def this(texture: Texture, source: RenderTexture, width: integer, height: integer) = this()
    def this(texture: Texture, source: HTMLCanvasElement, width: integer, height: integer) = this()
    def this(texture: Texture, source: org.scalajs.dom.raw.HTMLImageElement, width: integer, height: integer) = this()
    def this(texture: Texture, source: HTMLVideoElement, width: integer, height: integer) = this()
    def this(texture: Texture, source: WebGLTexture, width: integer, height: integer) = this()
    def this(texture: Texture, source: RenderTexture, width: integer, height: integer, flipY: Boolean) = this()
    def this(texture: Texture, source: HTMLCanvasElement, width: integer, height: integer, flipY: Boolean) = this()
    def this(
      texture: Texture,
      source: org.scalajs.dom.raw.HTMLImageElement,
      width: integer,
      height: integer,
      flipY: Boolean
    ) = this()
    def this(texture: Texture, source: HTMLVideoElement, width: integer, height: integer, flipY: Boolean) = this()
    def this(texture: Texture, source: WebGLTexture, width: integer, height: integer, flipY: Boolean) = this()
    /**
      * Currently un-used.
      */
    var compressionAlgorithm: integer = js.native
    /**
      * Sets the `UNPACK_FLIP_Y_WEBGL` flag the WebGL Texture uses during upload.
      */
    var flipY: Boolean = js.native
    /**
      * The WebGL Texture of the source image. If this TextureSource is driven from a WebGLTexture
      * already, then this is a reference to that WebGLTexture.
      */
    var glTexture: WebGLTexture = js.native
    /**
      * The height of the source image. If not specified in the constructor it will check
      * the `naturalHeight` and then `height` properties of the source image.
      */
    var height: integer = js.native
    /**
      * The image data.
      * 
      * This is either an Image element, Canvas element or a Video Element.
      */
    var image: org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
    /**
      * Is the source image a Canvas Element?
      */
    var isCanvas: Boolean = js.native
    /**
      * Is the source image a WebGLTexture?
      */
    var isGLTexture: Boolean = js.native
    /**
      * Are the source image dimensions a power of two?
      */
    var isPowerOf2: Boolean = js.native
    /**
      * Is the source image a Render Texture?
      */
    var isRenderTexture: Boolean = js.native
    /**
      * Is the source image a Video Element?
      */
    var isVideo: Boolean = js.native
    /**
      * The Texture this TextureSource belongs to.
      */
    var renderer: CanvasRenderer | WebGLRenderer = js.native
    /**
      * The resolution of the source image.
      */
    var resolution: Double = js.native
    /**
      * The Scale Mode the image will use when rendering.
      * Either Linear or Nearest.
      */
    var scaleMode: Double = js.native
    /**
      * The source of the image data.
      * 
      * This is either an Image Element, a Canvas Element, a Video Element, a RenderTexture or a WebGLTexture.
      */
    var source: org.scalajs.dom.raw.HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | RenderTexture | WebGLTexture = js.native
    /**
      * The Texture this TextureSource belongs to.
      */
    var texture: Texture = js.native
    /**
      * The width of the source image. If not specified in the constructor it will check
      * the `naturalWidth` and then `width` properties of the source image.
      */
    var width: integer = js.native
    /**
      * Destroys this Texture Source and nulls the references.
      */
    def destroy(): Unit = js.native
    /**
      * Creates a WebGL Texture, if required, and sets the Texture filter mode.
      * @param game A reference to the Phaser Game instance.
      */
    def init(game: Game): Unit = js.native
    /**
      * Sets the Filter Mode for this Texture.
      * 
      * The mode can be either Linear, the default, or Nearest.
      * 
      * For pixel-art you should use Nearest.
      * @param filterMode The Filter Mode.
      */
    def setFilter(filterMode: FilterMode): Unit = js.native
    /**
      * Sets the `UNPACK_FLIP_Y_WEBGL` flag for the WebGL Texture during texture upload.
      * @param value Should the WebGL Texture be flipped on the Y axis on texture upload or not? Default true.
      */
    def setFlipY(): Unit = js.native
    def setFlipY(value: Boolean): Unit = js.native
    /**
      * If this TextureSource is backed by a Canvas and is running under WebGL,
      * it updates the WebGLTexture using the canvas data.
      */
    def update(): Unit = js.native
  }
  
  /**
    * Linear filter type.
    */
  val LINEAR: integer = js.native
  /**
    * Nearest Neighbor filter type.
    */
  val NEAREST: integer = js.native
  @js.native
  object Events extends js.Object {
    /**
      * The Texture Add Event.
      * 
      * This event is dispatched by the Texture Manager when a texture is added to it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('addtexture', listener)`.
      */
    val ADD: js.Any = js.native
    /**
      * The Texture Load Error Event.
      * 
      * This event is dispatched by the Texture Manager when a texture it requested to load failed.
      * This only happens when base64 encoded textures fail. All other texture types are loaded via the Loader Plugin.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('onerror', listener)`.
      */
    val ERROR: js.Any = js.native
    /**
      * The Texture Load Event.
      * 
      * This event is dispatched by the Texture Manager when a texture has finished loading on it.
      * This only happens for base64 encoded textures. All other texture types are loaded via the Loader Plugin.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('onload', listener)`.
      * 
      * This event is dispatched after the [ADD]{@linkcode Phaser.Textures.Events#event:ADD} event.
      */
    val LOAD: js.Any = js.native
    /**
      * This internal event signifies that the Texture Manager is now ready and the Game can continue booting.
      * 
      * When a Phaser Game instance is booting for the first time, the Texture Manager has to wait on a couple of non-blocking
      * async events before it's fully ready to carry on. When those complete the Texture Manager emits this event via the Game
      * instance, which tells the Game to carry on booting.
      */
    val READY: js.Any = js.native
    /**
      * The Texture Remove Event.
      * 
      * This event is dispatched by the Texture Manager when a texture is removed from it.
      * 
      * Listen to this event from within a Scene using: `this.textures.on('removetexture', listener)`.
      * 
      * If you have any Game Objects still using the removed texture, they will start throwing
      * errors the next time they try to render. Be sure to clear all use of the texture in this event handler.
      */
    val REMOVE: js.Any = js.native
  }
  
  /**
    * Filter Types.
    */
  @js.native
  object FilterMode extends js.Object {
    /**
      * Linear filter type.
      */
    @js.native
    sealed trait LINEAR extends FilterMode
    
    /**
      * Nearest neighbor filter type.
      */
    @js.native
    sealed trait NEAREST extends FilterMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterMode with Double] = js.native
    /* 0 */ @js.native
    object LINEAR
      extends TopLevel[typingsJapgolly.phaser.Phaser.Textures.FilterMode.LINEAR with Double]
    
    /* 1 */ @js.native
    object NEAREST
      extends TopLevel[typingsJapgolly.phaser.Phaser.Textures.FilterMode.NEAREST with Double]
    
  }
  
}

