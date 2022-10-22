package typingsJapgolly.pixiSprite

import typingsJapgolly.pixiConstants.mod.BLEND_MODES
import typingsJapgolly.pixiCore.mod.IBaseTextureOptions
import typingsJapgolly.pixiCore.mod.Resource
import typingsJapgolly.pixiCore.mod.Texture
import typingsJapgolly.pixiCore.mod.TextureSource
import typingsJapgolly.pixiDisplay.anon.DisplayObject
import typingsJapgolly.pixiDisplay.mod.Container
import typingsJapgolly.pixiMath.mod.IPointData
import typingsJapgolly.pixiMath.mod.ObservablePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/sprite", "Sprite")
  @js.native
  /** @param texture - The texture for this sprite. */
  open class Sprite ()
    extends Container[DisplayObject]
       with typingsJapgolly.pixiSprite.GlobalMixins.Sprite {
    def this(texture: Texture[Resource]) = this()
    
    /**
      * The anchor point defines the normalized coordinates
      * in the texture that map to the position of this
      * sprite.
      *
      * By default, this is `(0,0)` (or `texture.defaultAnchor`
      * if you have modified that), which means the position
      * `(x,y)` of this `Sprite` will be the top-left corner.
      *
      * Note: Updating `texture.defaultAnchor` after
      * constructing a `Sprite` does _not_ update its anchor.
      *
      * {@link https://docs.cocos2d-x.org/cocos2d-x/en/sprites/manipulation.html}
      * @default `this.texture.defaultAnchor`
      */
    /* protected */ var _anchor: ObservablePoint[Any] = js.native
    
    /**
      * Cached tint value so we can tell when the tint is changed.
      * Value is used for 2d CanvasRenderer.
      * @protected
      * @default 0xFFFFFF
      */
    var _cachedTint: Double = js.native
    
    /** Called when the anchor position updates. */
    /* private */ var _onAnchorUpdate: Any = js.native
    
    /** When the texture is updated, this event will fire to update the scale and frame. */
    /* protected */ def _onTextureUpdate(): Unit = js.native
    
    /**
      * Internal roundPixels field
      * @private
      */
    /* private */ var _roundPixels: Any = js.native
    
    /**
      * The texture that the sprite is using.
      * @private
      */
    var _texture: Texture[Resource] = js.native
    
    var _textureID: Double = js.native
    
    /* protected */ var _textureTrimmedID: Double = js.native
    
    /**
      * The tint applied to the sprite. This is a hex value. A value of 0xFFFFFF will remove any tint effect.
      * @default 0xFFFFFF
      */
    /* private */ var _tint: Any = js.native
    
    /**
      * The tint applied to the sprite. This is a RGB value. A value of 0xFFFFFF will remove any tint effect.
      * @private
      * @default 16777215
      */
    var _tintRGB: Double = js.native
    
    /* private */ var _transformID: Any = js.native
    
    /* private */ var _transformTrimmedID: Any = js.native
    
    /**
      * The anchor sets the origin point of the sprite. The default value is taken from the {@link PIXI.Texture|Texture}
      * and passed to the constructor.
      *
      * The default is `(0,0)`, this means the sprite's origin is the top left.
      *
      * Setting the anchor to `(0.5,0.5)` means the sprite's origin is centered.
      *
      * Setting the anchor to `(1,1)` would mean the sprite's origin point will be the bottom right corner.
      *
      * If you pass only single parameter, it will set both x and y to the same value as shown in the example below.
      * @example
      * const sprite = new PIXI.Sprite(texture);
      * sprite.anchor.set(0.5); // This will set the origin to center. (0.5) is same as (0.5, 0.5).
      */
    def anchor: ObservablePoint[Any] = js.native
    def anchor_=(value: ObservablePoint[Any]): Unit = js.native
    
    /**
      * The blend mode to be applied to the sprite. Apply a value of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
      * @default PIXI.BLEND_MODES.NORMAL
      */
    var blendMode: BLEND_MODES = js.native
    
    /**
      * Calculates worldTransform * vertices for a non texture with a trim. store it in vertexTrimmedData.
      *
      * This is used to ensure that the true width and height of a trimmed texture is respected.
      */
    def calculateTrimmedVertices(): Unit = js.native
    
    /** Calculates worldTransform * vertices, store it in vertexData. */
    def calculateVertices(): Unit = js.native
    
    /**
      * Tests if a point is inside this sprite
      * @param point - the point to test
      * @returns The result of the test
      */
    def containsPoint(point: IPointData): Boolean = js.native
    
    var indices: js.typedarray.Uint16Array = js.native
    
    /**
      * Plugin that is responsible for rendering this element.
      * Allows to customize the rendering process without overriding '_render' & '_renderCanvas' methods.
      * @default 'batch'
      */
    var pluginName: String = js.native
    
    def roundPixels: Boolean = js.native
    /**
      * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
      *
      * Advantages can include sharper image quality (like text) and faster rendering on canvas.
      * The main disadvantage is movement of objects may appear less smooth.
      *
      * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}.
      * @default false
      */
    def roundPixels_=(value: Boolean): Unit = js.native
    
    /** The texture that the sprite is using. */
    def texture: Texture[Resource] = js.native
    def texture_=(value: Texture[Resource]): Unit = js.native
    
    /**
      * The tint applied to the sprite. This is a hex value.
      *
      * A value of 0xFFFFFF will remove any tint effect.
      * @default 0xFFFFFF
      */
    def tint: Double = js.native
    def tint_=(value: Double): Unit = js.native
    
    /**
      * This is used to store the uvs data of the sprite, assigned at the same time
      * as the vertexData in calculateVertices().
      * @member {Float32Array}
      */
    /* protected */ var uvs: js.typedarray.Float32Array = js.native
    
    /**
      * This is used to store the vertex data of the sprite (basically a quad).
      * @member {Float32Array}
      */
    /* protected */ var vertexData: js.typedarray.Float32Array = js.native
    
    /**
      * This is used to calculate the bounds of the object IF it is a trimmed sprite.
      * @member {Float32Array}
      */
    /* private */ var vertexTrimmedData: Any = js.native
  }
  /* static members */
  object Sprite {
    
    @JSImport("@pixi/sprite", "Sprite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function that creates a new sprite based on the source you provide.
      * The source can be - frame id, image url, video url, canvas element, video element, base texture
      * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
      * @param {object} [options] - See {@link PIXI.BaseTexture}'s constructor for options.
      * @returns The newly created sprite
      */
    inline def from(source: SpriteSource): Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[Sprite]
    inline def from(source: SpriteSource, options: IBaseTextureOptions[Any]): Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sprite]
  }
  
  type SpriteSource = TextureSource | Texture[Resource]
}
