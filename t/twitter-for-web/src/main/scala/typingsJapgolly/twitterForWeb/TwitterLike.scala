package typingsJapgolly.twitterForWeb

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterLike extends js.Object {
  /**
    * All JavaScript code depending on widgets.js should execute on or after this function.
    *
    * @param callback A callback function which will be invoked when widgets.js is ready.
    */
  def ready(callback: js.Function1[/* twttr */ Twitter, Unit]): Unit
}

object TwitterLike {
  @scala.inline
  def apply(ready: js.Function1[/* twttr */ Twitter, Unit] => Callback): TwitterLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: js.Function1[/* twttr */ typingsJapgolly.twitterForWeb.Twitter, scala.Unit]) => ready(t0).runNow()))
    __obj.asInstanceOf[TwitterLike]
  }
}

