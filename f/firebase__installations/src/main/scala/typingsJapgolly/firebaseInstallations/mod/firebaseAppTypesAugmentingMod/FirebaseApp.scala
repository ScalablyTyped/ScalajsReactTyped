package typingsJapgolly.firebaseInstallations.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def installations(): FirebaseInstallations
}

object FirebaseApp {
  @scala.inline
  def apply(installations: CallbackTo[FirebaseInstallations]): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("installations")(installations.toJsFn)
    __obj.asInstanceOf[FirebaseApp]
  }
}

