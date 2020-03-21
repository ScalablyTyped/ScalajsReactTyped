package typingsJapgolly.reactCopyWrite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactCopyWrite.mod.AnyDeepMemberOfState
import typingsJapgolly.reactCopyWrite.mod.ConsumerProps
import typingsJapgolly.reactCopyWrite.mod.MutateFn
import typingsJapgolly.reactCopyWrite.mod.Mutator
import typingsJapgolly.reactCopyWrite.mod.ProviderProps
import typingsJapgolly.reactCopyWrite.mod.SelectorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsumer[T /* <: js.Object */] extends js.Object {
  var Consumer: Instantiable0[Component[ConsumerProps[T] with js.Object, js.Object]]
  var Provider: Instantiable0[Component[ProviderProps[T] with js.Object, js.Object]]
  var createSelector: SelectorFn[T]
  var mutate: Mutator[T]
}

object AnonConsumer {
  @scala.inline
  def apply[T /* <: js.Object */](
    Consumer: Instantiable0[Component[ConsumerProps[T] with js.Object, js.Object]],
    Provider: Instantiable0[Component[ProviderProps[T] with js.Object, js.Object]],
    createSelector: T => CallbackTo[AnyDeepMemberOfState[T]],
    mutate: /* mutator */ MutateFn[T] => Callback
  ): AnonConsumer[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.updateDynamic("createSelector")(js.Any.fromFunction1((t0: T) => createSelector(t0).runNow()))
    __obj.updateDynamic("mutate")(js.Any.fromFunction1((t0: /* mutator */ typingsJapgolly.reactCopyWrite.mod.MutateFn[T]) => mutate(t0).runNow()))
    __obj.asInstanceOf[AnonConsumer[T]]
  }
}

