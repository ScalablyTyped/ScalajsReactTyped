package typingsJapgolly.aureliaDependencyInjection

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDecorates extends js.Object {
  var decorates: js.UndefOr[
    js.Function1[/* key */ js.Any, /* is aurelia-dependency-injection.AnonGet */ Boolean]
  ] = js.undefined
}

object AnonDecorates {
  @scala.inline
  def apply(
    decorates: /* key */ js.Any => CallbackTo[/* is aurelia-dependency-injection.AnonGet */ Boolean] = null
  ): AnonDecorates = {
    val __obj = js.Dynamic.literal()
    if (decorates != null) __obj.updateDynamic("decorates")(js.Any.fromFunction1((t0: /* key */ js.Any) => decorates(t0).runNow()))
    __obj.asInstanceOf[AnonDecorates]
  }
}

