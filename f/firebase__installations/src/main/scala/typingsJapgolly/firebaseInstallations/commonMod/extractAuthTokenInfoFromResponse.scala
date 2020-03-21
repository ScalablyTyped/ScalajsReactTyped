package typingsJapgolly.firebaseInstallations.commonMod

import typingsJapgolly.firebaseInstallations.apiResponseMod.GenerateAuthTokenResponse
import typingsJapgolly.firebaseInstallations.installationEntryMod.CompletedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "extractAuthTokenInfoFromResponse")
@js.native
object extractAuthTokenInfoFromResponse extends js.Object {
  def apply(response: GenerateAuthTokenResponse): CompletedAuthToken = js.native
}

