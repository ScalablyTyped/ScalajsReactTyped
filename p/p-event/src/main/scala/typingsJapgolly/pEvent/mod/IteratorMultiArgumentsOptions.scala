package typingsJapgolly.pEvent.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends IteratorOptions[EmittedType] {
  @JSName("multiArgs")
  var multiArgs_IteratorMultiArgumentsOptions: `true`
}

object IteratorMultiArgumentsOptions {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    multiArgs: `true`,
    filter: EmittedType => CallbackTo[Boolean] = null,
    limit: Int | Double = null,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    resolutionEvents: js.Array[String | js.Symbol] = null,
    timeout: Int | Double = null
  ): IteratorMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: EmittedType) => filter(t0).runNow()))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents.asInstanceOf[js.Any])
    if (resolutionEvents != null) __obj.updateDynamic("resolutionEvents")(resolutionEvents.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
  }
}

