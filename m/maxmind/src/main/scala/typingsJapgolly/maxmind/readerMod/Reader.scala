package typingsJapgolly.maxmind.readerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.maxmind.metadataMod.Metadata
import typingsJapgolly.maxmind.responseMod.Response
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader[T /* <: Response */] extends js.Object {
  var db: js.Any
  var decoder: js.Any
  var metadata: Metadata
  var walker: js.Any
  def findAddressInTree(ipAddress: String): Double | Null
  def get(ipAddress: String): T | Null
  def load(db: Buffer, opts: js.Object): Unit
  def resolveDataPointer(pointer: Double): js.Any
}

object Reader {
  @scala.inline
  def apply[T /* <: Response */](
    db: js.Any,
    decoder: js.Any,
    findAddressInTree: String => CallbackTo[Double | Null],
    get: String => CallbackTo[T | Null],
    load: (Buffer, js.Object) => Callback,
    metadata: Metadata,
    resolveDataPointer: Double => CallbackTo[js.Any],
    walker: js.Any
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], decoder = decoder.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], walker = walker.asInstanceOf[js.Any])
    __obj.updateDynamic("findAddressInTree")(js.Any.fromFunction1((t0: java.lang.String) => findAddressInTree(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction2((t0: typingsJapgolly.node.Buffer, t1: js.Object) => load(t0, t1).runNow()))
    __obj.updateDynamic("resolveDataPointer")(js.Any.fromFunction1((t0: scala.Double) => resolveDataPointer(t0).runNow()))
    __obj.asInstanceOf[Reader[T]]
  }
}

