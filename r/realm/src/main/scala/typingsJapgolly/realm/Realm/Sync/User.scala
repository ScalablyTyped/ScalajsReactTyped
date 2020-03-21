package typingsJapgolly.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.realm.AnonProvider
import typingsJapgolly.realm.Realm.Configuration
import typingsJapgolly.realm.Realm.PartialConfiguration
import typingsJapgolly.realm.realmStrings.any
import typingsJapgolly.realm.realmStrings.currentUser
import typingsJapgolly.realm.realmStrings.otherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
  */
@JSGlobal("Realm.Sync.User")
@js.native
class User () extends js.Object {
  val identity: String = js.native
  val isAdmin: Boolean = js.native
  val isAdminToken: Boolean = js.native
  val server: String = js.native
  val token: String = js.native
  def acceptPermissionOffer(token: String): js.Promise[String] = js.native
  def applyPermissions(condition: PermissionCondition, realmUrl: String, accessLevel: AccessLevel): js.Promise[Unit] = js.native
  def createConfiguration(): Configuration = js.native
  def createConfiguration(config: PartialConfiguration): Configuration = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_any(recipient: any): js.Promise[js.Array[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_currentUser(recipient: currentUser): js.Promise[js.Array[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_otherUser(recipient: otherUser): js.Promise[js.Array[Permission]] = js.native
  def getPermissionOffers(): js.Promise[js.Array[PermissionOffer]] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: String): js.Promise[Unit] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: PermissionOffer): js.Promise[Unit] = js.native
  def logout(): js.Promise[Unit] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel): js.Promise[String] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel, expiresAt: js.Date): js.Promise[String] = js.native
  def retrieveAccount(provider: String, username: String): js.Promise[Account] = js.native
  def serialize(): SerializedUser | SerializedTokenUser = js.native
}

/* static members */
@JSGlobal("Realm.Sync.User")
@js.native
object User extends js.Object {
  val all: StringDictionary[User] = js.native
  val current: js.UndefOr[User] = js.native
  // Deprecated
  /** @deprecated, to be removed in future versions */
  def adminUser(adminToken: String): User = js.native
  def adminUser(adminToken: String, server: String): User = js.native
  /** @deprecated, to be removed in future versions */
  def authenticate(server: String, provider: String, options: js.Any): js.Promise[User] = js.native
  def completePasswordReset(server: String, resetToken: String, newPassword: String): js.Promise[Unit] = js.native
  def confirmEmail(server: String, confirmationToken: String): js.Promise[Unit] = js.native
  def deserialize(serialized: SerializedTokenUser): User = js.native
  def deserialize(serialized: SerializedUser): User = js.native
  def login(server: String, credentials: AdminCredentials): User = js.native
  def login(server: String, credentials: Credentials): js.Promise[User] = js.native
  /** @deprecated, to be removed in future versions */
  def login(server: String, username: String, password: String): js.Promise[User] = js.native
  /** @deprecated, to be removed in future versions */
  def register(server: String, username: String, password: String): js.Promise[User] = js.native
  /** @deprecated, to be removed in future versions */
  def registerWithProvider(server: String, options: AnonProvider): js.Promise[User] = js.native
  def requestEmailConfirmation(server: String, email: String): js.Promise[Unit] = js.native
  def requestPasswordReset(server: String, email: String): js.Promise[Unit] = js.native
}

