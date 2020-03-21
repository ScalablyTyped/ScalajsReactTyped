package typingsJapgolly.cypress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.JQuery_.Tween
import typingsJapgolly.cypress.JQuery_._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): js.Any
}

object AnonGet {
  @scala.inline
  def apply[TElement](get: Tween[TElement] => CallbackTo[js.Any]): AnonGet[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Tween[TElement]) => get(t0).runNow()))
    __obj.asInstanceOf[AnonGet[TElement]]
  }
}

