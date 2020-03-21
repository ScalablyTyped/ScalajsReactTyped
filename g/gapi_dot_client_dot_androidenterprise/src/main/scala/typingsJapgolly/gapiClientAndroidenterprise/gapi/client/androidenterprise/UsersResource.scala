package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonEmail
import typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId
import typingsJapgolly.gapiClientAndroidenterprise.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deleted an EMM-managed user. */
  def delete(request: AnonEnterpriseId): Request_[Unit]
  /**
    * Generates an authentication token which the device policy client can use to provision the given EMM-managed user account on a device. The generated
    * token is single-use and expires after a few minutes.
    *
    * This call only works with EMM-managed accounts.
    */
  def generateAuthenticationToken(request: AnonEnterpriseId): Request_[AuthenticationToken]
  /**
    * Generates a token (activation code) to allow this user to configure their managed account in the Android Setup Wizard. Revokes any previously generated
    * token.
    *
    * This call only works with Google managed accounts.
    */
  def generateToken(request: AnonEnterpriseId): Request_[UserToken]
  /** Retrieves a user's details. */
  def get(request: AnonEnterpriseId): Request_[User]
  /** Retrieves the set of products a user is entitled to access. */
  def getAvailableProductSet(request: AnonEnterpriseId): Request_[ProductSet]
  /**
    * Creates a new EMM-managed user.
    *
    * The Users resource passed in the body of the request should include an accountIdentifier and an accountType.
    * If a corresponding user already exists with the same account identifier, the user will be updated with the resource. In this case only the displayName
    * field can be changed.
    */
  def insert(request: AnonKey): Request_[User]
  /**
    * Looks up a user by primary email address. This is only supported for Google-managed users. Lookup of the id is not needed for EMM-managed users because
    * the id is already returned in the result of the Users.insert call.
    */
  def list(request: AnonEmail): Request_[UsersListResponse]
  /**
    * Updates the details of an EMM-managed user.
    *
    * Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the
    * displayName field can be changed. Other fields must either be unset or have the currently active value. This method supports patch semantics.
    */
  def patch(request: AnonEnterpriseId): Request_[User]
  /** Revokes a previously generated token (activation code) for the user. */
  def revokeToken(request: AnonEnterpriseId): Request_[Unit]
  /**
    * Modifies the set of products that a user is entitled to access (referred to as whitelisted products). Only products that are approved or products that
    * were previously approved (products with revoked approval) can be whitelisted.
    */
  def setAvailableProductSet(request: AnonEnterpriseId): Request_[ProductSet]
  /**
    * Updates the details of an EMM-managed user.
    *
    * Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the
    * displayName field can be changed. Other fields must either be unset or have the currently active value.
    */
  def update(request: AnonEnterpriseId): Request_[User]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: AnonEnterpriseId => CallbackTo[Request_[Unit]],
    generateAuthenticationToken: AnonEnterpriseId => CallbackTo[Request_[AuthenticationToken]],
    generateToken: AnonEnterpriseId => CallbackTo[Request_[UserToken]],
    get: AnonEnterpriseId => CallbackTo[Request_[User]],
    getAvailableProductSet: AnonEnterpriseId => CallbackTo[Request_[ProductSet]],
    insert: AnonKey => CallbackTo[Request_[User]],
    list: AnonEmail => CallbackTo[Request_[UsersListResponse]],
    patch: AnonEnterpriseId => CallbackTo[Request_[User]],
    revokeToken: AnonEnterpriseId => CallbackTo[Request_[Unit]],
    setAvailableProductSet: AnonEnterpriseId => CallbackTo[Request_[ProductSet]],
    update: AnonEnterpriseId => CallbackTo[Request_[User]]
  ): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => delete(t0).runNow()))
    __obj.updateDynamic("generateAuthenticationToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => generateAuthenticationToken(t0).runNow()))
    __obj.updateDynamic("generateToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => generateToken(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => get(t0).runNow()))
    __obj.updateDynamic("getAvailableProductSet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => getAvailableProductSet(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEmail) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => patch(t0).runNow()))
    __obj.updateDynamic("revokeToken")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => revokeToken(t0).runNow()))
    __obj.updateDynamic("setAvailableProductSet")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => setAvailableProductSet(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => update(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

