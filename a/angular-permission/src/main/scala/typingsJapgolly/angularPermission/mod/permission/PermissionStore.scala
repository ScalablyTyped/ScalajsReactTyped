package typingsJapgolly.angularPermission.mod.permission

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionStore extends js.Object {
  /**
    * Removes all permissions
    * @method
    */
  def clearStore(): Unit
  /**
    * Allows to define set of permissionNames with shared validation function on application configuration
    * @method
    * @throws {TypeError}
    *
    * @param permissionNames {Array} Set of permission names
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def defineManyPermissions(permissionNames: js.Array[String], validationFunction: PermissionValidationFunction): Unit
  /**
    * Allows to define permission on application configuration
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def definePermission(permissionName: String, validationFunction: PermissionValidationFunction): Unit
  /**
    * Returns permission by it's name
    * @method
    *
    * @returns {permission.Permission} Permissions definition object
    */
  def getPermissionDefinition(permissionName: String): Permission
  /**
    * Returns all permissions
    * @method
    *
    * @returns {Object} Permissions collection
    */
  def getStore(): StringDictionary[Permission]
  /**
    * Checks if permission exists
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @returns {Boolean}
    */
  def hasPermissionDefinition(permissionName: String): Boolean
  /**
    * Deletes permission
    * @method
    *
    * @param permissionName {String} Name of defined permission
    */
  def removePermissionDefinition(permissionName: String): Unit
}

object PermissionStore {
  @scala.inline
  def apply(
    clearStore: Callback,
    defineManyPermissions: (js.Array[String], PermissionValidationFunction) => Callback,
    definePermission: (String, PermissionValidationFunction) => Callback,
    getPermissionDefinition: String => CallbackTo[Permission],
    getStore: CallbackTo[StringDictionary[Permission]],
    hasPermissionDefinition: String => CallbackTo[Boolean],
    removePermissionDefinition: String => Callback
  ): PermissionStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearStore")(clearStore.toJsFn)
    __obj.updateDynamic("defineManyPermissions")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: typingsJapgolly.angularPermission.mod.permission.PermissionValidationFunction) => defineManyPermissions(t0, t1).runNow()))
    __obj.updateDynamic("definePermission")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.angularPermission.mod.permission.PermissionValidationFunction) => definePermission(t0, t1).runNow()))
    __obj.updateDynamic("getPermissionDefinition")(js.Any.fromFunction1((t0: java.lang.String) => getPermissionDefinition(t0).runNow()))
    __obj.updateDynamic("getStore")(getStore.toJsFn)
    __obj.updateDynamic("hasPermissionDefinition")(js.Any.fromFunction1((t0: java.lang.String) => hasPermissionDefinition(t0).runNow()))
    __obj.updateDynamic("removePermissionDefinition")(js.Any.fromFunction1((t0: java.lang.String) => removePermissionDefinition(t0).runNow()))
    __obj.asInstanceOf[PermissionStore]
  }
}

