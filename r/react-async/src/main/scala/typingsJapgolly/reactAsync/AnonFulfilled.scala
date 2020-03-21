package typingsJapgolly.reactAsync

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFulfilled extends js.Object {
  def Fulfilled[T](props: AnonPersist[T]): Element
  def Initial[T](props: AnonChildren[T]): Element
  def Loading[T](props: AnonInitial[T]): Element
  def Pending[T](props: AnonInitial[T]): Element
  def Rejected[T](props: AnonChildrenPersist[T]): Element
  def Resolved[T](props: AnonPersist[T]): Element
  def Settled[T](props: AnonChildrenSettledChildren[T]): Element
}

object AnonFulfilled {
  @scala.inline
  def apply(
    Fulfilled: AnonPersist[js.Any] => CallbackTo[Element],
    Initial: AnonChildren[js.Any] => CallbackTo[Element],
    Loading: AnonInitial[js.Any] => CallbackTo[Element],
    Pending: AnonInitial[js.Any] => CallbackTo[Element],
    Rejected: AnonChildrenPersist[js.Any] => CallbackTo[Element],
    Resolved: AnonPersist[js.Any] => CallbackTo[Element],
    Settled: AnonChildrenSettledChildren[js.Any] => CallbackTo[Element]
  ): AnonFulfilled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Fulfilled")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonPersist[js.Any]) => Fulfilled(t0).runNow()))
    __obj.updateDynamic("Initial")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonChildren[js.Any]) => Initial(t0).runNow()))
    __obj.updateDynamic("Loading")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonInitial[js.Any]) => Loading(t0).runNow()))
    __obj.updateDynamic("Pending")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonInitial[js.Any]) => Pending(t0).runNow()))
    __obj.updateDynamic("Rejected")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonChildrenPersist[js.Any]) => Rejected(t0).runNow()))
    __obj.updateDynamic("Resolved")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonPersist[js.Any]) => Resolved(t0).runNow()))
    __obj.updateDynamic("Settled")(js.Any.fromFunction1((t0: typingsJapgolly.reactAsync.AnonChildrenSettledChildren[js.Any]) => Settled(t0).runNow()))
    __obj.asInstanceOf[AnonFulfilled]
  }
}

