package typingsJapgolly.rxLiteJoinpatterns.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableStatic extends js.Object {
  def when[TR](plan: Plan[TR]): Observable[TR]
}

object ObservableStatic {
  @scala.inline
  def apply(when: Plan[js.Any] => CallbackTo[Observable[js.Any]]): ObservableStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("when")(js.Any.fromFunction1((t0: typingsJapgolly.rxLiteJoinpatterns.Rx.Plan[js.Any]) => when(t0).runNow()))
    __obj.asInstanceOf[ObservableStatic]
  }
}

