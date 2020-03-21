package typingsJapgolly.hapiNes.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptions extends js.Object {
  var auth: js.UndefOr[Boolean | ServerSubscriptionOptionsAuthOptions] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* path */ String, 
      /* message */ js.Any, 
      /* options */ ServerSubscriptionOptionsFilterOptions, 
      /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.undefined
  var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.undefined
}

object ServerSubscriptionOptions {
  @scala.inline
  def apply(
    auth: Boolean | ServerSubscriptionOptionsAuthOptions = null,
    filter: (/* path */ String, /* message */ js.Any, /* options */ ServerSubscriptionOptionsFilterOptions, /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit]) => Callback = null,
    onSubscribe: ServerOnSubscribe = null,
    onUnsubscribe: ServerOnUnSubscribe = null
  ): ServerSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* path */ java.lang.String, t1: /* message */ js.Any, t2: /* options */ typingsJapgolly.hapiNes.mod.ServerSubscriptionOptionsFilterOptions, t3: /* next */ js.Function2[/* isMatch */ scala.Boolean, /* override */ js.UndefOr[js.Any], scala.Unit]) => filter(t0, t1, t2, t3).runNow()))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(onSubscribe.asInstanceOf[js.Any])
    if (onUnsubscribe != null) __obj.updateDynamic("onUnsubscribe")(onUnsubscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptions]
  }
}

