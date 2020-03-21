package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReadyobject extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var require: js.UndefOr[js.Array[String]] = js.undefined
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IReadyobject {
  @scala.inline
  def apply(
    context: js.Object = null,
    errorCallback: js.UndefOr[Callback] = js.undefined,
    require: js.Array[String] = null,
    successCallback: js.UndefOr[Callback] = js.undefined
  ): IReadyobject = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    errorCallback.foreach(p => __obj.updateDynamic("errorCallback")(p.toJsFn))
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    successCallback.foreach(p => __obj.updateDynamic("successCallback")(p.toJsFn))
    __obj.asInstanceOf[IReadyobject]
  }
}

