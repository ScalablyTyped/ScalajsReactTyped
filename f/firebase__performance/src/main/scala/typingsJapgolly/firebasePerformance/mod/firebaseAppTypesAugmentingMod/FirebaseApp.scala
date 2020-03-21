package typingsJapgolly.firebasePerformance.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebasePerformanceTypes.mod.FirebasePerformance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var performance: js.UndefOr[js.Function0[FirebasePerformance]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(performance: js.UndefOr[CallbackTo[FirebasePerformance]] = js.undefined): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    performance.foreach(p => __obj.updateDynamic("performance")(p.toJsFn))
    __obj.asInstanceOf[FirebaseApp]
  }
}

