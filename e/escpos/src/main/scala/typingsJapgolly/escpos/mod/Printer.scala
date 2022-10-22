package typingsJapgolly.escpos.mod

import typingsJapgolly.escpos.anon.Align
import typingsJapgolly.escpos.anon.Cols
import typingsJapgolly.escpos.anon.Encoding
import typingsJapgolly.escpos.anon.Font
import typingsJapgolly.escpos.anon.Mode
import typingsJapgolly.escpos.escposInts.`0`
import typingsJapgolly.escpos.escposInts.`1`
import typingsJapgolly.escpos.escposInts.`2`
import typingsJapgolly.escpos.escposStrings.A
import typingsJapgolly.escpos.escposStrings.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Printer")
@js.native
open class Printer protected () extends StObject {
  def this(adapter: Adapter) = this()
  def this(adapter: Adapter, options: Encoding) = this()
  
  def align(align: TXT_ALIGN): Printer = js.native
  
  def barcode(code: String, `type`: BARCODE_TYPE): Printer = js.native
  def barcode(code: String, `type`: BARCODE_TYPE, options: Font): Printer = js.native
  
  /**
    * Printer Buzzer (Beep sound)
    */
  def beep(numberOfBuzzer: Double, time: Double): Printer = js.native
  
  /**
    * Send pulse to kick the cash drawer
    *
    * @default 2
    */
  def cashdraw(): Printer = js.native
  def cashdraw(pin: Double): Printer = js.native
  
  def close(): Printer = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Printer = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[Any], Unit], options: Any): Printer = js.native
  def close(callback: Unit, options: Any): Printer = js.native
  
  /**
    * Select between two print color modes, if your printer supports it
    * @param color - 0 for primary color (black) 1 for secondary color (red)
    */
  def color(color: `0` | `1`): Printer = js.native
  
  /**
    * Carrier feed and tabs.
    */
  def control(ctrl: FEED_CONTROL_TYPE): Printer = js.native
  
  /**
    * Cut paper.
    *
    * *** Cut will flush buffer to printer ***
    *
    * @param part If true, PAPER_PART_CUT, else PAPER_FULL_CUT
    * @param feed
    */
  def cut(): Printer = js.native
  def cut(part: Boolean): Printer = js.native
  def cut(part: Boolean, feed: Double): Printer = js.native
  def cut(part: Unit, feed: Double): Printer = js.native
  
  /**
    * Draw a horizontal line with EOL
    *
    * Example:
    * `-------` 48x
    */
  def drawLine(): Printer = js.native
  
  /**
    * Set default encoding
    * @default `GB18030` (Chinese)
    */
  def encode(encoding: String): Printer = js.native
  
  /**
    * Print blank lines
    */
  def feed(): Printer = js.native
  def feed(n: Double): Printer = js.native
  
  /**
    * Send data to hardware and flush buffer
    */
  def flush(): Printer = js.native
  def flush(callback: js.Function1[/* error */ js.UndefOr[Any], Unit]): Printer = js.native
  
  /**
    * @default 'A'
    */
  def font(family: A | B): Printer = js.native
  
  def hardware(hw: String): Printer = js.native
  
  def image(image: Image, density: BITMAP_FORMAT_TYPE): Printer = js.native
  
  /**
    * Set line spacing
    */
  def lineSpace(): Printer = js.native
  def lineSpace(n: Double): Printer = js.native
  
  def marginBottom(size: Double): Printer = js.native
  
  def marginLeft(size: Double): Printer = js.native
  
  def marginRight(size: Double): Printer = js.native
  
  /**
    * Set printer model to recognize model-specific commands.
    * Supported models: [ null, 'qsprinter' ]
    *
    * For generic printers, set model to null
    */
  def model(_model: String): Printer = js.native
  
  def newLine(): Printer = js.native
  
  /**
    * Print raw
    */
  def print(content: Any): Printer = js.native
  
  /**
    * Print raw with EOL
    */
  def println(content: Any): Printer = js.native
  
  /**
    * Print text
    */
  def pureText(content: String): Printer = js.native
  def pureText(content: String, encoding: String): Printer = js.native
  
  def qrcode(code: String, version: Double, level: QRCODE_LEVEL, size: Double): Printer = js.native
  
  def qrimage(content: String): Printer = js.native
  def qrimage(
    content: String,
    callback: js.Function2[/* error */ js.Error | Null, /* printer */ js.UndefOr[this.type], Unit]
  ): Printer = js.native
  def qrimage(
    content: String,
    options: Unit,
    callback: js.Function2[/* error */ js.Error | Null, /* printer */ js.UndefOr[this.type], Unit]
  ): Printer = js.native
  def qrimage(content: String, options: Mode): Printer = js.native
  def qrimage(
    content: String,
    options: Mode,
    callback: js.Function2[/* error */ js.Error | Null, /* printer */ js.UndefOr[this.type], Unit]
  ): Printer = js.native
  
  def raster(image: Image): Printer = js.native
  def raster(image: Image, mode: String): Printer = js.native
  
  /**
    * Set text size
    *
    * 1 is for regular size, and 2 is twice the standard size.
    *
    * @default `1`
    */
  def size(width: `1` | `2`, height: `1` | `2`): Printer = js.native
  
  /**
    * Set character spacing
    */
  def spacing(): Printer = js.native
  def spacing(n: Double): Printer = js.native
  
  def style(`type`: TXT_STYLE): Printer = js.native
  
  /**
    * Print list of string with EOL
    */
  def table(data: js.Array[String]): Printer = js.native
  def table(data: js.Array[String], encoding: String): Printer = js.native
  
  def tableCustom(data: Align): Printer = js.native
  def tableCustom(data: Align, encoding: String): Printer = js.native
  def tableCustom(data: Cols): Printer = js.native
  def tableCustom(data: Cols, encoding: String): Printer = js.native
  
  /**
    * Print text with EOL
    */
  def text(content: String): Printer = js.native
  def text(content: String, encoding: String): Printer = js.native
}
/* static members */
object Printer {
  
  @JSImport("escpos", "Printer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(device: Adapter): js.Promise[Printer] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(device.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Printer]]
}
