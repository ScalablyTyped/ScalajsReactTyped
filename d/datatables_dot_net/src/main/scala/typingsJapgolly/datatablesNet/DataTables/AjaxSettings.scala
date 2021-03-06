package typingsJapgolly.datatablesNet.DataTables

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.jquery.JQuery_.Ajax.CompleteCallback
import typingsJapgolly.jquery.JQuery_.Ajax.ErrorCallback
import typingsJapgolly.jquery.JQuery_.Ajax.StatusCodeCallbacks
import typingsJapgolly.jquery.JQuery_.Ajax.SuccessCallback
import typingsJapgolly.jquery.JQuery_.Ajax.XHRFields
import typingsJapgolly.jquery.JQuery_.PlainObject
import typingsJapgolly.jquery.JQuery_.TypeOrArray
import typingsJapgolly.jquery.JQuery_.jqXHR
import typingsJapgolly.jquery.jqueryBooleans.`false`
import typingsJapgolly.jquery.jqueryBooleans.`true`
import typingsJapgolly.jquery.jqueryStrings.`applicationSlashx-www-form-urlencoded`
import typingsJapgolly.jquery.jqueryStrings.`multipartSlashform-data`
import typingsJapgolly.jquery.jqueryStrings.html
import typingsJapgolly.jquery.jqueryStrings.json
import typingsJapgolly.jquery.jqueryStrings.jsonp
import typingsJapgolly.jquery.jqueryStrings.script
import typingsJapgolly.jquery.jqueryStrings.text
import typingsJapgolly.jquery.jqueryStrings.textSlashplain
import typingsJapgolly.jquery.jqueryStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings
  extends typingsJapgolly.jquery.JQuery_.AjaxSettings[js.Any] {
  /**
    * Data property or manipulation method for table data. Since: 1.10
    */
  var dataSrc: js.UndefOr[String | (js.Function1[/* data */ js.Any, js.Array[_]])] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], AjaxSettings, `false` | Unit] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    complete: TypeOrArray[CompleteCallback[js.Any]] = null,
    contentType: String | `false` = null,
    contents: PlainObject[js.RegExp] = null,
    context: js.Any = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => CallbackTo[js.Any] = null,
    dataSrc: String | (js.Function1[/* data */ js.Any, js.Array[_]]) = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    enctype: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null,
    username: String = null,
    xhr: js.UndefOr[CallbackTo[XMLHttpRequest]] = js.undefined,
    xhrFields: XHRFields = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (converters != null) __obj.updateDynamic("converters")(converters.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2((t0: /* data */ java.lang.String, t1: /* type */ java.lang.String) => dataFilter(t0, t1).runNow()))
    if (dataSrc != null) __obj.updateDynamic("dataSrc")(dataSrc.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.asInstanceOf[js.Any])
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    xhr.foreach(p => __obj.updateDynamic("xhr")(p.toJsFn))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettings]
  }
}

