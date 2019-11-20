package typingsJapgolly.jquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.JQuery.Tween
import typingsJapgolly.jquery.JQuery._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Get[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): js.Any
}

object Anon_Get {
  @scala.inline
  def apply[TElement](get: Tween[TElement] => CallbackTo[js.Any]): Anon_Get[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.jquery.JQuery.Tween[TElement]) => get(t0).runNow()))
    __obj.asInstanceOf[Anon_Get[TElement]]
  }
}

