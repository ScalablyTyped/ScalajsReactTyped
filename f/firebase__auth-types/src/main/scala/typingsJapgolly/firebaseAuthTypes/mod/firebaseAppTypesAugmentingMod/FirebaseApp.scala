package typingsJapgolly.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAuthTypes.mod.FirebaseAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var auth: js.UndefOr[js.Function0[FirebaseAuth]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(auth: js.UndefOr[CallbackTo[FirebaseAuth]] = js.undefined): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    auth.foreach(p => __obj.updateDynamic("auth")(p.toJsFn))
    __obj.asInstanceOf[FirebaseApp]
  }
}

