package typingsJapgolly.pngjs.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.pngjs.AnonRead
import typingsJapgolly.pngjs.pngjsStrings.close
import typingsJapgolly.pngjs.pngjsStrings.error
import typingsJapgolly.pngjs.pngjsStrings.metadata
import typingsJapgolly.pngjs.pngjsStrings.parsed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pngjs", "PNG")
@js.native
class PNG () extends Duplex {
  def this(options: PNGOptions) = this()
  var data: Buffer = js.native
  var gamma: Double = js.native
  var height: Double = js.native
  var width: Double = js.native
  def adjustGamma(): Unit = js.native
  def bitblt(
    dst: PNG,
    srcX: js.UndefOr[Double],
    srcY: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    deltaX: js.UndefOr[Double],
    deltaY: js.UndefOr[Double]
  ): PNG = js.native
  @JSName("on")
  def on_close(event: close, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: metadata, callback: js.Function1[/* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("on")
  def on_parsed(event: parsed, callback: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  def pack(): PNG = js.native
  def parse(data: String): PNG = js.native
  def parse(data: String, callback: js.Function2[/* error */ js.Error, /* data */ this.type, Unit]): PNG = js.native
  def parse(data: Buffer): PNG = js.native
  def parse(data: Buffer, callback: js.Function2[/* error */ js.Error, /* data */ this.type, Unit]): PNG = js.native
}

/* static members */
@JSImport("pngjs", "PNG")
@js.native
object PNG extends js.Object {
  var sync: AnonRead = js.native
  def adjustGamma(src: PNG): Unit = js.native
  def bitblt(
    src: PNG,
    dst: PNG,
    srcX: js.UndefOr[Double],
    srcY: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    deltaX: js.UndefOr[Double],
    deltaY: js.UndefOr[Double]
  ): Unit = js.native
}

