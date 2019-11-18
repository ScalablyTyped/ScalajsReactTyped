package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.stdStrings.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingByteSource extends js.Object {
  var autoAllocateChunkSize: js.UndefOr[Double] = js.undefined
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  var pull: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  var start: js.UndefOr[ReadableByteStreamControllerCallback] = js.undefined
  var `type`: bytes
}

object UnderlyingByteSource {
  @scala.inline
  def apply(
    `type`: bytes,
    autoAllocateChunkSize: Int | Double = null,
    cancel: /* reason */ js.Any => CallbackTo[Unit | js.Thenable[Unit]] = null,
    pull: /* controller */ ReadableByteStreamController => CallbackTo[Unit | js.Thenable[Unit]] = null,
    start: /* controller */ ReadableByteStreamController => CallbackTo[Unit | js.Thenable[Unit]] = null
  ): UnderlyingByteSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (autoAllocateChunkSize != null) __obj.updateDynamic("autoAllocateChunkSize")(autoAllocateChunkSize.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* reason */ js.Any) => cancel(t0).runNow()))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.ReadableByteStreamController) => pull(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.ReadableByteStreamController) => start(t0).runNow()))
    __obj.asInstanceOf[UnderlyingByteSource]
  }
}

