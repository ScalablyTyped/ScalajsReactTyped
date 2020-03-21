package typingsJapgolly.apostrophe.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.apostrophe.AnonForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposType extends js.Object {
  var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, Unit]] = js.undefined
  var converters: AnonForm
  var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, Unit]] = js.undefined
  var name: String
  def index(value: js.Any, field: js.Any, texts: js.Any): Unit
}

object AposType {
  @scala.inline
  def apply(
    converters: AnonForm,
    index: (js.Any, js.Any, js.Any) => Callback,
    name: String,
    bless: (/* req */ js.Any, /* field */ js.Any) => Callback = null,
    empty: (/* field */ js.Any, /* value */ js.Any) => Callback = null
  ): AposType = {
    val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("index")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => index(t0, t1, t2).runNow()))
    if (bless != null) __obj.updateDynamic("bless")(js.Any.fromFunction2((t0: /* req */ js.Any, t1: /* field */ js.Any) => bless(t0, t1).runNow()))
    if (empty != null) __obj.updateDynamic("empty")(js.Any.fromFunction2((t0: /* field */ js.Any, t1: /* value */ js.Any) => empty(t0, t1).runNow()))
    __obj.asInstanceOf[AposType]
  }
}

