package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptMethods extends js.Object {
  var getValue: js.UndefOr[js.Function0[String]] = js.undefined
  var setValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[String], this.type]] = js.undefined
}

object PromptMethods {
  @scala.inline
  def apply(
    getValue: js.UndefOr[CallbackTo[String]] = js.undefined,
    setValue: /* val */ js.UndefOr[String] => CallbackTo[PromptMethods] = null
  ): PromptMethods = {
    val __obj = js.Dynamic.literal()
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[java.lang.String]) => setValue(t0).runNow()))
    __obj.asInstanceOf[PromptMethods]
  }
}

