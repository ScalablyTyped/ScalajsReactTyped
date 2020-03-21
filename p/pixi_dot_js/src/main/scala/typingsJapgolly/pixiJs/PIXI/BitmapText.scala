package typingsJapgolly.pixiJs.PIXI

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pixiJs.AnonFont
import typingsJapgolly.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A BitmapText object will create a line or multiple lines of text using bitmap font.
  *
  * The primary advantage of this class over Text is that all of your textures are pre-generated and loading,
  * meaning that rendering is fast, and changing text has no performance implications.
  *
  * The primary disadvantage is that you need to preload the bitmap font assets, and thus the styling is set in stone.
  * Supporting character sets other than latin, such as CJK languages, may be impractical due to the number of characters.
  *
  * To split a line you can use '\n', '\r' or '\r\n' in your string.
  *
  * You can generate the fnt files using
  * http://www.angelcode.com/products/bmfont/ for Windows or
  * http://www.bmglyph.com/ for Mac.
  *
  * A BitmapText can only be created when the font is loaded.
  *
  * ```js
  * // in this case the font is in a file called 'desyrel.fnt'
  * let bitmapText = new PIXI.BitmapText("text using a fancy font!", {font: "35px Desyrel", align: "right"});
  * ```
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@JSGlobal("PIXI.BitmapText")
@js.native
class BitmapText protected () extends Container {
  def this(text: String, style: AnonFont) = this()
  /**
    * The alignment of the BitmapText object.
    *
    * @member {string}
    * @default 'left'
    */
  var align: String = js.native
  /**
    * The anchor sets the origin point of the text.
    *
    * The default is `(0,0)`, this means the text's origin is the top left.
    *
    * Setting the anchor to `(0.5,0.5)` means the text's origin is centered.
    *
    * Setting the anchor to `(1,1)` would mean the text's origin point will be the bottom right corner.
    *
    * @member {PIXI.Point | number}
    */
  var anchor: Point | Double = js.native
  /**
    * The dirty state of this object.
    *
    * @member {boolean} PIXI.BitmapText#dirty
    */
  var dirty: Boolean = js.native
  /**
    * The font descriptor of the BitmapText object.
    *
    * @member {object}
    */
  var font: js.Any = js.native
  /**
    * Additional space between characters.
    *
    * @member {number}
    */
  var letterSpacing: Double = js.native
  /**
    * The max line height. This is useful when trying to use the total height of the Text,
    * i.e. when trying to vertically align.
    *
    * @member {number}
    * @readonly
    */
  val maxLineHeight: Double = js.native
  /**
    * The max width of this bitmap text in pixels. If the text provided is longer than the
    * value provided, line breaks will be automatically inserted in the last whitespace.
    * Disable by setting the value to 0.
    *
    * @member {number}
    */
  var maxWidth: Double = js.native
  /**
    * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
    * Advantages can include sharper image quality (like text) and faster rendering on canvas.
    * The main disadvantage is movement of objects may appear less smooth.
    * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}
    *
    * @member {boolean} PIXI.BitmapText#roundPixels
    * @default false
    */
  var roundPixels: Boolean = js.native
  /**
    * The text of the BitmapText object.
    *
    * @member {string}
    */
  var text: String = js.native
  /**
    * The height of the overall text, different from fontSize,
    * which is defined in the style object.
    *
    * @member {number}
    * @readonly
    */
  val textHeight: Double = js.native
  /**
    * The width of the overall text, different from fontSize,
    * which is defined in the style object.
    *
    * @member {number}
    * @readonly
    */
  val textWidth: Double = js.native
  /**
    * The tint of the BitmapText object.
    *
    * @member {number}
    */
  var tint: Double = js.native
}

/* static members */
@JSGlobal("PIXI.BitmapText")
@js.native
object BitmapText extends js.Object {
  def registerFont(xml: XMLDocument, textures: js.Array[Texture]): js.Any = js.native
  /**
    * Register a bitmap font with data and a texture.
    *
    * @static
    * @param {XMLDocument} xml - The XML document data.
    * @param {Object.<string, PIXI.Texture>|PIXI.Texture|PIXI.Texture[]} textures - List of textures for each page.
    *  If providing an object, the key is the `<page>` element's `file` attribute in the FNT file.
    * @return {Object} Result font object with font, size, lineHeight and char fields.
    */
  def registerFont(xml: XMLDocument, textures: StringDictionary[Texture]): js.Any = js.native
  def registerFont(xml: XMLDocument, textures: Texture): js.Any = js.native
}

