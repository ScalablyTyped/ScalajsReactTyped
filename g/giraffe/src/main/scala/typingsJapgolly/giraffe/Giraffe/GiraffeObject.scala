package typingsJapgolly.giraffe.Giraffe

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiraffeObject extends js.Object {
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var app: App_
  var appEvents: js.UndefOr[StringMap] = js.undefined
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var dataEvents: js.UndefOr[StringMap] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions_] = js.undefined
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var initialize: js.UndefOr[js.Function0[js.Any]] = js.undefined
}

object GiraffeObject {
  @scala.inline
  def apply(
    app: App_,
    afterDispose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    afterInitialize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    appEvents: StringMap = null,
    beforeDispose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    beforeInitialize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    dataEvents: StringMap = null,
    defaultOptions: DefaultOptions_ = null,
    dispose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    initialize: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): GiraffeObject = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    afterDispose.foreach(p => __obj.updateDynamic("afterDispose")(p.toJsFn))
    afterInitialize.foreach(p => __obj.updateDynamic("afterInitialize")(p.toJsFn))
    if (appEvents != null) __obj.updateDynamic("appEvents")(appEvents.asInstanceOf[js.Any])
    beforeDispose.foreach(p => __obj.updateDynamic("beforeDispose")(p.toJsFn))
    beforeInitialize.foreach(p => __obj.updateDynamic("beforeInitialize")(p.toJsFn))
    if (dataEvents != null) __obj.updateDynamic("dataEvents")(dataEvents.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    dispose.foreach(p => __obj.updateDynamic("dispose")(p.toJsFn))
    initialize.foreach(p => __obj.updateDynamic("initialize")(p.toJsFn))
    __obj.asInstanceOf[GiraffeObject]
  }
}

