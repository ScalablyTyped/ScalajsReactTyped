package typingsJapgolly.pEvent.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultiArgumentsOptions: `true`
}

object MultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    multiArgs: `true`,
    filter: EmittedType => CallbackTo[Boolean] = null,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    timeout: Int | Double = null
  ): MultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: EmittedType) => filter(t0).runNow()))
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiArgumentsOptions[EmittedType]]
  }
}

