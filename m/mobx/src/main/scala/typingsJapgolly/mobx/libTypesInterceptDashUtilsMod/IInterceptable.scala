package typingsJapgolly.mobx.libTypesInterceptDashUtilsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInterceptable[T] extends js.Object {
  var interceptors: js.UndefOr[js.Array[IInterceptor[T]]] = js.undefined
  def intercept(handler: IInterceptor[T]): Lambda
}

object IInterceptable {
  @scala.inline
  def apply[T](intercept: IInterceptor[T] => CallbackTo[Lambda], interceptors: js.Array[IInterceptor[T]] = null): IInterceptable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("intercept")(js.Any.fromFunction1((t0: typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptor[T]) => intercept(t0).runNow()))
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInterceptable[T]]
  }
}

