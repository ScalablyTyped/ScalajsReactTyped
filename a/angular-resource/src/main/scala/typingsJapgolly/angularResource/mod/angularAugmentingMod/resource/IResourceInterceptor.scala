package typingsJapgolly.angularResource.mod.angularAugmentingMod.resource

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceInterceptor extends js.Object {
  var response: js.UndefOr[js.Function1[/* response */ IResourceResponse, _]] = js.undefined
  var responseError: js.UndefOr[js.Function1[/* rejection */ js.Any, _]] = js.undefined
}

object IResourceInterceptor {
  @scala.inline
  def apply(
    response: /* response */ IResourceResponse => CallbackTo[js.Any] = null,
    responseError: /* rejection */ js.Any => CallbackTo[js.Any] = null
  ): IResourceInterceptor = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.angularResource.mod.angularAugmentingMod.resource.IResourceResponse) => response(t0).runNow()))
    if (responseError != null) __obj.updateDynamic("responseError")(js.Any.fromFunction1((t0: /* rejection */ js.Any) => responseError(t0).runNow()))
    __obj.asInstanceOf[IResourceInterceptor]
  }
}

