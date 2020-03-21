package typingsJapgolly.firebasePerformance.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebasePerformanceTypes.mod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var performance: js.UndefOr[js.Function1[/* app */ js.UndefOr[FirebaseApp], FirebasePerformance]] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(performance: /* app */ js.UndefOr[FirebaseApp] => CallbackTo[FirebasePerformance] = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (performance != null) __obj.updateDynamic("performance")(js.Any.fromFunction1((t0: /* app */ js.UndefOr[
  typingsJapgolly.firebasePerformance.mod.firebaseAppTypesAugmentingMod.FirebaseApp]) => performance(t0).runNow()))
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

