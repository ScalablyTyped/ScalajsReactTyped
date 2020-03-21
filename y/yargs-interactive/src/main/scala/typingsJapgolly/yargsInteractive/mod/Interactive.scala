package typingsJapgolly.yargsInteractive.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interactive extends js.Object {
  def interactive(options: Option): Interactive
  def `then`(callback: js.Function1[/* result */ js.Any, _]): Interactive
  def usage(usage: String): Interactive
}

object Interactive {
  @scala.inline
  def apply(
    interactive: Option => CallbackTo[Interactive],
    `then`: js.Function1[/* result */ js.Any, js.Any] => CallbackTo[Interactive],
    usage: String => CallbackTo[Interactive]
  ): Interactive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interactive")(js.Any.fromFunction1((t0: typingsJapgolly.yargsInteractive.mod.Option) => interactive(t0).runNow()))
    __obj.updateDynamic("then")(js.Any.fromFunction1((t0: js.Function1[/* result */ js.Any, js.Any]) => `then`(t0).runNow()))
    __obj.updateDynamic("usage")(js.Any.fromFunction1((t0: java.lang.String) => usage(t0).runNow()))
    __obj.asInstanceOf[Interactive]
  }
}

