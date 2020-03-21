package typingsJapgolly.web3CoreMethod.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var abiCoder: js.UndefOr[js.Any] = js.undefined
  var call: String
  var defaultAccount: js.UndefOr[String | Null] = js.undefined
  var defaultBlock: js.UndefOr[String] = js.undefined
  var extraFormatters: js.UndefOr[js.Any] = js.undefined
  var inputFormatter: js.UndefOr[js.Array[js.Function0[Unit] | Null]] = js.undefined
  var name: String
  var outputFormatter: js.UndefOr[js.Function0[Unit]] = js.undefined
  var params: js.UndefOr[Double] = js.undefined
  var transformPayload: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Method {
  @scala.inline
  def apply(
    call: String,
    name: String,
    abiCoder: js.Any = null,
    defaultAccount: String = null,
    defaultBlock: String = null,
    extraFormatters: js.Any = null,
    inputFormatter: js.Array[js.Function0[Unit] | Null] = null,
    outputFormatter: js.UndefOr[Callback] = js.undefined,
    params: Int | Double = null,
    transformPayload: js.UndefOr[Callback] = js.undefined
  ): Method = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (abiCoder != null) __obj.updateDynamic("abiCoder")(abiCoder.asInstanceOf[js.Any])
    if (defaultAccount != null) __obj.updateDynamic("defaultAccount")(defaultAccount.asInstanceOf[js.Any])
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock.asInstanceOf[js.Any])
    if (extraFormatters != null) __obj.updateDynamic("extraFormatters")(extraFormatters.asInstanceOf[js.Any])
    if (inputFormatter != null) __obj.updateDynamic("inputFormatter")(inputFormatter.asInstanceOf[js.Any])
    outputFormatter.foreach(p => __obj.updateDynamic("outputFormatter")(p.toJsFn))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    transformPayload.foreach(p => __obj.updateDynamic("transformPayload")(p.toJsFn))
    __obj.asInstanceOf[Method]
  }
}

