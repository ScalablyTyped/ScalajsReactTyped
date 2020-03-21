package typingsJapgolly.openapiFramework.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkVisitor extends js.Object {
  var visitApi: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkAPIContext, Unit]] = js.undefined
  var visitOperation: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkOperationContext, Unit]] = js.undefined
  var visitPath: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkPathContext, Unit]] = js.undefined
}

object OpenAPIFrameworkVisitor {
  @scala.inline
  def apply(
    visitApi: /* context */ OpenAPIFrameworkAPIContext => Callback = null,
    visitOperation: /* context */ OpenAPIFrameworkOperationContext => Callback = null,
    visitPath: /* context */ OpenAPIFrameworkPathContext => Callback = null
  ): OpenAPIFrameworkVisitor = {
    val __obj = js.Dynamic.literal()
    if (visitApi != null) __obj.updateDynamic("visitApi")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.openapiFramework.typesMod.OpenAPIFrameworkAPIContext) => visitApi(t0).runNow()))
    if (visitOperation != null) __obj.updateDynamic("visitOperation")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.openapiFramework.typesMod.OpenAPIFrameworkOperationContext) => visitOperation(t0).runNow()))
    if (visitPath != null) __obj.updateDynamic("visitPath")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.openapiFramework.typesMod.OpenAPIFrameworkPathContext) => visitPath(t0).runNow()))
    __obj.asInstanceOf[OpenAPIFrameworkVisitor]
  }
}

