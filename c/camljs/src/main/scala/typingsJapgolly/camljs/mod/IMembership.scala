package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsIn* methods instead. This interface will be removed in the next release */
trait IMembership extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWeb* methods instead */
  var SPWeb: IMembershipSPWeb
  /** DEPRECATED. Please use UserField(...).IsInCurrentUserGroups() instead */
  def CurrentUserGroups(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPGroup() instead */
  def SPGroup(groupId: Double): IExpression
}

object IMembership {
  @scala.inline
  def apply(
    CurrentUserGroups: CallbackTo[IExpression],
    SPGroup: Double => CallbackTo[IExpression],
    SPWeb: IMembershipSPWeb
  ): IMembership = {
    val __obj = js.Dynamic.literal(SPWeb = SPWeb.asInstanceOf[js.Any])
    __obj.updateDynamic("CurrentUserGroups")(CurrentUserGroups.toJsFn)
    __obj.updateDynamic("SPGroup")(js.Any.fromFunction1((t0: scala.Double) => SPGroup(t0).runNow()))
    __obj.asInstanceOf[IMembership]
  }
}

