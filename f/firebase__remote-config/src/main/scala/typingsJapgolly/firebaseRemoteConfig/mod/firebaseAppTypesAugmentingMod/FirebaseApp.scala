package typingsJapgolly.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseRemoteConfigTypes.mod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def remoteConfig(): RemoteConfig
}

object FirebaseApp {
  @scala.inline
  def apply(remoteConfig: CallbackTo[RemoteConfig]): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remoteConfig")(remoteConfig.toJsFn)
    __obj.asInstanceOf[FirebaseApp]
  }
}

