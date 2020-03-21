package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1EmployeeRole")
@js.native
class V1EmployeeRole () extends js.Object {
  /**
    * The time when the employee entity was created, in ISO 8601 format. Is set by Square when the Role is created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The role's unique ID, Can only be set by Square.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If true, employees with this role have all permissions, regardless of the values indicated in permissions.
    */
  var is_owner: js.UndefOr[Boolean] = js.native
  /**
    * The role's merchant-defined name.
    */
  var name: String = js.native
  /**
    * The role's permissions. See [V1EmployeeRolePermissions](#type-v1employeerolepermissions) for possible values
    */
  var permissions: js.Array[String] = js.native
  /**
    * The time when the employee entity was most recently updated, in ISO 8601 format.
    * Is set by Square when the Role updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

