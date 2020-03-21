package typingsJapgolly.tsmonad.monadMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor[T] extends js.Object {
  def fmap[U](f: js.Function1[/* t */ T, U]): Functor[U]
  def lift[U](f: js.Function1[/* t */ T, U]): Functor[U]
  def map[U](f: js.Function1[/* t */ T, U]): Functor[U]
}

object Functor {
  @scala.inline
  def apply[T](
    fmap: js.Function1[/* t */ T, js.Any] => CallbackTo[Functor[js.Any]],
    lift: js.Function1[/* t */ T, js.Any] => CallbackTo[Functor[js.Any]],
    map: js.Function1[/* t */ T, js.Any] => CallbackTo[Functor[js.Any]]
  ): Functor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fmap")(js.Any.fromFunction1((t0: js.Function1[/* t */ T, js.Any]) => fmap(t0).runNow()))
    __obj.updateDynamic("lift")(js.Any.fromFunction1((t0: js.Function1[/* t */ T, js.Any]) => lift(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* t */ T, js.Any]) => map(t0).runNow()))
    __obj.asInstanceOf[Functor[T]]
  }
}

