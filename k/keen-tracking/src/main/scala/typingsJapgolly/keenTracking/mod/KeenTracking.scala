package typingsJapgolly.keenTracking.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.keenTracking.AnonCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeenTracking extends js.Object {
  def recordEvent(collectionName: String, event: js.Object): js.Promise[AnonCreated]
  def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]]
}

object KeenTracking {
  @scala.inline
  def apply(
    recordEvent: (String, js.Object) => CallbackTo[js.Promise[AnonCreated]],
    recordEvents: StringDictionary[js.Array[js.Object]] => CallbackTo[js.Promise[StringDictionary[js.Array[Boolean]]]]
  ): KeenTracking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recordEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => recordEvent(t0, t1).runNow()))
    __obj.updateDynamic("recordEvents")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Array[js.Object]]) => recordEvents(t0).runNow()))
    __obj.asInstanceOf[KeenTracking]
  }
}

