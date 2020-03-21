package typingsJapgolly.angularPermission.mod.permission

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var permissionName: String
  var validationFunction: js.UndefOr[PermissionValidationFunction] = js.undefined
  def validatePermission(): IPromise[_]
}

object Permission {
  @scala.inline
  def apply(
    permissionName: String,
    validatePermission: CallbackTo[IPromise[js.Any]],
    validationFunction: (/* permissionName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => CallbackTo[Boolean | IPromise[js.Any]] = null
  ): Permission = {
    val __obj = js.Dynamic.literal(permissionName = permissionName.asInstanceOf[js.Any])
    __obj.updateDynamic("validatePermission")(validatePermission.toJsFn)
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(js.Any.fromFunction2((t0: /* permissionName */ js.UndefOr[java.lang.String], t1: /* transitionProperties */ js.UndefOr[typingsJapgolly.angularPermission.mod.permission.TransitionProperties]) => validationFunction(t0, t1).runNow()))
    __obj.asInstanceOf[Permission]
  }
}

