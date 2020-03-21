package typingsJapgolly.openapiRequestCoercer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestCoercer extends IOpenAPIRequestCoercer {
  var coerceFormData: js.Any
  var coerceHeaders: js.Any
  var coerceParams: js.Any
  var coerceQuery: js.Any
  var enableObjectCoercion: js.Any
  def coerce(request: js.Any): Unit
}

object OpenAPIRequestCoercer {
  @scala.inline
  def apply(
    coerce: js.Any => Callback,
    coerceFormData: js.Any,
    coerceHeaders: js.Any,
    coerceParams: js.Any,
    coerceQuery: js.Any,
    enableObjectCoercion: js.Any
  ): OpenAPIRequestCoercer = {
    val __obj = js.Dynamic.literal(coerceFormData = coerceFormData.asInstanceOf[js.Any], coerceHeaders = coerceHeaders.asInstanceOf[js.Any], coerceParams = coerceParams.asInstanceOf[js.Any], coerceQuery = coerceQuery.asInstanceOf[js.Any], enableObjectCoercion = enableObjectCoercion.asInstanceOf[js.Any])
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: js.Any) => coerce(t0).runNow()))
    __obj.asInstanceOf[OpenAPIRequestCoercer]
  }
}

