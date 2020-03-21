package typingsJapgolly.qwest.Qwest_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  /** Request has failed */
  def `catch`(
    callback: js.Function3[/* e */ js.Any, /* xhr */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], _]
  ): Promise
  /** Always run */
  def complete(callback: js.Function0[_]): Promise
  /** Request is successful */
  def `then`(callback: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], _]): Promise
}

object Promise {
  @scala.inline
  def apply(
    `catch`: js.Function3[
      /* e */ js.Any, 
      /* xhr */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      js.Any
    ] => CallbackTo[Promise],
    complete: js.Function0[js.Any] => CallbackTo[Promise],
    `then`: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], js.Any] => CallbackTo[Promise]
  ): Promise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1((t0: js.Function3[
  /* e */ js.Any, 
  /* xhr */ js.UndefOr[js.Any], 
  /* response */ js.UndefOr[js.Any], 
  js.Any]) => `catch`(t0).runNow()))
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => complete(t0).runNow()))
    __obj.updateDynamic("then")(js.Any.fromFunction1((t0: js.Function2[/* xhr */ js.Any, /* response */ js.UndefOr[js.Any], js.Any]) => `then`(t0).runNow()))
    __obj.asInstanceOf[Promise]
  }
}

