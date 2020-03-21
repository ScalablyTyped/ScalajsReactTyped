package typingsJapgolly.angularPermission.mod.permission

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var permissionNames: js.Array[String]
  var roleName: String
  var validationFunction: js.UndefOr[RoleValidationFunction] = js.undefined
  def validateRole(): IPromise[_]
}

object Role {
  @scala.inline
  def apply(
    permissionNames: js.Array[String],
    roleName: String,
    validateRole: CallbackTo[IPromise[js.Any]],
    validationFunction: (/* roleName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => CallbackTo[Boolean | IPromise[js.Any]] = null
  ): Role = {
    val __obj = js.Dynamic.literal(permissionNames = permissionNames.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
    __obj.updateDynamic("validateRole")(validateRole.toJsFn)
    if (validationFunction != null) __obj.updateDynamic("validationFunction")(js.Any.fromFunction2((t0: /* roleName */ js.UndefOr[java.lang.String], t1: /* transitionProperties */ js.UndefOr[typingsJapgolly.angularPermission.mod.permission.TransitionProperties]) => validationFunction(t0, t1).runNow()))
    __obj.asInstanceOf[Role]
  }
}

