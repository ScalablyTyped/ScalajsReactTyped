package typingsJapgolly.prompts.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onCancel: js.UndefOr[js.Function2[/* prompt */ PromptObject[String], /* answers */ js.Any, Unit]] = js.undefined
  var onSubmit: js.UndefOr[
    js.Function3[
      /* prompt */ PromptObject[String], 
      /* answer */ js.Any, 
      /* answers */ js.Array[_], 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onCancel: (/* prompt */ PromptObject[String], /* answers */ js.Any) => Callback = null,
    onSubmit: (/* prompt */ PromptObject[String], /* answer */ js.Any, /* answers */ js.Array[js.Any]) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2((t0: /* prompt */ typingsJapgolly.prompts.mod.PromptObject[java.lang.String], t1: /* answers */ js.Any) => onCancel(t0, t1).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction3((t0: /* prompt */ typingsJapgolly.prompts.mod.PromptObject[java.lang.String], t1: /* answer */ js.Any, t2: /* answers */ js.Array[js.Any]) => onSubmit(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

