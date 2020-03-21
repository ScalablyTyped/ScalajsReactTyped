package typingsJapgolly.knockoutMapping.mod._Global_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPropertyMappingCallBack extends js.Object {
  var create: js.UndefOr[js.Function1[/* options */ KnockoutMappingCreateOptions, Unit]] = js.undefined
  var key: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var update: js.UndefOr[js.Function1[/* options */ KnockoutMappingUpdateOptions, Unit]] = js.undefined
}

object KnockoutPropertyMappingCallBack {
  @scala.inline
  def apply(
    create: /* options */ KnockoutMappingCreateOptions => Callback = null,
    key: /* data */ js.Any => CallbackTo[js.Any] = null,
    update: /* options */ KnockoutMappingUpdateOptions => Callback = null
  ): KnockoutPropertyMappingCallBack = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.knockoutMapping.mod._Global_.KnockoutMappingCreateOptions) => create(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction1((t0: /* data */ js.Any) => key(t0).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.knockoutMapping.mod._Global_.KnockoutMappingUpdateOptions) => update(t0).runNow()))
    __obj.asInstanceOf[KnockoutPropertyMappingCallBack]
  }
}

