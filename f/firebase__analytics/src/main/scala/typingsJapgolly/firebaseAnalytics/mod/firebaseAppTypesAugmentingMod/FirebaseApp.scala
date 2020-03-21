package typingsJapgolly.firebaseAnalytics.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def analytics(): FirebaseAnalytics
}

object FirebaseApp {
  @scala.inline
  def apply(analytics: CallbackTo[FirebaseAnalytics]): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analytics")(analytics.toJsFn)
    __obj.asInstanceOf[FirebaseApp]
  }
}

