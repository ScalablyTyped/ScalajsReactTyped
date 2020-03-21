package typingsJapgolly.firebaseMessaging.apiMod

import typingsJapgolly.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typingsJapgolly.firebaseMessaging.tokenDetailsMod.TokenDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/core/api", "requestUpdateToken")
@js.native
object requestUpdateToken extends js.Object {
  def apply(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[String] = js.native
}

