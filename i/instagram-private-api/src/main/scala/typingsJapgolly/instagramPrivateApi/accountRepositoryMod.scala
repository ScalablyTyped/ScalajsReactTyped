package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.accountEditProfileOptionsMod.AccountEditProfileOptions
import typingsJapgolly.instagramPrivateApi.accountRepositoryCurrentUserResponseMod.AccountRepositoryCurrentUserResponseRootObject
import typingsJapgolly.instagramPrivateApi.accountRepositoryCurrentUserResponseMod.AccountRepositoryCurrentUserResponseUser
import typingsJapgolly.instagramPrivateApi.accountRepositoryLoginResponseMod.AccountRepositoryLoginResponseLoggedInUser
import typingsJapgolly.instagramPrivateApi.accountTwoFactorLoginOptionsMod.AccountTwoFactorLoginOptions
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import typingsJapgolly.instagramPrivateApi.statusResponseMod.StatusResponse
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/account.repository", JSImport.Namespace)
@js.native
object accountRepositoryMod extends js.Object {
  @js.native
  class AccountRepository () extends Repository {
    var command: js.Any = js.native
    def changePassword(oldPassword: String, newPassword: String): js.Promise[_] = js.native
    def changeProfilePicture(picture: Buffer): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def contactPointPrefill(): js.Promise[_] = js.native
    def contactPointPrefill(usage: String): js.Promise[_] = js.native
    def create(hasUsernamePasswordEmailFirst_name: AnonEmail): js.Promise[_] = js.native
    def currentUser(): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    def editProfile(options: AccountEditProfileOptions): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    def encryptPassword(password: String): AnonEncrypted = js.native
    def getPrefillCandidates(): js.Promise[_] = js.native
    def login(username: String, password: String): js.Promise[AccountRepositoryLoginResponseLoggedInUser] = js.native
    def logout(): js.Promise[StatusResponse] = js.native
    def msisdnHeaderBootstrap(): js.Promise[_] = js.native
    def msisdnHeaderBootstrap(usage: String): js.Promise[_] = js.native
    def processContactPointSignals(): js.Promise[_] = js.native
    def readMsisdnHeader(): js.Promise[_] = js.native
    def readMsisdnHeader(usage: String): js.Promise[_] = js.native
    def removeProfilePicture(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def sendRecoveryFlowEmail(query: String): js.Promise[_] = js.native
    def setBiography(text: String): js.Promise[AccountRepositoryCurrentUserResponseUser] = js.native
    def setPrivate(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def setPublic(): js.Promise[AccountRepositoryCurrentUserResponseRootObject] = js.native
    def twoFactorLogin(options: AccountTwoFactorLoginOptions): js.Promise[AccountRepositoryLoginResponseLoggedInUser] = js.native
  }
  
  /* static members */
  @js.native
  object AccountRepository extends js.Object {
    var accountDebug: js.Any = js.native
    def createJazoest(input: String): String = js.native
  }
  
}

