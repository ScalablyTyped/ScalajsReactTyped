package typingsJapgolly.ngTable.interceptorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ngTable.ngTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterceptor[T] extends js.Object {
  var response: js.UndefOr[js.Function2[/* data */ js.Any, /* params */ NgTableParams[T], _]] = js.undefined
  var responseError: js.UndefOr[js.Function2[/* reason */ js.Any, /* params */ NgTableParams[T], _]] = js.undefined
}

object IInterceptor {
  @scala.inline
  def apply[T](
    response: (/* data */ js.Any, /* params */ NgTableParams[T]) => CallbackTo[js.Any] = null,
    responseError: (/* reason */ js.Any, /* params */ NgTableParams[T]) => CallbackTo[js.Any] = null
  ): IInterceptor[T] = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* params */ typingsJapgolly.ngTable.ngTableParamsMod.NgTableParams[T]) => response(t0, t1).runNow()))
    if (responseError != null) __obj.updateDynamic("responseError")(js.Any.fromFunction2((t0: /* reason */ js.Any, t1: /* params */ typingsJapgolly.ngTable.ngTableParamsMod.NgTableParams[T]) => responseError(t0, t1).runNow()))
    __obj.asInstanceOf[IInterceptor[T]]
  }
}

