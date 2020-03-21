package typingsJapgolly.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SecurableObject")
@js.native
class SecurableObject () extends ClientObject {
  def breakRoleInheritance(copyRoleAssignments: Boolean, clearSubscopes: Boolean): Unit = js.native
  def get_firstUniqueAncestorSecurableObject(): SecurableObject = js.native
  def get_hasUniqueRoleAssignments(): Boolean = js.native
  def get_roleAssignments(): RoleAssignmentCollection = js.native
  def resetRoleInheritance(): Unit = js.native
}

