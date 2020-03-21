package typingsJapgolly.cypress

import japgolly.scalajs.react.Callback
import typingsJapgolly.cypress.JQuery_.Tween
import typingsJapgolly.cypress.JQuery_._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSet[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit
}

object AnonSet {
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Callback): AnonSet[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Tween[TElement]) => set(t0).runNow()))
    __obj.asInstanceOf[AnonSet[TElement]]
  }
}

