package typingsJapgolly.soap.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecurity extends js.Object {
  var addHeaders: js.UndefOr[js.Function1[/* headers */ IHeaders, Unit]] = js.undefined
  var addOptions: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.undefined
  var postProcess: js.UndefOr[js.Function2[/* xml */ js.Any, /* envelopeKey */ js.Any, String]] = js.undefined
  var toXML: js.UndefOr[js.Function0[String]] = js.undefined
}

object ISecurity {
  @scala.inline
  def apply(
    addHeaders: /* headers */ IHeaders => Callback = null,
    addOptions: /* options */ js.Any => Callback = null,
    postProcess: (/* xml */ js.Any, /* envelopeKey */ js.Any) => CallbackTo[String] = null,
    toXML: js.UndefOr[CallbackTo[String]] = js.undefined
  ): ISecurity = {
    val __obj = js.Dynamic.literal()
    if (addHeaders != null) __obj.updateDynamic("addHeaders")(js.Any.fromFunction1((t0: /* headers */ typingsJapgolly.soap.typesMod.IHeaders) => addHeaders(t0).runNow()))
    if (addOptions != null) __obj.updateDynamic("addOptions")(js.Any.fromFunction1((t0: /* options */ js.Any) => addOptions(t0).runNow()))
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2((t0: /* xml */ js.Any, t1: /* envelopeKey */ js.Any) => postProcess(t0, t1).runNow()))
    toXML.foreach(p => __obj.updateDynamic("toXML")(p.toJsFn))
    __obj.asInstanceOf[ISecurity]
  }
}

