package typingsJapgolly.koaWebpack.mod

import typingsJapgolly.webpack.mod.Compiler_
import typingsJapgolly.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compiler: js.UndefOr[Compiler_] = js.undefined
  var config: js.UndefOr[Configuration] = js.undefined
  var devMiddleware: js.UndefOr[typingsJapgolly.webpackDevMiddleware.mod.Options] = js.undefined
  var hotClient: js.UndefOr[typingsJapgolly.webpackHotClient.mod.Options | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    compiler: Compiler_ = null,
    config: Configuration = null,
    devMiddleware: typingsJapgolly.webpackDevMiddleware.mod.Options = null,
    hotClient: typingsJapgolly.webpackHotClient.mod.Options | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (devMiddleware != null) __obj.updateDynamic("devMiddleware")(devMiddleware.asInstanceOf[js.Any])
    if (hotClient != null) __obj.updateDynamic("hotClient")(hotClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

