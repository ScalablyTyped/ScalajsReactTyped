package typingsJapgolly.babelify.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babelify", "BabelifyObject")
@js.native
class BabelifyObject () extends Transform {
  def _flush(callback: js.Function0[Unit]): Unit = js.native
  def _transform(buf: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def _transform(buf: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
}

