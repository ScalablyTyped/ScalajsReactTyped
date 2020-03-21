package typingsJapgolly.koaRouter.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterAllowedMethodsOptions extends js.Object {
  /**
    * throw the returned value in place of the default MethodNotAllowed error
    */
  var methodNotAllowed: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * throw the returned value in place of the default NotImplemented error
    */
  var notImplemented: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * throw error instead of setting status and header
    */
  var `throw`: js.UndefOr[Boolean] = js.undefined
}

object IRouterAllowedMethodsOptions {
  @scala.inline
  def apply(
    methodNotAllowed: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    notImplemented: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    `throw`: js.UndefOr[Boolean] = js.undefined
  ): IRouterAllowedMethodsOptions = {
    val __obj = js.Dynamic.literal()
    methodNotAllowed.foreach(p => __obj.updateDynamic("methodNotAllowed")(p.toJsFn))
    notImplemented.foreach(p => __obj.updateDynamic("notImplemented")(p.toJsFn))
    if (!js.isUndefined(`throw`)) __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterAllowedMethodsOptions]
  }
}

