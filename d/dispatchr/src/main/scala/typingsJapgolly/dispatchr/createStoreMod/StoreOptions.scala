package typingsJapgolly.dispatchr.createStoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var dehydrate: js.UndefOr[js.Function0[_]] = js.undefined
  var handlers: StringDictionary[String]
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mixins: js.UndefOr[js.Array[js.Object]] = js.undefined
  var rehydrate: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
  var statics: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var storeName: String
}

object StoreOptions {
  @scala.inline
  def apply(
    handlers: StringDictionary[String],
    storeName: String,
    dehydrate: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    initialize: js.UndefOr[Callback] = js.undefined,
    mixins: js.Array[js.Object] = null,
    rehydrate: /* state */ js.Any => Callback = null,
    statics: StringDictionary[js.Any] = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    dehydrate.foreach(p => __obj.updateDynamic("dehydrate")(p.toJsFn))
    initialize.foreach(p => __obj.updateDynamic("initialize")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (rehydrate != null) __obj.updateDynamic("rehydrate")(js.Any.fromFunction1((t0: /* state */ js.Any) => rehydrate(t0).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

