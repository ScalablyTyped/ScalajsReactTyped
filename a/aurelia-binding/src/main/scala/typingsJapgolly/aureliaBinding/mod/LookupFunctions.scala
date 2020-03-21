package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupFunctions extends js.Object {
  def bindingBehaviors(name: String): js.Any
  def valueConverters(name: String): js.Any
}

object LookupFunctions {
  @scala.inline
  def apply(bindingBehaviors: String => CallbackTo[js.Any], valueConverters: String => CallbackTo[js.Any]): LookupFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindingBehaviors")(js.Any.fromFunction1((t0: java.lang.String) => bindingBehaviors(t0).runNow()))
    __obj.updateDynamic("valueConverters")(js.Any.fromFunction1((t0: java.lang.String) => valueConverters(t0).runNow()))
    __obj.asInstanceOf[LookupFunctions]
  }
}

