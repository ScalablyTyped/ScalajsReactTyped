package typingsJapgolly.systemjs.System

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declare extends js.Object {
  var execute: js.UndefOr[js.Function0[_]] = js.undefined
  var setters: js.UndefOr[js.Array[SetterFn]] = js.undefined
}

object Declare {
  @scala.inline
  def apply(execute: js.UndefOr[CallbackTo[js.Any]] = js.undefined, setters: js.Array[SetterFn] = null): Declare = {
    val __obj = js.Dynamic.literal()
    execute.foreach(p => __obj.updateDynamic("execute")(p.toJsFn))
    if (setters != null) __obj.updateDynamic("setters")(setters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declare]
  }
}

