package typingsJapgolly.msgpack.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackUploadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ XMLHttpRequest, 
      /* option */ MsgPackUploadOption, 
      /* result */ MsgPackCallbackResult, 
      Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ MsgPackUploadOption, Unit]] = js.undefined
  /**
    * string or ByteArray
    */
  var data: js.Any
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}

object MsgPackUploadOption {
  @scala.inline
  def apply(
    data: js.Any,
    after: (/* xhr */ XMLHttpRequest, /* option */ MsgPackUploadOption, /* result */ MsgPackCallbackResult) => Callback = null,
    before: (/* xhr */ XMLHttpRequest, /* option */ MsgPackUploadOption) => Callback = null,
    timeout: Int | Double = null,
    worker: js.UndefOr[Boolean] = js.undefined
  ): MsgPackUploadOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3((t0: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t1: /* option */ typingsJapgolly.msgpack.mod.MsgPackUploadOption, t2: /* result */ typingsJapgolly.msgpack.mod.MsgPackCallbackResult) => after(t0, t1, t2).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2((t0: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t1: /* option */ typingsJapgolly.msgpack.mod.MsgPackUploadOption) => before(t0, t1).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgPackUploadOption]
  }
}

