package typingsJapgolly.backbone.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchOptions
  extends CollectionSetOptions
     with PersistenceOptions
     with Parseable {
  var reset: js.UndefOr[Boolean] = js.undefined
}

object CollectionFetchOptions {
  @scala.inline
  def apply(
    add: js.UndefOr[Boolean] = js.undefined,
    beforeSend: /* jqxhr */ JQueryXHR => Callback = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Callback = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    parse: js.Any = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    url: String = null
  ): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1((t0: /* jqxhr */ typingsJapgolly.jquery.JQueryXHR) => beforeSend(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* modelOrCollection */ js.UndefOr[js.Any], t1: /* jqxhr */ js.UndefOr[typingsJapgolly.jquery.JQueryXHR], t2: /* options */ js.UndefOr[js.Any]) => error(t0, t1, t2).runNow()))
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* modelOrCollection */ js.UndefOr[js.Any], t1: /* response */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => success(t0, t1, t2).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFetchOptions]
  }
}

