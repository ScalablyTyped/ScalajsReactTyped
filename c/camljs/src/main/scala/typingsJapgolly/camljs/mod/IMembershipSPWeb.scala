package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsInSPWeb* methods instead. This interface will be removed in the next release */
trait IMembershipSPWeb extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWebAllUsers() instead */
  def AllUsers(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPWebGroups() instead */
  def Groups(): IExpression
  /** DEPRECATED. Please use UserField(...).IsInSPWebUsers() instead */
  def Users(): IExpression
}

object IMembershipSPWeb {
  @scala.inline
  def apply(AllUsers: CallbackTo[IExpression], Groups: CallbackTo[IExpression], Users: CallbackTo[IExpression]): IMembershipSPWeb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllUsers")(AllUsers.toJsFn)
    __obj.updateDynamic("Groups")(Groups.toJsFn)
    __obj.updateDynamic("Users")(Users.toJsFn)
    __obj.asInstanceOf[IMembershipSPWeb]
  }
}

