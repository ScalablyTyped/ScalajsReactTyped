package typingsJapgolly.firebaseMessaging.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def messaging(): FirebaseMessaging
}

object FirebaseApp {
  @scala.inline
  def apply(messaging: CallbackTo[FirebaseMessaging]): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messaging")(messaging.toJsFn)
    __obj.asInstanceOf[FirebaseApp]
  }
}

