package typingsJapgolly.pngAsync.packerMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Packer extends Readable {
  var _option: js.Any = js.native
  var _packChunk: js.Any = js.native
  var _packIDAT: js.Any = js.native
  var _packIEND: js.Any = js.native
  var _packIHDR: js.Any = js.native
  def _read(): Unit = js.native
  def pack(data: Buffer, width: Double, height: Double): Unit = js.native
}

