package typingsJapgolly.acl.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  def addRoleParents(role: String, parents: Values): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addRoleParents(role: String, parents: Values, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def allow(aclSets: js.Array[AclSet]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def allow(aclSets: AclSet): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[_] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): typingsJapgolly.bluebird.mod.^[_] = js.native
  def hasRole(userId: Value, role: String): typingsJapgolly.bluebird.mod.^[Boolean] = js.native
  def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ js.Error, /* isInRole */ Boolean, _]): typingsJapgolly.bluebird.mod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): typingsJapgolly.bluebird.mod.^[Boolean] = js.native
  def middleware(): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: Value): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: Value, actions: strings): RequestHandler[ParamsDictionary] = js.native
  def permittedResources(roles: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def permittedResources(roles: strings, permissions: strings, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeResource(resource: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeResource(resource: String, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeRole(role: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeRole(role: String, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings, cb: Callback): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def roleUsers(role: Value): typingsJapgolly.bluebird.mod.^[_] = js.native
  def roleUsers(role: Value, cb: js.Function2[/* err */ js.Error, /* users */ Values, _]): typingsJapgolly.bluebird.mod.^[_] = js.native
  def userRoles(userId: Value): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def userRoles(userId: Value, cb: js.Function2[/* err */ js.Error, /* roles */ js.Array[String], _]): typingsJapgolly.bluebird.mod.^[js.Array[String]] = js.native
  def whatResources(roles: strings): typingsJapgolly.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, cb: AnyCallback): typingsJapgolly.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings): typingsJapgolly.bluebird.mod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings, cb: AnyCallback): typingsJapgolly.bluebird.mod.^[_] = js.native
}

