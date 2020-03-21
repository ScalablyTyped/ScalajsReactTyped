package typingsJapgolly.istanbulMiddleware

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.istanbulMiddleware.mod.ClientMatcher
import typingsJapgolly.istanbulMiddleware.mod.PathTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatcher extends js.Object {
  var matcher: js.UndefOr[ClientMatcher] = js.undefined
  var pathTransformer: js.UndefOr[PathTransformer] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object AnonMatcher {
  @scala.inline
  def apply(
    matcher: /* req */ Request_[ParamsDictionary] => CallbackTo[Boolean] = null,
    pathTransformer: /* req */ Request_[ParamsDictionary] => CallbackTo[String] = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): AnonMatcher = {
    val __obj = js.Dynamic.literal()
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => matcher(t0).runNow()))
    if (pathTransformer != null) __obj.updateDynamic("pathTransformer")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => pathTransformer(t0).runNow()))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatcher]
  }
}

