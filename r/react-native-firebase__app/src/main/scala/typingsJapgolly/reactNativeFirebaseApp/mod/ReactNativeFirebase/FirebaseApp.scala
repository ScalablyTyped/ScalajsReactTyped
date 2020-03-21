package typingsJapgolly.reactNativeFirebaseApp.mod.ReactNativeFirebase

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def utils(): typingsJapgolly.reactNativeFirebaseApp.Utils.Module
}

object FirebaseApp {
  @scala.inline
  def apply(utils: CallbackTo[typingsJapgolly.reactNativeFirebaseApp.Utils.Module]): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("utils")(utils.toJsFn)
    __obj.asInstanceOf[FirebaseApp]
  }
}

