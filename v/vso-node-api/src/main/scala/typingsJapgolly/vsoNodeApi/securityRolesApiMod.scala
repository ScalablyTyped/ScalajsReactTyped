package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.securityRolesInterfacesMod.RoleAssignment
import typingsJapgolly.vsoNodeApi.securityRolesInterfacesMod.SecurityRole
import typingsJapgolly.vsoNodeApi.securityRolesInterfacesMod.UserRoleAssignmentRef
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/SecurityRolesApi", JSImport.Namespace)
@js.native
object securityRolesApiMod extends js.Object {
  @js.native
  trait ISecurityRolesApi extends ClientApiBase {
    def getRoleAssignments(scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
    def getRoleDefinitions(scopeId: String): js.Promise[js.Array[SecurityRole]] = js.native
    def removeRoleAssignment(scopeId: String, resourceId: String, identityId: String): js.Promise[Unit] = js.native
    def removeRoleAssignments(identityIds: js.Array[String], scopeId: String, resourceId: String): js.Promise[Unit] = js.native
    def setRoleAssignment(roleAssignment: UserRoleAssignmentRef, scopeId: String, resourceId: String, identityId: String): js.Promise[RoleAssignment] = js.native
    def setRoleAssignments(roleAssignments: js.Array[UserRoleAssignmentRef], scopeId: String, resourceId: String): js.Promise[js.Array[RoleAssignment]] = js.native
  }
  
  @js.native
  class SecurityRolesApi protected () extends ISecurityRolesApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

