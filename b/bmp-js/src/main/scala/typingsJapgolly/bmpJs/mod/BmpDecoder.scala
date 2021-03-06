package typingsJapgolly.bmpJs.mod

import typingsJapgolly.bmpJs.AnonBlue
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bmp-js", "BmpDecoder")
@js.native
class BmpDecoder protected () extends ImageData {
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, is_with_alpha: Boolean) = this()
  var bitPP: Double = js.native
  var bottom_up: Boolean = js.native
  var colors: Double = js.native
  var compress: Double = js.native
  /* CompleteClass */
  override val data: Buffer = js.native
  var fileSize: Double = js.native
  var headerSize: Double = js.native
  /* CompleteClass */
  override val height: Double = js.native
  var hr: Double = js.native
  var importantColors: Double = js.native
  var offset: Double = js.native
  var palette: js.Array[AnonBlue] = js.native
  var planes: Double = js.native
  var pos: Double = js.native
  var rawSize: Double = js.native
  var reserved: Double = js.native
  var vr: Double = js.native
  /* CompleteClass */
  override val width: Double = js.native
  /* private */ def bit1(): Unit = js.native
  /* private */ def bit15(): Unit = js.native
  /* private */ def bit16(): Unit = js.native
  /* private */ def bit24(): Unit = js.native
  /* private */ def bit32(): Unit = js.native
  /* private */ def bit4(): Unit = js.native
  /* private */ def bit8(): Unit = js.native
  /**
    * Returns the data buffer - byte array order by ABGR ABGR ABGR,4 bytes per pixel
    */
  def getData(): Buffer = js.native
  /* private */ def parseHeader(): Unit = js.native
  /* private */ def parseRGBA(): Unit = js.native
}

