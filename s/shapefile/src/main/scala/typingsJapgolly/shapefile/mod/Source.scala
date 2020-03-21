package typingsJapgolly.shapefile.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.shapefile.AnonDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source[RecordType] extends js.Object {
  var bbox: js.Array[Double]
  def cancel(): js.Promise[Unit]
  def read(): js.Promise[AnonDone[RecordType]]
}

object Source {
  @scala.inline
  def apply[RecordType](
    bbox: js.Array[Double],
    cancel: CallbackTo[js.Promise[Unit]],
    read: CallbackTo[js.Promise[AnonDone[RecordType]]]
  ): Source[RecordType] = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.asInstanceOf[Source[RecordType]]
  }
}

