package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononAjaxObject extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: String
  var error: js.UndefOr[
    js.Function3[/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: String
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
  def success(res: js.Any, xhr: XMLHttpRequest): Unit
}

object PhononAjaxObject {
  @scala.inline
  def apply(
    dataType: String,
    method: String,
    success: (js.Any, XMLHttpRequest) => Callback,
    url: String,
    contentType: String = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    error: (/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest) => Callback = null,
    headers: js.Any = null,
    timeout: Int | Double = null
  ): PhononAjaxObject = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: js.Any, t1: org.scalajs.dom.raw.XMLHttpRequest) => success(t0, t1).runNow()))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* res */ js.Any, t1: /* flagError */ typingsJapgolly.phonon.Phonon_.PhononAjaxErrorFlag, t2: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => error(t0, t1, t2).runNow()))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononAjaxObject]
  }
}

