package typingsJapgolly.backbone.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelDestroyOptions
  extends Waitable
     with PersistenceOptions

object ModelDestroyOptions {
  @scala.inline
  def apply(
    beforeSend: /* jqxhr */ JQueryXHR => Callback = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Callback = null,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Callback = null,
    url: String = null,
    wait: js.UndefOr[Boolean] = js.undefined
  ): ModelDestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1((t0: /* jqxhr */ typingsJapgolly.jquery.JQueryXHR) => beforeSend(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* modelOrCollection */ js.UndefOr[js.Any], t1: /* jqxhr */ js.UndefOr[typingsJapgolly.jquery.JQueryXHR], t2: /* options */ js.UndefOr[js.Any]) => error(t0, t1, t2).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* modelOrCollection */ js.UndefOr[js.Any], t1: /* response */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[js.Any]) => success(t0, t1, t2).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelDestroyOptions]
  }
}

