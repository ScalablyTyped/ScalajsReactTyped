package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var error: js.UndefOr[ObserverOnError] = js.undefined
  var next: ObserverOnNext
}

object Observer {
  @scala.inline
  def apply(
    next: /* querySnapshot */ QuerySnapshot => Callback,
    error: /* err */ SnapshotError => Callback = null
  ): Observer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* querySnapshot */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot) => next(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Query.SnapshotError) => error(t0).runNow()))
    __obj.asInstanceOf[Observer]
  }
}

