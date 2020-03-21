package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonFields
import typingsJapgolly.gapiClientPartners.AnonKey
import typingsJapgolly.gapiClientPartners.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: AnonKey): Request_[CompanyRelation]
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: AnonKey): Request_[js.Object]
  /** Gets a user. */
  def get(request: AnonOauthtoken): Request_[User]
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: AnonFields): Request_[UserProfile]
}

object UsersResource {
  @scala.inline
  def apply(
    createCompanyRelation: AnonKey => CallbackTo[Request_[CompanyRelation]],
    deleteCompanyRelation: AnonKey => CallbackTo[Request_[js.Object]],
    get: AnonOauthtoken => CallbackTo[Request_[User]],
    updateProfile: AnonFields => CallbackTo[Request_[UserProfile]]
  ): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCompanyRelation")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonKey) => createCompanyRelation(t0).runNow()))
    __obj.updateDynamic("deleteCompanyRelation")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonKey) => deleteCompanyRelation(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonOauthtoken) => get(t0).runNow()))
    __obj.updateDynamic("updateProfile")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonFields) => updateProfile(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

