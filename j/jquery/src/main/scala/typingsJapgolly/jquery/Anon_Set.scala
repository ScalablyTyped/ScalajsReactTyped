package typingsJapgolly.jquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.Tween
import typingsJapgolly.jquery.JQuery._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Set[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit
}

object Anon_Set {
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Callback): Anon_Set[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery.Tween[TElement]) => set(t0).runNow()))
    __obj.asInstanceOf[Anon_Set[TElement]]
  }
}

