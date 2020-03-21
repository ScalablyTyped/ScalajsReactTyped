package typingsJapgolly.firebaseMessaging.apiMod

import typingsJapgolly.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typingsJapgolly.firebaseMessaging.tokenDetailsMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/core/api", "requestGetToken")
@js.native
object requestGetToken extends js.Object {
  def apply(firebaseDependencies: FirebaseInternalDependencies, subscriptionOptions: SubscriptionOptions): js.Promise[String] = js.native
}

