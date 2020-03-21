package typingsJapgolly.expressDebug.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPanel extends js.Object {
  @JSName("finalize")
  var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], Unit]] = js.undefined
  var initialize: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], Unit]] = js.undefined
  var name: String
  var options: js.UndefOr[js.Any] = js.undefined
  var post_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], Unit]] = js.undefined
  var pre_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], Unit]] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
  var template: String
  def process(locals: js.Any): js.Any
}

object CustomPanel {
  @scala.inline
  def apply(
    name: String,
    process: js.Any => CallbackTo[js.Any],
    template: String,
    finalize: /* req */ Request_[ParamsDictionary] => Callback = null,
    initialize: /* req */ Request_[ParamsDictionary] => Callback = null,
    options: js.Any = null,
    post_render: /* req */ Request_[ParamsDictionary] => Callback = null,
    pre_render: /* req */ Request_[ParamsDictionary] => Callback = null,
    standalone: js.UndefOr[Boolean] = js.undefined
  ): CustomPanel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: js.Any) => process(t0).runNow()))
    if (finalize != null) __obj.updateDynamic("finalize")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => finalize(t0).runNow()))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => initialize(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (post_render != null) __obj.updateDynamic("post_render")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => post_render(t0).runNow()))
    if (pre_render != null) __obj.updateDynamic("pre_render")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => pre_render(t0).runNow()))
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPanel]
  }
}

