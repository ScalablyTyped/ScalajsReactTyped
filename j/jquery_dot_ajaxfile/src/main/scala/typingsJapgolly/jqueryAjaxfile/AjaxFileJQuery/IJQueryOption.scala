package typingsJapgolly.jqueryAjaxfile.AjaxFileJQuery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryAjaxfile.IFileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJQueryOption extends js.Object {
  var complete: js.UndefOr[js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ String, _]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String, _]
  ] = js.undefined
  var files: js.UndefOr[js.Array[IFileData]] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR, _]
  ] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object IJQueryOption {
  @scala.inline
  def apply(
    complete: (/* jqXHR */ IJQueryXHR, /* textStatus */ String) => CallbackTo[js.Any] = null,
    data: js.Any = null,
    dataType: String = null,
    error: (/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String) => CallbackTo[js.Any] = null,
    files: js.Array[IFileData] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    success: (/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR) => CallbackTo[js.Any] = null,
    timeout: Int | Double = null,
    `type`: String = null,
    url: String = null
  ): IJQueryOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2((t0: /* jqXHR */ typingsJapgolly.jqueryAjaxfile.AjaxFileJQuery.IJQueryXHR, t1: /* textStatus */ java.lang.String) => complete(t0, t1).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* jqXHR */ typingsJapgolly.jqueryAjaxfile.AjaxFileJQuery.IJQueryXHR, t1: /* textStatus */ java.lang.String, t2: /* errorThrown */ java.lang.String) => error(t0, t1, t2).runNow()))
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* data */ js.Any, t1: /* textStatus */ java.lang.String, t2: /* jqXHR */ typingsJapgolly.jqueryAjaxfile.AjaxFileJQuery.IJQueryXHR) => success(t0, t1, t2).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJQueryOption]
  }
}

