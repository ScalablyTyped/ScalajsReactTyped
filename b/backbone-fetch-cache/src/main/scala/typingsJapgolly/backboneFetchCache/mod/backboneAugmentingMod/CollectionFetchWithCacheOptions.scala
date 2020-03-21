package typingsJapgolly.backboneFetchCache.mod.backboneAugmentingMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchWithCacheOptions extends ModelFetchWithCacheOptions {
  @JSName("prefillSuccess")
  var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ js.Any, Unit]] = js.undefined
}

object CollectionFetchWithCacheOptions {
  @scala.inline
  def apply(
    beforeSend: /* jqxhr */ JQueryXHR => Callback = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Callback = null,
    expires: Int | Double = null,
    parse: js.Any = null,
    prefill: js.UndefOr[Boolean] = js.undefined,
    prefillExpires: Int | Double = null,
    prefillSuccess: /* self */ js.Any => Callback = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    url: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): CollectionFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1((t0: /* jqxhr */ typingsJapgolly.jquery.JQueryXHR) => beforeSend(t0).runNow()))
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* modelOrCollection */ js.UndefOr[js.Any], t1: /* jqxhr */ js.UndefOr[typingsJapgolly.jquery.JQueryXHR], t2: /* options */ js.UndefOr[js.Any]) => error(t0, t1, t2).runNow()))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(prefill)) __obj.updateDynamic("prefill")(prefill.asInstanceOf[js.Any])
    if (prefillExpires != null) __obj.updateDynamic("prefillExpires")(prefillExpires.asInstanceOf[js.Any])
    if (prefillSuccess != null) __obj.updateDynamic("prefillSuccess")(js.Any.fromFunction1((t0: /* self */ js.Any) => prefillSuccess(t0).runNow()))
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* modelOrCollection */ js.UndefOr[js.Any], t1: /* response */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => success(t0, t1, t2).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFetchWithCacheOptions]
  }
}

