package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextArgs extends js.Object {
  var avoidConstraints: Boolean
  var isMultiInject: Boolean
  var key: js.UndefOr[String | Double | js.Symbol] = js.undefined
  var serviceIdentifier: ServiceIdentifier[_]
  var targetType: TargetType
  var value: js.UndefOr[js.Any] = js.undefined
  def contextInterceptor(contexts: Context): Context
}

object NextArgs {
  @scala.inline
  def apply(
    avoidConstraints: Boolean,
    contextInterceptor: Context => CallbackTo[Context],
    isMultiInject: Boolean,
    serviceIdentifier: ServiceIdentifier[_],
    targetType: TargetType,
    key: String | Double | js.Symbol = null,
    value: js.Any = null
  ): NextArgs = {
    val __obj = js.Dynamic.literal(avoidConstraints = avoidConstraints.asInstanceOf[js.Any], isMultiInject = isMultiInject.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.updateDynamic("contextInterceptor")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.Context) => contextInterceptor(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextArgs]
  }
}

