package typingsJapgolly.nock.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackOptions extends js.Object {
  var after: js.UndefOr[js.Function1[/* scope */ Scope, Unit]] = js.undefined
  var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[Definition], js.Array[Definition]]] = js.undefined
  var before: js.UndefOr[js.Function1[/* def */ Definition, Unit]] = js.undefined
  var recorder: js.UndefOr[RecorderOptions] = js.undefined
}

object BackOptions {
  @scala.inline
  def apply(
    after: /* scope */ Scope => Callback = null,
    afterRecord: /* defs */ js.Array[Definition] => CallbackTo[js.Array[Definition]] = null,
    before: /* def */ Definition => Callback = null,
    recorder: RecorderOptions = null
  ): BackOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* scope */ typingsJapgolly.nock.mod.Scope) => after(t0).runNow()))
    if (afterRecord != null) __obj.updateDynamic("afterRecord")(js.Any.fromFunction1((t0: /* defs */ js.Array[typingsJapgolly.nock.mod.Definition]) => afterRecord(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* def */ typingsJapgolly.nock.mod.Definition) => before(t0).runNow()))
    if (recorder != null) __obj.updateDynamic("recorder")(recorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackOptions]
  }
}

