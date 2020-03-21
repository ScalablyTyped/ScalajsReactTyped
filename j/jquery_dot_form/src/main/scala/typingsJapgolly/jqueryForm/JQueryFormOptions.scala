package typingsJapgolly.jqueryForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.jquery.JQuery_.Ajax.CompleteCallback
import typingsJapgolly.jquery.JQuery_.Ajax.ErrorCallback
import typingsJapgolly.jquery.JQuery_.Ajax.StatusCodeCallbacks
import typingsJapgolly.jquery.JQuery_.Ajax.SuccessCallback
import typingsJapgolly.jquery.JQuery_.Ajax.XHRFields
import typingsJapgolly.jquery.JQuery_.AjaxSettings
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

trait JQueryFormOptions
  extends AjaxSettings[js.Any] {
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ JQueryFormOptions, Boolean]] = js.undefined
  var beforeSubmit: js.UndefOr[
    js.Function3[
      /* formData */ js.Array[_], 
      /* $form */ JQuery, 
      /* options */ JQueryFormOptions, 
      Boolean
    ]
  ] = js.undefined
  var clearForm: js.UndefOr[Boolean] = js.undefined
  var forceSync: js.UndefOr[Boolean] = js.undefined
  var iframe: js.UndefOr[Boolean] = js.undefined
  var iframeSrc: js.UndefOr[String] = js.undefined
  var iframeTarget: js.UndefOr[js.Any] = js.undefined
  var replaceTarget: js.UndefOr[Boolean] = js.undefined
  var resetForm: js.UndefOr[Boolean] = js.undefined
  var semantic: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ ProgressEvent, 
      /* position */ Double, 
      /* total */ Double, 
      /* percentComplete */ Double, 
      Unit
    ]
  ] = js.undefined
}

object JQueryFormOptions {
  @scala.inline
  def apply(
    accepts: PlainObject[String] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    beforeSend: js.ThisFunction2[js.Any, /* jqXHR */ jqXHR[_], JQueryFormOptions, `false` | Unit] = null,
    beforeSerialize: (/* $form */ JQuery, /* options */ JQueryFormOptions) => CallbackTo[Boolean] = null,
    beforeSubmit: (/* formData */ js.Array[js.Any], /* $form */ JQuery, /* options */ JQueryFormOptions) => CallbackTo[Boolean] = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    clearForm: js.UndefOr[Boolean] = js.undefined,
    complete: TypeOrArray[CompleteCallback[js.Any]] = null,
    contentType: String | `false` = null,
    contents: PlainObject[js.RegExp] = null,
    context: js.Any = null,
    converters: PlainObject[(js.Function1[/* value */ _, _]) | `true`] = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: PlainObject[_] | String = null,
    dataFilter: (/* data */ String, /* type */ String) => CallbackTo[js.Any] = null,
    dataType: xml | html | script | json | jsonp | text | String = null,
    enctype: `applicationSlashx-www-form-urlencoded` | `multipartSlashform-data` | textSlashplain = null,
    error: TypeOrArray[ErrorCallback[js.Any]] = null,
    forceSync: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    headers: PlainObject[js.UndefOr[String | Null]] = null,
    ifModified: js.UndefOr[Boolean] = js.undefined,
    iframe: js.UndefOr[Boolean] = js.undefined,
    iframeSrc: String = null,
    iframeTarget: js.Any = null,
    isLocal: js.UndefOr[Boolean] = js.undefined,
    jsonp: String | `false` = null,
    jsonpCallback: String | (js.ThisFunction0[js.Any, String]) = null,
    method: String = null,
    mimeType: String = null,
    password: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    replaceTarget: js.UndefOr[Boolean] = js.undefined,
    resetForm: js.UndefOr[Boolean] = js.undefined,
    scriptCharset: String = null,
    semantic: js.UndefOr[Boolean] = js.undefined,
    statusCode: StatusCodeCallbacks[js.Any] = null,
    success: TypeOrArray[SuccessCallback[js.Any]] = null,
    target: js.Any = null,
    timeout: Int | Double = null,
    traditional: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    uploadProgress: (/* event */ ProgressEvent, /* position */ Double, /* total */ Double, /* percentComplete */ Double) => Callback = null,
    url: String = null,
    username: String = null,
    xhr: js.UndefOr[CallbackTo[XMLHttpRequest]] = js.undefined,
    xhrFields: XHRFields = null
  ): JQueryFormOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (beforeSerialize != null) __obj.updateDynamic("beforeSerialize")(js.Any.fromFunction2((t0: /* $form */ typingsJapgolly.jqueryForm.JQuery, t1: /* options */ typingsJapgolly.jqueryForm.JQueryFormOptions) => beforeSerialize(t0, t1).runNow()))
    if (beforeSubmit != null) __obj.updateDynamic("beforeSubmit")(js.Any.fromFunction3((t0: /* formData */ js.Array[js.Any], t1: /* $form */ typingsJapgolly.jqueryForm.JQuery, t2: /* options */ typingsJapgolly.jqueryForm.JQueryFormOptions) => beforeSubmit(t0, t1, t2).runNow()))
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(clearForm)) __obj.updateDynamic("clearForm")(clearForm.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (converters != null) __obj.updateDynamic("converters")(converters.asInstanceOf[js.Any])
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(js.Any.fromFunction2((t0: /* data */ java.lang.String, t1: /* type */ java.lang.String) => dataFilter(t0, t1).runNow()))
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSync)) __obj.updateDynamic("forceSync")(forceSync.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(ifModified)) __obj.updateDynamic("ifModified")(ifModified.asInstanceOf[js.Any])
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (iframeSrc != null) __obj.updateDynamic("iframeSrc")(iframeSrc.asInstanceOf[js.Any])
    if (iframeTarget != null) __obj.updateDynamic("iframeTarget")(iframeTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(isLocal)) __obj.updateDynamic("isLocal")(isLocal.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceTarget)) __obj.updateDynamic("replaceTarget")(replaceTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(resetForm)) __obj.updateDynamic("resetForm")(resetForm.asInstanceOf[js.Any])
    if (scriptCharset != null) __obj.updateDynamic("scriptCharset")(scriptCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(semantic)) __obj.updateDynamic("semantic")(semantic.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(traditional)) __obj.updateDynamic("traditional")(traditional.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadProgress != null) __obj.updateDynamic("uploadProgress")(js.Any.fromFunction4((t0: /* event */ org.scalajs.dom.raw.ProgressEvent, t1: /* position */ scala.Double, t2: /* total */ scala.Double, t3: /* percentComplete */ scala.Double) => uploadProgress(t0, t1, t2, t3).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    xhr.foreach(p => __obj.updateDynamic("xhr")(p.toJsFn))
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFormOptions]
  }
}

