package typingsJapgolly.nextServer.dynamicMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableGeneratedOptions extends js.Object {
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
  var webpack: js.UndefOr[js.Function0[_]] = js.undefined
}

object LoadableGeneratedOptions {
  @scala.inline
  def apply(
    modules: js.UndefOr[CallbackTo[LoaderMap]] = js.undefined,
    webpack: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): LoadableGeneratedOptions = {
    val __obj = js.Dynamic.literal()
    modules.foreach(p => __obj.updateDynamic("modules")(p.toJsFn))
    webpack.foreach(p => __obj.updateDynamic("webpack")(p.toJsFn))
    __obj.asInstanceOf[LoadableGeneratedOptions]
  }
}

