package typingsJapgolly.next

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.utilsMod.BaseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetInitialProps[C /* <: BaseContext */, IP] extends js.Object {
  /**
    * Used for initial page load data population. Data returned from `getInitialProps` is serialized when server rendered.
    * Make sure to return plain `Object` without using `Date`, `Map`, `Set`.
    * @param ctx Context of `page`
    */
  var getInitialProps: js.UndefOr[js.Function1[/* context */ C, IP | js.Promise[IP]]] = js.undefined
}

object AnonGetInitialProps {
  @scala.inline
  def apply[C /* <: BaseContext */, IP](getInitialProps: /* context */ C => CallbackTo[IP | js.Promise[IP]] = null): AnonGetInitialProps[C, IP] = {
    val __obj = js.Dynamic.literal()
    if (getInitialProps != null) __obj.updateDynamic("getInitialProps")(js.Any.fromFunction1((t0: /* context */ C) => getInitialProps(t0).runNow()))
    __obj.asInstanceOf[AnonGetInitialProps[C, IP]]
  }
}

