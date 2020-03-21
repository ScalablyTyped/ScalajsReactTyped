package typingsJapgolly.compressJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compress extends js.Object {
  def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]]
  def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]]
}

object Compress {
  @scala.inline
  def apply(
    attach: (String, CompressOptions) => CallbackTo[js.Promise[js.Array[CompressResult]]],
    compress: (js.Array[File], CompressOptions) => CallbackTo[js.Promise[js.Array[CompressResult]]]
  ): Compress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.compressJs.mod.CompressOptions) => attach(t0, t1).runNow()))
    __obj.updateDynamic("compress")(js.Any.fromFunction2((t0: js.Array[org.scalajs.dom.raw.File], t1: typingsJapgolly.compressJs.mod.CompressOptions) => compress(t0, t1).runNow()))
    __obj.asInstanceOf[Compress]
  }
}

