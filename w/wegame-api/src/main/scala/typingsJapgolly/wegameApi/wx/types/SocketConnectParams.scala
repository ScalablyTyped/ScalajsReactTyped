package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConnectParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  var method: js.UndefOr[RequestMethod] = js.undefined
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  var url: String
}

object SocketConnectParams {
  @scala.inline
  def apply(
    url: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    header: StringDictionary[String] = null,
    method: RequestMethod = null,
    protocols: js.Array[String] = null,
    success: js.UndefOr[Callback] = js.undefined
  ): SocketConnectParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SocketConnectParams]
  }
}

