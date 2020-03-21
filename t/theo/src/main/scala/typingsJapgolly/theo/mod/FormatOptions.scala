package typingsJapgolly.theo.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  var options: js.UndefOr[
    js.Function2[
      /* options */ js.Object, 
      /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]], 
      Unit
    ]
  ] = js.undefined
  var `type`: Format
}

object FormatOptions {
  @scala.inline
  def apply(
    `type`: Format,
    options: (/* options */ js.Object, /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => Callback = null
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(js.Any.fromFunction2((t0: /* options */ js.Object, t1: /* transformPropName */ js.UndefOr[js.Function1[/* name */ java.lang.String, java.lang.String]]) => options(t0, t1).runNow()))
    __obj.asInstanceOf[FormatOptions]
  }
}

