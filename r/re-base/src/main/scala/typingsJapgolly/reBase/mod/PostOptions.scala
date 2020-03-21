package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostOptions extends js.Object {
  /**
    * The data you're wanting to persist to Firebase.
    */
  var data: js.Any
  /**
    * A callback that will get invoked once the new data has been saved to
    * Firebase. If there is an error, it will be the only argument to this
    * function.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
}

object PostOptions {
  @scala.inline
  def apply(data: js.Any, `then`: /* result */ js.Any => Callback = null): PostOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(js.Any.fromFunction1((t0: /* result */ js.Any) => `then`(t0).runNow()))
    __obj.asInstanceOf[PostOptions]
  }
}

