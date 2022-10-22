package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiTextBitmap.anon.PartialITextStyle
import typingsJapgolly.pixiTextBitmap.mod.IBitmapFontOptions
import typingsJapgolly.pixiUtils.mod.Dict
import typingsJapgolly.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BitmapFont")
@js.native
open class BitmapFont protected ()
  extends typingsJapgolly.pixiTextBitmap.mod.BitmapFont {
  /**
    * @param data
    * @param textures
    * @param ownsTextures - Setting to `true` will destroy page textures
    *        when the font is uninstalled.
    */
  def this(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ) = this()
  def this(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ) = this()
  def this(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ) = this()
  def this(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ) = this()
}
/* static members */
object BitmapFont {
  
  @JSImport("pixi.js", "BitmapFont")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This character set includes all the letters in the alphabet (both lower- and upper- case).
    * @type {string[][]}
    * @example
    * BitmapFont.from("ExampleFont", style, { chars: BitmapFont.ALPHA })
    */
  @JSImport("pixi.js", "BitmapFont.ALPHA")
  @js.native
  val ALPHA: js.Array[String | js.Array[String]] = js.native
  
  /**
    * This character set is the union of `BitmapFont.ALPHA` and `BitmapFont.NUMERIC`.
    * @type {string[][]}
    */
  @JSImport("pixi.js", "BitmapFont.ALPHANUMERIC")
  @js.native
  val ALPHANUMERIC: js.Array[String | js.Array[String]] = js.native
  
  /**
    * This character set consists of all the ASCII table.
    * @member {string[][]}
    * @see http://www.asciitable.com/
    */
  @JSImport("pixi.js", "BitmapFont.ASCII")
  @js.native
  val ASCII: js.Array[js.Array[String]] = js.native
  
  /**
    * This character set includes all decimal digits (from 0 to 9).
    * @type {string[][]}
    * @example
    * BitmapFont.from("ExampleFont", style, { chars: BitmapFont.NUMERIC })
    */
  @JSImport("pixi.js", "BitmapFont.NUMERIC")
  @js.native
  val NUMERIC: js.Array[js.Array[String]] = js.native
  
  /** Collection of available/installed fonts. */
  @JSImport("pixi.js", "BitmapFont.available")
  @js.native
  val available: Dict[typingsJapgolly.pixiTextBitmap.mod.BitmapFont] = js.native
  
  /**
    * Collection of default options when using `BitmapFont.from`.
    * @property {number} [resolution=1] -
    * @property {number} [textureWidth=512] -
    * @property {number} [textureHeight=512] -
    * @property {number} [padding=4] -
    * @property {string|string[]|string[][]} chars = PIXI.BitmapFont.ALPHANUMERIC
    */
  @JSImport("pixi.js", "BitmapFont.defaultOptions")
  @js.native
  val defaultOptions: IBitmapFontOptions = js.native
  
  /**
    * Generates a bitmap-font for the given style and character set. This does not support
    * kernings yet. With `style` properties, only the following non-layout properties are used:
    *
    * - {@link PIXI.TextStyle#dropShadow|dropShadow}
    * - {@link PIXI.TextStyle#dropShadowDistance|dropShadowDistance}
    * - {@link PIXI.TextStyle#dropShadowColor|dropShadowColor}
    * - {@link PIXI.TextStyle#dropShadowBlur|dropShadowBlur}
    * - {@link PIXI.TextStyle#dropShadowAngle|dropShadowAngle}
    * - {@link PIXI.TextStyle#fill|fill}
    * - {@link PIXI.TextStyle#fillGradientStops|fillGradientStops}
    * - {@link PIXI.TextStyle#fillGradientType|fillGradientType}
    * - {@link PIXI.TextStyle#fontFamily|fontFamily}
    * - {@link PIXI.TextStyle#fontSize|fontSize}
    * - {@link PIXI.TextStyle#fontVariant|fontVariant}
    * - {@link PIXI.TextStyle#fontWeight|fontWeight}
    * - {@link PIXI.TextStyle#lineJoin|lineJoin}
    * - {@link PIXI.TextStyle#miterLimit|miterLimit}
    * - {@link PIXI.TextStyle#stroke|stroke}
    * - {@link PIXI.TextStyle#strokeThickness|strokeThickness}
    * - {@link PIXI.TextStyle#textBaseline|textBaseline}
    * @param name - The name of the custom font to use with BitmapText.
    * @param textStyle - Style options to render with BitmapFont.
    * @param options - Setup options for font or name of the font.
    * @param {string|string[]|string[][]} [options.chars=PIXI.BitmapFont.ALPHANUMERIC] - characters included
    *      in the font set. You can also use ranges. For example, `[['a', 'z'], ['A', 'Z'], "!@#$%^&*()~{}[] "]`.
    *      Don't forget to include spaces ' ' in your character set!
    * @param {number} [options.resolution=1] - Render resolution for glyphs.
    * @param {number} [options.textureWidth=512] - Optional width of atlas, smaller values to reduce memory.
    * @param {number} [options.textureHeight=512] - Optional height of atlas, smaller values to reduce memory.
    * @param {number} [options.padding=4] - Padding between glyphs on texture atlas.
    * @returns Font generated by style options.
    * @example
    * PIXI.BitmapFont.from("TitleFont", {
    *     fontFamily: "Arial",
    *     fontSize: 12,
    *     strokeThickness: 2,
    *     fill: "purple"
    * });
    *
    * const title = new PIXI.BitmapText("This is the title", { fontName: "TitleFont" });
    */
  inline def from(name: String): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def from(name: String, textStyle: Unit, options: IBitmapFontOptions): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def from(name: String, textStyle: typingsJapgolly.pixiText.mod.TextStyle): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def from(name: String, textStyle: typingsJapgolly.pixiText.mod.TextStyle, options: IBitmapFontOptions): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def from(name: String, textStyle: PartialITextStyle): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def from(name: String, textStyle: PartialITextStyle, options: IBitmapFontOptions): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(name.asInstanceOf[js.Any], textStyle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  
  inline def install(
    data: String,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: String,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  /**
    * Register a new bitmap font.
    * @param data - The
    *        characters map that could be provided as xml or raw string.
    * @param textures - List of textures for each page.
    * @param ownsTextures - Set to `true` to destroy page textures
    *        when the font is uninstalled. By default fonts created with
    *        `BitmapFont.from` or from the `BitmapFontLoader` are `true`.
    * @returns {PIXI.BitmapFont} Result font object with font, size, lineHeight
    *         and char fields.
    */
  inline def install(
    data: String,
    textures: typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: String,
    textures: typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: String,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: String,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: typingsJapgolly.pixiTextBitmap.mod.BitmapFontData,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: XMLDocument,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: XMLDocument,
    textures: js.Array[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: XMLDocument,
    textures: typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: XMLDocument,
    textures: typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: XMLDocument,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]]
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  inline def install(
    data: XMLDocument,
    textures: Dict[typingsJapgolly.pixiCore.mod.Texture[typingsJapgolly.pixiCore.mod.Resource]],
    ownsTextures: Boolean
  ): typingsJapgolly.pixiTextBitmap.mod.BitmapFont = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(data.asInstanceOf[js.Any], textures.asInstanceOf[js.Any], ownsTextures.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiTextBitmap.mod.BitmapFont]
  
  /**
    * Remove bitmap font by name.
    * @param name - Name of the font to uninstall.
    */
  inline def uninstall(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
