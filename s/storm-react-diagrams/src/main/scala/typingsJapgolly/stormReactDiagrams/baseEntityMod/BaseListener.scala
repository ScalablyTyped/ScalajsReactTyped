package typingsJapgolly.stormReactDiagrams.baseEntityMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.AnonLocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseListener[T /* <: BaseEntity[BaseListener[_]] */] extends js.Object {
  var lockChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[T] with AnonLocked, Unit]] = js.undefined
}

object BaseListener {
  @scala.inline
  def apply[T /* <: BaseEntity[BaseListener[_]] */](lockChanged: /* event */ BaseEvent[T] with AnonLocked => Callback = null): BaseListener[T] = {
    val __obj = js.Dynamic.literal()
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[T] with typingsJapgolly.stormReactDiagrams.AnonLocked) => lockChanged(t0).runNow()))
    __obj.asInstanceOf[BaseListener[T]]
  }
}

