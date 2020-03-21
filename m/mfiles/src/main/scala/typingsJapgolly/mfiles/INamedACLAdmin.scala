package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedACLAdmin extends js.Object {
  var AccessControlListForNamedACL: IAccessControlList
  var NamedACL: INamedACL
  var SemanticAliases: ISemanticAliases
  def Clone(): INamedACLAdmin
}

object INamedACLAdmin {
  @scala.inline
  def apply(
    AccessControlListForNamedACL: IAccessControlList,
    Clone: CallbackTo[INamedACLAdmin],
    NamedACL: INamedACL,
    SemanticAliases: ISemanticAliases
  ): INamedACLAdmin = {
    val __obj = js.Dynamic.literal(AccessControlListForNamedACL = AccessControlListForNamedACL.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[INamedACLAdmin]
  }
}

