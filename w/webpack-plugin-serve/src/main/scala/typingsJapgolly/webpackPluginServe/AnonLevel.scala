package typingsJapgolly.webpackPluginServe

import typingsJapgolly.webpackPluginServe.webpackPluginServeStrings.debug
import typingsJapgolly.webpackPluginServe.webpackPluginServeStrings.error
import typingsJapgolly.webpackPluginServe.webpackPluginServeStrings.info
import typingsJapgolly.webpackPluginServe.webpackPluginServeStrings.trace
import typingsJapgolly.webpackPluginServe.webpackPluginServeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: trace | debug | info | warn | error
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object AnonLevel {
  @scala.inline
  def apply(level: trace | debug | info | warn | error, timestamp: js.UndefOr[Boolean] = js.undefined): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

