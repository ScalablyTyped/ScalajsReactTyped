package typingsJapgolly.phaser.Phaser.GameObjects

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.phaser.Phaser.Cameras.Scene2D.BaseCamera
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Alpha
import typingsJapgolly.phaser.Phaser.GameObjects.Components.BlendMode
import typingsJapgolly.phaser.Phaser.GameObjects.Components.ComputedSize
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Crop
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Depth
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Flip
import typingsJapgolly.phaser.Phaser.GameObjects.Components.GetBounds
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Mask
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Origin
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Pipeline
import typingsJapgolly.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Tint
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Transform
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Visible
import typingsJapgolly.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typingsJapgolly.phaser.Phaser.Renderer.WebGL.RenderTarget
import typingsJapgolly.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typingsJapgolly.phaser.Phaser.Textures.Texture
import typingsJapgolly.phaser.Phaser.Textures.TextureManager
import typingsJapgolly.phaser.Phaser.Types.Renderer.Snapshot.SnapshotCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Render Texture.
  * 
  * A Render Texture is a special texture that allows any number of Game Objects to be drawn to it. You can take many complex objects and
  * draw them all to this one texture, which can they be used as the texture for other Game Object's. It's a way to generate dynamic
  * textures at run-time that are WebGL friendly and don't invoke expensive GPU uploads.
  * 
  * Note that under WebGL a FrameBuffer, which is what the Render Texture uses internally, cannot be anti-aliased. This means
  * that when drawing objects such as Shapes to a Render Texture they will appear to be drawn with no aliasing, however this
  * is a technical limitation of WebGL. To get around it, create your shape as a texture in an art package, then draw that
  * to the Render Texture.
  */
@js.native
trait RenderTexture
  extends StObject
     with GameObject
     with Alpha
     with BlendMode
     with ComputedSize
     with Crop
     with Depth
     with Flip
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Tint
     with Transform
     with Visible {
  
  /**
    * Use this method if you have already called `beginDraw` and need to batch
    * draw a large number of objects to this Render Texture.
    * 
    * This method batches the drawing of the given objects to this Render Texture,
    * without causing a bind or batch flush.
    * 
    * It is faster than calling `draw`, but you must be very careful to manage the
    * flow of code and remember to call `endDraw()`. If you don't need to draw large
    * numbers of objects it's much safer and easier to use the `draw` method instead.
    * 
    * The flow should be:
    * 
    * ```javascript
    * // Call once:
    * RenderTexture.beginDraw();
    * 
    * // repeat n times:
    * RenderTexture.batchDraw();
    * // or
    * RenderTexture.batchDrawFrame();
    * 
    * // Call once:
    * RenderTexture.endDraw();
    * ```
    * 
    * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
    * have started a batch. Also, be very careful not to destroy this Render Texture while the
    * batch is still open, or call `beginDraw` again.
    * 
    * Draws the given object, or an array of objects, to this Render Texture.
    * 
    * It can accept any of the following:
    * 
    * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
    * * Tilemap Layers.
    * * A Group. The contents of which will be iterated and drawn in turn.
    * * A Container. The contents of which will be iterated fully, and drawn in turn.
    * * A Scene's Display List. Pass in `Scene.children` to draw the whole list.
    * * Another Render Texture.
    * * A Texture Frame instance.
    * * A string. This is used to look-up a texture from the Texture Manager.
    * 
    * Note: You cannot draw a Render Texture to itself.
    * 
    * If passing in a Group or Container it will only draw children that return `true`
    * when their `willRender()` method is called. I.e. a Container with 10 children,
    * 5 of which have `visible=false` will only draw the 5 visible ones.
    * 
    * If passing in an array of Game Objects it will draw them all, regardless if
    * they pass a `willRender` check or not.
    * 
    * You can pass in a string in which case it will look for a texture in the Texture
    * Manager matching that string, and draw the base frame. If you need to specify
    * exactly which frame to draw then use the method `drawFrame` instead.
    * 
    * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
    * the coordinates differ based on what objects are being drawn. If the object is
    * a Group, Container or Display List, the coordinates are _added_ to the positions
    * of the children. For all other types of object, the coordinates are exact.
    * 
    * The `alpha` and `tint` values are only used by Texture Frames.
    * Game Objects use their own alpha and tint values when being drawn.
    * @param entries Any renderable Game Object, or Group, Container, Display List, other Render Texture, Texture Frame or an array of any of these.
    * @param x The x position to draw the Frame at, or the offset applied to the object.
    * @param y The y position to draw the Frame at, or the offset applied to the object.
    * @param alpha The alpha value. Only used for Texture Frames and if not specified defaults to the `globalAlpha` property. Game Objects use their own current alpha value.
    * @param tint WebGL only. The tint color value. Only used for Texture Frames and if not specified defaults to the `globalTint` property. Game Objects use their own current tint value.
    */
  def batchDraw(entries: Any): this.type = js.native
  def batchDraw(entries: Any, x: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Double, alpha: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Unit, alpha: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Double, alpha: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDraw(entries: Any, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  
  /**
    * Use this method if you have already called `beginDraw` and need to batch
    * draw a large number of texture frames to this Render Texture.
    * 
    * This method batches the drawing of the given frames to this Render Texture,
    * without causing a bind or batch flush.
    * 
    * It is faster than calling `drawFrame`, but you must be very careful to manage the
    * flow of code and remember to call `endDraw()`. If you don't need to draw large
    * numbers of frames it's much safer and easier to use the `drawFrame` method instead.
    * 
    * The flow should be:
    * 
    * ```javascript
    * // Call once:
    * RenderTexture.beginDraw();
    * 
    * // repeat n times:
    * RenderTexture.batchDraw();
    * // or
    * RenderTexture.batchDrawFrame();
    * 
    * // Call once:
    * RenderTexture.endDraw();
    * ```
    * 
    * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
    * have started a batch. Also, be very careful not to destroy this Render Texture while the
    * batch is still open, or call `beginDraw` again.
    * 
    * Draws the Texture Frame to the Render Texture at the given position.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * 
    * ```javascript
    * var rt = this.add.renderTexture(0, 0, 800, 600);
    * rt.drawFrame(key, frame);
    * ```
    * 
    * You can optionally provide a position, alpha and tint value to apply to the frame
    * before it is drawn.
    * 
    * Calling this method will cause a batch flush, so if you've got a stack of things to draw
    * in a tight loop, try using the `draw` method instead.
    * 
    * If you need to draw a Sprite to this Render Texture, use the `draw` method instead.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    * @param x The x position to draw the frame at. Default 0.
    * @param y The y position to draw the frame at. Default 0.
    * @param alpha The alpha to use. If not specified it uses the `globalAlpha` property.
    * @param tint WebGL only. The tint color to use. If not specified it uses the `globalTint` property.
    */
  def batchDrawFrame(key: String): this.type = js.native
  def batchDrawFrame(key: String, frame: String): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def batchDrawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  
  /**
    * Use this method if you need to batch draw a large number of Game Objects to
    * this Render Texture in a single go, or on a frequent basis.
    * 
    * This method starts the beginning of a batched draw.
    * 
    * It is faster than calling `draw`, but you must be very careful to manage the
    * flow of code and remember to call `endDraw()`. If you don't need to draw large
    * numbers of objects it's much safer and easier to use the `draw` method instead.
    * 
    * The flow should be:
    * 
    * ```javascript
    * // Call once:
    * RenderTexture.beginDraw();
    * 
    * // repeat n times:
    * RenderTexture.batchDraw();
    * // or
    * RenderTexture.batchDrawFrame();
    * 
    * // Call once:
    * RenderTexture.endDraw();
    * ```
    * 
    * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
    * have started a batch. Also, be very careful not to destroy this Render Texture while the
    * batch is still open, or call `beginDraw` again.
    */
  def beginDraw(): this.type = js.native
  
  /**
    * An internal Camera that can be used to move around the Render Texture.
    * Control it just like you would any Scene Camera. The difference is that it only impacts the placement of what
    * is drawn to the Render Texture. You can scroll, zoom and rotate this Camera.
    */
  var camera: BaseCamera = js.native
  
  /**
    * The HTML Canvas Element that the Render Texture is drawing to when using the Canvas Renderer.
    */
  var canvas: HTMLCanvasElement = js.native
  
  /**
    * Clears the Render Texture.
    */
  def clear(): this.type = js.native
  
  /**
    * A reference to the Rendering Context belonging to the Canvas Element this Render Texture is drawing to.
    */
  var context: CanvasRenderingContext2D = js.native
  
  /**
    * Is this Render Texture dirty or not? If not it won't spend time clearing or filling itself.
    */
  var dirty: Boolean = js.native
  
  /**
    * Draws the given object, or an array of objects, to this Render Texture.
    * 
    * It can accept any of the following:
    * 
    * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
    * * Tilemap Layers.
    * * A Group. The contents of which will be iterated and drawn in turn.
    * * A Container. The contents of which will be iterated fully, and drawn in turn.
    * * A Scene's Display List. Pass in `Scene.children` to draw the whole list.
    * * Another Render Texture.
    * * A Texture Frame instance.
    * * A string. This is used to look-up a texture from the Texture Manager.
    * 
    * Note: You cannot draw a Render Texture to itself.
    * 
    * If passing in a Group or Container it will only draw children that return `true`
    * when their `willRender()` method is called. I.e. a Container with 10 children,
    * 5 of which have `visible=false` will only draw the 5 visible ones.
    * 
    * If passing in an array of Game Objects it will draw them all, regardless if
    * they pass a `willRender` check or not.
    * 
    * You can pass in a string in which case it will look for a texture in the Texture
    * Manager matching that string, and draw the base frame. If you need to specify
    * exactly which frame to draw then use the method `drawFrame` instead.
    * 
    * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
    * the coordinates differ based on what objects are being drawn. If the object is
    * a Group, Container or Display List, the coordinates are _added_ to the positions
    * of the children. For all other types of object, the coordinates are exact.
    * 
    * The `alpha` and `tint` values are only used by Texture Frames.
    * Game Objects use their own alpha and tint values when being drawn.
    * 
    * Calling this method causes the WebGL batch to flush, so it can write the texture
    * data to the framebuffer being used internally. The batch is flushed at the end,
    * after the entries have been iterated. So if you've a bunch of objects to draw,
    * try and pass them in an array in one single call, rather than making lots of
    * separate calls.
    * @param entries Any renderable Game Object, or Group, Container, Display List, other Render Texture, Texture Frame or an array of any of these.
    * @param x The x position to draw the Frame at, or the offset applied to the object.
    * @param y The y position to draw the Frame at, or the offset applied to the object.
    * @param alpha The alpha value. Only used for Texture Frames and if not specified defaults to the `globalAlpha` property. Game Objects use their own current alpha value.
    * @param tint WebGL only. The tint color value. Only used for Texture Frames and if not specified defaults to the `globalTint` property. Game Objects use their own current tint value.
    */
  def draw(entries: Any): this.type = js.native
  def draw(entries: Any, x: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Double, alpha: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Unit, alpha: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def draw(entries: Any, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Double, alpha: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def draw(entries: Any, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  
  /**
    * Draws the Texture Frame to the Render Texture at the given position.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * 
    * ```javascript
    * var rt = this.add.renderTexture(0, 0, 800, 600);
    * rt.drawFrame(key, frame);
    * ```
    * 
    * You can optionally provide a position, alpha and tint value to apply to the frame
    * before it is drawn.
    * 
    * Calling this method will cause a batch flush, so if you've got a stack of things to draw
    * in a tight loop, try using the `draw` method instead.
    * 
    * If you need to draw a Sprite to this Render Texture, use the `draw` method instead.
    * @param key The key of the texture to be used, as stored in the Texture Manager.
    * @param frame The name or index of the frame within the Texture.
    * @param x The x position to draw the frame at. Default 0.
    * @param y The y position to draw the frame at. Default 0.
    * @param alpha The alpha to use. If not specified it uses the `globalAlpha` property.
    * @param tint WebGL only. The tint color to use. If not specified it uses the `globalTint` property.
    */
  def drawFrame(key: String): this.type = js.native
  def drawFrame(key: String, frame: String): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: String, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Double, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Double, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Double, alpha: Unit, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Double, tint: Double): this.type = js.native
  def drawFrame(key: String, frame: Unit, x: Unit, y: Unit, alpha: Unit, tint: Double): this.type = js.native
  
  /**
    * Use this method to finish batch drawing to this Render Texture.
    * 
    * Never call this method without first calling `beginDraw`.
    * 
    * It is faster than calling `draw`, but you must be very careful to manage the
    * flow of code and remember to call `endDraw()`. If you don't need to draw large
    * numbers of objects it's much safer and easier to use the `draw` method instead.
    * 
    * The flow should be:
    * 
    * ```javascript
    * // Call once:
    * RenderTexture.beginDraw();
    * 
    * // repeat n times:
    * RenderTexture.batchDraw();
    * // or
    * RenderTexture.batchDrawFrame();
    * 
    * // Call once:
    * RenderTexture.endDraw();
    * ```
    * 
    * Do not call any methods other than `batchDraw`, `batchDrawFrame`, or `endDraw` once you
    * have started a batch. Also, be very careful not to destroy this Render Texture while the
    * batch is still open, or call `beginDraw` again.
    * @param erase Draws all objects in this batch using a blend mode of ERASE. This has the effect of erasing any filled pixels in the objects being drawn. Default false.
    */
  def endDraw(): this.type = js.native
  def endDraw(erase: Boolean): this.type = js.native
  
  /**
    * Draws the given object, or an array of objects, to this Render Texture using a blend mode of ERASE.
    * This has the effect of erasing any filled pixels in the objects from this Render Texture.
    * 
    * It can accept any of the following:
    * 
    * * Any renderable Game Object, such as a Sprite, Text, Graphics or TileSprite.
    * * Tilemap Layers.
    * * A Group. The contents of which will be iterated and drawn in turn.
    * * A Container. The contents of which will be iterated fully, and drawn in turn.
    * * A Scene's Display List. Pass in `Scene.children` to draw the whole list.
    * * Another Render Texture.
    * * A Texture Frame instance.
    * * A string. This is used to look-up a texture from the Texture Manager.
    * 
    * Note: You cannot erase a Render Texture from itself.
    * 
    * If passing in a Group or Container it will only draw children that return `true`
    * when their `willRender()` method is called. I.e. a Container with 10 children,
    * 5 of which have `visible=false` will only draw the 5 visible ones.
    * 
    * If passing in an array of Game Objects it will draw them all, regardless if
    * they pass a `willRender` check or not.
    * 
    * You can pass in a string in which case it will look for a texture in the Texture
    * Manager matching that string, and draw the base frame.
    * 
    * You can pass in the `x` and `y` coordinates to draw the objects at. The use of
    * the coordinates differ based on what objects are being drawn. If the object is
    * a Group, Container or Display List, the coordinates are _added_ to the positions
    * of the children. For all other types of object, the coordinates are exact.
    * 
    * Calling this method causes the WebGL batch to flush, so it can write the texture
    * data to the framebuffer being used internally. The batch is flushed at the end,
    * after the entries have been iterated. So if you've a bunch of objects to draw,
    * try and pass them in an array in one single call, rather than making lots of
    * separate calls.
    * @param entries Any renderable Game Object, or Group, Container, Display List, other Render Texture, Texture Frame or an array of any of these.
    * @param x The x position to draw the Frame at, or the offset applied to the object.
    * @param y The y position to draw the Frame at, or the offset applied to the object.
    */
  def erase(entries: Any): this.type = js.native
  def erase(entries: Any, x: Double): this.type = js.native
  def erase(entries: Any, x: Double, y: Double): this.type = js.native
  def erase(entries: Any, x: Unit, y: Double): this.type = js.native
  
  /**
    * Fills the Render Texture with the given color.
    * @param rgb The color to fill the Render Texture with.
    * @param alpha The alpha value used by the fill. Default 1.
    * @param x The left coordinate of the fill rectangle. Default 0.
    * @param y The top coordinate of the fill rectangle. Default 0.
    * @param width The width of the fill rectangle. Default this.frame.cutWidth.
    * @param height The height of the fill rectangle. Default this.frame.cutHeight.
    */
  def fill(rgb: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Double, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Double, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Double, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Unit, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Unit, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Double, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Double, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Unit, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Double, x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Double, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Double, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Double, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Unit, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Unit, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Double, y: Unit, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Double, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Double, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Double, width: Unit, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Unit, width: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Unit, width: Double, height: Double): this.type = js.native
  def fill(rgb: Double, alpha: Unit, x: Unit, y: Unit, width: Unit, height: Double): this.type = js.native
  
  /**
    * The alpha of the Render Texture when rendered.
    */
  var globalAlpha: Double = js.native
  
  /**
    * The tint of the Render Texture when rendered.
    */
  var globalTint: Double = js.native
  
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  
  /**
    * The Render Target that belongs to this Render Texture.
    * 
    * A Render Target encapsulates a framebuffer and texture for the WebGL Renderer.
    * 
    * This property remains `null` under Canvas.
    */
  var renderTarget: RenderTarget = js.native
  
  /**
    * A reference to either the Canvas or WebGL Renderer that the Game instance is using.
    */
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  
  /**
    * Resizes the Render Texture to the new dimensions given.
    * 
    * If Render Texture was created from specific frame, only the size of the frame will be changed. The size of the source
    * texture will not change.
    * 
    * If Render Texture was not created from specific frame, the following will happen:
    * 
    * In WebGL it will destroy and then re-create the frame buffer being used by the Render Texture.
    * In Canvas it will resize the underlying canvas element.
    * 
    * Both approaches will erase everything currently drawn to the Render Texture.
    * 
    * If the dimensions given are the same as those already being used, calling this method will do nothing.
    * @param width The new width of the Render Texture.
    * @param height The new height of the Render Texture. If not specified, will be set the same as the `width`. Default width.
    */
  def resize(width: Double): this.type = js.native
  def resize(width: Double, height: Double): this.type = js.native
  
  /**
    * Stores a copy of this Render Texture in the Texture Manager using the given key.
    * 
    * After doing this, any texture based Game Object, such as a Sprite, can use the contents of this
    * Render Texture by using the texture key:
    * 
    * ```javascript
    * var rt = this.add.renderTexture(0, 0, 128, 128);
    * 
    * // Draw something to the Render Texture
    * 
    * rt.saveTexture('doodle');
    * 
    * this.add.image(400, 300, 'doodle');
    * ```
    * 
    * Updating the contents of this Render Texture will automatically update _any_ Game Object
    * that is using it as a texture. Calling `saveTexture` again will not save another copy
    * of the same texture, it will just rename the key of the existing copy.
    * 
    * By default it will create a single base texture. You can add frames to the texture
    * by using the `Texture.add` method. After doing this, you can then allow Game Objects
    * to use a specific frame from a Render Texture.
    * 
    * If you destroy this Render Texture, any Game Object using it via the Texture Manager will
    * stop rendering. Ensure you remove the texture from the Texture Manager and any Game Objects
    * using it first, before destroying this Render Texture.
    * @param key The unique key to store the texture as within the global Texture Manager.
    */
  def saveTexture(key: String): Texture = js.native
  
  /**
    * Set the alpha to use when rendering this Render Texture.
    * @param alpha The alpha value.
    */
  def setGlobalAlpha(alpha: Double): this.type = js.native
  
  /**
    * Set the tint to use when rendering this Render Texture.
    * @param tint The tint value.
    */
  def setGlobalTint(tint: Double): this.type = js.native
  
  /**
    * Takes a snapshot of the whole of this Render Texture.
    * 
    * The snapshot is taken immediately.
    * 
    * To capture just a portion of the Render Texture see the `snapshotArea` method. To capture a specific pixel, see `snapshotPixel`.
    * 
    * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
    * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
    * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
    * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshot(callback: SnapshotCallback): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: String): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: String, encoderOptions: Double): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: Unit, encoderOptions: Double): this.type = js.native
  
  /**
    * Takes a snapshot of the given area of this Render Texture.
    * 
    * The snapshot is taken immediately.
    * 
    * To capture the whole Render Texture see the `snapshot` method. To capture a specific pixel, see `snapshotPixel`.
    * 
    * Snapshots work by using the WebGL `readPixels` feature to grab every pixel from the frame buffer into an ArrayBufferView.
    * It then parses this, copying the contents to a temporary Canvas and finally creating an Image object from it,
    * which is the image returned to the callback provided. All in all, this is a computationally expensive and blocking process,
    * which gets more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param x The x coordinate to grab from.
    * @param y The y coordinate to grab from.
    * @param width The width of the area to grab.
    * @param height The height of the area to grab.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback): this.type = js.native
  def snapshotArea(x: Double, y: Double, width: Double, height: Double, callback: SnapshotCallback, `type`: String): this.type = js.native
  def snapshotArea(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: SnapshotCallback,
    `type`: String,
    encoderOptions: Double
  ): this.type = js.native
  def snapshotArea(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    callback: SnapshotCallback,
    `type`: Unit,
    encoderOptions: Double
  ): this.type = js.native
  
  /**
    * Takes a snapshot of the given pixel from this Render Texture.
    * 
    * The snapshot is taken immediately.
    * 
    * To capture the whole Render Texture see the `snapshot` method. To capture a specific portion, see `snapshotArea`.
    * 
    * Unlike the other two snapshot methods, this one will send your callback a `Color` object containing the color data for
    * the requested pixel. It doesn't need to create an internal Canvas or Image object, so is a lot faster to execute,
    * using less memory, than the other snapshot methods.
    * @param x The x coordinate of the pixel to get.
    * @param y The y coordinate of the pixel to get.
    * @param callback The Function to invoke after the snapshot pixel data is extracted.
    */
  def snapshotPixel(x: Double, y: Double, callback: SnapshotCallback): this.type = js.native
  
  /**
    * A reference to the Texture Manager.
    */
  var textureManager: TextureManager = js.native
  
  /**
    * The Texture corresponding to this Render Texture.
    */
  @JSName("texture")
  var texture_RenderTexture: Texture = js.native
}
