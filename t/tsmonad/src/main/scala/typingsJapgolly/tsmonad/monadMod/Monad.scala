package typingsJapgolly.tsmonad.monadMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monad[T] extends js.Object {
  def bind[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
  def chain[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U]
  def of[U](t: U): Monad[U]
  def unit[U](t: U): Monad[U]
}

object Monad {
  @scala.inline
  def apply[T](
    bind: js.Function1[/* t */ T, Monad[js.Any]] => CallbackTo[Monad[js.Any]],
    chain: js.Function1[/* t */ T, Monad[js.Any]] => CallbackTo[Monad[js.Any]],
    of: js.Any => CallbackTo[Monad[js.Any]],
    unit: js.Any => CallbackTo[Monad[js.Any]]
  ): Monad[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: js.Function1[/* t */ T, typingsJapgolly.tsmonad.monadMod.Monad[js.Any]]) => bind(t0).runNow()))
    __obj.updateDynamic("chain")(js.Any.fromFunction1((t0: js.Function1[/* t */ T, typingsJapgolly.tsmonad.monadMod.Monad[js.Any]]) => chain(t0).runNow()))
    __obj.updateDynamic("of")(js.Any.fromFunction1((t0: js.Any) => of(t0).runNow()))
    __obj.updateDynamic("unit")(js.Any.fromFunction1((t0: js.Any) => unit(t0).runNow()))
    __obj.asInstanceOf[Monad[T]]
  }
}

