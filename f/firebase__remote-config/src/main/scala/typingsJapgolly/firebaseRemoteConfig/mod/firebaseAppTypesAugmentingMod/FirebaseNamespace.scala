package typingsJapgolly.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseRemoteConfigTypes.mod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var remoteConfig: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], RemoteConfig]] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(remoteConfig: /* app */ js.UndefOr[FirebaseApp] => CallbackTo[RemoteConfig] = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (remoteConfig != null) __obj.updateDynamic("remoteConfig")(js.Any.fromFunction1((t0: /* app */ js.UndefOr[
  typingsJapgolly.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod.FirebaseApp]) => remoteConfig(t0).runNow()))
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

