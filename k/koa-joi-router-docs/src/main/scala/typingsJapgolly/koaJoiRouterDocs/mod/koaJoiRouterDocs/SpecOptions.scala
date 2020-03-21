package typingsJapgolly.koaJoiRouterDocs.mod.koaJoiRouterDocs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecOptions extends js.Object {
  var defaultResponses: js.UndefOr[js.Object] = js.undefined
  var warnFunc: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SpecOptions {
  @scala.inline
  def apply(defaultResponses: js.Object = null, warnFunc: js.UndefOr[Callback] = js.undefined): SpecOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultResponses != null) __obj.updateDynamic("defaultResponses")(defaultResponses.asInstanceOf[js.Any])
    warnFunc.foreach(p => __obj.updateDynamic("warnFunc")(p.toJsFn))
    __obj.asInstanceOf[SpecOptions]
  }
}

